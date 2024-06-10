package Repositories;

import java.io.PrintWriter;
import entities.Funcionario;
import interfaces.IFuncionarioRepository;

public class IFuncionarioRepositoryCSV implements IFuncionarioRepository {

    @Override
    public void exportarDados(Funcionario funcionario) throws Exception {
        try (PrintWriter printWriter = new PrintWriter("Funcionario" + funcionario.getId() + ".csv")) {
            // Escrever cabeçalho CSV
            printWriter.println("ID,Nome,Matricula,CPF,Salario,ID_Funcao,Nome_Funcao,ID_Setor,Descricao_Setor");

            // Escrever dados do funcionário
            printWriter.printf("%d,%s,%s,%s,%.2f,%d,%s,%d,%s%n",
                    funcionario.getId(),
                    funcionario.getNome(),
                    funcionario.getMatricula(),
                    funcionario.getCpf(),
                    funcionario.getSalario(),
                    funcionario.getFuncao().getId(),
                    funcionario.getFuncao().getNome(),
                    funcionario.getSetor().getId(),
                    funcionario.getSetor().getDescricao());
        }
    }
}
