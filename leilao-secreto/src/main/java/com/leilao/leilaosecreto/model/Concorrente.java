package com.leilao.leilaosecreto.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Concorrente {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	
	@OneToMany(mappedBy = "concorrente", fetch = FetchType.LAZY)
	private List<Lance> listaLances;

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCpf() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNome(String nome2) {
		// TODO Auto-generated method stub
		
	}

	public void setCpf(String cpf2) {
		// TODO Auto-generated method stub
		
	}
	
}
