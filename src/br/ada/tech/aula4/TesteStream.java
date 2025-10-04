package br.ada.tech.aula4;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class TesteStream {

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Rodrigo", "Simão", "Helena");

        for (int i = 0; i < nomes.size(); i++) {
            //System.out.println(nomes.get(i));
        }

        for (String nome : nomes) {
            //System.out.println(nome);
        }


        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                //System.out.println(s);
            }
        };

        Stream<String> nomesStream = nomes.stream();

        //ClasseOuObjecto::metodo
        //nomes.forEach(System.out::println);

        //Filtrar nomes que comecem com "Ro" em uma nova lista
        //List<String> nomesFiltrados = nomesStream.filter(nome -> nome.startsWith("Ro")).toList();

        //nomesFiltrados.forEach(System.out::println);

        //Filtre por um nome específico e retorne apenas ele
        Optional<String> nomeEncontrado = nomesStream.filter(nome -> nome.equals("Rodolfo")).findFirst();

        String nome = nomeEncontrado.orElse("Não encontrado");

//        try {
//            String nome = nomeEncontrado.orElseThrow(() -> new RuntimeException("Nome não encontrado"));
//            System.out.println(nome);
//        } catch (RuntimeException e) {
//            System.err.println(e.getMessage());
//        }


//        if (nomeEncontrado.isPresent()) {
//            String nome = nomeEncontrado.get();
//            System.out.println("Nome encontrado na lista: " + nome);
//        } else {
//            System.out.println("Nome não encontrado");
//        }

    }
}
