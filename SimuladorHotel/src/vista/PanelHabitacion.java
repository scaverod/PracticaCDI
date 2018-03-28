package vista;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

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
		
		JLabel lblPanelhabitacion = new JLabel("[PLACEHOLDER] panelHabitacion");
		GroupLayout gl_panelHabitacion = new GroupLayout(this);
		gl_panelHabitacion.setHorizontalGroup(gl_panelHabitacion.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHabitacion.createSequentialGroup().addGap(139)
						.addComponent(lblPanelhabitacion, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(450, Short.MAX_VALUE)));
		gl_panelHabitacion.setVerticalGroup(gl_panelHabitacion.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHabitacion.createSequentialGroup().addGap(74)
						.addComponent(lblPanelhabitacion, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(200, Short.MAX_VALUE)));
		this.setLayout(gl_panelHabitacion);
	}

}
