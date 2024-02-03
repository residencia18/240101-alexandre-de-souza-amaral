package mastermind;
import mastermind.Configuracao;

public class ListaConfiguracoes {

    private Configuracao[] configuracoes;
    private int tamanho;

    public ListaConfiguracoes() {
        this.configuracoes = new Configuracao[10];
        this.tamanho = 0;
    }

    public void adicionar(Configuracao configuracao) {
        if (this.tamanho < this.configuracoes.length) {
            this.configuracoes[this.tamanho] = configuracao;
            this.tamanho++;
        } else {
            Configuracao[] novo = new Configuracao[this.configuracoes.length * 2];
            for (int i = 0; i < this.configuracoes.length; i++) {
                novo[i] = this.configuracoes[i];
            }
            this.configuracoes = novo;
            this.configuracoes[this.tamanho] = configuracao;
            this.tamanho++;
        }
    }

    public Configuracao obter(int indice) {
        if (indice < this.tamanho) {
            return this.configuracoes[indice];
        } else {
            return null;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void remover(int indice) {
        if (indice < this.tamanho) {
            for (int i = indice; i < this.tamanho - 1; i++) {
                this.configuracoes[i] = this.configuracoes[i + 1];
            }
            this.tamanho--;
        }
    }

    public void remover(Configuracao configuracao) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.configuracoes[i].equals(configuracao)) {
                this.remover(i);
                break;
            }
        }
    }

    public void limpar() {
        this.tamanho = 0;
    }

    public boolean contem(Configuracao configuracao) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.configuracoes[i].equals(configuracao)) {
                return true;
            }
        }
        return false;
    }

    public int indice(Configuracao configuracao) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.configuracoes[i].equals(configuracao)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        String resultado = "";
        for (int i = 0; i < this.tamanho; i++) {
            resultado += this.configuracoes[i].toString() + "\n";
        }
        return resultado;
    }

}
