package br.ada.tech.aula4;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PessoaStream {


    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Rodolfo", 30),
            new Pessoa("Helena", 5),
            new Pessoa("Simão", 55)
        );

        //Ordenar as pessoas na lista por ordem alfábetica (nome)
//        pessoas.stream().sorted(
//                 (pessoa1, pessoa2) -> pessoa1.getNome().compareToIgnoreCase(pessoa2.getNome())
//                ).collect(Collectors.joining(","));
//
//        pessoasOrdenadasAlfabeticamente.forEach(System.out::println);
    }
}
