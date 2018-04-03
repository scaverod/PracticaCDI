package modelo;

public class Almohada {

	//Tipos de almhoada: 
	
	//Viscoelasticas
	private double precioVisco;
	//Latex
	private double precioLatex;
	//Gel
	private double precioGel;
	//Pluma
	private double precioPluma;
	
	
	public Almohada(double precioVisco, double precioLatex, double precioGel, double precioPluma) {
		
		this.precioVisco = precioVisco;
		this.precioLatex = precioLatex;
		this.precioGel = precioGel;
		this.precioPluma = precioPluma;
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
