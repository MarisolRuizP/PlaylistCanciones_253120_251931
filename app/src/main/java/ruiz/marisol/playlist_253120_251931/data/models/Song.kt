package ruiz.marisol.playlist_253120_251931.data.models

import ruiz.marisol.playlist_253120_251931.R

data class Song(
    val id:Int,
    val nombre:String,
    val autor:String,
    val duracion: Double,
    val imagen: Int = 0
)

val sampleSongs = listOf(
    Song(id = 1, nombre = "Your Favorite Toy", autor = "Foo Fighters", duracion = 2.55, imagen = R.drawable.yourfavoritetoy)
)