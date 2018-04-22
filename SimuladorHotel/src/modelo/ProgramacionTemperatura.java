package modelo;

import tiposVariable.Tiempo;

public class ProgramacionTemperatura {



	private Tiempo horaInicio;
	private Tiempo horaFin;
	private double temperatura;

	public ProgramacionTemperatura(Tiempo horaInicio, Tiempo horaFin, double temperatura) {
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
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

	
	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

}
