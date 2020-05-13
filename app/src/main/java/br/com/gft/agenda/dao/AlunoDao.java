package br.com.gft.agenda.dao;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.agenda.Aluno;

public class AlunoDao {



    private final static List<Aluno> alunos = new ArrayList<>();

    public void salvar(Aluno aluno){
        alunos.add(aluno);
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }


}
