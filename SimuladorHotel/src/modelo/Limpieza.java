package modelo;

public class Limpieza {

	private double precio;
	private Tiempo tiempo;

	public Limpieza(double precio, Tiempo tiempo) {

		this.precio = precio;
		this.tiempo = tiempo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Tiempo getTiempo() {
		return tiempo;
	}

	public void setTiempo(Tiempo tiempo) {
		this.tiempo = tiempo;
	}

}
