package br.ada.tech.aula9;

import java.io.FileInputStream;
import java.io.IOException;

public class LeituraOutrosFormatos {

    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("passaro.jpg")) {
            int bytes;
            while ((bytes = fis.read()) != -1) {
                System.out.print(bytes);
            }
        }
    }
}
