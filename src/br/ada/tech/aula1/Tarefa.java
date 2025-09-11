package br.ada.tech.aula1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tarefa {

    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;

    public Tarefa(String descricao,
                  LocalDate dataCriacao,
                  LocalDate dataLimite) {
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataLimite = dataLimite;
    }

    public boolean estaAtrasada() {
        return LocalDate.now().isAfter(dataLimite);
    }

    public long diasRestantes() {
        return ChronoUnit.DAYS.between(dataCriacao, LocalDate.now());
    }
}
