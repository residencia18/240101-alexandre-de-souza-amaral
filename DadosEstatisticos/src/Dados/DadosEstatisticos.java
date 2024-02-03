package Dados;

import java.sql.Date;

public class DadosEstatisticos implements DadoEstatistico{

	Date dataNascimento;
	float temperaturaPeriodo;
	String Cidades;
	
	public Object Maximo(){
        return null;
    };  
	
	public Object Minimo(){
        return null;
    };
	
	public Object Ordenar(){
        return null;
    };
	
	public Object Buscar(){
        return null;
    };
    };
	
	public DadosEstatisticos(Date dataNascimento, float temperaturaPeriodo, String cidades) {
        super();
        this.dataNascimento = dataNascimento;
        this.temperaturaPeriodo = temperaturaPeriodo;
        Cidades = cidades;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public float getTemperaturaPeriodo() {
        return temperaturaPeriodo;
    }

    public String getCidades() {
        return Cidades;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTemperaturaPeriodo(float temperaturaPeriodo) {
        this.temperaturaPeriodo = temperaturaPeriodo;
    }

    public void setCidades(String cidades) {
        Cidades = cidades;
    }
    
    public static void main(String[] Args) {
    	
    	DadosEstatisticos dados = new DadosEstatisticos(new Date(System.currentTimeMillis()), 25.5f, "São Paulo");

        System.out.println("Máximo: " + dados.Maximo());
        System.out.println("Mínimo: " + dados.Minimo());
        System.out.println("Ordenado: " + Arrays.toString((Object[]) dados.Ordenar()));
        System.out.println("Busca: " + dados.Buscar());	
    	
    	
    }

    
}
