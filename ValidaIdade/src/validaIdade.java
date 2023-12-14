import java.util.Scanner;
import java.time.LocalDate;
import Exceptions.IdadeInvalidaException;


public class validaIdade {
    
    int idade;
    

    public validaIdade(int idade){
        this.idade = idade;
    }

    public static void validaIdade(int idade) throws IdadeInvalidaException {
        if(idade < 0 || idade > 150){
            throw new IdadeInvalidaException("Idade Inválida!");
        } else {
            System.out.println("Idade válida!");
        }
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade: ");
            int idade = scan.nextInt();
            validaIdade(idade);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Digite um número inteiro!");
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}


