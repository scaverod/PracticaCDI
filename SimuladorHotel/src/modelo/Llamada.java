package modelo;

public class Llamada {

	private double precioEuropa;
	private double precioAmerica;
	private double precioAsia;
	private double precioAfrica;

	public Llamada(double precioEuropa, double precioAmerica, double precioAsia, double precioAfrica) {
		super();
		this.precioEuropa = precioEuropa;
		this.precioAmerica = precioAmerica;
		this.precioAsia = precioAsia;
		this.precioAfrica = precioAfrica;
	}

	public double getPrecioEuropa() {
		return precioEuropa;
	}

	public void setPrecioEuropa(double precioEuropa) {
		this.precioEuropa = precioEuropa;
	}

	public double getPrecioAmerica() {
		return precioAmerica;
	}

	public void setPrecioAmerica(double precioAmerica) {
		this.precioAmerica = precioAmerica;
	}

	public double getPrecioAsia() {
		return precioAsia;
	}

	public void setPrecioAsia(double precioAsia) {
		this.precioAsia = precioAsia;
	}

	public double getPrecioAfrica() {
		return precioAfrica;
	}

	public void setPrecioAfrica(double precioAfrica) {
		this.precioAfrica = precioAfrica;
	}

}
