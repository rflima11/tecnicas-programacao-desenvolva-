package br.ada.tech.aula8;

import java.io.File;

public class InfoIO {

    public static void main(String[] args) {
        File file = new File("dir1/dir2/arquivo.txt");

        if (file.exists()) {
            System.out.println("Caminho é absoluto? " + file.getAbsolutePath());
            System.out.println("Caminho é diretório? " + file.isDirectory());
            System.out.println("Caminho pai: " + file.getParent());
            if (file.isFile()) {
                System.out.println("Tamanho: " + file.length());
                System.out.println("Data última modificação " + file.lastModified());
            }
        }
    }
}
