package br.ada.tech.aula2;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class UsandoLocale {

    public static void main(String[] args) {
        Locale locBR = new Locale("pt", "BR");
        Locale locJA = new Locale("ja", "JP");
        Locale locUS = new Locale("en", "US");

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println("Formato longo: ");
        System.out.println("Brasil: " +
                zonedDateTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                                .withLocale(locBR)));
        System.out.println("Japao: " +
                zonedDateTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                                .withLocale(locJA)));
        System.out.println("USA: " +
                zonedDateTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                                .withLocale(locUS)));

        System.out.println("\nFormato curto: ");
        System.out.println("Brasil: " +
                zonedDateTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                                .withLocale(locBR)));
        System.out.println("Japao: " +
                zonedDateTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                                .withLocale(locJA)));
        System.out.println("USA: " +
                zonedDateTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                                .withLocale(locUS)));
    }
}
