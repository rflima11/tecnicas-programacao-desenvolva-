package br.ada.tech.aula9;

import java.io.*;

public class PessoaSerDes {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Pessoa pessoa = new Pessoa("Rodolfo", 31, "12345678");

        System.out.println("ANTES DA SERIALIZAÇãO");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Senha: " + pessoa.getSenha());

        //serialização
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoa.bin"))) {
            oos.writeObject(pessoa);
        }

        //deserialização
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoa.bin"))) {
            Pessoa pessoaDeserializada = (Pessoa) ois.readObject();
            System.out.println("DEPOIS DA SERIALIZAÇãO");
            System.out.println("Nome: " + pessoaDeserializada.getNome());
            System.out.println("Idade: " + pessoaDeserializada.getIdade());
            System.out.println("Senha: " + pessoaDeserializada.getSenha());
        }
    }
}
