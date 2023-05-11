package com.tunejar

import com.tunejar.repositorio.Cancion
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest
class TunejarApplicationTests {

    @Autowired
    private lateinit var api: TestRestTemplate

    @Test
    fun `Devuelve una lista de canciones`() {
        val canciones = listOf(
            Cancion("https://tse3.mm.bing.net/th?id=OIP.ruT15mxQwIgt8k_MgycTtQHaEK&pid=Api&P=0", "Fito y Fitipaldis", "Soldadito Marinero", "Pop Rock", 2003),
            Cancion("https://tse3.mm.bing.net/th?id=OIP.BRnGT23SKPg7BH9N4pqqNwHaHa&pid=Api&P=0", "Maluma", "Felices los 4", "Salsa", 2018),
            Cancion("https://tse4.mm.bing.net/th?id=OIP.hoVIUhPoLh608K9KdvW_BgHaEk&pid=Api&P=0", "Manolo García", "Insurrección", "Jangle Pop", 1986)
        ).let{repositorioCanciones.saveAll(it)}

        val response = api.get("/cancion/")

        asserThat(response.statusCode, `is`(HttpStatus.OK))
        asserThat(response.body, equalTo(canciones.toTypedArray()))
    }

}
