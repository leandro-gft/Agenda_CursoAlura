package br.com.gft.agenda;

public class Aluno {

    private String nome;
    private String email;
    private String phone;

    public Aluno(String nome, String email, String phone) {
        this.nome = nome;
        this.email = email;
        this.phone = phone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
