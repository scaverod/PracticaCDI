package vista;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

public class PanelHabitacion extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelHabitacion() {
		this.setSize(new Dimension(931, 483));
		this.setName("panelHabitacion");
		
		JLabel panelFotoHabitacion = new JLabel("");
		panelFotoHabitacion.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/fotoHabitacion.jpg")));
		GroupLayout gl_panelHabitacion = new GroupLayout(this);
		gl_panelHabitacion.setHorizontalGroup(
			gl_panelHabitacion.createParallelGroup(Alignment.LEADING)
				.addComponent(panelFotoHabitacion, GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
		);
		gl_panelHabitacion.setVerticalGroup(
			gl_panelHabitacion.createParallelGroup(Alignment.LEADING)
				.addComponent(panelFotoHabitacion, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
		);
		this.setLayout(gl_panelHabitacion);
	}
}
