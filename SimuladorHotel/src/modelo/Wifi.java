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

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Wifi {

	private boolean activado;
	private double precio;
	private String pwd;

	public Wifi(boolean activado, double precio, String pwd) {
		this.activado = activado;
		this.precio = precio;
		this.pwd = pwd;
	}
	public Wifi(boolean activado, String pwd) {
		this.activado = activado;
		this.pwd = pwd;
	}
	

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * Método que devuelve un String que es una contraseña aleatoria generada a
	 * partir del array de symbols. La longitud de la contraseña viene determinado
	 * por la variable lenght.
	 * 
	 * @return contraseña aleatoria
	 */
	private String generarPwd() {
		String[] symbols = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h",
				"i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "y", "@", "#", "A", "Z", "T", "C", "B", "D", "E", "F" };
		int length = 10;
		Random random = null;
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int indexRandom = random.nextInt(symbols.length);
			sb.append(symbols[indexRandom]);
		}
		String pwd = sb.toString();
		return pwd;
	}

	/**
	 * Metodo quiie activa el wifi de una habitación. Genera una contraseña para
	 * conectarse.
	 */
	public String activarWifi() {
		this.activado = true;
		this.pwd = this.generarPwd();
		return this.pwd;
	}

}
