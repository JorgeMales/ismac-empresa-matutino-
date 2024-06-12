package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "departamento")
public class Departamento {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private int idDepartamento;
	@Column(name = "NombreDpto")
	private String NombreDpto;
	@Column(name = "NumeroDpto")
	private int NumeroDpto;
	@Column(name = "DniDirector")
	private String DniDirector;
	@Column(name = "FechaIngresoDirector")
	private String FechaIngreso;

	public Departamento() {}

	public Departamento(int idDepartamento, String nombreDpto, int numeroDpto, String dniDirector, String fechaIngreso) {
		super();
		this.idDepartamento = idDepartamento;
		this.NombreDpto = nombreDpto;
		this.NumeroDpto = numeroDpto;
		this.DniDirector = dniDirector;
		this.FechaIngreso = fechaIngreso;
	}
	

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombreDpto() {
		return NombreDpto;
	}

	public void setNombreDpto(String nombreDpto) {
		NombreDpto = nombreDpto;
	}

	public int getNumeroDpto() {
		return NumeroDpto;
	}

	public void setNumeroDpto(int numeroDpto) {
		NumeroDpto = numeroDpto;
	}

	public String getDniDirector() {
		return DniDirector;
	}

	public void setDniDirector(String dniDirector) {
		DniDirector = dniDirector;
	}

	public String getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", NombreDpto=" + NombreDpto + ", NumeroDpto="
				+ NumeroDpto + ", DniDirector=" + DniDirector + ", FechaIngreso=" + FechaIngreso + "]";
	}
	
}
