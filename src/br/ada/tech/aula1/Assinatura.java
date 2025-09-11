package br.ada.tech.aula1;

import java.time.LocalDate;

public class Assinatura {

    private String cliente;
    private LocalDate dataInicio;
    private int planoMeses;

    public Assinatura(String cliente,
                      LocalDate dataInicio,
                      int planoMeses) {
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.planoMeses = planoMeses;
    }

    public LocalDate getDataExpiracao() {
        return dataInicio.plusMonths(planoMeses);
    }

}
