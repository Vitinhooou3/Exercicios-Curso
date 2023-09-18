package Investigacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Investigar {
	public static void main(String[] args) {
		ArrayList<String> inv = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----------------------------");
		System.out.println("Investigação Policial...");
		System.out.println("Responda 'sim' ou 'nao'");
		
		System.out.println("Você telefonou para a vítima?");
		String resposta = scan.next();
		inv.add(resposta.toLowerCase());
		System.out.println("Você era próximo da vítima?");
		resposta = scan.next();
		inv.add(resposta.toLowerCase());
		System.out.println("Você já esteve no local do crime?");
		resposta = scan.next();
		inv.add(resposta.toLowerCase());
		System.out.println("Você vive próximo à vítima?");
		resposta = scan.next();
		inv.add(resposta.toLowerCase());
		System.out.println("Você tinha alguma dívida com a vítima?");
		resposta = scan.next();
		inv.add(resposta.toLowerCase());
		System.out.println("Já trabalhou com a vítima?");
		resposta = scan.next();
		inv.add(resposta.toLowerCase());
		
		int count = 0;
        Iterator<String> contador = inv.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("sim")) {
                count ++;
            }
        }
        System.out.println("Declarado como: ");
        switch (count) {
		
        case 2: 
			System.out.println("Suspeito");
		break;
        case 3:
        	System.out.println("Cúmplice");
        break;
        case 4:
        	System.out.println("Cúmplice");
        break;
        case 5:
        	System.out.println("Assassino");
        break;
        case 6:
        	System.out.println("Assassino");
        break;
		default:
			System.out.println("Inocente");
        }
		
		scan.close();
	}
}
