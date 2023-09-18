package com.funtec.meuprimeiroapi.controller;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.funtec.meuprimeiroapi.model.User; 
import com.funtec.meuprimeiroapi.repository.UserRepository; 
import java.util.List;


@RestController
public class UserController {
	 //agora vamos buscar a lista que esta em nosso repositorio
	 //colocamos o @Autowired, pra buscar nossa implementação, ele 
	//que contem a inteligencia
	
	@Autowired
	private UserRepository repository; 
	 
	@GetMapping("/users") 
	
	
	 
	 
	//metodo pra listar nossos usuarios
	
	 public List<User>getUsers(){ 
	 repository.findAll(); 
	 return repository.findAll(); 
	 
	 
 
	 }
	 
	@GetMapping("/users/{username}")
	//parametro q vier da url vamos buscar um usuário
	public User getOne(@PathVariable("username")String username){ 
	//com o @PathVariable veja a possição ou nome da variavel
	 return repository.findByUsername(username);
	}
}
