package crypto;
import java.io.FileInputStream;	
import java.io.FileOutputStream;
import java.io.IOException;

public class Crypto{

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Por favor, forneça dois nomes de arquivos e uma senha como argumentos.");
            return;
        }

        String arquivoOrigem = args[0];
        String arquivoDestino = args[1];
        String senha = args[2];

        try {
            process(arquivoOrigem, arquivoDestino, senha);
            System.out.println("Cópia concluída com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao copiar os arquivos: " + e.getMessage());
        }
    }

    public static void process(String arquivoOrigem, String arquivoDestino, String senha) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(arquivoOrigem);
             FileOutputStream outputStream = new FileOutputStream(arquivoDestino)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    // Operação XOR com 255 (0xFF)
                    buffer[i] = (byte) (buffer[i] ^ 0xFF);
                }
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }
}
