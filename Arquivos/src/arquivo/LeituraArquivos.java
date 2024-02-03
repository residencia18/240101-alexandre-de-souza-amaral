package arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeituraArquivos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o nome do arquivo: ");
        String nomeArquivo = scan.nextLine();

        try {
            FileReader fr = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fr);

            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
