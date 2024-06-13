package com.distribuida.entities;

public class Proyecto {
	
	private int idProyecto;
	private String NombreProyecto;
	private int NumProyecto;
	private String UbicacionProyecto;
	private int NumDptoProyecto;
	
	public Proyecto () {}

	public Proyecto(int idProyecto, String nombreProyecto, int numProyecto, String ubicacionProyecto,
			int numDptoProyecto) {
		
		this.idProyecto = idProyecto;
		this.NombreProyecto = nombreProyecto;
		this.NumProyecto = numProyecto;
		this.UbicacionProyecto = ubicacionProyecto;
		this.NumDptoProyecto = numDptoProyecto;
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getNombreProyecto() {
		return NombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		NombreProyecto = nombreProyecto;
	}

	public int getNumProyecto() {
		return NumProyecto;
	}

	public void setNumProyecto(int numProyecto) {
		NumProyecto = numProyecto;
	}

	public String getUbicacionProyecto() {
		return UbicacionProyecto;
	}

	public void setUbicacionProyecto(String ubicacionProyecto) {
		UbicacionProyecto = ubicacionProyecto;
	}

	public int getNumDptoProyecto() {
		return NumDptoProyecto;
	}

	public void setNumDptoProyecto(int numDptoProyecto) {
		NumDptoProyecto = numDptoProyecto;
	}

	@Override
	public String toString() {
		return "Proyecto [idProyecto=" + idProyecto + ", NombreProyecto=" + NombreProyecto + ", NumProyecto="
				+ NumProyecto + ", UbicacionProyecto=" + UbicacionProyecto + ", NumDptoProyecto=" + NumDptoProyecto
				+ "]";
	}
	
	
	
	
	

}
