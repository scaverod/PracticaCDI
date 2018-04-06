package vista;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class PanelServiciosEmergente extends JPanel {
	private static final long serialVersionUID = 1L;

	public PanelServiciosEmergente() {
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102)));
		this.setSize(new Dimension(695, 315));
		this.setName("panelServiciosEmergente");
		setLayout(null);
		
		JLabel lblPanelEmergente = new JLabel("PANEL EMERGENTE");
		lblPanelEmergente.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblPanelEmergente.setBounds(207, 138, 280, 39);
		add(lblPanelEmergente);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(596, 11, 89, 23);
		add(btnCerrar);
	}
}
