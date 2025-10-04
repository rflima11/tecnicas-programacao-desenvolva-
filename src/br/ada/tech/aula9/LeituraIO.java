package br.ada.tech.aula9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraIO {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"))) {
            String linha;
            while((linha = br.readLine())  != null) {
                System.out.println(linha);
            }
        }
    }

}
