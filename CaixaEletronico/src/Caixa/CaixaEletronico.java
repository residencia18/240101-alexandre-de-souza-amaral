package Caixa;
import java.util.Scanner;
import Exceptions.ValorInvalidoException;

public class CaixaEletronico {
	
	float valor;
	String titular;
	
	public void CaixaEletronico(float valor, String titular){
		this.valor = valor;
		this.titular = titular;
	}
	
	public static void Sacar(float qtd_sacar) {
		if(qtd_sacar % 10 == 0) {
			System.out.println("valor mutiplo de 10!");
		}else {
			System.out.println("O valor não é um mutiplo de 10");
		}
	}

	public static void main(String[] Args) {
		
		CaixaEletronico caixa1 = new CaixaEletronico();
		Scanner scan = new Scanner(System.in);
		
		  try {
	            System.out.println("Digite o valor a ser sacado: ");
	            int valor = scan.nextInt();
	            Sacar(valor);
	        } catch (java.util.InputMismatchException e) {
	            System.out.println("Erro: Digite um número inteiro!");
	        } catch (ValorInvalidoException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	    }
	}