package br.senai.sp.jandira.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private String servidor, banco, user, password;

    public Connection conexao;

    public Conexao() {
        this.servidor = "localhost";
        this.banco = "db_senai_java";
        this.user = "root";
        this.password = "bcd127";
    }

    public void connectDriver(){
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.user, this.password);
        } catch (SQLException erro) {
            System.out.println(erro);
        }

    }

    //Faz a conexão com o banco, carrega na variável e carrega no driver
    public Connection getConnection(){
        connectDriver();
        return conexao;
    }


}
