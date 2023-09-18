package list;


import java.util.ArrayList;
import java.util.Scanner;


public class ListaTemp {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			ArrayList<Integer> temperatura = new ArrayList<>();
			ArrayList<String> meses = new ArrayList<>();
			
			int temp;
			double media = 0;
			
			meses.add("Janeiro");
			meses.add("Fevereiro");
			meses.add("Março");
			meses.add("Abril");
			meses.add("maio");
			meses.add("Junho");
			
			
			for (int i = 0; i <  6; i++) {
				System.out.println("Insira a temperatura dos mês " + (i+1) + ":");
				temp = sc.nextInt();
				temperatura.add(temp);
				
				media += temperatura.get(i);
			}
			
			media = media / temperatura.size();
			System.out.println(media);
			
			for (int i = 0; i < temperatura.size(); i++) {
				int mesTemp = 0;
				
				mesTemp = temperatura.get(i);
				
				if ( media <= mesTemp) {
				
					System.out.println("Mes: " + meses.get(i) + " temperatura " + temperatura.get(i));
					
				}
			}
			sc.close();		
			
		}

}
