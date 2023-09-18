package com.academia.academiadigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia.academiadigital.repository.AlunoRepository;
import com.academia.academiadigital.model.Aluno;
import com.academia.academiadigital.model.AvaliacaoFisica;
import com.academia.academiadigital.model.form.AlunoForm;
import com.academia.academiadigital.model.form.AlunoUpdateForm;
import com.academia.academiadigital.service.IAlunoService;
import com.academia.academiadigital.service.impl.AlunoServiceImpl;

@Service
public class AlunoServiceImpl implements IAlunoService {
	
	@Autowired
	private AlunoRepository repository;
		
	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setBairro(form.getBairro());
		aluno.setCpf(form.getCpf());
		aluno.setDataDeNascimento(form.getDataDeNascimento());
		return repository.save(aluno);

	}

	@Override
	public Aluno get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

 
	@Override
	public Aluno update(Long id, AlunoUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aluno delete(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> getAll(String dataDeNascimento) {
		return repository.findAll();
	}

}
