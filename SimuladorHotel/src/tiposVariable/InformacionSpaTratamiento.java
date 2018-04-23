package tiposVariable;

public class InformacionSpaTratamiento {

	private int max;
	private int min;
	private StringDouble factura;
	private int [] aforo;
	private int maxAforo;
	private int personas;
	private int spa;

	public InformacionSpaTratamiento(int min, int max, StringDouble factura, int [] aforo, int maxAforo, int personas, int spa) {
		this.max = max;
		this.min = min;
		this.factura = factura;
		this.aforo = aforo;
		this.personas = personas;
		this.spa = spa;
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

	public int getMaxAforo() {
		return maxAforo;
	}

	public void setMaxAforo(int maxAforo) {
		this.maxAforo = maxAforo;
	}

	public int [] getAforo() {
		return aforo;
	}

	public void setAforo(int [] aforo) {
		this.aforo = aforo;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public int getSpa() {
		return spa;
	}

	public void setSpa(int spa) {
		this.spa = spa;
	}

}
