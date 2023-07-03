package edu.funtec.condicional;
public class Fatorial {
    
    public static void main(String[] args) {

        int fatorial1 = 1;
        int fatorial2 = 1;

        System.out.println("Fatorial1");
        for(int i = 1; i < 11; i ++){
            fatorial1 *= i;
            System.out.println("fat(" + i + ")= " + fatorial1);
        }

        System.out.println("Fatorial2");
        for(int i = 1; i < 41; i++){
            fatorial2 *= i;
            System.out.println("fat(" + i + ")= " + fatorial2);
        }

    }
    
}
