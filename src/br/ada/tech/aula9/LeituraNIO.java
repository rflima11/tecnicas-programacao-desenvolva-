package br.ada.tech.aula9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LeituraNIO {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("arquivo.txt");

        Files.lines(path).map(String::trim).forEach(System.out::println);
    }
}
