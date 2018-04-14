package tiposVariable;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Tabla extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JTable table;

	public Tabla() {
		table = new JTable();
		table.setRowHeight(40);
		table.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { "No ha adquirido ningún servicio", "0 €" } },
				new String[] { "Title 1", "Title 2" }));
		TableColumnModel columnModel = table.getColumnModel();

		columnModel.getColumn(0).setPreferredWidth(250);
		columnModel.getColumn(1).setPreferredWidth(100);

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