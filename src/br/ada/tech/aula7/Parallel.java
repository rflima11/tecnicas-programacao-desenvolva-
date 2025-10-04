package br.ada.tech.aula7;

import java.util.List;
import java.util.Arrays;
import java.util.Locale;

public class Parallel {

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList(
                "Fabiana", "Marcos", "Rodolfo", "Helena", "Andre");

        nomes.parallelStream().forEach((n) -> {
            System.out.println(n.toUpperCase() + " stream parallel na thread " + Thread.currentThread().getName());
        });

        nomes.stream().forEach(n -> System.out.println(n.toUpperCase() + " stream: na thread " + Thread.currentThread().getName()) );


    }


}
