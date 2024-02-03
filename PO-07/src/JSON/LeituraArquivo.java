import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

class Estudante {
    String nome;
    int idade;
    String curso;

}

public class LeituraArquivo {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("estudantes.json"))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }

            Gson gson = new Gson();
            Type listType = new TypeToken<List<Estudante>>(){}.getType();
            List<Estudante> estudantes = gson.fromJson(jsonContent.toString(), listType);

      
            if (estudantes != null && !estudantes.isEmpty()) {
            	
            }
          }
    }
}
         
