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

package controlador;

import java.awt.Component;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class MicroControladorLayers {
	JLayeredPane contenedorPadre;
	JPanel panel;
	
	public MicroControladorLayers(JLayeredPane contenedorPadre) {
		this.contenedorPadre = contenedorPadre;
	}
	
	public MicroControladorLayers(JLayeredPane contenedorPadre, JPanel panel) {
		this.contenedorPadre = contenedorPadre;
		this.panel = panel;
	}
	
	public void changeLayer(Component c, int layer) {
		contenedorPadre.setLayer(c, layer);
	}
	
	public void changeLayer(int layer) {
		contenedorPadre.setLayer(panel, layer);
	}
}