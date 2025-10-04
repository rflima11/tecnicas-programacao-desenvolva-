package br.ada.tech.aula8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class EscritoNIO {

    public static void main(String[] args) {
        Path caminho = Path.of("arquivo-escrita-novo.txt");
        try {
            Files.write(caminho,
                    Arrays.asList("Rodolfo", "Helena"),
                    StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
