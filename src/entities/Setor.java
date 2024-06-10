package entities;

import java.util.List;

public class Setor {
	
	private Integer id;
	private String descricao;
	private List<Funcionario> funcionarios;
	
	public Setor() {
		// TODO Auto-generated constructor stub
	}


	public Setor(Integer id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	@Override
	public String toString() {
		return "Setor [id=" + id + ", descricao=" + descricao + ", funcionarios=" + funcionarios + "]";
	}


	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}


	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	

}
