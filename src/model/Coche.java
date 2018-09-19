package model;

import java.util.Calendar;
import java.util.Date;


public class Coche {
	
	public Coche(){};
	

	private String color;
	private boolean esMetalizada;
	private String matricula;
	private int anyoFabricacion;
	private String tipoSeguro;

	
	/*private String utilitario;
	private String deportivo;
	private String familiar;*/
	

	public boolean getIsMetalizada() {
		return esMetalizada;
	}

	public void setEsMetalizada(boolean esMetalizada) {
		this.esMetalizada = esMetalizada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}

	public void setAnyoFabricacion(int anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}

	public String getTipoSeguro() {
		return tipoSeguro;
	}

	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}
	
	public void setColor(String color){
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", esMetalizada=" + esMetalizada + ", matricula=" + matricula
				+ ", anyoFabricacion=" + anyoFabricacion + ", tipoSeguro=" + tipoSeguro + "]";
	}
	
	
	
	
}
