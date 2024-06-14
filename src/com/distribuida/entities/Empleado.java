package com.distribuida.entities;

public class Empleado {
	
	private int idEmpleado;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int Dni;
	private String FechaNac;
	private String Direccion;
	private String sexo;
	private int Sueldo;
	private int SuperDni;
	private Departamento departamento;
	
public Empleado() {}



public Empleado(int idEmpleado, String nombre, String apellido1, String apellido2, int dni, String fechaNac,
		String direccion, String sexo, int sueldo, int superDni, Departamento departamento) {
	this.idEmpleado = idEmpleado;
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.Dni = dni;
	this.FechaNac = fechaNac;
	this.Direccion = direccion;
	this.sexo = sexo;
	this.Sueldo = sueldo;
	this.SuperDni = superDni;
	this.departamento = departamento;
}



public int getIdEmpleado() {
	return idEmpleado;
}



public void setIdEmpleado(int idEmpleado) {
	this.idEmpleado = idEmpleado;
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public String getApellido1() {
	return apellido1;
}



public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
}



public String getApellido2() {
	return apellido2;
}



public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
}



public int getDni() {
	return Dni;
}



public void setDni(int dni) {
	Dni = dni;
}



public String getFechaNac() {
	return FechaNac;
}



public void setFechaNac(String fechaNac) {
	FechaNac = fechaNac;
}



public String getDireccion() {
	return Direccion;
}



public void setDireccion(String direccion) {
	Direccion = direccion;
}



public String getSexo() {
	return sexo;
}



public void setSexo(String sexo) {
	this.sexo = sexo;
}



public int getSueldo() {
	return Sueldo;
}



public void setSueldo(int sueldo) {
	Sueldo = sueldo;
}



public int getSuperDni() {
	return SuperDni;
}



public void setSuperDni(int superDni) {
	SuperDni = superDni;
}



public Departamento getDepartamento() {
	return departamento;
}



public void setDepartamento(Departamento departamento) {
	this.departamento = departamento;
}



@Override
public String toString() {
	return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
			+ apellido2 + ", Dni=" + Dni + ", FechaNac=" + FechaNac + ", Direccion=" + Direccion + ", sexo=" + sexo
			+ ", Sueldo=" + Sueldo + ", SuperDni=" + SuperDni + ", departamento=" + departamento + "]";
}





}
