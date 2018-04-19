package modelo;

public class Spa {

	private String nombre;
	private String[] duracion;
	private int aforoMax;
	private int asistentes;
	private double[] precio;
	private int horaIni;
	private int horaFin;

	public Spa(String nombre, String[] duracion, int aforoMax, int asistentes, double[] precio, int horaIni, int horaFin) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.aforoMax = aforoMax;
		this.asistentes = asistentes;
		this.precio = precio;
		this.horaFin = horaFin;
		this.horaIni = horaIni;
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

	public String[] getDuracion() {
		return duracion;
	}

	public void setDuracion(String[] duracion) {
		this.duracion = duracion;
	}

	public int getAforoMax() {
		return aforoMax;
	}

	public void setAforoMax(int aforoMax) {
		this.aforoMax = aforoMax;
	}

	public int getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(int asistentes) {
		this.asistentes = asistentes;
	}

}
