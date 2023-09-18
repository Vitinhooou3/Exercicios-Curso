package Temperatura;

import java.util.ArrayList;
import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		ArrayList<Double> temp = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
        while (true) {
            if (count == 12) break;

            System.out.print("Digite a temperatura do mês: ");
            double temperatura = scan.nextDouble();
            temp.add(temperatura);
            count++;
        }
        
        System.out.println("------------------------");
        System.out.println("Janeiro - " + temp.get(0) + "°C");
        System.out.println("Fevereiro - " + temp.get(1) + "°C");
        System.out.println("Março - " + temp.get(2) + "°C");
        System.out.println("Abril - " + temp.get(3) + "°C");
        System.out.println("Maio - " + temp.get(4) + "°C");
        System.out.println("Junho - " + temp.get(5) + "°C");
        System.out.println("Julho - " + temp.get(6) + "°C");
        System.out.println("Agosto - " + temp.get(7) + "°C");
        System.out.println("Setembro - " + temp.get(8) + "°C");
        System.out.println("Outubro - " + temp.get(9) + "°C");
        System.out.println("Novembro - " + temp.get(10) + "°C");
        System.out.println("Dezembro - " + temp.get(11) + "°C");
        
        double media1 = (temp.get(0) + temp.get(1) + temp.get(2) + temp.get(3) + temp.get(4) + temp.get(5))/6;
        double media2 = (temp.get(6) + temp.get(7) + temp.get(8) + temp.get(9) + temp.get(10) + temp.get(11))/6;
        
        System.out.println("------------------------");
        System.out.println("Temperatura Média do 1° Semestre: " + media1 + "°C");
        
        System.out.println("A média  foi superada em:");
        if (temp.get(0) > media1) {
        	System.out.println("Janeiro - " + temp.get(0) + "°C");
        }
        if (temp.get(1) > media1) {
        	System.out.println("Fevereiro - " + temp.get(1) + "°C");
        }
        if (temp.get(2) > media1) {
        	System.out.println("Março - " + temp.get(2) + "°C");
        }
        if (temp.get(3) > media1) {
        	System.out.println("Abril - " + temp.get(3) + "°C");
        }
        if (temp.get(4) > media1) {
        	System.out.println("Maio - " + temp.get(4) + "°C");
        }
        if (temp.get(5) > media1) {
        	System.out.println("Junho - " + temp.get(5) + "°C");
        }
        
        System.out.println("------------------------");
        System.out.println("Temperatura Média do 2° Semestre: " + media2 + "°C");
        
        System.out.println("A média  foi superada em:");
        if (temp.get(6) > media2) {
        	System.out.println("Julho - " + temp.get(0) + "°C");
        }
        if (temp.get(7) > media2) {
        	System.out.println("Agosto - " + temp.get(1) + "°C");
        }
        if (temp.get(8) > media2) {
        	System.out.println("Setembro - " + temp.get(2) + "°C");
        }
        if (temp.get(9) > media2) {
        	System.out.println("Outubro - " + temp.get(3) + "°C");
        }
        if (temp.get(10) > media2) {
        	System.out.println("Novembro - " + temp.get(4) + "°C");
        }
        if (temp.get(11) > media2) {
        	System.out.println("Dezembro - " + temp.get(5) + "°C");
        }
        
        scan.close();
	}
}
