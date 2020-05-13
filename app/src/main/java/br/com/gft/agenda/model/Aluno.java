package br.com.gft.agenda.model;

import androidx.annotation.NonNull;

public class Aluno {

    private String nome;
    private String email;
    private String phone;

    public Aluno(String nome, String email, String phone) {
        this.nome = nome;
        this.email = email;
        this.phone = phone;
    }

    @NonNull
    @Override
    public String toString() {
        return nome;
    }
}
