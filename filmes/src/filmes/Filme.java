package filmes;

import org.json.JSONArray;	
import org.json.JSONObject;

public class Filme {

	private String genero;
	private int ano;
	private String titulo;
	
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public static void main(String[] Args) {
		
		String json_str = "{\"titulo\":\"Os Arquivos JSON\",\"ano\":1998,\"genero\":\"Ficção\"}";
		JSONObject my_obj = new JSONObject(json_str);
		System.out.println(json_str);
		JSONArray jsonArray = new JSONArray();
		jsonArray.put("Alexandre");
		jsonArray.put("Megan Fox");
		jsonArray.put("Indiana Jones");
		my_obj.put("elenco", jsonArray);
		JSONArray novoArray = my_obj.getJSONArray("elenco");
		
		Filme filme = new Filme();

		for(int i = 0; i< novoArray.length(); i++) {
			filme.addAtor(novoArray.getString(i));
		}
		//
		
		filme.setTitulo(my_obj.getString("titulo"));
		filme.setAno(my_obj.getInt("ano"));
		filme.setGenero(my_obj.getString("genero"));

		System.out.println(my_obj);
		System.out.println(filme.toString());
	
	}
}
