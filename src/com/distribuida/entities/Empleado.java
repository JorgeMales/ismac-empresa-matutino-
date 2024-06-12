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
@Table(name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado")
	private int idEmpleado;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Apellido1")
	private String apellido1;
	@Column(name = "Apellido2")
	private String apellido2;
	@Column(name = "Dni")
	private int Dni;
	@Column(name = "Fecha_nac")
	private String FechaNac;
	@Column(name = "Direccion")
	private String Direccion;
	@Column(name = "Sexo")
	private String sexo;
	@Column(name = "Sueldo")
	private int Sueldo;
	@Column(name = "SuperDni")
	private int SuperDni;
	@Column(name = "Dno")
	private int Dno;
	
public Empleado() {}

public Empleado(int idEmpleado, String nombre, String apellido1, String apellido2, int dni, String fechaNac,
		String direccion, String sexo, int sueldo, int superDni, int dno) {
	super();
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
	this.Dno = dno;
	
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

public int getDno() {
	return Dno;
}

public void setDno(int dno) {
	Dno = dno;
}

@Override
public String toString() {
	return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
			+ apellido2 + ", Dni=" + Dni + ", FechaNac=" + FechaNac + ", Direccion=" + Direccion + ", sexo=" + sexo
			+ ", Sueldo=" + Sueldo + ", SuperDni=" + SuperDni + ", Dno=" + Dno + "]";
}




}
