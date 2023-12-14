package conta;
import java.util.Scanner;


public class ContaBancaria {
	
	float saldo=0;
	String titular;
	
	public ContaBancaria(float _saldo, String _titular) {
		
		this.saldo = _saldo;
		this.titular = _titular;
		
	}
	
	public float sacar(float retirada) {
		return this.saldo = this.saldo - retirada;
		
	}
	
	public float depositar(float depositar) {
		return this.saldo = this.saldo + depositar;
		
	}
	
	public static void verSaldo(ContaBancaria conta) {
		System.out.println("Seu saldo é: ");
		System.out.println(conta.saldo);
	}
	
	public static void tranferirContas(ContaBancaria contabancaria1, ContaBancaria contabancaria2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor que deseja transferir para outra conta");
		float saldo = scan.nextFloat();
		
		if(contabancaria2.saldo < saldo) {
			System.out.println("Você não tem esse saldo.");
		}else {
			contabancaria1.saldo +=  saldo;
			contabancaria2.saldo -= saldo;
		}
		
	}

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(500, "Armando Botas");
		ContaBancaria conta2 = new ContaBancaria(100, "Joselina Cubicheca");
		
		
		
		verSaldo(conta1);
		
		tranferirContas(conta1, conta2);
		
		verSaldo(conta1);
		verSaldo(conta2);
		
		
	}
}

