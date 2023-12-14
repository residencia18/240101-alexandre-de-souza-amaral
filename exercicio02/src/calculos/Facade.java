package calculos;
import calculos.Poligono;
import calculos.Ponto;
import java.util.Scanner;

class Facade {
	
	public static void main(String[] args){
		System.out.println("Poligono de quantos pontos?");
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		Poligono poli = new Poligono();
		
		for (int i=0; i< n; i++) {
			System.out.println("Digite as coordenadas");
			float x = scan.nextInt();
			float y = scan.nextInt();
			float z = scan.nextInt();
			poli.inserePonto(x, y, z);
		}
		
		System.out.println("Mostrando o perimetro: "+poli.perimetro());
	}
}