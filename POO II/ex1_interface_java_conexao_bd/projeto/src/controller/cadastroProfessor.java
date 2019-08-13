/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.ProfessorDAO;
import model.ProfessorDomain;

/**
 *
 * @author carli
 */
public class cadastroProfessor {
    public void cadastrarProfessor(ProfessorDomain professor){
        ProfessorDAO professor_persistencia = new ProfessorDAO();
        if(professor_persistencia.cadastrarProfessor(professor))
            JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o professor!", "", JOptionPane.ERROR_MESSAGE);
    }
}
