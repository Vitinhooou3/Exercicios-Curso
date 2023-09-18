package com.academia.Academiabase.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.academia.Academiabase.model.Aluno;

public interface AlunoRepository extends JpaRepository <Aluno, Long>{
}
