package ruiz.marisol.playlist_253120_251931.ui.theme.screens.components

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ruiz.marisol.playlist_253120_251931.R
import ruiz.marisol.playlist_253120_251931.data.models.Song

@Composable
fun SongCard (song: Song) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            ,
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(12.dp)
        ) {
            Image(
                painter = painterResource(song.imagen),
                contentDescription = "cover${song.id}",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(90.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column() {
                Text(text = song.nombre,
                    style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = song.autor)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSongCard(){
    SongCard(Song(id = 2, nombre = "ayuda", imagen = R.drawable.yourfavoritetoy, autor = "ayudax2", duracion = 12.11))
}