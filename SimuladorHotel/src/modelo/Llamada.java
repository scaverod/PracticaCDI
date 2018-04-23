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

public class Llamada {

	private double precioEuropa;
	private double precioAmerica;
	private double precioAsia;
	private double precioAfrica;

	public Llamada(double precioEuropa, double precioAmerica, double precioAsia, double precioAfrica) {
		super();
		this.precioEuropa = precioEuropa;
		this.precioAmerica = precioAmerica;
		this.precioAsia = precioAsia;
		this.precioAfrica = precioAfrica;
	}

	public double getPrecioEuropa() {
		return precioEuropa;
	}

	public void setPrecioEuropa(double precioEuropa) {
		this.precioEuropa = precioEuropa;
	}

	public double getPrecioAmerica() {
		return precioAmerica;
	}

	public void setPrecioAmerica(double precioAmerica) {
		this.precioAmerica = precioAmerica;
	}

	public double getPrecioAsia() {
		return precioAsia;
	}

	public void setPrecioAsia(double precioAsia) {
		this.precioAsia = precioAsia;
	}

	public double getPrecioAfrica() {
		return precioAfrica;
	}

	public void setPrecioAfrica(double precioAfrica) {
		this.precioAfrica = precioAfrica;
	}

}
