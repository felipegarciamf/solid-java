package br.com.alura.solid.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private String nome;

	private String cpf;

	private Cargo cargo;

	private BigDecimal salario;

	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario, LocalDate dataUltimoReajuste) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		this.dataUltimoReajuste = dataUltimoReajuste;
	}
	
	public void reajustarSalario(BigDecimal aumento) {
		
	}

	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

}
