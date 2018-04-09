package vista;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.MicroControladorPanelesPadreHijo;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class PanelServiciosEmergenteInformacion extends JPanel {
	private static final long serialVersionUID = 1L;

	public PanelServiciosEmergenteInformacion(MicroControladorPanelesPadreHijo microControlador, String padre) {
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102)));
		this.setSize(new Dimension(695, 315));
		this.setName("p" + this.getClass().getSimpleName().substring(1)); // No modificar
		setLayout(null);
		
		JLabel lblPanelEmergente = new JLabel(this.getName());
		lblPanelEmergente.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanelEmergente.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblPanelEmergente.setBounds(10, 138, 675, 39);
		add(lblPanelEmergente);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // No modificar
				// Devuelve control al padre
				microControlador.cambiarPanel(padre);
			}
		});
		btnCerrar.setBounds(596, 11, 89, 23);
		add(btnCerrar);
	}
}
