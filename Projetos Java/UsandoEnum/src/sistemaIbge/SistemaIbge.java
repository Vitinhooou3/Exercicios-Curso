package sistemaIbge;

import estadoBrasileiros.EstadoBrasileiro;

public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadoBrasileiro uf: EstadoBrasileiro.values()) {
			System.out.println(uf.getSigla() +  "-" + uf.getNome() + "-" + uf.getCodigo());
			
		}
		
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.SAO_PAULO;
		
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNome() + " - "+ ufSelecionado.getSigla() + " - "+ ufSelecionado.getCodigo() + " - " + ufSelecionado.getRegiao());
	}
}
