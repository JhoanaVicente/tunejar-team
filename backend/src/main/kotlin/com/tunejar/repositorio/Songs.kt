package com.tunejar.repositorio

import jakarta.persistence.*

@Table(name ="musica")
@Entity
data class Songs(
    var coverUrl: String,
    var author: String,
    var title: String,
    var genre: String,
    var releaseYear: Int,

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    var id:Long? = null
)

