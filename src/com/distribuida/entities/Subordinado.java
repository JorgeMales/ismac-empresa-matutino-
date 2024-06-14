package com.distribuida.entities;

public class Subordinado {
	private int idSubordinado;
	private int DniEmpleado;
    private String NombreSubordinado;
    private String Sexo;
    private String FechaNac;
    private String Relacion;
    private Empleado empleado;
   

	public Subordinado(int idSubordinado, int dniEmpleado, String nombreSubordinado, String sexo, String fechaNac,
			String relacion, Empleado empleado) {
		this.idSubordinado = idSubordinado;
		this.DniEmpleado = dniEmpleado;
		this.NombreSubordinado = nombreSubordinado;
		this.Sexo = sexo;
		this.FechaNac = fechaNac;
		this.Relacion = relacion;
		this.empleado = empleado;
	}



	public int getIdSubordinado() {
		return idSubordinado;
	}



	public void setIdSubordinado(int idSubordinado) {
		this.idSubordinado = idSubordinado;
	}



	public int getDniEmpleado() {
		return DniEmpleado;
	}



	public void setDniEmpleado(int dniEmpleado) {
		DniEmpleado = dniEmpleado;
	}



	public String getNombreSubordinado() {
		return NombreSubordinado;
	}



	public void setNombreSubordinado(String nombreSubordinado) {
		NombreSubordinado = nombreSubordinado;
	}



	public String getSexo() {
		return Sexo;
	}



	public void setSexo(String sexo) {
		Sexo = sexo;
	}



	public String getFechaNac() {
		return FechaNac;
	}



	public void setFechaNac(String fechaNac) {
		FechaNac = fechaNac;
	}



	public String getRelacion() {
		return Relacion;
	}



	public void setRelacion(String relacion) {
		Relacion = relacion;
	}



	public Empleado getEmpleado() {
		return empleado;
	}



	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}



	@Override
	public String toString() {
		return "Subordinado [idSubordinado=" + idSubordinado + ", DniEmpleado=" + DniEmpleado + ", NombreSubordinado="
				+ NombreSubordinado + ", Sexo=" + Sexo + ", FechaNac=" + FechaNac + ", Relacion=" + Relacion
				+ ", empleado=" + empleado + "]";
	}




}
