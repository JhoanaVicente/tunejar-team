package com.tunejar.repositorio

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface RepositorioCanciones: JpaRepository<Songs, Long>