package com.tunejar.repositorio

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class DataLoader (private val repositorio: RepositorioCanciones) {
    @PostConstruct
    fun load() {
        val canciones = listOf(
            Songs("https://cdns-images.dzcdn.net/images/cover/04914ec5fd3d7c7332cf597b20085ef4/350x350.jpg",
                "Fito y Fitipaldis",
                "Soldadito Marinero",
                "Pop Rock",
                2003),
            Songs("https://tse3.mm.bing.net/th?id=OIP.BRnGT23SKPg7BH9N4pqqNwHaHa&pid=Api&P=0",
                "Maluma",
                "Felices los 4",
                "Salsa",
                2018),
            Songs("https://i.discogs.com/fYgMzw1OiJ8ld9SecrRgxol07e6vq1QDXKm7hKgQ1pg/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9SLTIwOTg3/MTczLTE2MzY5NzQ2/ODgtMTk5MS5qcGVn.jpeg",
                "Manolo García",
                "Insurrección",
                "Jangle Pop",
                1986),
        )
        repositorio.saveAll(canciones)
        println("cargamos canciones: $canciones")
    }
}