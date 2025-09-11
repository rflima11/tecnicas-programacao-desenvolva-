package br.ada.tech.aula1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        Period periodoEntreDatas = Period.between(dataNascimento, LocalDate.now());
        return periodoEntreDatas.getYears();
    }

    public boolean fazAniversarioHoje() {
        LocalDate hoje = LocalDate.now();
        return hoje.getMonth().equals(dataNascimento.getMonth())
                && hoje.getDayOfMonth() == (dataNascimento.getDayOfMonth());

    }


}
