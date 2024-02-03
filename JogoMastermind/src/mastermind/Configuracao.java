package mastermind;

public class Configuracao {

	private String alfabeto;

	public String getAlfabeto() {
		return alfabeto;
	}

	public void setAlfabeto(String alfabeto) {
		this.alfabeto = alfabeto;

		if (this.alfabeto == null) {
			throw new IllegalArgumentException("O alfabeto deve possuir mais de 1 caracter");
		}

		if (this.alfabeto.length() < 2 || this.alfabeto.length() > 7) {
			throw new IllegalArgumentException("O alfabeto deve possuir mais de 1 caracter e menos que 7 caracteres");
		}

		for (int i = 0; i < this.alfabeto.length(); i++) {
			for (int j = i + 1; j < this.alfabeto.length(); j++) {
				if (this.alfabeto.charAt(i) == this.alfabeto.charAt(j)) {
					throw new IllegalArgumentException("O alfabeto não pode possuir caracteres repetidos");
				}
			}
		}


	}

	public Configuracao(String alfabeto) {
		this.alfabeto = alfabeto;

		if (this.alfabeto == null) {
			throw new IllegalArgumentException("O alfabeto deve possuir mais de 1 caracter");
		}

		if (this.alfabeto.length() < 2 || this.alfabeto.length() > 7) {
			throw new IllegalArgumentException("O alfabeto deve possuir mais de 1 caracter e menos que 7 caracteres");
		}

		for (int i = 0; i < this.alfabeto.length(); i++) {
			for (int j = i + 1; j < this.alfabeto.length(); j++) {
				if (this.alfabeto.charAt(i) == this.alfabeto.charAt(j)) {
					throw new IllegalArgumentException("O alfabeto não pode possuir caracteres repetidos");
				}
			}
		}


	}

	public Configuracao() {
		this.alfabeto = "ABCDEF";

		if (this.alfabeto == null) {
			throw new IllegalArgumentException("O alfabeto deve possuir mais de 1 caracter");
		}

		if (this.alfabeto.length() < 2 || this.alfabeto.length() > 7) {
			throw new IllegalArgumentException("O alfabeto deve possuir mais de 1 caracter e menos que 7 caracteres");
		}

		for (int i = 0; i < this.alfabeto.length(); i++) {
			for (int j = i + 1; j < this.alfabeto.length(); j++) {
				if (this.alfabeto.charAt(i) == this.alfabeto.charAt(j)) {
					throw new IllegalArgumentException("O alfabeto não pode possuir caracteres repetidos");
				}
			}
		}
	}

	
}
