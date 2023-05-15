package com.tunejar


import com.tunejar.repositorio.Songs
import com.tunejar.repositorio.RepositorioCanciones
import org.hamcrest.Matchers.equalTo
import org.hamcrest.Matchers.hasSize
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print



@SpringBootTest(
    classes = arrayOf(TunejarApplication::class),
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class TunejarApplicationTests(@Autowired val mockMvc: MockMvc) {

    @Autowired
    private lateinit var repositorioCanciones: RepositorioCanciones

    @AfterEach
    fun tearDown(){
        repositorioCanciones.deleteAll()
    }
    @Test
    @Throws(Exception::class)
    fun `return the existing songs`() {
        addTestSongs()
        mockMvc.perform(get("/Songs"))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$[*]", hasSize<Int>(3)))
            .andExpect(jsonPath("$[0].coverUrl", equalTo("https://cdns-images.dzcdn.net/images/cover/04914ec5fd3d7c7332cf597b20085ef4/350x350.jpg")))
            .andExpect(jsonPath("$[0].author", equalTo("Fito y Fitipaldis")))
            .andExpect(jsonPath("$[0].title", equalTo("Soldadito Marinero")))
            .andExpect(jsonPath("$[0].genre", equalTo("Pop Rock")))
            .andExpect(jsonPath("$[0].releaseYear", equalTo(2003)))
            .andExpect(jsonPath("$[1].coverUrl", equalTo("https://tse3.mm.bing.net/th?id=OIP.BRnGT23SKPg7BH9N4pqqNwHaHa&pid=Api&P=0")))
            .andExpect(jsonPath("$[1].author", equalTo("Maluma")))
            .andExpect(jsonPath("$[1].title", equalTo("Felices los 4")))
            .andExpect(jsonPath("$[1].genre", equalTo("Salsa")))
            .andExpect(jsonPath("$[1].releaseYear", equalTo(2018)) )
            .andExpect(jsonPath("$[2].coverUrl", equalTo("https://i.discogs.com/fYgMzw1OiJ8ld9SecrRgxol07e6vq1QDXKm7hKgQ1pg/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9SLTIwOTg3/MTczLTE2MzY5NzQ2/ODgtMTk5MS5qcGVn.jpeg")))
            .andExpect(jsonPath("$[2].author", equalTo("Manolo García")))
            .andExpect(jsonPath("$[2].title", equalTo("Insurrección")))
            .andExpect(jsonPath("$[2].genre", equalTo("Jangle Pop")))
            .andExpect(jsonPath("$[2].releaseYear", equalTo(1986)))
            .andDo(print())
    }

    private fun addTestSongs() {
        val songs: List<Songs> = listOf(
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

        )
            songs.forEach(repositorioCanciones::save)
    }
}



