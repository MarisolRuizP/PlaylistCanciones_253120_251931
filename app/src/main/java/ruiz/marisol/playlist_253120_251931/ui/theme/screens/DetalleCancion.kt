package ruiz.marisol.playlist_253120_251931.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ruiz.marisol.playlist_253120_251931.R
import ruiz.marisol.playlist_253120_251931.data.models.Song
import ruiz.marisol.playlist_253120_251931.viewModel.SongViewModel

@Composable
fun DetalleCancion(song: Song, viewModel: SongViewModel, onBack: () -> Unit, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = song.nombre,
        style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(18.dp))
        Image(
            painter = painterResource(song.imagen),
            contentDescription = "Portada",
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(18.dp))
        Text(text = song.autor,
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(18.dp))
        Text(text = song.duracion.toString(),
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(18.dp))
        Button(
            onClick = {
                viewModel.reproducirCancion()
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Reproducir")
        }
        Spacer(modifier = Modifier.height(16.dp))

        if(viewModel.estaBuffering) {
            Text(text = "Cargando ...",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        } else if (viewModel.CancionReproduciendo == true) {
            Text(text = "Reproduciendo canción",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
        Spacer(modifier = Modifier.height(18.dp))
        Button(
            onClick = onBack,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Volver")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetalleCancionPreview(){

}