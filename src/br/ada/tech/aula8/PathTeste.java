package br.ada.tech.aula8;

import java.nio.file.Path;

public class PathTeste {

    public static void main(String[] args) {
        Path path = Path.of("/dir1/dir2/arquivo.txt");
        Path path1 = Path.of("/dir1", "dir2", "arquivo.txt");

        System.out.println(path);
    }
}
