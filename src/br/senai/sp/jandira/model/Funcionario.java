package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Funcionario {
    private int idFuncionario, permissao, departamento_FK;
    private String nome, sobrenome, matricula;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarFuncionario(){
        System.out.println("|           Cadastro de Funcionário           |");
        System.out.println("|.............................................|");
        System.out.println("| Informe o nome: ");
        this.nome = scanner.nextLine();
        System.out.println("| Informe o sobrenome: ");
        this.sobrenome = scanner.nextLine();
        System.out.println("| Informe a matricula: ");
        this.matricula = scanner.nextLine();
        System.out.println("| Informe o id do funcionário (0): ");
        this.idFuncionario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("| Informe a permissão: ");
        this.permissao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("| Informe o id do departamento: ");
        this.departamento_FK = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cadastro local efetuado!!!");
        System.out.println("|.............................................|");
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getPermissao() {
        return permissao;
    }

    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }

    public int getDepartamento_FK() {
        return departamento_FK;
    }

    public void setDepartamento_FK(int departamento_FK) {
        this.departamento_FK = departamento_FK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
