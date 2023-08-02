package contas;

public abstract class Contas implements IContas {
	
	private static final int AGENCIA_PADRAO = 1; 
	private static int SEQUENCIAL = 1; 
	
	protected int agencia; 
	protected int numero; 
	protected double saldo; 
	 
	public void Conta() { 
	 this.agencia = Contas.AGENCIA_PADRAO; 
	 this.numero = SEQUENCIAL++; 
	 } 
	
	public void sacar(double valor) {
		if (saldo < valor) {
			System.out.println("Saldo inválido");
		}else {
			saldo -= valor;
		}

	} 
	public void depositar(double valor) { 
		saldo += valor;
	} 
	
	public void transferir(double valor, Contas contaDestino) { 
		this.sacar(valor);
		contaDestino.depositar(valor);
	} 
	
	protected void imprimirInformacoes() { 
		 System.out.println(String.format("Agencia: %d", this.agencia)); 
		 System.out.println(String.format("Número: %d", this.numero)); 
		 System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	public int getAgencia() { 
		return agencia; 
	} 
	
	public int getNumero() { 
		return numero; 
	} 
	
	public double getSaldo() { 
		return saldo; 
	} 

	
}
