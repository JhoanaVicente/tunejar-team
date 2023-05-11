package com.tunejar.controllers


import com.tunejar.repositorio.Songs
import com.tunejar.repositorio.RepositorioCanciones
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
class CancionController(private val repositorioCanciones: RepositorioCanciones) {

    @GetMapping("/hello")
    fun hola(): String = "Hola desde el backend"

    @GetMapping("/songs")
    fun allCancion(): List<Songs?>? {
        return repositorioCanciones.findAll()
    }

    @GetMapping("/songs/{id}")
    fun findCancion(@PathVariable id: Long): Songs? {
        return repositorioCanciones.findById(id).orElseThrow { SongsNotFoundException() }
    }

    @PostMapping("/songs")
    fun addCancion(@RequestBody cancion: Songs): Songs? {
        return repositorioCanciones.save(cancion)
    }

    @PutMapping("/songs")
    fun updateCancionById(@RequestBody cancion: Songs): Songs? {
        cancion.id?.let { repositorioCanciones.findById(it).orElseThrow { SongsNotFoundException() } }
        return repositorioCanciones.save(cancion)
    }

    @DeleteMapping("/songs/{id}")
    fun deleteCancionById(@PathVariable id: Long): Songs? {
        val cancion: Songs = repositorioCanciones.findById(id).orElseThrow { SongsNotFoundException() }
        repositorioCanciones.deleteById(id)
        return cancion
    }
}

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "songs not found")
class SongsNotFoundException: RuntimeException()

