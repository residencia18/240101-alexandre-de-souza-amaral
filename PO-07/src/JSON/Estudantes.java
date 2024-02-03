import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.json.JSONArray;	
import org.json.JSONObject;

class Estudante {
    String nome;
    int idade;
    String curso;

    public Estudante(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
}

public class GravarEstudantesJSON {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome do estudante (ou 'fim' para encerrar):");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite a idade do estudante:");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite o curso do estudante:");
            String curso = scanner.nextLine();

            Estudante estudante = new Estudante(nome, idade, curso);
            estudantes.add(estudante);
        }

   
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("estudantes.json"))) {
            Gson gson = new Gson();
            String json = gson.toJson(estudantes);
            writer.write(json);
            System.out.println("Dados dos estudantes foram gravados no arquivo 'estudantes.json'.");
        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }
}
