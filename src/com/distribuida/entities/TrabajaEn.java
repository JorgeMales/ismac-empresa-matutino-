package com.distribuida.entities;

public class TrabajaEn {
	
	private int idTrabajaEn;
	private int DniEmpleado;
	private int NumProy;
	private int Horas;
	
	public TrabajaEn() {}
	
	public TrabajaEn(int idTrabajaEn, int dniEmpleado, int numProy, int horas) {
		
		this.idTrabajaEn = idTrabajaEn;
		this.DniEmpleado = dniEmpleado;
		this.NumProy = numProy;
		this.Horas = horas;
	}

	public int getIdTrabajaEn() {
		return idTrabajaEn;
	}

	public void setIdTrabajaEn(int idTrabajaEn) {
		this.idTrabajaEn = idTrabajaEn;
	}

	public int getDniEmpleado() {
		return DniEmpleado;
	}

	public void setDniEmpleado(int dniEmpleado) {
		DniEmpleado = dniEmpleado;
	}

	public int getNumProy() {
		return NumProy;
	}

	public void setNumProy(int numProy) {
		NumProy = numProy;
	}

	public int getHoras() {
		return Horas;
	}

	public void setHoras(int horas) {
		Horas = horas;
	}

	@Override
	public String toString() {
		return "TrabajaEn [idTrabajaEn=" + idTrabajaEn + ", DniEmpleado=" + DniEmpleado + ", NumProy=" + NumProy
				+ ", Horas=" + Horas + "]";
	}
	
	

}
