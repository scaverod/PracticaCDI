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

package tiposVariable;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import idiomas.Texto;

public class Tabla extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JTable table;

	public Tabla(Texto t) {
		table = new JTable();
		table.setRowHeight(40);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{t.getStrNingunServicio(), "0 \u20AC"},
			},
			new String[] {
				"Title 1", "Title 2"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);

		table.getColumnModel().getColumn(0).setPreferredWidth(250);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);

		this.add(table);
		table.setDefaultRenderer(Object.class, new CellRend());
	}

	public void addFila(StringDouble gasto) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new Object[] { gasto.getCadena(), String.valueOf(gasto.getNumero()) + " €" });

	}
	
	public void removeFilaInicial () {
		((DefaultTableModel)table.getModel()).removeRow(0);
	}

}