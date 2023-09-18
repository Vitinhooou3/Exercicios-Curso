package ExercicioList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima?");
        String resp1 = sc.nextLine();
        respostas.add(resp1.toLowerCase());

        System.out.println("Esteve no local do crime?");
        String resp2 = sc.nextLine();
        respostas.add(resp2.toLowerCase());

        System.out.println("Mora perto da vítima?");
        String resp3 = sc.nextLine();
        respostas.add(resp3.toLowerCase());

        System.out.println("Devia para a vítima?");
        String resp4 = sc.nextLine();
        respostas.add(resp4.toLowerCase());

        System.out.println("Já trabalhou com a vítima?");
        String resp5 = sc.nextLine();
        respostas.add(resp5.toLowerCase());

        sc.close();

        int totalRespostasPositivas = 0;

        for (String resp : respostas) {
            if (resp.contains("s"))
                totalRespostasPositivas++;
        }

        switch (totalRespostasPositivas) {
            case 2 -> System.out.println("-----------------\nVoce é Suspeito");
            case 3, 4 -> System.out.println("-----------------\nVoce é Cúmplice");
            case 5 -> System.out.println("-----------------\nVoce é Culpado");
            default -> System.out.println("-----------------\nVoce é Inocente");
        }
    }
}
