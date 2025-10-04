package br.ada.tech.aula2;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DatasComFuso {

    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
        ZonedDateTime zonedDateTimeSP = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime zonedDateTimeAC = ZonedDateTime.now(ZoneId.of("America/Rio_Branco"));
        ZonedDateTime zonedDateTimePT = ZonedDateTime.now(ZoneId.of("Europe/Lisbon"));

        System.out.println("Data hora fuso SP: " + zonedDateTimeSP);
        System.out.println("Data hora fuso AC: " + zonedDateTimeAC);
        System.out.println("Data hora fuso PT: " + zonedDateTimePT);
    }
}
