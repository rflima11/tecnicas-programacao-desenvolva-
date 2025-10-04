package br.ada.tech.aula4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteEndereco {


    public static void main(String[] args) {
        List<Endereco> enderecos = Arrays.asList(
                new Endereco(
                        "DF", "Brasília", Optional.empty()
                ),
                new Endereco(
                        "BA", "Xique-Xique", Optional.of("Ao lado da padaria")
                ),
                new Endereco(
                        "SP", "São Paulo", Optional.of("Paulista")
                ),
                new Endereco(
                        "RJ", "Rio de Janeiro", Optional.of("Complemento qualquer")
                )
        );

        //uma nova lista em que os endereços possuam complemento
        enderecos
                .stream()
                .filter(endereco -> endereco.getComplemento().isPresent());
                //.collect(Collectors.joining(","));


    }
}
