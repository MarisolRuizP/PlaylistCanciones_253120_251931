package ruiz.marisol.playlist_253120_251931.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SongViewModel : ViewModel(){
    var CancionReproduciendo by mutableStateOf<Boolean?>(false)
        private set

    fun reproducirCancion(){
        CancionReproduciendo = true
    }


}
