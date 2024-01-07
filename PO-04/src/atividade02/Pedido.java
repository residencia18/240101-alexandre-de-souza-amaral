package atividade02;

import java.util.ArrayList;

class ItemPedido {
    String nome;
    double preco;

    public ItemPedido(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

public class Pedido {
    int numeroPedido;
    String cpfCliente;
    ArrayList<ItemPedido> itens;

    public Pedido(int numeroPedido, String cpfCliente) {
        this.numeroPedido = numeroPedido;
        this.cpfCliente = cpfCliente;
        this.itens = new ArrayList<>();
    }

    // Adicionar um único item ao pedido
    public void adicionarItem(String nome, double preco) {
        itens.add(new ItemPedido(nome, preco));
    }

    // Adicionar uma lista de itens ao pedido
    public void adicionarItens(ArrayList<ItemPedido> listaItens) {
        itens.addAll(listaItens);
    }

    // Calcular o total do pedido com desconto à vista
    public double calcularTotal(double percentualDesconto) {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.preco;
        }
        // Aplicar desconto à vista
        total -= total * (percentualDesconto / 100);
        return total;
    }

    // Calcular o total do pedido a prazo
    public double calcularTotal(int numPrestacoes, double juro) {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.preco;
        }
        // Aplicar juros para o pagamento a prazo
        total += total * (juro / 100);
        return total;
    }

    // Exibir informações do pedido
    public void exibirInformacoes() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("CPF do Cliente: " + cpfCliente);
        System.out.println("Itens do Pedido:");
        for (ItemPedido item : itens) {
            System.out.println("- " + item.nome + ": R$ " + item.preco);
        }
    }

    // Método main com exemplos de uso
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1, "123.456.789-01");
        pedido1.adicionarItem("Produto A", 45.0);
        pedido1.adicionarItem("Produto B", 35.0);

        pedido1.exibirInformacoes();
        System.out.println("Total com 10% de desconto à vista: R$ " + pedido1.calcularTotal(10));

        System.out.println("\n--------------------------\n");

        Pedido pedido2 = new Pedido(2, "987.654.321-00");
        ArrayList<ItemPedido> listaItens = new ArrayList<>();
        listaItens.add(new ItemPedido("Produto C", 25.0));
        listaItens.add(new ItemPedido("Produto D", 40.0));
        pedido2.adicionarItens(listaItens);

        pedido2.exibirInformacoes();
        System.out.println("Total a prazo em 4 parcelas com juros de 5%: R$ " + pedido2.calcularTotal(4, 5));
    }
}
