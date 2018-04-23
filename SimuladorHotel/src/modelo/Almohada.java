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

public class Almohada {

	private double precioVisco;
	private double precioLatex;
	private double precioGel;
	private double precioPluma;
	private String nombre;

	public static final String viscoelastica = "Viscoelastica";
	public static final String latex = "Latex";
	public static final String gel = "Gel";
	public static final String pluma = "Pluma";

	public Almohada(double precioVisco, double precioLatex, double precioGel, double precioPluma) {

		this.precioVisco = precioVisco;
		this.precioLatex = precioLatex;
		this.precioGel = precioGel;
		this.precioPluma = precioPluma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioVisco() {
		return precioVisco;
	}

	public void setPrecioVisco(double precioVisco) {
		this.precioVisco = precioVisco;
	}

	public double getPrecioLatex() {
		return precioLatex;
	}

	public void setPrecioLatex(double precioLatex) {
		this.precioLatex = precioLatex;
	}

	public double getPrecioGel() {
		return precioGel;
	}

	public void setPrecioGel(double precioGel) {
		this.precioGel = precioGel;
	}

	public double getPrecioPluma() {
		return precioPluma;
	}

	public void setPrecioPluma(double precioPluma) {
		this.precioPluma = precioPluma;
	}

}
