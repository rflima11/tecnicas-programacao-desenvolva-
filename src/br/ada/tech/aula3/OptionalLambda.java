package br.ada.tech.aula3;

import java.util.List;
import java.util.Arrays;

public class OptionalLambda {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .distinct()
                .forEach(n -> System.out.println(n));

    }
}
