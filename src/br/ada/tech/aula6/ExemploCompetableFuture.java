package br.ada.tech.aula6;

import java.util.concurrent.CompletableFuture;

public class ExemploCompetableFuture {

        public static void main(String[] args) throws Exception {
            CompletableFuture.supplyAsync(() -> {
                try { Thread.sleep(4000);  } catch (InterruptedException e) {}
                return 10;
            }).thenAccept(x -> System.out.println("AAA" + x.longValue())).join();
        }
}
