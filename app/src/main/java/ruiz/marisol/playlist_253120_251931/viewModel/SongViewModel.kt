package ruiz.marisol.playlist_253120_251931.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class SongViewModel : ViewModel(){
    var CancionReproduciendo by mutableStateOf<Boolean?>(null)
        private set

    var estaBuffering by mutableStateOf<Boolean>(false)
        private set

    fun reproducirCancion(){
        viewModelScope.launch {
            calcularBuffering()
        }
    }

    private suspend fun calcularBuffering(){
        val hayBuffering = Random.nextFloat() < 0.5f

        if(hayBuffering){
            estaBuffering = true
            CancionReproduciendo = false
            delay(3000L)
            calcularBuffering()
        } else {
            estaBuffering = false
            CancionReproduciendo = true
        }
    }
}
