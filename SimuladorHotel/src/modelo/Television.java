package modelo;

public class Television {

	private double precioMoviestarPlus;
	private double precioNetflix;
	private double precioBeinSport;
	private double precioBBC;

	public Television(double precioMoviestarPlus, double precioNetflix, double precioBeinSport, double precioBBC) {

		this.precioMoviestarPlus = precioMoviestarPlus;
		this.precioNetflix = precioNetflix;
		this.precioBeinSport = precioBeinSport;
		this.precioBBC = precioBBC;
	}

	public double getPrecioMoviestarPlus() {
		return precioMoviestarPlus;
	}

	public void setPrecioMoviestarPlus(double precioMoviestarPlus) {
		this.precioMoviestarPlus = precioMoviestarPlus;
	}

	public double getPrecioNetflix() {
		return precioNetflix;
	}

	public void setPrecioNetflix(double precioNetflix) {
		this.precioNetflix = precioNetflix;
	}

	public double getPrecioBeinSport() {
		return precioBeinSport;
	}

	public void setPrecioBeinSport(double precioBeinSport) {
		this.precioBeinSport = precioBeinSport;
	}

	public double getPrecioBBC() {
		return precioBBC;
	}

	public void setPrecioBBC(double precioBBC) {
		this.precioBBC = precioBBC;
	}

}
