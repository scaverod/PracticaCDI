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

import controlador.Controlador;
import modelo.Texto;
import modelo.TextoManager;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Component;

public class PanelCuenta extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Texto t = new TextoManager(TextoManager.english).getTexto();
	private final ButtonGroup btnIdiomas = new ButtonGroup();

	/**
	 * Create the panel.
	 */

	public PanelCuenta(Controlador controlador) {
		this.setSize(new Dimension(931, 483));
		this.setName("panelCuenta");

		JLabel lblHabitacion = new JLabel(t.getLblCuentaHabitacion() +": " + controlador.getCuenta().getUsuario());
		lblHabitacion.setBounds(10, 11, 829, 47);
		lblHabitacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblHabitacion.setOpaque(true);
		lblHabitacion.setForeground(new Color(255, 255, 255));
		lblHabitacion.setBackground(Color.decode("#006df0"));
		lblHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		// TODO: Cambiar para que quede más bonito
		lblHabitacion.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));

		JPanel panelLogout = new JPanel();
		panelLogout.setBounds(843, 11, 76, 47);
		panelLogout.setBackground(Color.ORANGE);

		JLabel lblGastos = new JLabel("Gastos");
		lblGastos.setBounds(10, 113, 45, 19);
		lblGastos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel = new JPanel();
		panel.setBounds(565, 113, 356, 138);
		
				JLabel lblElegirIdioma = new JLabel("Elegir idioma");
				lblElegirIdioma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
				JToggleButton btnESP = new JToggleButton("");
				btnESP.setSelected(true);
				btnESP.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/espa\u00F1a.png")));
				btnESP.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/espa\u00F1aSelected.png")));
				btnESP.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnIdiomas.add(btnESP);
				btnESP.setOpaque(false);
				btnESP.setContentAreaFilled(false);
		
		JToggleButton btnUK = new JToggleButton("");
		btnUK.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/ukSelected.png")));
		btnIdiomas.add(btnUK);
		btnUK.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/uk.png")));
		btnUK.setOpaque(false);
		btnUK.setContentAreaFilled(false);
		
		JToggleButton toggleButton = new JToggleButton("");
		toggleButton.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/rumaniaSelected.png")));
		btnIdiomas.add(toggleButton);
		toggleButton.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/rumania.png")));
		toggleButton.setOpaque(false);
		toggleButton.setContentAreaFilled(false);
		
		JLabel lblNewLabel = new JLabel("Castellano");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblIngls = new JLabel("Ingl\u00E9s");
		lblIngls.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblRumano = new JLabel("Rumano");
		lblRumano.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblElegirIdioma)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnESP, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnUK, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(lblIngls, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(lblRumano, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGap(1)
					.addComponent(lblElegirIdioma)
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnESP)
						.addComponent(btnUK)
						.addComponent(toggleButton))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIngls, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRumano, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);

		JButton btnLogout = new JButton("");
		btnLogout.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/logout.png")));
		panelLogout.add(btnLogout);
		btnLogout.setOpaque(true);
		btnLogout.setContentAreaFilled(false);
		setLayout(null);
		add(lblHabitacion);
		add(panelLogout);
		add(lblGastos);
		add(panel);
	}
}
