package controllers;


import java.util.ArrayList;
import java.util.Scanner;

import Repositories.IFuncionarioRepositoryCSV;
import Repositories.IFuncionarioRepositoryTxt;
import entities.Funcao;
import entities.Funcionario;
import entities.Setor;
import interfaces.IFuncionarioRepository;

public class FuncionarioController {

    public void cadastrarFuncionario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE CADASTRO DE FUNCIONÁRIOS");

        try {
            Funcionario funcionario = new Funcionario();
            Setor setor = new Setor();
            Funcao funcao = new Funcao();

            System.out.println("ID do funcionário: ");
            funcionario.setId(Integer.parseInt(scanner.nextLine()));

            System.out.println("NOME do funcionário: ");
            funcionario.setNome(scanner.nextLine());

            System.out.println("CPF do funcionário: ");
            funcionario.setCpf(scanner.nextLine());

            System.out.println("MATRICULA do funcionário: ");
            funcionario.setMatricula(scanner.nextLine());

            System.out.println("SALARIO do funcionário: ");
            funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

            System.out.println("ID DO SETOR do funcionário: ");
            setor.setId(Integer.parseInt(scanner.nextLine()));

            System.out.println("DESCRICAO DO SETOR do funcionário: ");
            setor.setDescricao(scanner.nextLine());

            System.out.println("ID DA FUNÇÃO do funcionário: ");
            funcao.setId(Integer.parseInt(scanner.nextLine()));

            System.out.println("NOME DA FUNÇÃO do funcionário: ");
            funcao.setNome(scanner.nextLine());

            // Associar o Setor e Funcao ao Funcionario
            funcionario.setSetor(setor);
            funcionario.setFuncao(funcao);
            
            // Inicializar as listas de funcionários em Setor e Funcao
            setor.setFuncionarios(new ArrayList<>());
            funcao.setFuncionarios(new ArrayList<>());



            System.out.println("DIGITE (1)TXT,  (2)CSV:");
            Integer opcao = Integer.parseInt(scanner.nextLine());

            IFuncionarioRepository iFuncionarioRepository = null;

            switch (opcao) {
                case (1):
                    iFuncionarioRepository = new IFuncionarioRepositoryTxt();
                    break;
                case (2):
                    iFuncionarioRepository = new IFuncionarioRepositoryCSV();
                    break;
                default:
                    throw new Exception("OPÇÃO INVÁLIDA");
            }

            iFuncionarioRepository.exportarDados(funcionario);
            System.out.println("\nDADOS GRAVADOS COM SUCESSO.");

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
