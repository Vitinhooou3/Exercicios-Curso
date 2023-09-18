import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AlunoDAO {

		private Connection con;
	    private PreparedStatement cmd;
	    
	    public AlunoDAO(){
	        this.con = Conexao.conectar();
	    }
	    
	   
	    public int inserir(Aluno a){
	        try {
	            String SQL = "insert into tb_aluno "
	                       + "(nome,idade,estado) values (?,?,?)";
	            
	            cmd = con.prepareStatement(SQL); // vai verificar se o codigo de cima te certo 
	            // e se der errado cai no catch
	            cmd.setString(1, a.getNome()); // colocar o usuario no primeiro parametro
	            cmd.setInt(2,a.getIdade());// colocar senha no segundo parametro
	            cmd.setString(3, a.getEstado());
	            
	            //envia a instrução SQL para o banco
	            if (cmd.executeUpdate() > 0){
	                //operação realizada com sucesso
	                return 1;   //OK
	            }else{
	                return -1;  // ERRO
	            }
	            
	        } catch (SQLException e) {
	            System.err.println("ERRO: " + e.getMessage());
	            return -1;
	        }finally{
	            Conexao.desconectar(con);
	        }
	    }
	    
	    public int atualizar(Aluno a){
	         try {
	        	 this.con = Conexao.conectar();
	            String SQL = "update tb_aluno set nome=?, idade=?, estado=? where id=?";
	            
	            cmd = con.prepareStatement(SQL); // vai verificar se o codigo de cima te certo 
	            // e se der errado cai no catch
	            cmd.setString(1, a.getNome()); // colocar o usuario no primeiro parametro
	            cmd.setInt(2, a.getIdade());
	            cmd.setString(3,a.getEstado());// colocar senha no segundo parametro
	            cmd.setInt(4,a.getId());
	            //envia a instrução SQL para o banco
	            if (cmd.executeUpdate() > 0){
	                //operação realizada com sucesso
	                return 1;   //OK
	            }else{
	                return -1;  // ERRO
	            }
	            
	        } catch (SQLException e) {
	            System.err.println("ERRO: " + e.getMessage());
	            return -1;
	        }finally{
	            Conexao.desconectar(con);
	        }
	    }
	    
	    public List<Aluno> listar(){
	         try {
	        	 this.con = Conexao.conectar();
	        	String SQL = "select * from tb_aluno";
	            cmd = con.prepareStatement(SQL);
	            
	            //executar a consulta
	            List<Aluno> lista = new ArrayList<>();
	            ResultSet rs = cmd.executeQuery();
	            while (rs.next()){
	                Aluno al = new Aluno();
	                al.setId(rs.getInt("id"));
	                al.setNome(rs.getString("nome"));
	                al.setIdade(rs.getInt("idade"));
	                al.setEstado(rs.getString("estado"));
	                lista.add(al);
	            }
	            return lista;
	        } catch (SQLException e) {
	            System.err.println("ERRO: " + e.getMessage());
	            return null;
	        }finally{
	            Conexao.desconectar(con);
	        }
	    }
	  
	    
	    
	}

	
