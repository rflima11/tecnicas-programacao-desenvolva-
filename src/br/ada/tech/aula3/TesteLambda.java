package br.ada.tech.aula3;

import java.util.Arrays;
import java.util.List;

public class TesteLambda {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 4, 3, 2, 5);

        Operacao operacao = num1 -> num1 * 2;

        List<Integer> novaListaNumeros = numeros.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> operacao.executar(num))
                .sorted()
                .distinct()
                .limit(1)
                .toList();

        novaListaNumeros.forEach(num -> System.out.println(num));

        
    }
}

@FunctionalInterface
interface Operacao {
    int executar(int num1);
}

class Dobro implements Operacao {
    @Override
    public int executar(int num1) {
        return num1 * 2;
    }
}


