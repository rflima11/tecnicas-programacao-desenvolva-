package br.ada.tech.aula6;

public class MainAula062 {

        public static void main(String[] args) throws Exception {
            Thread t1 = new Thread(() -> {
                try {
                    tarefa("Consultar API");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            });
            Thread t2 = new Thread(() -> {
                try {
                    tarefa("Consultar Banco de Dados");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            });

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println("Tarefas concluídas");
        }

        public static void tarefa(String nome) throws InterruptedException {
            Thread.sleep(2000);
            System.out.println(nome + " terminou");
        }

}
