package entities;

public class Funcionario extends Pessoa {

	private String cpf;
	private String matricula;
	private Double salario;
	private Setor setor;
	private Funcao funcao;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String cpf, String matricula, Double salario) {
		super();
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Funcionario [cpf=" + cpf + ", matricula=" + matricula + ", salario=" + salario + ", setor=" + setor
				+ ", funcao=" + funcao + "]";
	}

	
}