package br.ada.tech.aula1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventoTeste {

    public static void main(String[] args) {
        LocalDateTime dataInicio = LocalDateTime.of(
                2025,
                9,
                14,
                19,
                10
        );

        Evento evento = new Evento(
                "Missa",
                dataInicio,
                LocalDateTime.of(
                        2025,
                        9,
                        14,
                        21,
                        10
                )
        );

        System.out.println("A duração do evento é de : " + evento.duracaoEvento());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("A data de ínicio do evento é: " + dtf.format(evento.getInicio()));

        System.out.println("Data daqui a uma semana: " + dtf.format(evento.getInicio().plusDays(7)));
    }
}
