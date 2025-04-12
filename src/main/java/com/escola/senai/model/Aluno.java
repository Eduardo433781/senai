package com.escola.senai.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Aluno {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String NomeAluno;
    private String MatriculaAluno;
    private int IdadeAluno;

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Aluno id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Aluno name
    public String getNomeAluno() {
        return NomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        NomeAluno = nomeAluno;
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Aluno Matricula
    public String getMatriculaAluno() {
        return MatriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        MatriculaAluno = matriculaAluno;
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Aluno Idade
    public int getIdadeAluno() {
        return IdadeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        IdadeAluno = idadeAluno;
    }
}
