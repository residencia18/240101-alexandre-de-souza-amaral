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
public class Leilao {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private Double valorMinimo;
	private String status;
	
	@OneToMany(mappedBy = "leilao", fetch = FetchType.LAZY)
	private List<Lance> listaLances;

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getValorMinimo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDescricao(String descricao2) {
		// TODO Auto-generated method stub
		
	}

	public void setValorMinimo(Double valorMinimo2) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(String status2) {
		// TODO Auto-generated method stub
		
	}

}
