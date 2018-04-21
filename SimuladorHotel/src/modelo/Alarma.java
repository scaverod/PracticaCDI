package modelo;

import tiposVariable.Tiempo;

public class Alarma {



	public Tiempo hora;
	private boolean [] dia;

	public Alarma(Tiempo hora, boolean [] dia) {
		super();
		this.hora = hora;
		this.dia = dia;
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

}
