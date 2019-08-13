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
public class DisciplinaDAO {
    
    public boolean cadastrarDisciplina(DisciplinaDomain disciplina){
        BDConnection bd = new BDConnection();
        bd.openConnection();
        
        String sql = "INSERT INTO tb_disciplina (cod, nome, curso, carga_horaria, ementa) "
                + "VALUES('"+disciplina.getCod()+"','"+disciplina.getNome()+"','"+disciplina.getCurso()+"','"+disciplina.getCarga_horaria()+"','"
                +disciplina.getEmenta()+"');";
        
        bd.executeUpdateSQL(sql);
        bd.closeConnection();
        return true;
    }
}
