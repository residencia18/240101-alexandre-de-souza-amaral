package validaIdade;
import java.util.Scanner;

public class ValidaIdadeOne {
    
    int idade;

    public ValidaIdadeOne(int idade){
        this.idade = idade;
    }

    public static void validaIdade(int idade){
        if(idade < 0 || idade > 150){
            System.out.println("Idade Invalida!");
        }else{
            System.out.println("Idade valida!");
        }
    }

   public static void Main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        try{
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        validaIdade(idade);
        }
        
    catch(java.util.InputMismatchException e){
            System.out.println("Erro: Digite um numero inteiro!");
        }
    }
}
