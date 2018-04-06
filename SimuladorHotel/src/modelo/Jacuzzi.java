package modelo;

public class Jacuzzi {

	private double temperatura;
	private double cantidadAgua;
	private boolean encendido;

	public Jacuzzi(double temperatura, double cantidadAgua, boolean encendido) {

		this.temperatura = temperatura;
		this.cantidadAgua = cantidadAgua;
		this.encendido = encendido;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getCantidadAgua() {
		return cantidadAgua;
	}

	public void setCantidadAgua(double cantidadAgua) {
		this.cantidadAgua = cantidadAgua;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

}
