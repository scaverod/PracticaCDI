package modelo;

import tiposVariable.Tiempo;

public class Alarma {

	public enum DiaSemana {
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
	}

	public Tiempo hora;
	private DiaSemana dia;

	public Alarma(Tiempo hora, DiaSemana dia) {
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

	public DiaSemana getDia() {
		return dia;
	}

	public void setDia(DiaSemana dia) {
		this.dia = dia;
	}

}
