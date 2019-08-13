/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author carli
 */
public class DisciplinaDomain {
    private String cod;
    private String nome;
    private String curso;
    private int carga_horaria;
    private String ementa;

    public DisciplinaDomain() {
    }

    public DisciplinaDomain(String cod, String nome, String curso, int carga_horaria, String ementa) {
        this.cod = cod;
        this.nome = nome;
        this.curso = curso;
        this.carga_horaria = carga_horaria;
        this.ementa = ementa;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    
    
}
