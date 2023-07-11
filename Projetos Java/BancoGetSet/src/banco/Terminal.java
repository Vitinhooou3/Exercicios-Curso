package banco;

import java.util.Scanner;

import usuário.Usuario;

public class Terminal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		System.out.println("Nos informe seus dados cadastrais: ");
		usuario.setNome(sc.nextLine());
		usuario.setCpf(sc.nextLine());
		usuario.setIdade(sc.nextInt());
		
		System.out.println("Informe em qual banco você deseja criar a conta:");		
		usuario.setBanco(sc.nextLine());
		usuario.setNumeroConta("300310");
		
		System.out.println("Bem vindo ao banco " + usuario.getNome() + "Inscrito no CPF: " + usuario.getCpf() + "No banco " + usuario.getBanco());
		
		
		sc.close();
		
	}
}
