package vista;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.Controlador;
import controlador.MicroControladorPanelesPadreHijo;
import idiomas.Texto;
import idiomas.TextoManager;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

public class PanelServiciosEmergenteInformacion_OFF extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	// FIXME: temporal para que salga el texto en vez de "<dynamic>"
		// Habría que mandarlo desde el Main, por ejemplo
		private Texto t = new TextoManager(TextoManager.english).getTexto();

	public PanelServiciosEmergenteInformacion_OFF(MicroControladorPanelesPadreHijo microControlador, String padre, Controlador controlador) {
		setForeground(Color.ORANGE);
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102)));
		this.setSize(new Dimension(695, 315));
		this.setName("p" + this.getClass().getSimpleName().substring(1)); // No modificar
		setLayout(null);
		
		JButton btnCerrar = new JButton(t.getBtnCerrar());
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // No modificar
				// Devuelve control al padre
				microControlador.cambiarPanel(padre);
			}
		});
		btnCerrar.setBounds(596, 11, 89, 23);
		add(btnCerrar);
		
		JButton btnAdquirir = new JButton(t.getBtnAdquirir());
		btnAdquirir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdquirir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO: avisar de que en minutos llamarán al telefono
			}
		});
		btnAdquirir.setBounds(260, 223, 175, 53);
		add(btnAdquirir);
		
		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(t.getTxtInformacion());
		txtpnInfo.setBounds(45, 63, 593, 75);
		add(txtpnInfo);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 153));
		panel.setBorder(new LineBorder(Color.ORANGE, 3));
		panel.setForeground(Color.ORANGE);
		panel.setBounds(45, 166, 593, 35);
		add(panel);
		
		JLabel lblPrecio = new JLabel(t.getLblCoste());
		panel.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label = new JLabel("0\u20AC");
		panel.add(label);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
	}
}
