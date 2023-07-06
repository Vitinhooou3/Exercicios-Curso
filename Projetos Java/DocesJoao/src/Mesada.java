import java.util.concurrent.ThreadLocalRandom;


public class Mesada {
    public static void main(String[] args) {
        int mesada = 50;

        while(mesada > 0){
            int valorDoce = (int) valorAleatorio();
            if(valorDoce < mesada){
            mesada -= valorDoce;
            }else{
                System.out.println("joao acabou com sua mesada");
                break;
            }

            System.out.println("mesada: " + mesada);
        }
    
    }

    private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextInt(2,5);
    }
}
