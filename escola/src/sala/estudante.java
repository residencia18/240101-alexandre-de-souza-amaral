package sala;

import java.util.ArrayList;		
import java.util.List;
import java.util.Scanner;



public class estudante {
	
	String nome;
	int id;
	private int length;
	
	public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
	
	public estudante(String nome, int matricula){
		this.nome = nome;
		this.id = id;
	}
	static List<estudante> estud = new ArrayList<>();
	
	public static void addEstudante(estudante estudante) {
		estud.add(estudante);
	}
	
	
	
	
	static void listar(){
		System.out.println("Os estudantes: ");
		for(estudante estud : estud){
			System.out.println("Estudante: "+ estud.getNome()+ " Matrícula: "+ estud.getId());
		}
	}
	
	static void listarApartir(int x){
		System.out.println("Escolha a paritr de qual posição deseja listar:  ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		for(estudante estud : estud){
			if(estud.length >= x) {
			System.out.println("Estudante: "+ estud.getNome()+ " Matrícula: "+ estud.getId());
			}
		}
	}
	
	static void matricular(String semestre) {
		
	}
	
	static void matricular2(String turma) {
		
	}
	
	public static void main(String[] args) {
		
		 
		
		estudante estudantes = new estudante("a", 1);
		estudante estud1 = new estudante("Maira", 12);
		estudante estud2 = new estudante("Joana", 12);
		estudante estud3 = new estudante("Joana", 12);
		estudante estud4 = new estudante("Euzebio", 12);
		estudante estud5 = new estudante("Martinele", 12);
		
		estudantes.addEstudante(estud1);
		estudantes.addEstudante(estud2);
		estudantes.addEstudante(estud3);
		estudantes.addEstudante(estud4);
		estudantes.addEstudante(estud5);
		
		
		
		
		
		listar();
		
		
	}
	

}
