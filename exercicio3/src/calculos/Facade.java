package calculos;
import java.util.Scanner;
import calculos.Poligono;
import calculos.Ponto;

class Facade {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Poligono de quantos pontos?");
		int n = scan.nextInt();
		Poligono poli = new Poligono();
		for (int i=0; i< n; i++) {
			Ponto p = Ponto.solicitaPonto();
			poli.inserePonto(p);
		}
		
		System.out.println("Mostrando o perimetro: "+poli.perimetro());
	}
}  