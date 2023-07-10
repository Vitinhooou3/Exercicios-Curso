import java.util.Scanner;



public class Excessao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite seu nome:");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura:");
            double altura = sc.nextDouble();

        
        } catch (Exception e) {
            System.out.println("Erro: Nada foi informado em um dos scanners.");
        } finally {
            sc.close();
        }
    }
}
