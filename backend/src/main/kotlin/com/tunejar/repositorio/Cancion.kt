package com.tunejar.repositorio

import jakarta.persistence.*

@Table(name ="musica")
@Entity
data class Cancion(
    var coverUrl: String,
    var author: String,
    var title: String,
    var generoMusical: String,
    var releaseYear: Int,

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    var id:Long? = null
)

