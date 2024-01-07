package atividade03;

class Veiculo {
    String modelo;
    String cor;
    int ano;

    public Veiculo(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("Veículo ligado");
    }

    public void acelerar() {
        System.out.println("Veículo acelerando");
    }

    public void parar() {
        System.out.println("Veículo parado");
    }
}

class Carro extends Veiculo {
    public Carro(String modelo, String cor, int ano) {
        super(modelo, cor, ano);
    }

    // Sobrescreve o método ligar da classe Veiculo
    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    // Adiciona um método específico para carros
    public void abrirPorta() {
        System.out.println("Porta do carro aberta");
    }
}

class Moto extends Veiculo {
    public Moto(String modelo, String cor, int ano) {
        super(modelo, cor, ano);
    }

    // Sobrescreve o método acelerar da classe Veiculo
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando rapidamente");
    }

    // Adiciona um método específico para motos
    public void empinar() {
        System.out.println("Moto empinando");
    }
}

public class TesteVeiculos {
    public static void main(String[] args) {
        // Cria instâncias das classes derivadas (Carro e Moto)
        Carro carro = new Carro("Sedan", "Prata", 2022);
        Moto moto = new Moto("Esportiva", "Vermelha", 2021);

        // Demonstra o polimorfismo chamando os métodos das classes base (Veiculo)
        Veiculo veiculo1 = carro;
        Veiculo veiculo2 = moto;

        veiculo1.ligar();  // Chama o método ligar() da classe Carro
        veiculo1.acelerar();  // Chama o método acelerar() da classe Veiculo
        veiculo1.parar();  // Chama o método parar() da classe Veiculo

        System.out.println("\n------------------------\n");

        veiculo2.ligar();  // Chama o método ligar() da classe Moto
        veiculo2.acelerar();  // Chama o método acelerar() da classe Moto
        veiculo2.parar();  // Chama o método parar() da classe Veiculo

        // Demonstra os métodos específicos para Carro e Moto
        ((Carro) veiculo1).abrirPorta();  // Converte veiculo1 para Carro e chama o método abrirPorta()
        ((Moto) veiculo2).empinar();  // Converte veiculo2 para Moto e chama o método empinar()
    }
}
