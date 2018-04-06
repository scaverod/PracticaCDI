package modelo;

import tiposVariable.Tiempo;

public class ProgramacionTemperatura {

	public enum DiaSemana {
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
	}

	private Tiempo horaInicio;
	private Tiempo horaFin;
	private DiaSemana dia;
	private double temperatura;

	public ProgramacionTemperatura(Tiempo horaInicio, Tiempo horaFin, DiaSemana dia, double temperatura) {
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.dia = dia;
		this.temperatura = temperatura;
	}

	public Tiempo getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Tiempo horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Tiempo getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Tiempo horaFin) {
		this.horaFin = horaFin;
	}

	public DiaSemana getDia() {
		return dia;
	}

	public void setDia(DiaSemana dia) {
		this.dia = dia;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

}
