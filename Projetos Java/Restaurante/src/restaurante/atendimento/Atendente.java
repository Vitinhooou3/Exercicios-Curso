package restaurante.atendimento;

public class Atendente {
	
	public void ReceberPedidoCliente() {
		System.out.println("Recebendo pedido do cliente...");
	}
	public void EncaminharPedido() {
		System.out.println("Encaminhando pedido para a cozinha...");
	}
	private void EsperarPedido() {
		System.out.println("Esperando pedido ficar pronto...");
	}
	public void LevarPedido() {
		System.out.println("Levando pedido para o cliente...");
	}
	
	public void EntregarPedido() {
		System.out.println("Entregando pedido do cliente...");
	}
	
	
}
