package com.distribuida.entities;

public class TrabajaEn {
	
	private int idTrabajaEn;
	private int DniEmpleado;
	private int NumProy;
	private int Horas;
	private Empleado empleado;
	private Proyecto proyecto;
	
	public TrabajaEn() {}
	
	public TrabajaEn(int idTrabajaEn, int dniEmpleado, int numProy, int horas, Empleado empleado, Proyecto proyecto) {
		this.idTrabajaEn = idTrabajaEn;
		this.DniEmpleado = dniEmpleado;
		this.NumProy = numProy;
		this.Horas = horas;
		this.empleado = empleado;
		this.proyecto = proyecto;
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



	public Empleado getEmpleado() {
		return empleado;
	}



	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}



	public Proyecto getProyecto() {
		return proyecto;
	}



	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "TrabajaEn [idTrabajaEn=" + idTrabajaEn + ", DniEmpleado=" + DniEmpleado + ", NumProy=" + NumProy
				+ ", Horas=" + Horas + ", empleado=" + empleado + ", proyecto=" + proyecto + "]";
	}




}
