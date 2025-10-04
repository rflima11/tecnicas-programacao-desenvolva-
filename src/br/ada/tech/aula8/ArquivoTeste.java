package br.ada.tech.aula8;

import java.io.File;
import java.io.IOException;

public class ArquivoTeste {

    public static void main(String[] args) throws IOException {
        File arquivo = new File("dir1/dir2/arquivo.txt");
        File arquivo2 = new File("dir1/dir2", "arquivo.txt");
        File parent = new File("dir/dir2");
        File arquivo3 = new File(parent, "arquivo.txt");

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        } else {
            System.out.println("Arquivo existente");
        }
    }

}
