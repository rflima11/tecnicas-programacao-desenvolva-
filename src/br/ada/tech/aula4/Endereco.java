package br.ada.tech.aula4;

import java.util.Optional;

public class Endereco {

    private String estado;
    private String cidade;
    private Optional<String> complemento;

    public Endereco(String estado, String cidade, Optional<String> complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public Optional<String> getComplemento() {
        return complemento;
    }

    public String getComplementoIfExists() {
        if (complemento.isPresent()) {
            return complemento.get();
        }
        return null;
    }

    @Override
    public String toString() {
        return "estado " + estado + ", cidade " + cidade + ", complemento " + getComplementoIfExists();
    }
}
