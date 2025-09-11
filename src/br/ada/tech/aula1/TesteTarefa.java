package br.ada.tech.aula1;

import java.time.LocalDate;

public class TesteTarefa {

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa(
                "Lavar louça",
                LocalDate.now().minusDays(5),
                LocalDate.now().plusDays(2)
        );

        System.out.println(tarefa.estaAtrasada() ? "Está atrasada" : "Não está atrasada");

        System.out.println("Dias restantes para conclusão da tarefa: " + tarefa.diasRestantes());
    }
}
