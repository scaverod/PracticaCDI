package modelo;

public class Servicios {

	private Almohada almohada;
	private Botones botones;
	private MiniBar minibar;
	private Taxi taxi;
	private Wifi wifi;
	private Llamada llamada;
	private Sabanas sabanas;
	private Limpieza limpieza;

	public Servicios() {
		this.almohada = new Almohada(1.50, 2, 1.25, 1);
		this.botones = new Botones(1);
		this.minibar = new MiniBar(4.50);
		this.taxi = new Taxi(0.50);
		this.wifi = new Wifi(false, 2.50, null);
		this.llamada = new Llamada(0.50, 1.25, 1.50, 2);
		this.sabanas = new Sabanas(0.50);
		//TODO: inicialziar limpieza
	}

	public Sabanas getSabanas() {
		return sabanas;
	}

	public void setSabanas(Sabanas sabanas) {
		this.sabanas = sabanas;
	}

	public Almohada getAlmohada() {
		return almohada;
	}

	public void setAlmohada(Almohada almohada) {
		this.almohada = almohada;
	}

	public Botones getBotones() {
		return botones;
	}

	public void setBotones(Botones botones) {
		this.botones = botones;
	}

	public MiniBar getMinibar() {
		return minibar;
	}

	public void setMinibar(MiniBar minibar) {
		this.minibar = minibar;
	}

	public Taxi getTaxi() {
		return taxi;
	}

	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}

	public Wifi getWifi() {
		return wifi;
	}

	public void setWifi(Wifi wifi) {
		this.wifi = wifi;
	}

	public Llamada getLlamada() {
		return llamada;
	}

	public void setLlamada(Llamada llamada) {
		this.llamada = llamada;
	}

}
