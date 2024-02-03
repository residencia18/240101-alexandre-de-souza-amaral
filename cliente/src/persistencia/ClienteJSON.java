package persistencia;
import cliente.Cliente;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteJSON {

    public static void salvaClientes(List<Cliente> clientes, String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Cliente cliente : clientes) {
                String linha = cliente.getNome() + ";" + cliente.getCpf() + ";" + cliente.getCnh();
                writer.write(linha);
                writer.newLine();
            }
            System.out.println("Clientes salvos com sucesso no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar clientes: " + e.getMessage());
        }
    }

    public static List<Cliente> recuperaClientes(String nomeArquivo) {
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                Cliente cliente = new Cliente();
                cliente.setNome(dados[0]);
                cliente.setCpf(dados[1]);
                cliente.setCnh(dados[2]);
                clientes.add(cliente);
            }
            System.out.println("Clientes recuperados com sucesso do arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao recuperar clientes: " + e.getMessage());
        }
        return clientes;
    }
    
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        // Adicione alguns clientes para teste
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");
        cliente1.setCpf("12345678900");
        cliente1.setCnh("ABC123");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");
        cliente2.setCpf("98765432100");
        cliente2.setCnh("XYZ789");
        
        Cliente cliente3 = new Cliente();
        cliente1.setNome("Alexandre");
        cliente1.setCpf("12345678900");
        cliente1.setCnh("JDC123");

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        // Teste para salvar clientes
        ClienteJSON.salvaClientes(clientes, "clientes.txt");

        // Teste para recuperar clientes
        List<Cliente> clientesRecuperados = ClienteJSON.recuperaClientes("clientes.txt");

        // Exibindo os clientes recuperados
        if (clientesRecuperados != null) {
            System.out.println("\nClientes recuperados:");
            for (Cliente cliente : clientesRecuperados) {
                System.out.println("Nome: " + cliente.getNome() +
                        ", CPF: " + cliente.getCpf() +
                        ", CNH: " + cliente.getCnh());
            }
        }
    }
}
