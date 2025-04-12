package com.escola.senai.service;

import com.escola.senai.model.Aluno;
import com.escola.senai.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    private AlunoRepository alunoRepository;

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Inserir Aluno
    public Aluno SalvarAluno(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Buscar Aluno
 public List<Aluno> BuscarTodosAlunos(){
        return alunoRepository.findAll();
 }

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Buscar Alunos Pelo Id
    public Optional<Aluno> BuscarTodosAlunosId(Long id){
        return alunoRepository.findById(id);
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Atualizar
    public Aluno atualizarAluno(Long id, Aluno alunoAtualizado) {
        return alunoRepository.findById(id)
                .map(aluno -> {
                    aluno.setNomeAluno(alunoAtualizado.getNomeAluno());
                    aluno.setIdadeAluno(alunoAtualizado.getIdadeAluno());
                    aluno.setMatriculaAluno(alunoAtualizado.getMatriculaAluno());
                    return alunoRepository.save(aluno);
                })
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com o ID: " + id));
    }
    
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Deletar Aluno
    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }
}