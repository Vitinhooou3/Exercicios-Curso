package Contador;
import java.util.Scanner;

import Exceção.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digie o parametro 1: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o parametro 2: ");
        int parametroDois = sc.nextInt();
        sc.close();

        try{
            contar(parametroUm, parametroDois);
            int contagem = parametroDois - parametroUm;
            System.out.println(contagem);
        }catch(ParametrosInvalidosException exception){
            System.out.println("O parametro 1 é maior que o parametro 2");
        }
    }

    public static void contar(int parametroUm , int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException(); 
        }

    }

}
