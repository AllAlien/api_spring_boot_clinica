package com.vidaplena.vidaplena.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_medico")
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_medico;
	private String cpf_medico;
	private String nome_medico;
	
	@OneToOne
	@JoinColumn(name="fk_id_especialidade")
	private Especialidade id_especialidade;
	
	public Medico() {
		
	}

	public Medico(String cpf_medico, String nome_medico, Especialidade id_especialidade) {
		super();
		this.cpf_medico = cpf_medico;
		this.nome_medico = nome_medico;
		this.id_especialidade = id_especialidade;
	}

	public Long getId_medico() {
		return id_medico;
	}

	public void setId_medico(Long id_medico) {
		this.id_medico = id_medico;
	}

	public String getCpf_medico() {
		return cpf_medico;
	}

	public void setCpf_medico(String cpf_medico) {
		this.cpf_medico = cpf_medico;
	}

	public String getNome_medico() {
		return nome_medico;
	}

	public void setNome_medico(String nome_medico) {
		this.nome_medico = nome_medico;
	}

	public Especialidade getId_especialidade() {
		return id_especialidade;
	}

	public void setId_especialidade(Especialidade id_especialidade) {
		this.id_especialidade = id_especialidade;
	}
	
	
}
