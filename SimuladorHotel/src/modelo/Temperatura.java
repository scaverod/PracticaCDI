package modelo;

import java.util.ArrayList;

public class Temperatura {

	private double temperaturaActual;
	private ArrayList<ProgramacionTemperatura> programacionTemperatura;

	public Temperatura(double temperaturaActual) {
		this.temperaturaActual = temperaturaActual;
		this.programacionTemperatura = new ArrayList<ProgramacionTemperatura>();
	}

	public double getTemperaturaActual() {
		return temperaturaActual;
	}

	public void setTemperaturaActual(double temperaturaActual) {
		this.temperaturaActual = temperaturaActual;
	}

	public ArrayList<ProgramacionTemperatura> getProgramacionTemperatura() {
		return programacionTemperatura;
	}

	public void setProgramacionTemperatura(ArrayList<ProgramacionTemperatura> programacionTemperatura) {
		this.programacionTemperatura = programacionTemperatura;
	}

}
