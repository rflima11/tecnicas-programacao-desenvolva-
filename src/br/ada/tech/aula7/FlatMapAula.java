package br.ada.tech.aula7;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapAula {


    public static void main(String[] args) {

        List<String> frases = Arrays.asList(
                "O céu é lindo",
                "Está chovendo");
                                                      //1 - 1
        //List<String> frasesMaisculas = frases.stream().map(frase -> frase.toUpperCase()).toList();

                                             //1 - n
//        List<String> flatMap = frases.stream().flatMap(frase -> frase.toUpperCase())
//                .toList();
//
//        System.out.println(flatMap);

    }
}
