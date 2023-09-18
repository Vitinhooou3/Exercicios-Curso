package list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class SusOrNot {
	public static void main(String[] args) {
		
			ArrayList<String> respostas = new ArrayList<>();
			
			
			
			Scanner sc = new Scanner(System.in);
			
			String resp;
			
				
			System.out.println("Telefonou para a vítima?");
			resp = sc.nextLine();
			respostas.add(resp.toLowerCase());
			
			System.out.println("Esteve no local do crime?");
			resp = sc.nextLine();
			respostas.add(resp.toLowerCase());
			
			System.out.println("Mora perto da vítima?");
			resp = sc.nextLine();
			respostas.add(resp.toLowerCase());
			
			System.out.println("Devia para a vítima?");
			resp = sc.next();
			respostas.add(resp.toLowerCase());
			
			System.out.println("Já trabalhou com a vítima?");
			resp = sc.next();
			respostas.add(resp.toLowerCase());
			
			System.out.println(respostas);
			Iterator<String> contador = respostas.iterator();
			int count = 0;
			while(contador.hasNext()) {
				String Answer = contador.next();
				if (Answer.contains("s")) {
					count++;
					System.out.println();
				}
			}
			
			
			
			if (count < 2) {
				System.out.println("tá safe");
			}else if (count == 5) {
				System.out.println("Matou o veio");
			}else{
				System.out.println("Olha lá hein");
			}
			
			sc.close();
			
	}

	
}
