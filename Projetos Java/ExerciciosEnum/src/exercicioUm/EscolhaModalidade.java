package exercicioUm;

public class EscolhaModalidade {
	public static void main(String[] args) {
		for(ModalidadeEsportiva mod: ModalidadeEsportiva.values()) {
			System.out.println(mod.getCodigo() + " - " + mod.getAbreviacao());
		}
		
		ModalidadeEsportiva modSel = ModalidadeEsportiva.GINASTICA;
		
	}
}
