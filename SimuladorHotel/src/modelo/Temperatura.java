package modelo;

import java.util.ArrayList;

public class Temperatura {

	private int temperaturaActual;
	private ArrayList<ProgramacionTemperatura> programacionTemperatura;

	public Temperatura(int temperaturaActual) {
		this.temperaturaActual = temperaturaActual;
		this.programacionTemperatura = new ArrayList<ProgramacionTemperatura>();
	}

	public double getTemperaturaActual() {
		return temperaturaActual;
	}

	public void setTemperaturaActual(int temperaturaActual) {
		this.temperaturaActual = temperaturaActual;
	}

	public ArrayList<ProgramacionTemperatura> getProgramacionTemperatura() {
		return programacionTemperatura;
	}

	public void setProgramacionTemperatura(ArrayList<ProgramacionTemperatura> programacionTemperatura) {
		this.programacionTemperatura = programacionTemperatura;
	}

}
