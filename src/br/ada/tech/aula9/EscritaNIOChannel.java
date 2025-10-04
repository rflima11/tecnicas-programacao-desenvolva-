package br.ada.tech.aula9;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class EscritaNIOChannel {

    public static void main(String[] args) {
        try (FileChannel channel = FileChannel.open(
                Path.of("arquivo-nio-channel.txt"),
                StandardOpenOption.CREATE,
                StandardOpenOption.WRITE
        )) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put("Escrevendo com channel + buffer".getBytes());
            buffer.flip();
            channel.write(buffer);
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
