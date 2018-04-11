package vista;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import controlador.Controlador;
import controlador.MicroControladorPanelesPadreHijo;
import modelo.Texto;
import modelo.TextoManager;
import tiposVariable.StringDouble;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelServiciosEmergenteWifi extends JPanel {
	private static final long serialVersionUID = 1L;
	private Texto t = new TextoManager(TextoManager.english).getTexto();

	public PanelServiciosEmergenteWifi(MicroControladorPanelesPadreHijo microControlador, String padre,
			Controlador controlador) {
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102),
				new Color(0, 0, 102)));
		this.setSize(new Dimension(695, 315));
		this.setName("p" + this.getClass().getSimpleName().substring(1)); // No modificar
		setLayout(null);

		JButton btnCerrar = new JButton(t.getCerrar());
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // No modificar
				// Devuelve control al padre
				microControlador.cambiarPanel(padre);
			}
		});
		btnCerrar.setBounds(596, 11, 89, 23);
		add(btnCerrar);

		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(t.getPanelServiciosEmergenteWifiTxt());
		txtpnInfo.setBounds(45, 63, 593, 75);
		add(txtpnInfo);

		JButton btnAdquirir = new JButton(t.getBtnAdquirir());
		btnAdquirir.setFont(new Font("Tahoma", Font.PLAIN, 15));

		btnAdquirir.setBounds(260, 223, 175, 53);
		add(btnAdquirir);

		JPanel panelPrecio = new JPanel();
		panelPrecio.setBackground(new Color(255, 255, 153));
		panelPrecio.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecio.setForeground(Color.ORANGE);
		panelPrecio.setBounds(45, 166, 593, 35);
		add(panelPrecio);

		JLabel lblPrecio = new JLabel(t.getLblCoste());
		panelPrecio.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel labelPrecioYPwd = new JLabel(
				String.valueOf(controlador.getServicios().getWifi().getPrecio()) + " \u20AC");
		panelPrecio.add(labelPrecioYPwd);
		labelPrecioYPwd.setFont(new Font("Tahoma", Font.PLAIN, 15));

		btnAdquirir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO: se contratará el wifi

				// Suponemos que finalmente se ha contratado:
				txtpnInfo.setText(t.getPanelServiciosEmergenteWifiActivadoTxt());
				panelPrecio.setBorder(new LineBorder(Color.decode("#005cb9"), 3));
				panelPrecio.setBackground(Color.decode("#9bbfe3"));
				String pwd = controlador.getServicios().getWifi().activarWifi();
				controlador.getCuenta().getGasto()
						.addGasto(new StringDouble("Contratar WiFi", controlador.getServicios().getWifi().getPrecio()));
				lblPrecio.setText("");
				labelPrecioYPwd.setText(t.getPanelServiciosEmergenteWifiPwdTxt() + " " + pwd);
				btnAdquirir.setVisible(false);
			}
		});
	}
}
