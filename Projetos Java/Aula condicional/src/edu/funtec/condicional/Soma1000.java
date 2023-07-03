package edu.funtec.condicional;
public class Soma1000 {
    public static void main(String[] args) {
        int soma1 = 1;

        System.out.println("somatória até 1000");
        for (int i = 1; i < 1001; i ++){
            soma1 += i;
            System.out.println(soma1);
        }

    }
}
