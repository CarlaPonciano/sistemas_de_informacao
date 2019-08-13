/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.conexao.BDConnection;

/**
 *
 * @author carli
 */
public class ProfessorDAO {
    public boolean cadastrarProfessor(ProfessorDomain professor){
        BDConnection bd = new BDConnection();
        bd.openConnection();
        
        String sql = "INSERT INTO tb_aluno (cpf, nome, email, telefone) "
                + "VALUES('"+professor.getCpf()+"','"+professor.getNome()+"','"+professor.getEmail()+"','"+professor.getTelefone()+"');";
        
        bd.executeUpdateSQL(sql);
        bd.closeConnection();
        return true;
    }
}
