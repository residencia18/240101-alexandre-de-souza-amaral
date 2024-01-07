package atividade04;

import java.util.ArrayList;

class Garagem {
    private ArrayList<Veiculo> veiculos;
    private boolean possuiTomadaEletrica;

    public Garagem(boolean possuiTomadaEletrica) {
        this.veiculos = new ArrayList<>();
        this.possuiTomadaEletrica = possuiTomadaEletrica;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public boolean possuiTomadaEletrica() {
        return possuiTomadaEletrica;
    }

    public void estacionar(Veiculo veiculo) {
        adicionarVeiculo(veiculo);
        System.out.println("Veículo estacionado!");
        if (possuiTomadaEletrica && veiculo.isVeiculoEletrico()) {
            System.out.println("Veículo carregando");
        }
    }
}

class Veiculo {
    String modelo;
    String cor;
    int ano;
    boolean veiculoEletrico;

    public Veiculo(String modelo, String cor, int ano, boolean veiculoEletrico) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.veiculoEletrico = veiculoEletrico;
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

    public boolean isVeiculoEletrico() {
        return veiculoEletrico;
    }

    public void estacionar(Garagem garagem) {
        garagem.estacionar(this);
    }
}

class Carro extends Veiculo {
    public Carro(String modelo, String cor, int ano, boolean veiculoEletrico) {
        super(modelo, cor, ano, veiculoEletrico);
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    public void abrirPorta() {
        System.out.println("Porta do carro aberta");
    }
}

class Moto extends Veiculo {
    public Moto(String modelo, String cor, int ano, boolean veiculoEletrico) {
        super(modelo, cor, ano, veiculoEletrico);
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando rapidamente");
    }

    public void empinar() {
        System.out.println("Moto empinando");
    }
}

public class TesteVeiculos {
    public static void main(String[] args) {
        Garagem garagem = new Garagem(true); // Garagem com tomada elétrica

        Carro carro = new Carro("Sedan", "Prata", 2022, false); // Carro não elétrico
        Moto moto = new Moto("Esportiva", "Vermelha", 2021, true); // Moto elétrica

        carro.estacionar(garagem);
        moto.estacionar(garagem);

        System.out.println("\n------------------------\n");

        // Garagem sem tomada elétrica
        Garagem garagemSemTomada = new Garagem(false);

        Carro carroEletrico = new Carro("Elétrico", "Preto", 2023, true); // Carro elétrico
        Moto motoNaoEletrica = new Moto("Off-Road", "Verde", 2022, false); // Moto não elétrica

        carroEletrico.estacionar(garagemSemTomada);
        motoNaoEletrica.estacionar(garagemSemTomada);
    }
}
