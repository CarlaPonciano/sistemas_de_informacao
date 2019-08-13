/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.AlunoDomain;
import model.conexao.BDConnection;

/**
 *
 * @author carli
 */
public class AlunoDAO {
    
    public boolean cadastrarAluno(AlunoDomain aluno){
        BDConnection bd = new BDConnection();
        bd.openConnection();
        
        String sql = "INSERT INTO tb_aluno (matricula, cpf, nome, email, telefone) "
                + "VALUES('"+aluno.getMatricula()+"','"+aluno.getCpf()+"','"+aluno.getNome()+"','"+aluno.getEmail()+"','"
                +aluno.getTelefone()+"');";
        
        bd.executeUpdateSQL(sql);
        bd.closeConnection();
        return true;
    }
    
}
