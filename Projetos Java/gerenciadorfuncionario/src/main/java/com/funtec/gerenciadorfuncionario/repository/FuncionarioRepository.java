package com.funtec.gerenciadorfuncionario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.funtec.gerenciadorfuncionario.model.Funcionario;
import com.funtec.gerenciadorfuncionario.model.FuncionarioSetor;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
	List<Funcionario> findBySetor(FuncionarioSetor funcionarioSetor);
}
