package com.funtec.meuprimeiroapi.repository;
import java.util.ArrayList; 
import java.util.List; 
import org.springframework.stereotype.Repository; 
import com.funtec.meuprimeiroapi.model.User; 

@Repository
public class UserRepository {
	public void save(User usuario) { 
		
		
		 if(usuario.getId()==null) 
		 System.out.println("SAVE - Recebendo o usuário na camada de repositoório "); 
		 else 
		 System.out.println("UPDATE -Recebendo o usuário na camada de repositoório "); 
		 
		 System.out.println(usuario); 
		 } 
		 
		 public void deleteById(Integer id) { 
		 System.out.println(String.format("DELETE/id - Recebenso o id: %d para delete", id )); 
		 System.out.println(id); 
		 } 
		 public List<User> findAll(){ 
		 System.out.println("LIST - Listando os usuários do sistema"); 
		 List<User> usuarios = new ArrayList<>(); 
		 usuarios.add(new User("shirlei", "123456")); 
		 usuarios.add(new User("paulo", "654321")); 
		 return usuarios; 
		 } 
		 
		 public User findById(Integer id) { 
		 System.out.println(String.format("FIND/id - Recebenso o id: %d para localizar um usuário", id )); 
		 return new User("shirlei", "123456"); 
		 } 
		 
		 public User findByUsername(String username) { 
		 System.out.println(String.format("FIND/username - Recebendo o username: %s ", username)); 
		 return new User("shirlei", "123456");
		 }} 

