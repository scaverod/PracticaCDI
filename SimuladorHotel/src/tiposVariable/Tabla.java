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