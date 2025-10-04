package br.ada.tech.aula6;

import java.util.concurrent.Executors;

import java.util.concurrent.*;

public class ExemploFuture {

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

         Future<Integer> futureInteger = executor.submit(() -> {
            System.out.println("Processando...");
            try { Thread.sleep(2000); } catch (Exception e) { e.printStackTrace(); }
            return 42;
        });

         System.out.println("Fazendo outra coisa enquanto aguardo...");

         Integer resultado = futureInteger.get();
         System.out.println("Resultado: " + resultado);

         executor.shutdown();
    }
}
