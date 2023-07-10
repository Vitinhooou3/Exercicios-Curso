package restaurante.area.cliente;


public class Cliente {
	private void LerCardapio() {
		System.out.println("Lendo cardápio...");
	}
	public void ChamarAtendente() {
		System.out.println("Chamando atendente...");
	}
	public void FazerPedido() {
		System.out.println("Fazendo pedido...");
	}
	private void EsperarPedido() {
		System.out.println("Esperando pedido...");
	}
	public void ReceberPedido() {
		System.out.println("Recebendo pedido...");
	}
	private void ComendoPedido() {
		System.out.println("Comendo pedido...");
	}
	public void PedirConta() {
		System.out.println("Pedindo conta");
	}
	public void PagarConta() {
		ConsultarSaldo();
		System.out.println("Pagando conta...");
	}
	public void ConsultarSaldo() {
		System.out.println("Consultando saldo");
		
	}
	
}
