package vista;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.Controlador;

import javax.swing.GroupLayout.Alignment;

public class PanelSpa extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 * @param controlador 
	 */
	public PanelSpa(Controlador controlador) {
		this.setSize(new Dimension(931, 483));
		this.setName("panelSpa");
		
		JLabel lblPanelspa = new JLabel("[PLACEHOLDER] panelSpa");
		GroupLayout gl_panelSpa = new GroupLayout(this);
		gl_panelSpa.setHorizontalGroup(gl_panelSpa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSpa.createSequentialGroup().addGap(139)
						.addComponent(lblPanelspa, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(387, Short.MAX_VALUE)));
		gl_panelSpa.setVerticalGroup(gl_panelSpa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSpa.createSequentialGroup().addGap(127)
						.addComponent(lblPanelspa, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(188, Short.MAX_VALUE)));
		this.setLayout(gl_panelSpa);
	}

}
