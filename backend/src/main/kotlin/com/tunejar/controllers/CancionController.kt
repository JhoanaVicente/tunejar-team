package com.tunejar.controllers


import com.tunejar.repositorio.Cancion
import com.tunejar.repositorio.RepositorioCanciones
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class CancionController(private val repositorioCanciones: RepositorioCanciones) {

    @GetMapping("/cancion")
    fun allCancion(): List<Cancion?>? {
        return repositorioCanciones.findAll()
    }

    @GetMapping("/cancion/{id}")
    fun findCancion(@PathVariable id: Long): Cancion? {
        return repositorioCanciones.findById(id).orElseThrow { CancionNotFoundException() }
    }

    @PostMapping("/cancion")
    fun addCancion(@RequestBody cancion: Cancion): Cancion? {
        return repositorioCanciones.save(cancion)
    }

    @PutMapping("/cancion")
    fun updateCancionById(@RequestBody cancion: Cancion): Cancion? {
        cancion.id?.let { repositorioCanciones.findById(it).orElseThrow { CancionNotFoundException() } }
        return repositorioCanciones.save(cancion)
    }

    @DeleteMapping("/cancion/{id}")
    fun deleteCancionById(@PathVariable id: Long): Cancion? {
        val cancion: Cancion = repositorioCanciones.findById(id).orElseThrow { CancionNotFoundException() }
        repositorioCanciones.deleteById(id)
        return cancion
    }
}

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "cancion not found")
class CancionNotFoundException: RuntimeException()

