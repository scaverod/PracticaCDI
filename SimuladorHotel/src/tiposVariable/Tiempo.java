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

package tiposVariable;

import java.util.Date;

public class Tiempo {

	private int hora;
	private int minutos;

	public Tiempo(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}
	
	@SuppressWarnings("deprecation")
	public Tiempo(long date) {
		Date d = new Date(date);
		
		hora = d.getHours();
		minutos = d.getMinutes();
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public String toString() {
		return hora + ":" + minutos;

	}
	
	public static Tiempo getTiempoActual() {
		return new Tiempo(System.currentTimeMillis());
	}
}
