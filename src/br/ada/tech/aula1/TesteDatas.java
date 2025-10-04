package br.ada.tech.aula1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class TesteDatas {


    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
                "Rodolfo",
                "rodolfo.lima@gmail.com",
                LocalDate.of(2024, 9, 10)
        );

//        System.out.println(
//                "Nome " + funcionario.getNome()
//                        + " E-mail: " + funcionario.getEmail()
//                        + " Data de admissão " + funcionario.getDataAdmissao()
//                        + " Tem direito a férias? " + funcionario.ehEligivelFerias()
//        );

        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Calendar pré java 8 " + calendar.getTime());

        System.out.println("Date pré java 8 " + date);

        LocalDate.of(2025, 1, 25);
        LocalDate.now(ZoneId.of("America/Sao_Paulo"));

        LocalTime time = LocalTime.now();
        LocalDate data = LocalDate.now();
        LocalDateTime dataHora = LocalDateTime.now();

        System.out.println("ano " + data.getYear());
        System.out.println("mês " + data.getMonthValue());
        System.out.println("ano " + data.getDayOfMonth());
        data.plus(3, ChronoUnit.DAYS);

        System.out.println("LocalTime: " + time);
        System.out.println("LocalDate: " + data);
        System.out.println("LocalDateTime: " + dataHora);

        System.out.println("LocalDate + 5 dias: " + data.plusDays(5));

        System.out.println("LocalDate: " + data);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        DateTimeFormatter formatterDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String dataAsString = data.format(formatter);

        LocalDateTime dataFormatada = LocalDateTime.parse("10/09/2025 23:59:59", formatterDataHora);

        System.out.println("dataFormatada: " + dataFormatada);
        System.out.println("Data formatada: " + dataAsString);
        System.out.println("Data hora formatada: " + dataHora.format(formatterDataHora));

        LocalDate dataDeHoje = LocalDate.now();
        LocalDate dataDeOntem = dataDeHoje.minusYears(1);

        System.out.println(dataDeHoje.isAfter(dataDeOntem));


        LocalDateTime dataHoraMili = LocalDateTime.of(
                2025,
                9,
                10,
                21,
                14,
                10,
                10
        );
        LocalDateTime localDateTime = dataHoraMili.plusDays(10).plusHours(3).plusNanos(40);

        System.out.println("Verificação data somada " + localDateTime);
    }
}
