package br.ada.tech.aula8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaIIO {

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo-escrita.txt"))) {
            bw.newLine();
            bw.write("Rodolfo");
        }
    }
}
