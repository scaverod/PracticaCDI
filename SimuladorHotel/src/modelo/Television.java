package modelo;

public class Television {

	private double precioMoviestarPlus;
	private double precioNetflix;
	private double precioBeinSport;
	private double precioBBC;
	private boolean activadoMoviestarPlus;
	private boolean activadoNetflix;
	private boolean activadoBBC;
	private boolean activadoBeinSport;

	public Television(double precioMoviestarPlus, double precioNetflix, double precioBeinSport, double precioBBC) {

		this.precioMoviestarPlus = precioMoviestarPlus;
		this.precioNetflix = precioNetflix;
		this.precioBeinSport = precioBeinSport;
		this.precioBBC = precioBBC;
	}

	public Television(double precioMoviestarPlus, double precioNetflix, double precioBeinSport, double precioBBC,
			boolean activadoMoviestarPlus, boolean activadoNetflix, boolean activadoBBC, boolean activadoBeinSport) {
		this.precioMoviestarPlus = precioMoviestarPlus;
		this.precioNetflix = precioNetflix;
		this.precioBeinSport = precioBeinSport;
		this.precioBBC = precioBBC;
		this.activadoMoviestarPlus = activadoMoviestarPlus;
		this.activadoNetflix = activadoNetflix;
		this.activadoBBC = activadoBBC;
		this.activadoBeinSport = activadoBeinSport;
	}

	public Television(boolean activadoMoviestarPlus, boolean activadoNetflix, boolean activadoBBC,
			boolean activadoBeinSport) {

		this.activadoMoviestarPlus = activadoMoviestarPlus;
		this.activadoNetflix = activadoNetflix;
		this.activadoBBC = activadoBBC;
		this.activadoBeinSport = activadoBeinSport;
	}

	public boolean isActivadoMoviestarPlus() {
		return activadoMoviestarPlus;
	}

	public void setActivadoMoviestarPlus(boolean activadoMoviestarPlus) {
		this.activadoMoviestarPlus = activadoMoviestarPlus;
	}

	public boolean isActivadoNetflix() {
		return activadoNetflix;
	}

	public void setActivadoNetflix(boolean activadoNetflix) {
		this.activadoNetflix = activadoNetflix;
	}

	public boolean isActivadoBBC() {
		return activadoBBC;
	}

	public void setActivadoBBC(boolean activadoBBC) {
		this.activadoBBC = activadoBBC;
	}

	public boolean isActivadoBeinSport() {
		return activadoBeinSport;
	}

	public void setActivadoBeinSport(boolean activadoBeinSport) {
		this.activadoBeinSport = activadoBeinSport;
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
