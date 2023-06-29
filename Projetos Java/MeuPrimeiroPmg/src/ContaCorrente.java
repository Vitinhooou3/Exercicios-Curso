public class ContaCorrente {
    public static void main(String[] args) {
        String banco = "Bradesco";
        String nome = "Shirley";
        double saldoInicial = 1000.00;
        double retirada = 2000.00;
        double saldoFinal = saldoInicial - retirada;

        if (banco.equalsIgnoreCase("Bradesco") && nome.equalsIgnoreCase("Shirley")){
            System.out.println("Os dados fornecidos batem com o seu cadastro");
            if (saldoInicial < retirada){
                System.out.println("O valor de retirada é maior do que o seu saldo disponível");
            }
            else{
                System.out.println("O saldo é suficiente para a retirada, restará um saldo de: " + saldoFinal);
            }
        }
        else{
            System.out.println("Um dos dados fornecidos não está correto, por favor verifique os dados fornecidos");
        }
        
    

        
    }
}
