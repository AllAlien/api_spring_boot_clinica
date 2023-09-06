package com.vidaplena.vidaplena.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_especialidade")
public class Especialidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_especialidade;
	private String nome_especialidade;
	
	public Especialidade() {}

	public Especialidade(String nome_especialidade) {
		super();
		this.nome_especialidade = nome_especialidade;
	}

	public Long getId_especialidade() {
		return id_especialidade;
	}

	public void setId_especialidade(Long id_especialidade) {
		this.id_especialidade = id_especialidade;
	}

	public String getNome_especialidade() {
		return nome_especialidade;
	}

	public void setNome_especialidade(String nome_especialidade) {
		this.nome_especialidade = nome_especialidade;
	}
	
	
}
