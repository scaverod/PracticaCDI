package modelo;

import tiposVariable.Tiempo;

public class Alarma {



	public Tiempo hora;
	private boolean [] dia = new boolean [7];

	public Alarma(Tiempo hora, boolean [] dia) {
		this.hora = hora;
		this.dia = dia;
	}
	
	public Alarma() {
		this.hora = null;
		this.dia = inicializar();
	}

	public Tiempo getHora() {
		return hora;
	}

	public void setHora(Tiempo hora) {
		this.hora = hora;
	}

	public boolean []  getDia() {
		return dia;
	}

	public void setDia(boolean [] dia) {
		this.dia = dia;
	}

	public void eliminar() {
		for(int i = 0; i<7; i++) {
			dia [i] = false;
		}
		hora = null;
	}
	
	public boolean [] inicializar () {
		 boolean [] aux  = new boolean [7];
		for(int i = 0; i<7; i++) {
			aux [i] = false;
		}
		return aux;
	}

}
