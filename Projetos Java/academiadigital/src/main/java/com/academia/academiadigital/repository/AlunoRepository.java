package com.academia.academiadigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academia.academiadigital.model.Aluno;

@Repository

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
}
