package br.ada.tech.aula5;

public class Aula05 {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> tarefa("Participar reunião"));
        t1.start();
        tarefa("Programar");

    }

    public static void tarefa(String nomeTarefa) {
        try {
            for(int i = 1; i < 6; i++) {
                Thread.sleep(1000);
                System.out.println("Realizando " + nomeTarefa + " passo: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

}
