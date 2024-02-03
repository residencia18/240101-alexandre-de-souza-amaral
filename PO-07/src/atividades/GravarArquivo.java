package atividades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class GravarArquivo {

    public static void main(String[] args) {
        String nomeArquivo = "saida.json"; 

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite as linhas de texto (digite 'fim' para encerrar):");

            while (true) {
                String linha = scanner.nextLine();
                if (linha.equalsIgnoreCase("fim")) {
                    break;
                }

                
                Files.writeString(Paths.get(nomeArquivo), linha + System.lineSeparator(),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }

            System.out.println("As linhas foram gravadas no arquivo '" + nomeArquivo + "'.");
        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }
}
