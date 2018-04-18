package vista;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.Controlador;
import controlador.MicroControladorLayers;
import controlador.MicroControladorPanelesPadreHijo;
import idiomas.Texto;
import idiomas.TextoManager;
import tiposVariable.StringDouble;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

public class PanelServiciosEmergenteInformacion extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	private Semaphore s;

	// FIXME: temporal para que salga el texto en vez de "<dynamic>"
	// Habría que mandarlo desde el Main, por ejemplo
	private Texto t = new TextoManager(TextoManager.español).getTexto();

	public PanelServiciosEmergenteInformacion(MicroControladorPanelesPadreHijo microControlador, String padre,
			Controlador controlador, Semaphore s) {
		this.s = s;

		setForeground(Color.ORANGE);
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)));
		this.setSize(new Dimension(695, 315));
		this.setName("p" + this.getClass().getSimpleName().substring(1)); // No modificar
		setLayout(null);

		panelContenedor = new JLayeredPane();
		panelContenedor.setBounds(0, 0, 695, 315);
		add(panelContenedor);
		panelContenedor.setLayout(null);

		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)));
		panelPrincipal.setBounds(0, 0, 695, 315);
		panelContenedor.setLayer(panelPrincipal, 1);
		panelContenedor.add(panelPrincipal);
		panelPrincipal.setLayout(null);

		crearPanelConfirmacion("<precio>");

		JButton btnCerrar = new JButton(t.getBtnCerrar());
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // No modificar
				// Devuelve control al padre
				microControlador.cambiarPanel(padre);
				s.release(s.getQueueLength());
			}
		});
		btnCerrar.setBounds(596, 11, 89, 23);
		panelPrincipal.add(btnCerrar);

		JLabel lblGif = new JLabel("");
		lblGif.setBorder(new LineBorder(Color.GREEN));
		lblGif.setOpaque(true);
		lblGif.setVisible(false);
		lblGif.setIcon(new ImageIcon(PanelServiciosEmergenteWifi.class.getResource("/iconos/check-gif-1.gif")));
		lblGif.setBounds(287, 103, 120, 109);
		panelPrincipal.add(lblGif);

		JButton btnAdquirir = new JButton(t.getBtnAdquirir());
		btnAdquirir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdquirir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Thread() {
					public void run() {
						try {

							mostrarPanelConfirmacion("0 €");

							s.acquire();

							if (((PanelConfirmacionServicios) panelConfirmacion).getConfirmacion() == true) {
								lblGif.setVisible(true);
								Thread.sleep(2050);
								lblGif.setVisible(false);
								controlador.getCuenta().getGasto().addGasto(new StringDouble("Solicitar Información", 0));

								// Tiene que hacerse siempre!
								((PanelConfirmacionServicios) panelConfirmacion).setConfirmacion(false);
							}
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				}.start();
			}
		});
		btnAdquirir.setBounds(260, 223, 175, 53);
		panelPrincipal.add(btnAdquirir);

		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(t.getTxtInformacion());
		txtpnInfo.setBounds(45, 63, 593, 75);
		panelPrincipal.add(txtpnInfo);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 153));
		panel.setBorder(new LineBorder(Color.ORANGE, 3));
		panel.setForeground(Color.ORANGE);
		panel.setBounds(45, 166, 593, 35);
		panelPrincipal.add(panel);

		JLabel lblPrecio = new JLabel(t.getLblCoste());
		panel.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel label = new JLabel("0\u20AC");
		panel.add(label);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
	}

	public void cerrarPanelConfirmacion() {
		panelContenedor.setLayer(panelConfirmacion, 0);
	}

	public void crearPanelConfirmacion(String precio) {
		panelConfirmacion = new PanelConfirmacionServicios(new MicroControladorLayers(panelContenedor), this.getName(),
				s, precio);
		panelConfirmacion.setBounds(147, 57, 400, 200);
		panelContenedor.setLayer(panelConfirmacion, 0);
		panelContenedor.add(panelConfirmacion);
	}

	public void mostrarPanelConfirmacion(String precio) {
		crearPanelConfirmacion(precio);
		panelContenedor.setLayer(panelConfirmacion, 2);
	}
}
