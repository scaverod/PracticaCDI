package tiposVariable;

public class InformacionSpaTratamiento {

	private int max;
	private int min;
	private StringDouble Factura;

	public InformacionSpaTratamiento(int max, int min, StringDouble factura) {
		this.max = max;
		this.min = min;
		Factura = factura;
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
		return Factura;
	}

	public void setFactura(StringDouble factura) {
		Factura = factura;
	}

}
