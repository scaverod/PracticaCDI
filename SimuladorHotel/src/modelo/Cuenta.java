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

public class Cuenta {

	private Gasto gasto;
	private String usuario;
	private String pwd;
	private Idioma idioma;
	private Personalizacion personalizacion;

	public enum Idioma {
		Ingles, Rumano, Castellano
	}

	public Cuenta(Gasto gasto, String usuario, String pwd, Idioma idioma, Personalizacion personalizacion) {
		super();
		this.gasto = gasto;
		this.usuario = usuario;
		this.pwd = pwd;
		this.idioma = idioma;
		this.setPersonalizacion(personalizacion);
	}

	public Cuenta(String usuario, String pwd) {
		this.gasto = new Gasto();
		this.usuario =  usuario;
		this.pwd = pwd;
		this.setPersonalizacion(new Personalizacion(false, false, false, false));
		this.idioma = Idioma.Castellano;

	}

	public Gasto getGasto() {
		return gasto;
	}

	public void setGasto(Gasto gasto) {
		this.gasto = gasto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public Personalizacion getPersonalizacion() {
		return personalizacion;
	}

	public void setPersonalizacion(Personalizacion personalizacion) {
		this.personalizacion = personalizacion;
	}

}
