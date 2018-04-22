package controlador;

import idiomas.Texto;
import idiomas.TextoManager;
import modelo.Cuenta;
import modelo.Habitacion;
import modelo.Servicios;
import modelo.ServiciosSpa;

public class Controlador {

	private Servicios servicios;
	private Cuenta cuenta;
	private Habitacion habitacion;
	private Texto texto;
	private ServiciosSpa serviciosSpa;

	public Controlador() {
		super();
		this.setTexto(new TextoManager(TextoManager.español).getTexto());
		this.servicios = new Servicios();
		this.cuenta = new Cuenta("101", "cdi");
		this.habitacion = new Habitacion();
		this.serviciosSpa = new ServiciosSpa();
	}

	public ServiciosSpa getServiciosSpa() {
		return serviciosSpa;
	}

	public void setServiciosSpa(ServiciosSpa serviciosSpa) {
		this.serviciosSpa = serviciosSpa;
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

	public Texto getTexto() {
		return texto;
	}

	public void setTexto(Texto texto) {
		this.texto = texto;
	}

}
