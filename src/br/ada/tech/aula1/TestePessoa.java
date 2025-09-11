package br.ada.tech.aula1;

import java.time.LocalDate;

public class TestePessoa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Rodolfo", LocalDate.of(1994, 9, 10));

        System.out.println("Tem " + pessoa.getIdade() + " anos");

        System.out.println(pessoa.fazAniversarioHoje() ? "Parabéns! \uD83C\uDF89" : "Não faz aniversário hoje");

    }

}
