package com.escola.senai.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Professor {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String NomeProfessor;
    private String DisciplinaProfessor;

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Professor id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Professor Nome
    public String getNomeProfessor() {
        return NomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        NomeProfessor = nomeProfessor;
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Disciplina Professor
    public String getDisciplinaProfessor() {
        return DisciplinaProfessor;
    }

    public void setDisciplinaProfessor(String disciplinaProfessor) {
        DisciplinaProfessor = disciplinaProfessor;
    }
}
