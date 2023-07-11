package Metodos.Getter;

import java.util.Scanner;

public class UsandoGetSet {
	public static void main(String[] args) {
		Futebol fut = new Futebol();
		Scanner sc = new Scanner(System.in);
		String time;
		
		System.out.println("Escreva o nome do seu time: ");
		
		time = sc.nextLine();
		
		fut.setTime(time);
		fut.MostrarTime();
		
		sc.close();
		
	}
}
