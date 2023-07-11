package Metodos.Getter;

public class Futebol {
	
	private String nomeTime;
	private String tecnico;
	
	public void setTime(String meuTime) {
	
	nomeTime = meuTime;
	}
	
	public String getTime() {
		return nomeTime;
	}
	
	public void MostrarTime() {
		System.out.println("Seu time é: " + getTime());
	}
	
	public String getTecnico() {
		return tecnico;
	}
	
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
}
