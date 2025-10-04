package br.ada.tech.aula4;

import java.util.function.Consumer;

public class ImprimidorString implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
