package calculos;
import java.lang.Math;
import java.util.Scanner;

class Ponto {
	
	float x, y, z;
	Ponto(float _x, float _y, float _z) {
		x = _x;
		y = _y;
		z = _z;
	}
	
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	
	public float getZ() {
		return z;
	}
	
	float distancia(Ponto p) {
		return (float) Math.sqrt( Math.pow(this.x-p.getX(),2) + Math.pow(this.y-p.getY(),2)+ Math.pow(this.z-p.getZ(),2) );
	}
	
	static Ponto solicitaPonto() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as coordenadas");
		float x = scan.nextFloat();
		float y = scan.nextFloat();
		float z = scan.nextFloat();
		
		return new Ponto(x,y,z);
	}
}
