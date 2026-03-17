package ruiz.marisol.playlist_253120_251931

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import ruiz.marisol.playlist_253120_251931.data.models.Song
import ruiz.marisol.playlist_253120_251931.ui.theme.Playlist_253120_251931Theme
import ruiz.marisol.playlist_253120_251931.ui.theme.screens.DetalleCancion
import ruiz.marisol.playlist_253120_251931.ui.theme.screens.listaCanciones
import ruiz.marisol.playlist_253120_251931.viewModel.SongViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Playlist_253120_251931Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val viewModel: SongViewModel = viewModel()
                    var cancionSeleccionada by remember { mutableStateOf<Song?>(null) }

                    if (cancionSeleccionada == null) {
                        listaCanciones(
                            onSongClick = { song ->
                                cancionSeleccionada = song
                            }
                        )
                    } else {
                        DetalleCancion(
                            song = cancionSeleccionada!!,
                            viewModel = viewModel,
                            onBack = { cancionSeleccionada = null },
                            modifier = Modifier.padding(innerPadding)  // <- aqui se usa
                        )
                    }
                }
            }
        }
    }
}