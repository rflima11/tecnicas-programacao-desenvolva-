package br.ada.tech.aula5;

public class VariavelClasse {

    static int contador = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> incrementar("Thread1"));
        Thread t2 = new Thread(() -> incrementar("Thread2"));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Valor final do contador: " + contador);
    }

    static synchronized void incrementar(String nome) {
        for(int i = 0; i < 10000; i++) {
            synchronized (VariavelClasse.class) {
                contador++;
            }
        }
        System.out.println(nome + " terminou!");
    }
}
