package modelo;

public class Tratamiento {

	private String nombre;
	private int[] duracion;
	private String[] lugares;
	private String[] trabajadores;
	private double[] precio;
	private int horaIni;
	private int horaFin;

	public Tratamiento(String nombre, int[] duracion, String[] lugares, String[] trabajadores, int horaIni, int horaFin,
			double[] precio) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.lugares = lugares;
		this.trabajadores = trabajadores;
		this.horaIni = horaIni;
		this.horaFin = horaFin;
		this.precio = precio;
	}

	public double[] getPrecio() {
		return precio;
	}

	public void setPrecio(double[] precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getDuracion() {
		return duracion;
	}

	public void setDuracion(int[] duracion) {
		this.duracion = duracion;
	}

	public String[] getLugares() {
		return lugares;
	}

	public void setLugares(String[] lugares) {
		this.lugares = lugares;
	}

	public String[] getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(String[] trabajadores) {
		this.trabajadores = trabajadores;
	}

	public int getHoraIni() {
		return horaIni;
	}

	public void setHoraIni(int horaIni) {
		this.horaIni = horaIni;
	}

	public int getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}

}
