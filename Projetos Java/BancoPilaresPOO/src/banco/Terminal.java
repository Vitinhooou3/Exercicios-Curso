package banco;
import contas.ContaCorrente;
import contas.ContaPoupança;
import contas.Contas;
import contas.IContas;

public class Terminal {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(); 
		 cc.depositar(100);
		 System.out.println(cc.getSaldo());
		 cc.sacar(300);
		 
		 Contas poupanca = new ContaPoupança(); 

		 cc.transferir(70, poupanca); 
		 	System.out.println(cc.getSaldo());
	
	}
}
