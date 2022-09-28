package pck_principal;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    private String caminho = "jdbc:mysql://localhost:3306/listadeingredientes"; //Caminho de localização do banco.
    private String usuario = "root"; //Nome do usuario master do banco
    private String senha = "3404"; //Senha do banco de dados.
    public Connection conn;

    public void conexao() { //Conector BD
        try {       //Utilizado apara tentar a conexão com o BD
            conn = DriverManager.getConnection(caminho, usuario, senha);
            System.out.println("CONECTADO COM SUCESSO!");
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERRO DE CONEXÃO!");
        }
    }

    public void desconecta() { //Encerra a conexão com o BD
        try {
            conn.close();
            System.out.println("DESCONECTADO COM SUCESSO!");
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERRO AO FECHAR CONEXÃO!");
        }
    }

   /* public static void main(String[] args) {
        Conexao obj_conexao = new Conexao();
        obj_conexao.conexao();
    }*/
}
