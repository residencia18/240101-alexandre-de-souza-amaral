package atividade;

import java.util.ArrayList;
import java.util.List;


class Cliente {
    private String nome;
    private String cpf;
    private List<Imovel> imoveis;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.imoveis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void addImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

}


class Imovel {
    private int matricula;
    private double ultimaLeitura;
    private double penultimaLeitura;

    public Imovel(int matricula, double ultimaLeitura, double penultimaLeitura) {
        this.matricula = matricula;
        this.ultimaLeitura = ultimaLeitura;
        this.penultimaLeitura = penultimaLeitura;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getUltimaLeitura() {
        return ultimaLeitura;
    }

    public double getPenultimaLeitura() {
        return penultimaLeitura;
    }

    public void registraLeitura(double novaLeitura) {
        penultimaLeitura = ultimaLeitura;
        ultimaLeitura = novaLeitura;
    }

}


class Fatura {
    private int matriculaImovel;
    private double penultimaLeitura;
    private double ultimaLeitura;
    private double valorCalculado;
    private boolean quitada;
    private String dataEmissao;

    public Fatura(int matriculaImovel, double penultimaLeitura, double ultimaLeitura, String dataEmissao) {
        this.matriculaImovel = matriculaImovel;
        this.penultimaLeitura = penultimaLeitura;
        this.ultimaLeitura = ultimaLeitura;
        this.dataEmissao = dataEmissao;
        this.valorCalculado = calcularValor();
        this.quitada = false;
    }

    private double calcularValor() {
       
        return (ultimaLeitura - penultimaLeitura) * 10;
    }

    public double getValorCalculado() {
        return valorCalculado;
    }

    public boolean isQuitada() {
        return quitada;
    }

    public void quitarFatura() {
        quitada = true;
    }
}
