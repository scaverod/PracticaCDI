/*

The following notices can be found in each source file of the 
original project.

Copyright (C) 2018 EquipoSPA:
	David Herrero Pascual	- GitHub: Deividhp13
	Antonio Castro Blanco	- GitHub: Castrum38
	Radu Dumitru Boboia		- GitHub: rdboboia
	Sergio Cavero D�az		- GitHub: scaverod

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

package idiomas;

public class TextoManager {
	public static final String espa�ol = "ESP";
	public static final String english = "ENG";
	public static final String romana = "RO";
	
	String idioma;
	
	Texto t;
	
	public TextoManager(String idioma) {
		this.idioma = idioma;
		
		switch (idioma) {
			case espa�ol:
				t = new TextoEsp();
				break;
			case romana:
				t = new TextoRo();
				break;
			default:
				t = new TextoEng();
				break;
		}
	}
	
	public void getIdiomas() {
		
	}
	
	public Texto getTexto() {
		return t;
	}
}