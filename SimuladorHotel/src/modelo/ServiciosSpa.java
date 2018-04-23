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

import java.util.ArrayList;

public class ServiciosSpa {

	private ArrayList<Spa> spas;
	private ArrayList<Tratamiento> tratamientos;

	public ServiciosSpa() {
		this.spas = new ArrayList<>();
		this.tratamientos = new ArrayList<>();
		this.inicializar();
	}

	public ArrayList<Spa> getSpas() {
		return spas;
	}

	public void setSpas(ArrayList<Spa> spas) {
		this.spas = spas;
	}

	public ArrayList<Tratamiento> getTratamientos() {
		return tratamientos;
	}

	public void setTratamientos(ArrayList<Tratamiento> tratamientos) {
		this.tratamientos = tratamientos;
	}

	public void inicializar() {
		spas.add(new Spa("Circuito termal", new String[] { "30 min.", "60 min.", "90 min." }, 40,
				new double[] { 22.50, 30, 37.99 }, 16, 21));
		spas.add(new Spa("Baño turco", new String[] { "30 min.", "60 min." }, 20, new double[] { 15, 25.99 }, 9, 13));
		spas.add(new Spa("Termas romanas", new String[] { "30 min.", "60 min." }, 15, new double[] { 17, 28.99 }, 9,
				13));
		tratamientos.add(new Tratamiento("Masaje facial", new String[] { "15 min.", "30 min." },
				new String[] { "Cabina", "Habitación" }, new String[] { "Deivid Herrero" }, 9, 13,
				new double[] { 15.99, 25.99 }));
		tratamientos.add(new Tratamiento("Masaje Thai", new String[] { "15 min.", "30 min." },
				new String[] { "Cabina", "Habitación" }, new String[] { "Antonio Castro" }, 9, 13,
				new double[] { 20, 27.99 }));
		tratamientos.add(new Tratamiento("Masaje Sueco", new String[] { "30 min.", "60 min." },
				new String[] { "Cabina", "Habitación" }, new String[] { "Irina Boboia", "Sergio Cavero" }, 18, 20,
				new double[] { 30, 47.99 }));

	}

	public String[] getNombresTratamientos() {
		String[] aux = new String[3];
		for (int i = 0; i < 3; i++) {
			aux[i] = tratamientos.get(i).getNombre();
		}
		return aux;
	}

	public String[] getNombresSpas() {
		String[] aux = new String[3];
		for (int i = 0; i < 3; i++) {
			aux[i] = spas.get(i).getNombre();
		}
		return aux;
	}

}
