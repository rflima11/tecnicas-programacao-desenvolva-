package br.ada.tech.aula8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CriarArquivoNIO {

    public static void main(String[] args) {
        try {
            Path path = Path.of("arquivo-criado-nio.txt");
            Files.createFile(path);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo");
            throw new RuntimeException("Erro ao criar arquivo " + e.getMessage());
        }

    }
}
