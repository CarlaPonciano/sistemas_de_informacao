/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author carli
 */
public class BDConnection {
    public static String status = "Not connected...";

    public static Connection connection = null;//atributo do tipo Connection 

    //Método Construtor da Classe
    public BDConnection() {

    }

    //Método de Conexão
    public static java.sql.Connection openConnection() {

        try {
            // Carregando o JDBC Driver padrão
            String driverName = "org.postgresql.Driver";
            Class.forName(driverName);

            // Configurando a conexão com um banco de dados
            String serverName = "200.18.128.54";    //caminho do servidor do BD
            String mydatabase = "carla";        //nome do seu banco de dados
            String url = "jdbc:postgresql://" + serverName + "/" + mydatabase;
            String username = "carla";        //nome de um usuário de seu BD      
            String password = "carla";      //sua senha de acesso
            connection = DriverManager.getConnection(url, username, password);

            //Testa sua conexão
            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return connection;
        } catch (ClassNotFoundException e) {
            //Driver não encontrado
            JOptionPane.showMessageDialog(null, "O driver especificado não foi encontrado.", "Erro na conexão", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao Banco de Dados.", "Erro na conexão", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    //Método que retorna o status da sua conexão
    public static String statusConnection() {
        return status;
    }

    //Método que fecha sua conexão
    public static boolean closeConnection() {

        try {
            BDConnection.openConnection().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    //Método que reinicia sua conexão
    public static java.sql.Connection restartConnection() {
        closeConnection();
        return BDConnection.openConnection();
    }

    //Método que realiza uma consulta (select) ao banco de dados
    //o comando SQL deve ser passado como parâmetro na forma de String
    //o método retorna um objeto ResultSet com os resultados da consulta
    public static ResultSet executeQuerySQL(String sql) {
        ResultSet result = null; //variável de retorno
        Statement stmt = null; //objeto que executa a consulta
        try {
            stmt = connection.createStatement(); //criação do objeto de consulta
            result = stmt.executeQuery(sql); //execução da consulta
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Consulta não pode ser realizada!!", "Erro na consulta", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    //Método que realiza um comando de atualização (como insert, update e delete) no banco
    //o comando SQL deve ser passado como parâmetro na forma de String
    public static void executeUpdateSQL(String sql) {
        Statement stmt; //objeto que executa o comando
        try {
            stmt = connection.createStatement(); //criação do objeto do comando
            stmt.executeUpdate(sql); //execução do comando de atualização
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Atualização não pode ser realizada!!", "Erro na atualização", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
}
