package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.MicroControladorLayersPadreHijo;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class PanelSpaEmergenteBase_OFF extends JPanel {
	private static final long serialVersionUID = 1L;

	public PanelSpaEmergenteBase_OFF(MicroControladorLayersPadreHijo m/* , Controlador controlador */) {
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102),
				new Color(0, 0, 102)));
		this.setSize(695, 315);
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);

		JLabel lblPanelEmergente = new JLabel(this.getName());
		lblPanelEmergente.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanelEmergente.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblPanelEmergente.setBounds(10, 138, 675, 39);
		add(lblPanelEmergente);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ocultar panel
				m.changeLayer(0);
			}
		});
		btnCerrar.setBounds(596, 11, 89, 23);
		add(btnCerrar);
	}
}
