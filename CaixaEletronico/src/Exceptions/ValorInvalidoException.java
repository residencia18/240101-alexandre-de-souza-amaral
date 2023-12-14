package Exceptions;
import Caixa.CaixaEletronico;

public class ValorInvalidoException extends Exception {
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}