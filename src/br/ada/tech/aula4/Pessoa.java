package br.ada.tech.aula4;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + '}';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareToIgnoreCase(pessoa.getNome());
    }

}
