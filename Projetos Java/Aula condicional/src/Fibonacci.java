public class Fibonacci {
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;

        System.out.println("Fibonacci");
        while (atual < 100){
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            System.out.println(atual);
        }
    }
}
