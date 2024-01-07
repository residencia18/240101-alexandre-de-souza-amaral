package atividade01;
import java.util.ArrayList;

public class Calculadora {
    
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        }
    }

    
    public static float somar(float a, float b) {
        return a + b;
    }

    public static float subtrair(float a, float b) {
        return a - b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        }
    }

    
    public static int somar(ArrayList<Integer> numeros) {
        int resultado = 0;
        for (int num : numeros) {
            resultado += num;
        }
        return resultado;
    }

    public static float multiplicar(ArrayList<Float> numeros) {
        float resultado = 1;
        for (float num : numeros) {
            resultado *= num;
        }
        return resultado;
    }

    
    public static void main(String[] args) {
        
        System.out.println("Soma: " + somar(5, 3));
        System.out.println("Subtração: " + subtrair(8, 4));
        System.out.println("Multiplicação: " + multiplicar(6, 2));
        System.out.println("Divisão: " + dividir(9, 3));

        
        System.out.println("Soma: " + somar(5.5f, 3.2f));
        System.out.println("Subtração: " + subtrair(8.0f, 4.5f));
        System.out.println("Multiplicação: " + multiplicar(6.2f, 2.5f));
        System.out.println("Divisão: " + dividir(9.0f, 3.0f));

      
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("Soma da lista de inteiros: " + somar(intList));

        ArrayList<Float> floatList = new ArrayList<>();
        floatList.add(1.5f);
        floatList.add(2.0f);
        floatList.add(3.5f);
        System.out.println("Multiplicação da lista de floats: " + multiplicar(floatList));
    }
}
