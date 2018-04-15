package modelo;

public class Almohada {

	private double precioVisco;
	private double precioLatex;
	private double precioGel;
	private double precioPluma;
	private String nombre;

	public static final String viscoelastica = "Viscoelastica";
	public static final String latex = "Latex";
	public static final String gel = "Gel";
	public static final String pluma = "Pluma";

	public Almohada(double precioVisco, double precioLatex, double precioGel, double precioPluma) {

		this.precioVisco = precioVisco;
		this.precioLatex = precioLatex;
		this.precioGel = precioGel;
		this.precioPluma = precioPluma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioVisco() {
		return precioVisco;
	}

	public void setPrecioVisco(double precioVisco) {
		this.precioVisco = precioVisco;
	}

	public double getPrecioLatex() {
		return precioLatex;
	}

	public void setPrecioLatex(double precioLatex) {
		this.precioLatex = precioLatex;
	}

	public double getPrecioGel() {
		return precioGel;
	}

	public void setPrecioGel(double precioGel) {
		this.precioGel = precioGel;
	}

	public double getPrecioPluma() {
		return precioPluma;
	}

	public void setPrecioPluma(double precioPluma) {
		this.precioPluma = precioPluma;
	}

}
