package usuário;

import java.util.Scanner;

import Exceptions.IdadeInsuficienteException;


public class Usuario {
	
	private String nome;
	private String banco;
	private String cpf;
	private int saldo;
	private String numeroConta;
	private double deposito;
	private double saque;
	private int idade;
	
	Scanner sc = new Scanner(System.in);


	public Usuario() {
		setSaldo(0);
		setSaque(0);
		setDeposito(0);
	}
	
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getDeposito() {
		return deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public void sacar() {
		System.out.println("digite a quantia a ser sacada: ");
		setSaque(sc.nextDouble());
		if (getSaque() > getSaldo()){
			System.out.println("Seu saldo é insuficiente");
		}else{
			saldo -= getSaque();
			System.out.println("Seu novo saldo é de R$" + getSaldo());
		}
	}

	public void depositar() {
		System.out.println("Digite o valor a ser depositado: ");
		setDeposito(sc.nextDouble());
		saldo += getDeposito();
		System.out.println("Seu novo saldo é de R$ " + getSaldo());
	}

	public void verificarIdade() throws IdadeInsuficienteException{
		
        if (getIdade() < 18) {
            throw new IdadeInsuficienteException("A idade mínima requerida é 18 anos.");
        }
	}
	

}
