package vista;

import java.awt.Dimension;
import java.awt.Font;

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
import javax.swing.JScrollPane;

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

		JLabel lblHabitacion = new JLabel("Habitacion");
		lblHabitacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblHabitacion.setOpaque(true);
		lblHabitacion.setForeground(new Color(255, 255, 255));
		lblHabitacion.setBackground(Color.decode("#006df0"));
		lblHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		//TODO: Cambiar para que quede más bonito
		lblHabitacion.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		
		JPanel panelLogout = new JPanel();
		panelLogout.setBackground(Color.RED);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblGastos = new JLabel("Gastos");
		
		JButton btnNewButton = new JButton("Personalizar Aplicaci\u00F3n");
		
		JLabel lblGastoToal = new JLabel("Gasto toal: ");
		
		JLabel label = new JLabel("<GASTO>");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panelCuenta = new GroupLayout(this);
		gl_panelCuenta.setHorizontalGroup(
			gl_panelCuenta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCuenta.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCuenta.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGastos)
						.addGroup(gl_panelCuenta.createSequentialGroup()
							.addComponent(lblGastoToal)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label))
						.addGroup(gl_panelCuenta.createSequentialGroup()
							.addGroup(gl_panelCuenta.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_panelCuenta.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_panelCuenta.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panelCuenta.createSequentialGroup()
											.addGap(76)
											.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(Alignment.TRAILING, gl_panelCuenta.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))))
								.addComponent(lblHabitacion, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 829, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelLogout, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_panelCuenta.setVerticalGroup(
			gl_panelCuenta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCuenta.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCuenta.createParallelGroup(Alignment.LEADING)
						.addComponent(panelLogout, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHabitacion, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addComponent(lblGastos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelCuenta.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panelCuenta.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(scrollPane_1))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelCuenta.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGastoToal)
						.addComponent(label))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		
		JLabel lblEventosPrximos = new JLabel("Eventos Pr\u00F3ximos");
		scrollPane_1.setColumnHeaderView(lblEventosPrximos);
		
		JButton btnLogout = new JButton("");
		btnLogout.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/logout.png")));
		panelLogout.add(btnLogout);
		btnLogout.setOpaque(true);
		btnLogout.setBackground(Color.RED);
		btnLogout.setContentAreaFilled( false );
		btnLogout.setContentAreaFilled( false );
		this.setLayout(gl_panelCuenta);
	}
}
