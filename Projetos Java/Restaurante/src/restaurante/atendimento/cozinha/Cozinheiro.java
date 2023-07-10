package restaurante.atendimento.cozinha;

public class Cozinheiro {
	public void ReceberPedido() {
		System.out.println("Recebendo pedido do atendente...");
	}
	
	private void LerPedido() {
		System.out.println("Lendo o pedido...");
	}
	
	private void RealizarPedido() {
		System.out.println("Fazendo o pedido do cliente...");
	}
	
	public void EntregarPedido() {
		System.out.println("Entregando pedido para o atendente...");
	}
	
	public void FazerRequerimento() {
		System.out.println("fazendo requerimento de item para o Almoxarife...");
	}
	
	
}
