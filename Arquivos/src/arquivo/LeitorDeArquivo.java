package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeitorDeArquivo {

    public static void main(String[] args)throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

       
            File documento = new File(nomeArquivo);
            FileWriter fw = new FileWriter(documento);
            BufferedWriter buffer = new BufferedWriter(fw);
            
            System.out.println("Informe o texto que vai ser inserido no arquivo");
            String txt = scanner.nextLine();
            
            buffer.write(txt);
            buffer.newLine();
            buffer.close();
            fw.close();
            scanner.close();
            
    }
}
