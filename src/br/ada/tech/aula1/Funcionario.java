package br.ada.tech.aula1;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private String email;
    private LocalDate dataAdmissao;

    public Funcionario(String nome, String email, LocalDate dataAdmissao) {
        this.nome = nome;
        this.email = email;
        this.dataAdmissao = dataAdmissao;
    }

    public boolean ehEligivelFerias() {
        LocalDate hoje = LocalDate.now();
        return hoje.equals(dataAdmissao.plusYears(1));
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

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
