package com.tunejar.repositorio

import com.tunejar.repositorio.cancion
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class DataLoader (private val repositorio: repositorioCanciones) {
    @PostConstruct
    fun load() {
        val canciones = listOf(
            cancion("https://tse3.mm.bing.net/th?id=OIP.ruT15mxQwIgt8k_MgycTtQHaEK&pid=Api&P=0",
                "Fito y Fitipaldis",
                "Soldadito Marinero",
                "Pop Rock",
                2003),
            cancion("https://tse3.mm.bing.net/th?id=OIP.BRnGT23SKPg7BH9N4pqqNwHaHa&pid=Api&P=0",
                "Maluma",
                "Felices los 4",
                "Salsa",
                2018),
            cancion("https://tse4.mm.bing.net/th?id=OIP.hoVIUhPoLh608K9KdvW_BgHaEk&pid=Api&P=0",
                "Manolo García",
                "Insurrección",
                "Jangle Pop",
                1986),
        )
        repositorio.saveAll(canciones)
        println("cargamos canciones: $canciones")
    }
}