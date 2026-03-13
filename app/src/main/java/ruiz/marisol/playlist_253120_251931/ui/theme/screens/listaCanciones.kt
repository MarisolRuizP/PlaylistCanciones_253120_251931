package ruiz.marisol.playlist_253120_251931.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ruiz.marisol.playlist_253120_251931.R
import ruiz.marisol.playlist_253120_251931.data.models.Song
import ruiz.marisol.playlist_253120_251931.data.models.sampleSongs
import ruiz.marisol.playlist_253120_251931.ui.theme.screens.components.SongCard

@Composable
fun listaCanciones(song: Song) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Listado de canciones",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        LazyColumn() {
            items(items = sampleSongs) {
                song ->
                SongCard(song)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewListaCanciones() {
    listaCanciones(Song(id = 2, nombre = "ayuda", imagen = R.drawable.yourfavoritetoy, autor = "ayudax2", duracion = 12.11))
}