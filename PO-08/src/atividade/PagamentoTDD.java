package atividade;
import java.util.ArrayList;
import atividade.Cliente;
import java.util.List;

class Pagamento {
    private int matriculaFatura;
    private double valorPago;
    private String dataPagamento;

    public Pagamento(int matriculaFatura, double valorPago, String dataPagamento) {
        this.matriculaFatura = matriculaFatura;
        this.valorPago = valorPago;
        this.dataPagamento = dataPagamento;
    }

    public int getMatriculaFatura() {
        return matriculaFatura;
    }

    public double getValorPago() {
        return valorPago;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }
}

// Adicione esses métodos à classe Fatura
class Fatura {
    // ...

    private List<Pagamento> pagamentos;

    public Fatura(int matriculaImovel, double penultimaLeitura, double ultimaLeitura, String dataEmissao) {
        // ...
        this.pagamentos = new ArrayList<>();
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void registrarPagamento(double valorPago, String dataPagamento) {
        if (!quitada) {
            pagamentos.add(new Pagamento(matriculaImovel, valorPago, dataPagamento));

            // Verificar se a fatura foi quitada após o pagamento
            if (calcularValorPago() >= valorCalculado) {
                quitarFatura();
            }
        }
    }

    private double calcularValorPago() {
        return pagamentos.stream().mapToDouble(Pagamento::getValorPago).sum();
    }
}
