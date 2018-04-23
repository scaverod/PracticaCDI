/*

The following notices can be found in each source file.

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

package modelo;

public class Tratamiento {

	private String nombre;
	private String[] duracion;
	private String[] lugares;
	private String[] trabajadores;
	private double[] precio;
	private int horaIni;
	private int horaFin;

	public Tratamiento(String nombre, String[] duracion, String[] lugares, String[] trabajadores, int horaIni, int horaFin,
			double[] precio) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.lugares = lugares;
		this.trabajadores = trabajadores;
		this.horaIni = horaIni;
		this.horaFin = horaFin;
		this.precio = precio;
	}

	public double[] getPrecio() {
		return precio;
	}

	public void setPrecio(double[] precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getDuracion() {
		return duracion;
	}

	public void setDuracion(String[] duracion) {
		this.duracion = duracion;
	}

	public String[] getLugares() {
		return lugares;
	}

	public void setLugares(String[] lugares) {
		this.lugares = lugares;
	}

	public String[] getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(String[] trabajadores) {
		this.trabajadores = trabajadores;
	}

	public int getHoraIni() {
		return horaIni;
	}

	public void setHoraIni(int horaIni) {
		this.horaIni = horaIni;
	}

	public int getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}

}
