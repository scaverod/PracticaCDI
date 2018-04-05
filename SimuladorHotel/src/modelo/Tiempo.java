package modelo;

public class Tiempo {

	private int hora;
	private int minutos;

	public Tiempo(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public String toString() {
		return hora + ":" + minutos;

	}
}
