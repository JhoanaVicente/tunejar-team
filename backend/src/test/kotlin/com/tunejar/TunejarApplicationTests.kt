package com.tunejar


import com.tunejar.repositorio.Cancion
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
    fun `devolver la lista de canciones`() {
        addTestCanciones()
        mockMvc.perform(get("/cancion"))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$[*]", hasSize<Int>(3)))
            .andExpect(jsonPath("$[0].coverImage", equalTo("https://tse3.mm.bing.net/th?id=OIP.ruT15mxQwIgt8k_MgycTtQHaEK&pid=Api&P=0")))
            .andExpect(jsonPath("$[0].artista", equalTo("Fito y Fitipaldis")))
                .andExpect(jsonPath("$[0].nombreCancion", equalTo("Soldadito Marinero")))
                    .andExpect(jsonPath("$[0].generoMusical", equalTo("Pop Rock")))
                        .andExpect(jsonPath("$[0].releaseYear", equalTo(2003)))
                        .andExpect(jsonPath("$[1].coverImage", equalTo("https://tse3.mm.bing.net/th?id=OIP.BRnGT23SKPg7BH9N4pqqNwHaHa&pid=Api&P=0")))
                        .andExpect(jsonPath("$[1].artista", equalTo("Maluma")))
                            .andExpect(jsonPath("$[1].nombreCancion", equalTo("Felices los 4")))
                                .andExpect(jsonPath("$[1].generoMusical", equalTo("Salsa")))
                                    .andExpect(jsonPath("$[1].releaseYear", equalTo(2018)) )
                                        .andExpect(jsonPath("$[2].coverImage", equalTo("https://tse4.mm.bing.net/th?id=OIP.hoVIUhPoLh608K9KdvW_BgHaEk&pid=Api&P=0")))
                                        .andExpect(jsonPath("$[2].artista", equalTo("Manolo García")))
                                            .andExpect(jsonPath("$[2].nombreCancion", equalTo("Insurrección")))
                                                .andExpect(jsonPath("$[2].generoMusical", equalTo("Jangle Pop")))
                                                    .andExpect(jsonPath("$[2].releaseYear", equalTo(1986)))
                                                    .andDo(print())

    }
private fun addTestCanciones() {
    val canciones: List <Cancion> = listOf(
        Cancion(
            "https://tse3.mm.bing.net/th?id=OIP.ruT15mxQwIgt8k_MgycTtQHaEK&pid=Api&P=0",
            "Fito y Fitipaldis",
            "Soldadito Marinero",
            "Pop Rock",
            2003
        ),
        Cancion(
            "https://tse3.mm.bing.net/th?id=OIP.BRnGT23SKPg7BH9N4pqqNwHaHa&pid=Api&P=0",
            "Maluma",
            "Felices los 4",
            "Salsa",
            2018
        ),
        Cancion(
            "https://tse4.mm.bing.net/th?id=OIP.hoVIUhPoLh608K9KdvW_BgHaEk&pid=Api&P=0",
            "Manolo García",
            "Insurrección",
            "Jangle Pop",
            1986
        )
    )
      canciones.forEach(repositorioCanciones::save)


}
}

