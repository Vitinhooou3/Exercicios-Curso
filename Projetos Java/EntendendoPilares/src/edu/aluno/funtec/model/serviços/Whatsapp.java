package edu.aluno.funtec.model.serviços;

public class Whatsapp extends ServiçoMensagem {
		public void enviarMensagem() {
			validarInternet();
			System.out.println("Enviando mensagem pelo Whatsapp");
		}
		public void receberMensagem() {
			System.out.println("Recebendo mensagem pelo Whatsapp");
		}

}
