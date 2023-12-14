package obra;
import obra.engenheiro;

public class projeto {

	int cod;
	String nome;
	float orcamento;
	engenheiro eng;
	
	projeto(int cod, String nome){
		this.cod = cod;
		this.nome = nome;
	}
	
	projeto(int cod, String nome, float orcamento){
		this.cod = cod;
		this.nome = nome;
		this.orcamento = orcamento;
	}
	
	projeto(int cod, String nome, float orcamento, engenheiro eng){
			this.cod = cod;
			this.nome = nome;
			this.orcamento = orcamento;
			this.eng = eng;
	}
	
	
}
