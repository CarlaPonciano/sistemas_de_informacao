/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.DisciplinaDAO;
import model.DisciplinaDomain;

/**
 *
 * @author carli
 */
public class cadastroDisciplina {
    public void cadastrarDisciplina(DisciplinaDomain disciplina){
        DisciplinaDAO disciplina_persistencia = new DisciplinaDAO();
        if(disciplina_persistencia.cadastrarDisciplina(disciplina))
            JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a disciplina!", "", JOptionPane.ERROR_MESSAGE);
    }
}
