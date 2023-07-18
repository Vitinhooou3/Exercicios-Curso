package banco;

import java.util.Scanner;
import Exceptions.IdadeInsuficienteException;
import usuário.Usuario;

public class Terminal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Usuario usuario = new Usuario();
	


		System.out.println("Nos informe seus dados cadastrais");
		System.out.println("Nome: ");
		usuario.setNome(sc.nextLine());

		System.out.println("CPF: ");
		usuario.setCpf(sc.nextLine());

		try{
			System.out.println("Idade: ");
			usuario.setIdade(sc.nextInt());

			usuario.verificarIdade();
		}catch (IdadeInsuficienteException e){
			System.out.println("Ocorreu um erro: " + e.getMessage());	
			System.out.println("Acesso negado");
		
			System.exit(0);
		}
		
		int resp;

			do{
				System.out.println("Qual operação deseja realizar?");
				System.out.println("1- Realizar depósito");
				System.out.println("2- Realizar saque");
				System.out.println("3- Verificar saldo");
				System.out.println("0- Finalizar programa");
				resp = sc.nextInt();

				switch (resp) {
				case 1:
					System.out.println("Realizar deposito");
					usuario.depositar();
					break;
				
				case 2:
					System.out.println("Realizar saque");
					usuario.sacar();
					break;

				case 3:
					System.out.println("Verificar saldo");
					System.out.println("Seu saldo atual é de R$ " + usuario.getSaldo());
					break;

				case 0:
					System.out.println("Fim do programa.");
					break;

				default:
					System.out.println("Ação inválida");
					break;
				}
			}while (resp != 0);
			
		
		sc.close();
		
	}
}
