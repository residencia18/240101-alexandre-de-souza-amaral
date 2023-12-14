package concessionaria;

public class carro extends veiculo{
	
	int numPortas;
	String marca;
	Boolean flag;
	

	public carro(String modelo, String cor, int ano, int num_portas, boolean flag) {
		
		super(modelo,cor,ano);
		if(flag) {	
			this.numPortas = num_portas;
			}
		this.flag = flag;
		
	}
	
	public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }


	public static void main(String[] args) {
		
	carro car = new carro("civic", "azul", 5,3 ,true);
	
	
	System.out.println("Modelo: " + car.getModelo());
    System.out.println("Cor: " + car.getCor());
    System.out.println("Ano: " + car.getAno());
    System.out.println("Número de Portas: " + car.getNumPortas());
    System.out.println("Flag: " + car.getFlag());
	
}
	
}
