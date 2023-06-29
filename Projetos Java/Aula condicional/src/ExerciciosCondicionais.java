import javax.sound.midi.Soundbank;

public class ExerciciosCondicionais {
    public static void main(String[] args) {
        int numeroComeco = 150;
        int soma1 = 1;
        int soma2 = 0;
        int multiplo3 = 3;
        int fatorial1 = 1;
        int fatorial2 = 1;

        while(numeroComeco < 300){
            numeroComeco = numeroComeco + 1;
            System.out.println(numeroComeco);
        }
        System.out.println("soma até 1000");

        for (int i = 1; i < 1001; i ++){
            soma1 += i;
            System.out.println(soma1);
        }

        while (soma1 < 1001){
            soma1 = soma1 + 1;
            soma2 = soma1 + soma2;
            System.out.println(soma2);
        }

        while (multiplo3 < 100){
            multiplo3 = multiplo3 + 3;
            System.out.println(multiplo3);
        }

        System.out.println("Fatorial");
        for(int i = 1; i < 11; i ++){
            fatorial1 *= i;
            System.out.println(fatorial1);
        }

        for(int i = 1; i < 41; i++){
            fatorial2 *= i;
            System.out.println(fatorial2);
        }
            
    }
}
