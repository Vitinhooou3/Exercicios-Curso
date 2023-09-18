package com.funtec.gerenciadorfuncionario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.funtec.gerenciadorfuncionario.model.Funcionario;
import com.funtec.gerenciadorfuncionario.repository.FuncionarioRepository;

@Controller
public class HomeController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	@GetMapping("/home")
	public String home(Model model) {
		
		List<Funcionario> funcionarios = funcionarioRepository.findAll();	
		
		model.addAttribute("funcionarios", funcionarios);
		return "home";
	}
	
}
