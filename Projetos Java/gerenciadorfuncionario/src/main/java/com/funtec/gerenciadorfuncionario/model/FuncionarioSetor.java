package com.funtec.gerenciadorfuncionario.model;

public enum FuncionarioSetor {
	TECNOLOGIA("tecnologia"),
	RECURSOSHUMANOS("rh"),
	DIRETORIA("diretoria");
	
	private String value;
	
	private FuncionarioSetor(String value) {
		this.value = value;
	}
	
	public String getSetor() {
		return value;
	}
}
