package com.academia.academiadigital.model.form;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;


public class AlunoForm {
	 @NotEmpty(message = "Preencha o campo corretamente.")
	  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
	  private String nome;

	  @NotEmpty(message = "Preencha o campo corretamente.")
	  //@CPF(message = "'${validatedValue}' é inválido!")
	  private String cpf;

	  @NotEmpty(message = "Preencha o campo corretamente.")
	  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
	  private String bairro;
	  
	  @JsonFormat(pattern = "dd/MM/yyyy")
	  @NotNull(message = "Prencha o campo corretamente.")
	  @Past(message = "Data '${validatedValue}' é inválida.")
	  private LocalDate dataDeNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
}
