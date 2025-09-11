package br.ada.tech.aula1;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Evento {

    private String nome;
    private LocalDateTime inicio;
    private LocalDateTime fim;

    public Evento(String nome,
                  LocalDateTime inicio,
                  LocalDateTime fim) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
    }

    public long duracaoEvento() {
        return ChronoUnit.HOURS.between(inicio, fim);
    }

    public LocalDateTime getInicio() {
        return inicio;
    }
}
