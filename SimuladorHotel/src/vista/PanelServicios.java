package vista;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

public class PanelServicios extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelServicios() {
		this.setName("panelServicios");
		JLabel lblPanelservicios = new JLabel("[PLACEHOLDER] panelServicios");
		GroupLayout gl_panelServicios = new GroupLayout(this);
		gl_panelServicios.setHorizontalGroup(gl_panelServicios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelServicios.createSequentialGroup().addGap(266)
						.addComponent(lblPanelservicios, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(354, Short.MAX_VALUE)));
		gl_panelServicios.setVerticalGroup(gl_panelServicios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelServicios.createSequentialGroup().addGap(147)
						.addComponent(lblPanelservicios, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(157, Short.MAX_VALUE)));
		this.setLayout(gl_panelServicios);

	}

}
