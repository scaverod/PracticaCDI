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

public class Spa {

	private String nombre;
	private String[] duracion;
	private int aforoMax;
	private int [] asistentes;
	private double[] precio;
	private int horaIni;
	private int horaFin;

	public Spa(String nombre, String[] duracion, int aforoMax, double[] precio, int horaIni, int horaFin) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.aforoMax = aforoMax;
		this.setAsistentes(new int [1 + horaFin-horaIni]);
		this.precio = precio;
		this.horaFin = horaFin;
		this.horaIni = horaIni;
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

	public int getAforoMax() {
		return aforoMax;
	}

	public void setAforoMax(int aforoMax) {
		this.aforoMax = aforoMax;
	}

	public int [] getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(int [] asistentes) {
		this.asistentes = asistentes;
	}
	
	public int plazasTotalesDisponibles () {
		int plazas = 0;
		for (int i = 0; i < asistentes.length; i++ ) {
			plazas  += (aforoMax- asistentes[i]);
		}
		return plazas;
	}


}
