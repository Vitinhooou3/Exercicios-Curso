import java.sql.Connection;
import java.util.List;
import java.util.Scanner;



public class ConexaoTeste {

	 public static void main(String[]args){
	        
	        //Conectar no SGBD
	        Connection con = Conexao.conectar();
	        
	        if( con!= null){
	            System.out.println("Conexão realizada com sucesso!");
	            Conexao.desconectar(con);
	        }
	        
	        
	        Aluno aluno = new Aluno();
	        Scanner scan = new Scanner(System.in);
	        Scanner scan1 = new Scanner(System.in);
	        
	        System.out.println("Digite o nome do aluno: ");
	        aluno.setNome(scan.nextLine());
	        System.out.println("Digite a idade do aluno: ");
	        aluno.setIdade(scan.nextInt());
	        System.out.println("Digite o estado do aluno: ");
	        aluno.setEstado(scan1.nextLine());
	        System.out.println("escreva o Id de update");
	        aluno.setId(scan1.nextInt());
	        
	        
	        scan.close();
	        scan1.close();
	        System.out.println(aluno);
	        
	        AlunoDAO dao = new AlunoDAO();
	        dao.atualizar(aluno);
	        
	        List<Aluno> lista = dao.listar();
	        
	     
	        
	        lista.stream().forEach(System.out::println);
	        
	    
	    }
	 
	 
	 
	
}