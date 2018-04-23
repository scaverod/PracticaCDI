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

package tiposVariable;

public class InformacionSpaTratamiento {

	private int max;
	private int min;
	private StringDouble factura;
	private int [] aforo;
	private int maxAforo;
	private int personas;
	private int spa;

	public InformacionSpaTratamiento(int min, int max, StringDouble factura, int [] aforo, int maxAforo, int personas, int spa) {
		this.max = max;
		this.min = min;
		this.factura = factura;
		this.aforo = aforo;
		this.personas = personas;
		this.spa = spa;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public StringDouble getFactura() {
		return factura;
	}

	public void setFactura(StringDouble factura) {
		this.factura = factura;
	}
	
	public void print () {
		System.out.println("Hora inicio:" + min);
		System.out.println("Hora fin:" + max);
		System.out.println("Hora factura:" + this.factura.getCadena() +  " - " + this.factura.getNumero());
	}

	public int getMaxAforo() {
		return maxAforo;
	}

	public void setMaxAforo(int maxAforo) {
		this.maxAforo = maxAforo;
	}

	public int [] getAforo() {
		return aforo;
	}

	public void setAforo(int [] aforo) {
		this.aforo = aforo;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public int getSpa() {
		return spa;
	}

	public void setSpa(int spa) {
		this.spa = spa;
	}

}
