package conexao;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionJdbc {

    
	
	private final static String driver = "org.postgresql.Driver";
	private final static String usuario = "postgres";
	private final static String senha = "shi192837";
	private final static String host = "localhost";
	private final static String porta = "5432";
	private final static String banco = "Aulacon";
	private final static String url =  "jdbc:postgresql://localhost:5432/aulabd;
	private final static String url =  "jdbc:postgresql://" + host + ":" + porta + "/" + banco;
	private static ConnectionJdbc conexao = null;
	
	public static ConnectionJdbc conectar() {
	 try {
		 Class.forName(driver);
		 conexao = (ConnectionJdbc) DriverManager.getConnection(url, usuario, senha);
		 System.out.println("Conexão efetuada com sucesso");
	 
	 }catch (Exception ex) {
		ex.printStackTrace();
		//System.out.println("falou");
	}
 return conexao;
}
	
	/*public void fechar() {
		try {
			conexao.close();
			System.out.println("Conexão encerrada");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	 */
	}
