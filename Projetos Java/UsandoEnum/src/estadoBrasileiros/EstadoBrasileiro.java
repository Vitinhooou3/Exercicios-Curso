package estadoBrasileiros;

public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo", "Sudeste", 35),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", "Sudeste", 33),
	PIAUI ("PI", "Piaui", "Nordeste", 22),
	MARANHAO ("MA", "Maranhão", "Nordeste", 21);


	private String nome;
	private String sigla;
	private String regiao;
	private int codigo;
	
	private EstadoBrasileiro(String sigla, String nome, String regiao, int codigo) {
		this.sigla = sigla;
		this.nome = nome;
		this.codigo = codigo;
		this.regiao = regiao;
		
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}
		
	public int getCodigo() {
		return codigo;
	}
	
	public String getRegiao() {
		return regiao;
	}
}
