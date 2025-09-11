package br.ada.tech.aula1;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteAssinatura {

    public static void main(String[] args) {

        Assinatura assinatura = new Assinatura(
                "Rodolfo",
                LocalDate.of(2025, 1, 1),
                12
        );
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");

        System.out.println("Data de expiração é: " + dtf.format(assinatura.getDataExpiracao()));
    }
}
