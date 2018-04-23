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

package modelo;

import tiposVariable.Tiempo;

public class ProgramacionTemperatura {



	private Tiempo horaInicio;
	private Tiempo horaFin;
	private double temperatura;

	public ProgramacionTemperatura(Tiempo horaInicio, Tiempo horaFin, double temperatura) {
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.temperatura = temperatura;
	}

	public Tiempo getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Tiempo horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Tiempo getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Tiempo horaFin) {
		this.horaFin = horaFin;
	}

	
	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

}
