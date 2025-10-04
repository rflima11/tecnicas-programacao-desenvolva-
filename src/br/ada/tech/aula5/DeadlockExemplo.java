package br.ada.tech.aula5;

public class DeadlockExemplo {

    static Object recurso1 = new Object();
    static Object recurso2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (recurso1) {
                System.out.println("Thread1 - Acessando recurso 1");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (recurso2) {
                    System.out.println("Thread1 - Acessando recurso 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (recurso2) {
                System.out.println("Thread2 - Acessando recurso 2");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (recurso1) {
                    System.out.println("Thread2 - Acessando recurso 1");
                }
            }
        });

        t1.start();
        t2.start();


    }

}
