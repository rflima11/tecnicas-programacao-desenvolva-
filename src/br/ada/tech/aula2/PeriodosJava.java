package br.ada.tech.aula2;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PeriodosJava {

    public static void main(String[] args) {
        ZonedDateTime startDateTime = ZonedDateTime.of(
                2022,
                4,
                8,
                13,
                35,
                56,
                0,
                ZoneId.systemDefault());

        Period period = Period.ofMonths(3);
        ZonedDateTime endDateTime = startDateTime.plus(period);

        System.out.println("Inicio da Atividade: " + startDateTime);
        System.out.println("Fim da Atividade (+ 3 meses): " + endDateTime);

        System.out.println("\nFim da Atividade com horario de Portugal: " + endDateTime.withZoneSameInstant(ZoneId.of("Europe/Lisbon")));
    }
}
