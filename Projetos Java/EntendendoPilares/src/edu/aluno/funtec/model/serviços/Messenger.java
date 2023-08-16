package edu.aluno.funtec.model.serviços;

public class Messenger extends ServiçoMensagem {
	public void enviarMensagem() {
		validarInternet();
		System.out.println("Enviando mensagem pelo Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Messenger");
	}
}
