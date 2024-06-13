package com.distribuida.entities;

public class Subordinado {
	private int idSubordinado;
	private int DniEmpleado;
    private String NombreSubordinado;
    private String Sexo;
    private String FechaNac;
    private String Relacion;
    
    
    
	public Subordinado(int idSubordinado, int dniEmpleado, String nombreSubordinado, String sexo, String fechaNac,
			String relacion) {
		super();
		this.idSubordinado = idSubordinado;
		DniEmpleado = dniEmpleado;
		NombreSubordinado = nombreSubordinado;
		Sexo = sexo;
		FechaNac = fechaNac;
		Relacion = relacion;
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



	@Override
	public String toString() {
		return "Subordinado [idSubordinado=" + idSubordinado + ", DniEmpleado=" + DniEmpleado + ", NombreSubordinado="
				+ NombreSubordinado + ", Sexo=" + Sexo + ", FechaNac=" + FechaNac + ", Relacion=" + Relacion + "]";
	}
    
    
    


}
