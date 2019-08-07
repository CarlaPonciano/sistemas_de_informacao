/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.AlunoDomain;
import model.AlunoDAO;

/**
 *
 * @author carli
 */
public class cadastrarAluno {
    public void cadastrarAluno(AlunoDomain aluno){
        AlunoDAO aluno_persistencia = new AlunoDAO();
            if(aluno_persistencia.cadastrarAluno(aluno))
                JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar a disciplina!", "", JOptionPane.ERROR_MESSAGE);
    }
}
