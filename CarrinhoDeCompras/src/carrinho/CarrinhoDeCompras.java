package carrinho;
import java.util.ArrayList;	
import java.util.List;
import java.util.Scanner;

import carrinho.Produtos;


public class CarrinhoDeCompras {

	static List<Produtos> produtos = new ArrayList<>();
	String cliente;
	
	

	public static void fechaCompra() {
		float total=0;
		System.out.println("A compra está fechada!");
		for(Produtos produto : produtos){
			System.out.println("Produto: "+ produto.getNome()+ " Preço: "+ produto.getPreco());
			total += produto.getPreco();
		}
		System.out.println("Total do valor da compra: "+total);
	}
	
	public static void Adcionar(Produtos item) {
		Scanner scan = new Scanner(System.in);
		int qtd;
		System.out.println("Insira a quantidade de produtos que deseja adicionar: ");
		qtd = scan.nextInt();
		for(int i =0; i <qtd; i++) {
		produtos.add(item);
		}
	}
	
	public static void Remover(Produtos item) {
		produtos.remove(item);
	}
	
	public static void main(String[] args) {
		
		CarrinhoDeCompras compra1 = new CarrinhoDeCompras();
		Produtos proudo1 = new Produtos(10, "rabecao", 50);
		Produtos produto2 = new Produtos(10, "espelho quebrado", 350);
		Produtos produto3 = new Produtos(10, "ventilador de teto preto", 800);
		
		compra1.Adcionar(proudo1);
		compra1.Adcionar(produto2);
		compra1.Adcionar(produto3);
		compra1.Remover(proudo1);
		
		compra1.fechaCompra();
	}
	
}

