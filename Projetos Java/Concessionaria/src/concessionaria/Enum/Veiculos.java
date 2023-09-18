package concessionaria.Enum;

public enum Veiculos {
	SEDAN ("Onix", 4, 150),
	SUV ("HR-V", 4, 300),
	HATCH ("City", 4, 100),
	PERUA ("Palio", 4, 200);
	
	private String nome;
	private int porta;
	private int maleiro;
	
	public String getNome() {
		return nome;
	}

	public int getPorta() {
		return porta;
	}

	public int getMaleiro() {
		return maleiro;
	}

	private Veiculos(String nome, int porta, int maleiro) {
		this.nome = nome;
		this.maleiro = maleiro;
		this.porta = porta;
		
	}
}
