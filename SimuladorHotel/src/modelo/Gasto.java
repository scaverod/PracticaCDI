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

import java.util.ArrayList;

import tiposVariable.StringDouble;

public class Gasto {

	private double gastoTotal;
	private ArrayList<StringDouble> gastos;

	public Gasto() {

		this.gastoTotal = 0;
		this.gastos = new ArrayList<StringDouble>();
	}

	public double getGastoTotal() {
		return gastoTotal;
	}

	public void setGastoTotal(double gastoTotal) {
		this.gastoTotal = gastoTotal;
	}

	public ArrayList<StringDouble> getGastos() {
		return gastos;
	}

	public void setGastos(ArrayList<StringDouble> gastos) {
		this.gastos = gastos;
	}

	public void addGasto(StringDouble servicio) {
		gastos.add(servicio);
		gastoTotal += servicio.getNumero();
	}

	public void listarGastos() {
		for (int x = 0; x < gastos.size(); x++) {
			System.out.println(gastos.get(x).getCadena() + " --> " + String.valueOf(gastos.get(x).getNumero()));
		}
		System.out.println("Gasto tolal: " + String.valueOf(gastoTotal));
	}
	
}
