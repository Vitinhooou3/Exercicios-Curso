package usuário;

public class Usuario {
	
	private String nome;
	private String banco;
	private String cpf;
	private int saldo;
	private String numeroConta;
	private double deposito;
	private double saque;
	private int idade;
	
	public Usuario() {
		setSaldo(0);
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

	public void Sacar() {
		saldo -= saque;
	}

	public void Depositar() {
		saldo += deposito;
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


}
