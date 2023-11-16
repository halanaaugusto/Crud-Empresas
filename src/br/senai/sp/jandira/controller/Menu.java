package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    public void executarMenu() throws SQLException {
        boolean continuar = true;

        Scanner scanner = new Scanner(System.in);

        FuncionarioController funcionario = new FuncionarioController();

        while (continuar) {
            System.out.println("|              Bem vindo              |");
            System.out.println("|.....................................|");
            System.out.println("|                Menu                 |");
            System.out.println("|.....................................|");
            System.out.println("| 1- Cadastrar Funcionário            |");
            System.out.println("| 2- Listar Funcionário               |");
            System.out.println("| 3- Deletar Funcionário              |");
            System.out.println("| 4- Consultar Funcionário            |");
            System.out.println("| 5- Editar Funcionário               |");
            System.out.println("| 6- Sair                             |");
            System.out.println("|.....................................|");

            System.out.println("| Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    Funcionario newFuncionario = new Funcionario();
                    newFuncionario.cadastrarFuncionario();
                    funcionario.cadastrarFuncionario(newFuncionario);

                    break;

                case 2:
                    System.out.println("\n|    Lista de Funcionários    |");
                    funcionario.listarFuncionarios();
                    break;

                case 3:
                    System.out.println("\n|    Informe o nome do ex funcionário:    ");
                    String nomeDelete = scanner.nextLine();
                    funcionario.deletarFuncionario(nomeDelete);
                    break;

                case 4:
                    System.out.println("|    Informe o nome que deseja pesquisar: ");
                    String nomePesquisado = scanner.nextLine();
                    funcionario.consultarFuncionario(nomePesquisado);
                    break;

                case 5:
                    System.out.println("|    Informe o nome que deseja editar: ");
                    String nomeEditado = scanner.nextLine();
                    System.out.println("|    Informe o novo sobrenome: ");
                    String sobrenomeAtual = scanner.nextLine();
                    funcionario.editarFuncionario(nomeEditado, sobrenomeAtual);
                    break;

                case 6:
                    continuar = false;
                    break;
            }


        }
    }

}
