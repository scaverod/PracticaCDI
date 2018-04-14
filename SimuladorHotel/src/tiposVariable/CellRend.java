package tiposVariable;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

public class CellRend implements TableCellRenderer {
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JTextField editor = new JTextField();
        editor.setFont(new Font("Tahoma", Font.PLAIN, 14));
        if (value != null)
          editor.setText(value.toString());
        editor.setBackground((row % 2 == 0) ? Color.decode("#E3E9FF") : Color.white);
        return editor;
  }
}