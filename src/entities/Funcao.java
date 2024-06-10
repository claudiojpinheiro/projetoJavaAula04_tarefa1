package entities;

import java.util.List;

public class Funcao {

	private Integer id;
	private String nome;
	private List<Funcionario> funcionarios;

	public Funcao() {
		// TODO Auto-generated constructor stub
	}

	public Funcao(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Funcao [id=" + id + ", nome=" + nome + ", funcionarios=" + funcionarios + "]";
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

}
