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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		panelLogout.setBackground(Color.decode("#e61919"));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblGastos = new JLabel("Gastos");
		
		JLabel lblGastoToal = new JLabel("Gasto toal: ");
		
		JLabel label = new JLabel("<GASTO>");
		
		JLabel lblPersonalizarAplicacin = new JLabel("Personalizar Aplicaci\u00F3n");
		
		JButton btnESP = new JButton("");
		btnESP.setOpaque(false);
		btnESP.setContentAreaFilled( false );

		btnESP.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/espa\u00F1a.png")));
		
		JButton btnUK = new JButton("");
		btnUK.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/uk.png")));
		btnUK.setOpaque(false);
		btnUK.setContentAreaFilled( false );
		
		JButton btnRo = new JButton("");
		btnRo.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/rumania.png")));
		btnRo.setOpaque(false);
		btnRo.setContentAreaFilled( false );
		
		
		JLabel lblElegirIdioma = new JLabel("Elegir idioma");
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
							.addGroup(gl_panelCuenta.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_panelCuenta.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
									.addGap(118)
									.addGroup(gl_panelCuenta.createParallelGroup(Alignment.LEADING)
										.addComponent(lblElegirIdioma)
										.addGroup(gl_panelCuenta.createSequentialGroup()
											.addComponent(btnESP, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnUK, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnRo, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblPersonalizarAplicacin)))
								.addComponent(lblHabitacion, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 829, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelLogout, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
					.addGroup(gl_panelCuenta.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCuenta.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panelCuenta.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGastoToal)
								.addComponent(label)))
						.addGroup(gl_panelCuenta.createSequentialGroup()
							.addComponent(lblPersonalizarAplicacin)
							.addGap(23)
							.addComponent(lblElegirIdioma)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panelCuenta.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnESP)
								.addComponent(btnUK)
								.addComponent(btnRo))))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		
		JButton btnLogout = new JButton("");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogout.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/logout.png")));
		panelLogout.add(btnLogout);
		btnLogout.setOpaque(true);
		btnLogout.setBackground(Color.RED);
		btnLogout.setContentAreaFilled( false );
		this.setLayout(gl_panelCuenta);
	}
}
