package Aula1;
import java.sql.Connection;
import java.sql.SQLException;

public class Teste {


		public static void main(String[] args) {
			
			//gerar com botão direito surround...
	
			try {
				Connection con = Conecta.criarConexao();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			
		}
	
}
