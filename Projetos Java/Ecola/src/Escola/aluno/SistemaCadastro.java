package Escola.aluno;

public class SistemaCadastro {
	public static void main(String[] args) {
			Aluno aluno = new Aluno("44098532875 ", " Marcos Felipe Celestino ", " 18 ");
	
	aluno.setEndereço("Rua Tal");
	
		System.out.println(aluno.getCpf() + aluno.getEndereço() + aluno.getIdade() + aluno.getNome());
	}

}
