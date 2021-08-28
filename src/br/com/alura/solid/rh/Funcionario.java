package br.com.alura.solid.rh;

import br.com.alura.solid.rh.dto.FuncionarioDto;

public class Funcionario {

	public Funcionario(FuncionarioDto funcionario) {
		this.nome = funcionario.getNome();
		this.sobrenome = funcionario.getSobrenome();
	}

	private String nome;

	private String sobrenome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
