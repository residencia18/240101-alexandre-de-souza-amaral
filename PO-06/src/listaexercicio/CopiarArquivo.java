package listaexercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopiarArquivo {

    public static void main(String[] args) {
        String arquivoOrigem = "origem.txt";
        String arquivoDestino = "destino.txt";

        try {
            Files.copy(Paths.get(arquivoOrigem), Paths.get(arquivoDestino), StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Conteúdo do arquivo '" + arquivoOrigem + "' copiado para '" + arquivoDestino + "'.");
        } catch (IOException e) {
            System.err.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }
}
