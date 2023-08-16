package edu.aluno.funtec.model.serviços;

public class Msn extends ServiçoMensagem {
		public void enviarMensagem() {
				validarInternet();
				System.out.println("Eviando mensagem pelo MSN");
				
		}
		public void receberMensagem() {
			System.out.println("Recebendo mensagem pelo MSN");
		}
		
		
}
