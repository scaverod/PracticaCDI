/*

The following notices can be found in each source file of the 
original project.

Copyright (C) 2018 EquipoSPA:
	David Herrero Pascual	- GitHub: Deividhp13
	Antonio Castro Blanco	- GitHub: Castrum38
	Radu Dumitru Boboia		- GitHub: rdboboia
	Sergio Cavero Díaz		- GitHub: scaverod

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.

You can contact us at our GitHub written above.

To see the full license, check:
https://github.com/scaverod/PracticaCDI/blob/master/LICENSE

*/

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
