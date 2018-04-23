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

public class Television {

	private double precioMoviestarPlus;
	private double precioNetflix;
	private double precioBeinSport;
	private double precioBBC;
	private boolean activadoMoviestarPlus;
	private boolean activadoNetflix;
	private boolean activadoBBC;
	private boolean activadoBeinSport;

	public Television(double precioMoviestarPlus, double precioNetflix, double precioBeinSport, double precioBBC) {

		this.precioMoviestarPlus = precioMoviestarPlus;
		this.precioNetflix = precioNetflix;
		this.precioBeinSport = precioBeinSport;
		this.precioBBC = precioBBC;
	}

	public Television(double precioMoviestarPlus, double precioNetflix, double precioBeinSport, double precioBBC,
			boolean activadoMoviestarPlus, boolean activadoNetflix, boolean activadoBBC, boolean activadoBeinSport) {
		this.precioMoviestarPlus = precioMoviestarPlus;
		this.precioNetflix = precioNetflix;
		this.precioBeinSport = precioBeinSport;
		this.precioBBC = precioBBC;
		this.activadoMoviestarPlus = activadoMoviestarPlus;
		this.activadoNetflix = activadoNetflix;
		this.activadoBBC = activadoBBC;
		this.activadoBeinSport = activadoBeinSport;
	}

	public Television(boolean activadoMoviestarPlus, boolean activadoNetflix, boolean activadoBBC,
			boolean activadoBeinSport) {

		this.activadoMoviestarPlus = activadoMoviestarPlus;
		this.activadoNetflix = activadoNetflix;
		this.activadoBBC = activadoBBC;
		this.activadoBeinSport = activadoBeinSport;
	}

	public boolean isActivadoMoviestarPlus() {
		return activadoMoviestarPlus;
	}

	public void setActivadoMoviestarPlus(boolean activadoMoviestarPlus) {
		this.activadoMoviestarPlus = activadoMoviestarPlus;
	}

	public boolean isActivadoNetflix() {
		return activadoNetflix;
	}

	public void setActivadoNetflix(boolean activadoNetflix) {
		this.activadoNetflix = activadoNetflix;
	}

	public boolean isActivadoBBC() {
		return activadoBBC;
	}

	public void setActivadoBBC(boolean activadoBBC) {
		this.activadoBBC = activadoBBC;
	}

	public boolean isActivadoBeinSport() {
		return activadoBeinSport;
	}

	public void setActivadoBeinSport(boolean activadoBeinSport) {
		this.activadoBeinSport = activadoBeinSport;
	}

	public double getPrecioMoviestarPlus() {
		return precioMoviestarPlus;
	}

	public void setPrecioMoviestarPlus(double precioMoviestarPlus) {
		this.precioMoviestarPlus = precioMoviestarPlus;
	}

	public double getPrecioNetflix() {
		return precioNetflix;
	}

	public void setPrecioNetflix(double precioNetflix) {
		this.precioNetflix = precioNetflix;
	}

	public double getPrecioBeinSport() {
		return precioBeinSport;
	}

	public void setPrecioBeinSport(double precioBeinSport) {
		this.precioBeinSport = precioBeinSport;
	}

	public double getPrecioBBC() {
		return precioBBC;
	}

	public void setPrecioBBC(double precioBBC) {
		this.precioBBC = precioBBC;
	}

}
