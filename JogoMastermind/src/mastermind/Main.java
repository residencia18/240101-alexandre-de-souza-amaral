package mastermind;
import mastermind.Configuracao;



public class Main {

    public static void main(String[] args) {
        ListaConfiguracoes lista = new ListaConfiguracoes();
        Configuracao novaConfig = new Configuracao();
        Configuracao novaConfig2 = new Configuracao();
        String alfabeto = "ABCDEF";
        String alfabeto2 = "ABCDEH";
        

        novaConfig.setAlfabeto(alfabeto);
        novaConfig2.setAlfabeto(alfabeto2);
        lista.adicionar(novaConfig);
        lista.adicionar(novaConfig2);
        System.out.println(lista.obter(0).getAlfabeto());
        lista.remover(0);
        System.out.println(lista.tamanho());
        lista.limpar();
        System.out.println(lista.tamanho());

    }
    
}
