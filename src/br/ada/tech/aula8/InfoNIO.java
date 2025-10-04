package br.ada.tech.aula8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InfoNIO {

    public static void main(String[] args) {
        try {
            Path path = Path.of("dir1/dir2/arquivo.txt");
            if (Files.exists(path)) {
                System.out.println("O caminho é absoluto? " + path.toAbsolutePath());
                System.out.println("Diretório? "  + Files.isDirectory(path));
                System.out.println("Caminho pai: " + path.getParent());
                if (Files.isRegularFile(path)) {
                    System.out.println("Tamanho: " + Files.size(path));
                    System.out.println("Data ultima modificação " + Files.getLastModifiedTime(path));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }




    }
}
