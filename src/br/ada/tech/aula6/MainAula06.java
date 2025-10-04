package br.ada.tech.aula6;

public class MainAula06 {


    public static void main(String[] args) throws InterruptedException {
        tarefa("Consultar uma API");
        tarefa("Consultar um banco de dados");
        tarefa("Processar um arquivo texto");
    }

    public static void tarefa(String nome) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(nome + " terminou!");
    }
}
