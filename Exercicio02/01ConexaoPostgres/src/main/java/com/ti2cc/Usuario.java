package com.ti2cc;

public class Usuario {
	private int numero;
	private String nome;
	private int idade;
	private char sexo;
	private String profissao;
	
	public Usuario() {
		this.numero = -1;
		this.nome = "";
		this.idade = -1;
		this.sexo = '*';
		this.profissao =  "";
	}
	
	public Usuario(int numero, String nome, int idade, char sexo,String profissao) {
		this.numero = numero;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.profissao = profissao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Usuario [numero=" + numero + ", nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", profissao=" + profissao + "]";
	}
	
}
