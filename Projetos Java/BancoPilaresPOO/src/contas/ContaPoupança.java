package contas;

public class ContaPoupança extends Contas{
	public void imprimirExtrato() {
		System.out.println("Seu saldo é " + saldo);
	}

	@Override
	public void tranferir(double transf, Contas contaDestino) {
		
	}
}
