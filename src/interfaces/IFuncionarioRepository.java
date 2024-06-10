package interfaces;

import entities.Funcionario;

public interface IFuncionarioRepository {
	
	public void exportarDados(Funcionario funcionario) throws Exception;

}
