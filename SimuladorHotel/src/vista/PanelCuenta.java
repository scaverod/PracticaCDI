package vista;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

public class PanelCuenta extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	public PanelCuenta() {
		this.setSize(new Dimension(931, 483));
		this.setName("panelCuenta");
		
		JLabel lblPanelcuenta = new JLabel("[PLACEHOLDER] panelCuenta");
		GroupLayout gl_panelCuenta = new GroupLayout(this);
		gl_panelCuenta.setHorizontalGroup(
			gl_panelCuenta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCuenta.createSequentialGroup()
					.addGap(297)
					.addComponent(lblPanelcuenta, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(343, Short.MAX_VALUE))
		);
		gl_panelCuenta.setVerticalGroup(
			gl_panelCuenta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCuenta.createSequentialGroup()
					.addGap(110)
					.addComponent(lblPanelcuenta, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(185, Short.MAX_VALUE))
		);
		this.setLayout(gl_panelCuenta);
	}

}
