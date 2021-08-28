package br.com.alura.solid.rh.dto;

public class FuncionarioDto {

	public FuncionarioDto(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	private String nome;

	private String sobrenome;

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public static void constroi() {
		
	}

}
