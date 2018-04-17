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
	private Comida comida;
	private Television television;
	private Toallas toallas;

	public Servicios() {
		this.almohada = new Almohada(1.50, 2, 1.25, 1);
		this.botones = new Botones(1);
		this.minibar = new MiniBar(4.50);
		this.taxi = new Taxi(0.50);
		this.wifi = new Wifi(false, 2.50, null);
		this.llamada = new Llamada(0.50, 1.25, 1.50, 2);
		this.sabanas = new Sabanas(0.50);
		this.limpieza = new Limpieza(0.50, null);
		this.comida = new Comida(3.50);
		this.television = new Television(2.50, 3.50, 4.50, 3.50);
		this.toallas = new Toallas(0.25);
	}

	public Servicios(Wifi wifi, Limpieza limpieza, Television television) {
		this.almohada = new Almohada(1.50, 2, 1.25, 1);
		this.botones = new Botones(1);
		this.minibar = new MiniBar(4.50);
		this.taxi = new Taxi(0.50);
		this.wifi = new Wifi(wifi.isActivado(), 2.50, wifi.getPwd());
		this.llamada = new Llamada(0.50, 1.25, 1.50, 2);
		this.sabanas = new Sabanas(0.50);
		this.limpieza = new Limpieza(0.50, limpieza.getTiempo());
		this.comida = new Comida(3.50);
		this.television = new Television(2.50, 3.50, 4.50, 3.50, television.isActivadoMoviestarPlus(),
				television.isActivadoNetflix(), television.isActivadoBBC(), television.isActivadoBeinSport());
		this.toallas = new Toallas(0.25);
	}

	public Television getTelevision() {
		return television;
	}

	public void setTelevision(Television television) {
		this.television = television;
	}

	public Comida getComida() {
		return comida;
	}

	public void setComida(Comida comida) {
		this.comida = comida;
	}

	public Limpieza getLimpieza() {
		return limpieza;
	}

	public void setLimpieza(Limpieza limpieza) {
		this.limpieza = limpieza;
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

	public void cargaWifi(Wifi wifi) {
		this.wifi.setPwd(wifi.getPwd());
		this.wifi.setActivado(wifi.isActivado());
	}

	public void cargaLimpieza(Limpieza limpieza) {
		this.limpieza.setTiempo(limpieza.getTiempo());
	}

	public void cargaTelevision(Television television) {
		this.television = new Television(2.50, 3.50, 4.50, 3.50, television.isActivadoMoviestarPlus(),
				television.isActivadoNetflix(), television.isActivadoBBC(), television.isActivadoBeinSport());
	}

	public Toallas getToallas() {
		return toallas;
	}

	public void setToallas(Toallas toallas) {
		this.toallas = toallas;
	}

}
