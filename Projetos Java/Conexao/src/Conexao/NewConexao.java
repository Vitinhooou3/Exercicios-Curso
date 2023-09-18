package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NewConexao {

	        // 1 - NÃO ESQUECER DE BAIXAR O DRIVER PARA O BANCO DE DADOS QUE IRÁ UTILIZAR! (Como demonstrado na parte 1 do curso)

	        // 2 - Definir parâmetros para se conectar ao banco de dados postgres.
	        String driver = "org.postgresql.Driver";
	        String dataBaseAddress = "localhost";
	        String dataBaseName = "aulabd";
	        String user = "postgres";
	        String password = "11111111";
	        
	        
	       /* 
	    	private final static String driver = "org.postgresql.Driver";
	    	private final static String usuario = "postgres";
	    	private final static String senha = "111111111";
	    	private final static String host = "localhost";
	    	private final static String porta = "5432";
	    	private final static String banco = "aulabd";
	    	//private final static String url =  "jdbc:postgresql://localhost:5432/aulabd";
	    	private final static String url =  "jdbc:postgresql://" + host + ":" + porta + "/" + banco;
	    	private static ConnectionJdbc conexao = null;
	    	
	        */

	        // 3 - Construção da string de conexão.
	        StringBuilder sb = new StringBuilder("jdbc:")
	                .append(driver).append("://")
	                .append(dataBaseAddress).append("/")
	                .append(dataBaseName);

	        String connectionUrl = sb.toString(); //sb.toString() == "jdbc:mysql://localhost/aulacon"

	        //Carregar a classe específica de implementação do driver na memória da JVM. (A partir da versão JDBC 4 não é mais necessário!!!)
	        //Class.forName("org.postgresql.Driver");

	        // 4 - Criar conexão usando o DriverManager, passando como parâmetros a string de conexão, usuário e senha do usuário.
	        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)) {
	            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
	        } catch (SQLException e) {
	            System.out.println("FALHA ao se conectar ao banco MySQL!");
	            e.printStackTrace();
	        }

	    }
	}
	
	
	

