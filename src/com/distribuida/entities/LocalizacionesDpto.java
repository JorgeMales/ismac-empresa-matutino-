package com.distribuida.entities;

public class LocalizacionesDpto {
	private int idLocalizacionesDpto;
	private int NumeroDpta;
	private String UbicacionDpto;
	
	
	public LocalizacionesDpto ( ){}


	public LocalizacionesDpto(int idLocalizacionesDpto, int numeroDpta, String ubicacionDpto) {
		this.idLocalizacionesDpto = idLocalizacionesDpto;
		this.NumeroDpta = numeroDpta;
		this.UbicacionDpto = ubicacionDpto;
	}


	public int getIdLocalizacionesDpto() {
		return idLocalizacionesDpto;
	}


	public void setIdLocalizacionesDpto(int idLocalizacionesDpto) {
		this.idLocalizacionesDpto = idLocalizacionesDpto;
	}


	public int getNumeroDpta() {
		return NumeroDpta;
	}


	public void setNumeroDpta(int numeroDpta) {
		NumeroDpta = numeroDpta;
	}


	public String getUbicacionDpto() {
		return UbicacionDpto;
	}


	public void setUbicacionDpto(String ubicacionDpto) {
		UbicacionDpto = ubicacionDpto;
	}


	@Override
	public String toString() {
		return "LocalizacionesDpto [idLocalizacionesDpto=" + idLocalizacionesDpto + ", NumeroDpta=" + NumeroDpta
				+ ", UbicacionDpto=" + UbicacionDpto + "]";
	}

	

}
