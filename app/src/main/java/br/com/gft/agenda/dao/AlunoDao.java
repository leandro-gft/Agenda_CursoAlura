package br.com.gft.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.agenda.model.Aluno;

public class AlunoDao {

    private final static List<Aluno> alunos = new ArrayList<>();

    public void salvar(Aluno aluno){
        alunos.add(aluno);
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }


}
