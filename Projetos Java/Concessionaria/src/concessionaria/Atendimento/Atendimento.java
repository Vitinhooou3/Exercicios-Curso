package concessionaria.Atendimento;

import concessionaria.Enum.Veiculos;
import java.util.Scanner;

public class Atendimento {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(Veiculos car: Veiculos.values()) {
			System.out.println("Nome: " + car.getNome() + car.getMaleiro()+ " Litros " + car.getPorta() + " portas");
		}
		
		System.out.println("Digite uma opção de 1 à 4: ");
		String resp = sc.nextLine();
		Veiculos nomeCarro = null;
		
		for(Veiculos car: Veiculos.values()) {
			if (resp.equalsIgnoreCase(car.getNome())) {
				nomeCarro = car;
				System.out.println("O carro escolhido foi: " + car.getNome() + " " + car.getMaleiro() + " " + car.getPorta() );
			}
		}
			if (nomeCarro != null) {
				System.out.println("O modelo está correto");
			}else {
				System.out.println("O modelo está errado");
			}
	}
}
