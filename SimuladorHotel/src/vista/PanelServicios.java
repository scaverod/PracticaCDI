package vista;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelServicios extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelServicios() {
		this.setSize(new Dimension(931, 483));
		this.setName("panelServicios");
		
		JButton btnNewButton = new JButton("New button");
		
		JButton btnNewButton_1 = new JButton("New button");
		
		JButton btnNewButton_2 = new JButton("New button");
		
		JButton btnNewButton_3 = new JButton("New button");
		GroupLayout gl_panelServicios = new GroupLayout(this);
		gl_panelServicios.setHorizontalGroup(
			gl_panelServicios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelServicios.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelServicios.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panelServicios.createSequentialGroup()
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelServicios.createSequentialGroup()
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panelServicios.setVerticalGroup(
			gl_panelServicios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelServicios.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelServicios.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
					.addGroup(gl_panelServicios.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		this.setLayout(gl_panelServicios);
	}
}
