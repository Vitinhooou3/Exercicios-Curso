package exercicioUm;

public enum ModalidadeEsportiva {
	FUTEBOL (1, "Fut"),
	GINASTICA (2, "Gin"),
	NATAÇAO (3, "Nat"),
	ATLETISMO (4, "Atl");
	
	private int codigo;
	private String abreviacao;
	
	private ModalidadeEsportiva(int codigo, String abreviacao){
		this.codigo = codigo;
		this.abreviacao = abreviacao;
	}

	public int getCodigo() {
		return codigo;
	}



	public String getAbreviacao() {
		return abreviacao;
	}
}
