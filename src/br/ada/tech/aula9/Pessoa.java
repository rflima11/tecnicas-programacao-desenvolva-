package br.ada.tech.aula9;


import java.io.Serializable;

//como podemos transformar essa classe em um arquivo?
public class Pessoa implements Serializable {

    private String nome;
    private int idade;
    private transient String senha;

    public Pessoa(String nome, int idade, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }
}
