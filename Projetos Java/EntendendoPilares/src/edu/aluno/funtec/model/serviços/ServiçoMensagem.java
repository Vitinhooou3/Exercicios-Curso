package edu.aluno.funtec.model.serviços;

public abstract class ServiçoMensagem {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected void validarInternet() {
		System.out.println("validando conexão");
	}
}	
