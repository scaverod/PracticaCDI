package vista;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

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

		JLabel lblHabitacion = new JLabel("Habitacion");
		lblHabitacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblHabitacion.setOpaque(true);
		lblHabitacion.setForeground(new Color(255, 255, 255));
		lblHabitacion.setBackground(Color.decode("#005cb9"));
		//TODO: Cambiar para que quede más bonito
		lblHabitacion.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		
		JButton btnLogout = new JButton("");
		btnLogout.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/exit.png")));
		btnLogout.setOpaque(true);
		btnLogout.setBackground(Color.RED);
		btnLogout.setContentAreaFilled( false );
		btnLogout.setContentAreaFilled( false );
		GroupLayout gl_panelCuenta = new GroupLayout(this);
		gl_panelCuenta.setHorizontalGroup(
			gl_panelCuenta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCuenta.createSequentialGroup()
					.addGroup(gl_panelCuenta.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCuenta.createSequentialGroup()
							.addGap(297)
							.addComponent(lblPanelcuenta, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelCuenta.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblHabitacion, GroupLayout.PREFERRED_SIZE, 829, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 79, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panelCuenta.setVerticalGroup(
			gl_panelCuenta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCuenta.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCuenta.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnLogout, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblHabitacion, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
					.addGap(52)
					.addComponent(lblPanelcuenta, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(185, Short.MAX_VALUE))
		);
		this.setLayout(gl_panelCuenta);
	}
}
