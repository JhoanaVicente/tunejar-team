package com.tunejar

import com.tunejar.repositorio.RepositorioCanciones
import com.tunejar.repositorio.Songs
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.ActiveProfiles


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class TunejarApplicationTests {
    @Autowired
    private lateinit var api: TestRestTemplate

    @Autowired
    private lateinit var repositorioCanciones: RepositorioCanciones

    @Test
    fun `Return a list of songs`() {
       val songs = listOf(
            Songs(
                "https://cdns-images.dzcdn.net/images/cover/04914ec5fd3d7c7332cf597b20085ef4/350x350.jpg",
                "Fito y Fitipaldis",
                "Soldadito Marinero",
                "Pop Rock",
                2003
            ),
            Songs(
                "https://tse3.mm.bing.net/th?id=OIP.BRnGT23SKPg7BH9N4pqqNwHaHa&pid=Api&P=0",
                "Maluma",
                "Felices los 4",
                "Salsa",
                2018
            ),
            Songs(
                "https://i.discogs.com/fYgMzw1OiJ8ld9SecrRgxol07e6vq1QDXKm7hKgQ1pg/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9SLTIwOTg3/MTczLTE2MzY5NzQ2/ODgtMTk5MS5qcGVn.jpeg",
                "Manolo García",
                "Insurrección",
                "Jangle Pop",
                1986
            )
       ).let {repositorioCanciones.saveAll(it)}


        val response = api.getForEntity("/songs", Array<Songs>::class.java)

        assertThat(response.statusCode, `is`(HttpStatus.OK))
        assertThat(response.body?.toList(), equalTo(songs))
    }
}







