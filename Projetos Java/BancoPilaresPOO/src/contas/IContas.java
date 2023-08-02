package contas;

public interface IContas {
	void sacar(double saque);
	void depositar(double deposito);
	void tranferir(double transf, Contas contaDestino);
	void imprimirExtrato();
}
