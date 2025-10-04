package br.ada.tech.aula6;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorMain {

    public static void main(String[] args) throws InterruptedException {
        //RUNNING, SHUTDOWN TERMINATED
        ExecutorService executor = Executors.newFixedThreadPool(5);
        try {
            for (int i = 1; i <= 5; i++) {
                int id = i;
                executor.submit(() -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Executando tarefa " + id + " na thread " + Thread.currentThread().getName());
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            executor.shutdown();
        }

//        executor.shutdownNow();
//        executor.awaitTermination(1, TimeUnit.MINUTES);
    }
}
