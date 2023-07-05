

public class Conta {

    String titular = "";
    int numeroConta = 3003/1;
    String nomeBanco = "";
    double saldoDisponivel = 2000;
    String dataAbertura = "";
    

    public void sacar(int valorSaque){
        this.saldoDisponivel -= valorSaque;

        System.out.println("O seu novo saldo é de: " + saldoDisponivel);
    }

    public void depositar(int valorDeposito){
        this.saldoDisponivel += valorDeposito;

        System.out.println("O seu novo saldo é de: " + saldoDisponivel);

    }

    public void calcular(){
        this.saldoDisponivel *= 0.1;

    }

}
