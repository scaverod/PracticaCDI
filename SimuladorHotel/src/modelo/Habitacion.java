package modelo;


public class Habitacion {

	private Temperatura temperatura;
	private boolean puertaAbierta;
	private Alarma despertador;
	private Jacuzzi jacuzzi;
	private boolean luzTechoHab;
	private boolean luzTechoBan;
	private boolean luzMesaIzq;
	private boolean luzMesaDer;
	private int persianaIzq;
	private int persianaDer;
	private int ventanaIzq;
	private int ventanaDer;

	public Habitacion(Temperatura temperatura, boolean puertaAbierta, Alarma despertador, Jacuzzi jacuzzi,
			boolean luzTechoHab, boolean luzTechoBan, boolean luzMesaIzq, boolean luzMesaDer, int persianaIzq,
			int persianaDer, int ventanaIzq, int ventanaDer) {

		this.temperatura = temperatura;
		this.puertaAbierta = puertaAbierta;
		this.setDespertador(despertador);
		this.jacuzzi = jacuzzi;
		this.luzTechoHab = luzTechoHab;
		this.luzTechoBan = luzTechoBan;
		this.luzMesaIzq = luzMesaIzq;
		this.luzMesaDer = luzMesaDer;
		this.persianaIzq = persianaIzq;
		this.persianaDer = persianaDer;
		this.ventanaIzq = ventanaIzq;
		this.ventanaDer = ventanaDer;
	}

	public Habitacion() {
		this.temperatura = new Temperatura(22);
		this.puertaAbierta = false;
		this.setDespertador(new Alarma(null, null));
		this.jacuzzi = new Jacuzzi(0, 0, false);
		this.luzTechoHab = false;
		this.luzTechoBan = false;
		this.luzMesaIzq = false;
		this.luzMesaDer = false;
		this.persianaIzq = 0;
		this.persianaDer = 0;
		this.ventanaIzq = 0;
		this.ventanaDer = 0;
	}

	public Temperatura getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Temperatura temperatura) {
		this.temperatura = temperatura;
	}

	public boolean isPuertaAbierta() {
		return puertaAbierta;
	}

	public void setPuertaAbierta(boolean puertaAbierta) {
		this.puertaAbierta = puertaAbierta;
	}

	public Jacuzzi getJacuzzi() {
		return jacuzzi;
	}

	public void setJacuzzi(Jacuzzi jacuzzi) {
		this.jacuzzi = jacuzzi;
	}

	public boolean isLuzTechoHab() {
		return luzTechoHab;
	}

	public void setLuzTechoHab(boolean luzTechoHab) {
		this.luzTechoHab = luzTechoHab;
	}

	public boolean isLuzTechoBan() {
		return luzTechoBan;
	}

	public void setLuzTechoBan(boolean luzTechoBan) {
		this.luzTechoBan = luzTechoBan;
	}

	public boolean isLuzMesaIzq() {
		return luzMesaIzq;
	}

	public void setLuzMesaIzq(boolean luzMesaIzq) {
		this.luzMesaIzq = luzMesaIzq;
	}

	public boolean isLuzMesaDer() {
		return luzMesaDer;
	}

	public void setLuzMesaDer(boolean luzMesaDer) {
		this.luzMesaDer = luzMesaDer;
	}

	public int getPersianaIzq() {
		return persianaIzq;
	}

	public void setPersianaIzq(int persianaIzq) {
		this.persianaIzq = persianaIzq;
	}

	public int getPersianaDer() {
		return persianaDer;
	}

	public void setPersianaDer(int persianaDer) {
		this.persianaDer = persianaDer;
	}

	public int getVentanaIzq() {
		return ventanaIzq;
	}

	public void setVentanaIzq(int ventanaIzq) {
		this.ventanaIzq = ventanaIzq;
	}

	public int getVentanaDer() {
		return ventanaDer;
	}

	public void setVentanaDer(int ventanaDer) {
		this.ventanaDer = ventanaDer;
	}

	/**
	 * Método que apaga todas las luces de la casa
	 */
	public void apagarTodasLuces() {
		this.luzTechoHab = false;
		this.luzTechoBan = false;
		this.luzMesaIzq = false;
		this.luzMesaDer = false;
	}

	public Alarma getDespertador() {
		return despertador;
	}

	public void setDespertador(Alarma despertador) {
		this.despertador = despertador;
	}

}
