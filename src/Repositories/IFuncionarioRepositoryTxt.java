package Repositories;

import java.io.PrintWriter;
import entities.Funcionario;
import interfaces.IFuncionarioRepository;

public class IFuncionarioRepositoryTxt implements IFuncionarioRepository {

    @Override
    public void exportarDados(Funcionario funcionario) throws Exception {
        try (PrintWriter printWriter = new PrintWriter("Funcionario" + funcionario.getId() + ".txt")) {
            printWriter.println("Funcionário: " + funcionario.getId());
            printWriter.println("Nome: " + funcionario.getNome());
            printWriter.println("Matricula: " + funcionario.getMatricula());
            printWriter.println("CPF: " + funcionario.getCpf());
            printWriter.println("Salario: " + funcionario.getSalario());
            printWriter.println("ID da Função: " + funcionario.getFuncao().getId());
            printWriter.println("Nome da Função: " + funcionario.getFuncao().getNome());
            printWriter.println("ID do Setor: " + funcionario.getSetor().getId());
            printWriter.println("Descrição do Setor: " + funcionario.getSetor().getDescricao());
        }
    }
}
