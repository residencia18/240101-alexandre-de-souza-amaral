package listaexercicio;

	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Paths;
	import java.util.stream.Stream;

	public class LerArquivo {

	    public static void main(String[] args) {
	        String nomeArquivo = "entrada.txt";

	        try (Stream<String> linhas = Files.lines(Paths.get(nomeArquivo))) {
	            linhas.forEach(System.out::println);
	        } catch (IOException e) {
	            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
	        }
	    }
	}


