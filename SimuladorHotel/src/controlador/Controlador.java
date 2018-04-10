package controlador;

import modelo.Cuenta;
import modelo.Habitacion;
import modelo.Servicios;

public class Controlador {

	private Servicios servicios;
	private Cuenta cuenta;
	private Habitacion habitacion;
	
	

	public Controlador() {
		super();
		this.servicios = new Servicios();
		this.cuenta = new Cuenta("101", "contr12");
		this.habitacion =  new Habitacion();
	}

	public Servicios getServicios() {
		return servicios;
	}

	public void setServicios(Servicios servicios) {
		this.servicios = servicios;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

}
