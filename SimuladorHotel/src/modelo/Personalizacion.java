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

public class Personalizacion {

	private boolean modoNocturno;
	private boolean invertiColores;
	private boolean textoVoz;
	private boolean aumentoTexto;

	public Personalizacion(boolean modoNocturno, boolean invertiColores, boolean textoVoz, boolean aumentoTexto) {
		this.modoNocturno = modoNocturno;
		this.invertiColores = invertiColores;
		this.textoVoz = textoVoz;
		this.aumentoTexto = aumentoTexto;
	}

	public boolean isModoNocturno() {
		return modoNocturno;
	}

	public void setModoNocturno(boolean modoNocturno) {
		this.modoNocturno = modoNocturno;
	}

	public boolean isInvertiColores() {
		return invertiColores;
	}

	public void setInvertiColores(boolean invertiColores) {
		this.invertiColores = invertiColores;
	}

	public boolean isTextoVoz() {
		return textoVoz;
	}

	public void setTextoVoz(boolean textoVoz) {
		this.textoVoz = textoVoz;
	}

	public boolean isAumentoTexto() {
		return aumentoTexto;
	}

	public void setAumentoTexto(boolean aumentoTexto) {
		this.aumentoTexto = aumentoTexto;
	}

}
