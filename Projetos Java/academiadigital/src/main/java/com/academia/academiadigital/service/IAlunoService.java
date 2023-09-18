package com.academia.academiadigital.service;
import com.academia.academiadigital.model.*;
import com.academia.academiadigital.model.form.*;
import java.util.List;

public interface IAlunoService {
	Aluno create(AlunoForm form);
	
	Aluno get(Long id);
	
	Aluno update(Long id, AlunoUpdateForm formUpdate);
	
	Aluno delete(long id);

	List<Aluno> getAll(String dataDeNascimento);
}
