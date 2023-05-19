package com.tunejar.controllers

import com.tunejar.repositorio.Songs
import com.tunejar.repositorio.RepositorioCanciones

import org.springframework.web.bind.annotation.*

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@CrossOrigin
class CancionController(private val repositorioCanciones: RepositorioCanciones) {

    private val miLista: MutableList<Songs> = mutableListOf()

    @GetMapping("/songs")
    fun allCancion(): List<Songs> {
        return repositorioCanciones.findAll()
    }


}




