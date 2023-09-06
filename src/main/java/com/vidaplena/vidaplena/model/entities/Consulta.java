package com.vidaplena.vidaplena.model.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="tb_consulta")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_consulta;
	
	private Date data_consulta;
	
	@OneToOne
	@JoinColumn(name="fk_id_medico")
	private Medico id_medico;
	
	@OneToOne
	@JoinColumn(name="fk_id_paciente")
	private Paciente id_paciente;
	
	public Consulta() {}
	
	public Consulta(Date data_consulta, Medico id_medico, Paciente id_paciente) {
		super();
		this.data_consulta = data_consulta;
		this.id_medico = id_medico;
		this.id_paciente = id_paciente;
	}

	public Long getId_consulta() {
		return id_consulta;
	}

	public void setId_consulta(Long id_consulta) {
		this.id_consulta = id_consulta;
	}

	public Date getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(Date data_consulta) {
		this.data_consulta = data_consulta;
	}

	public Medico getId_medico() {
		return id_medico;
	}

	public void setId_medico(Medico id_medico) {
		this.id_medico = id_medico;
	}

	public Paciente getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(Paciente id_paciente) {
		this.id_paciente = id_paciente;
	}
	
	
}
