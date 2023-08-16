package edu.aluno.funtec.model;

import edu.aluno.funtec.model.serviços.*;
public class Computador {
	public static void main(String[] args) { 
		 
		 ServiçoMensagem servico = null; 

		 String servicoEscolhido = "wpp"; 
		 
		 if(servicoEscolhido.equals("msg")) {
			 servico = new Msn(); 
		 }else if (servicoEscolhido.equals("fcb")) {
			 servico = new Messenger(); 
		 }else if (servicoEscolhido.equals("wpp")) {
			  servico = new Whatsapp(); 
		 }
		servico.enviarMensagem(); 
		servico.receberMensagem();
		
		}
	} 
