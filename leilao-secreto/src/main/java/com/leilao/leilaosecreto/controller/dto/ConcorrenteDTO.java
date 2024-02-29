package com.leilao.leilaosecreto.controller.dto;

import com.leilao.leilaosecreto.model.Concorrente;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConcorrenteDTO {
	private Long id;
	private String nome;
	private String cpf;
	
	public ConcorrenteDTO(Concorrente concorrente) {
		this.id = concorrente.getId();
		this.nome = concorrente.getNome();
		this.cpf = concorrente.getCpf();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
