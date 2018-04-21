package tiposVariable;

public class InformacionSpaTratamiento {

	private int max;
	private int min;
	private StringDouble factura;

	public InformacionSpaTratamiento(int min, int max, StringDouble factura) {
		this.max = max;
		this.min = min;
		this.factura = factura;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public StringDouble getFactura() {
		return factura;
	}

	public void setFactura(StringDouble factura) {
		this.factura = factura;
	}
	
	public void print () {
		System.out.println("Hora inicio:" + min);
		System.out.println("Hora fin:" + max);
		System.out.println("Hora factura:" + this.factura.getCadena() +  " - " + this.factura.getNumero());
	}

}
