package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DadosFuncionario {

	private String nome;
	private String cpf;
	private CargoFuncionario cargo;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;

	public DadosFuncionario(String nome, String cpf, CargoFuncionario cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.salario = novoSalario;
		this.dataUltimoReajuste = LocalDate.now();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public CargoFuncionario getCargo() {
		return cargo;
	}

	public void setCargo(CargoFuncionario cargo) {
		this.cargo = cargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(CargoFuncionario novoCargo) {
		this.cargo = novoCargo;
	}

}
