package vista;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PanelServiciosEmergenteWifi extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	private Semaphore s;

	// FIXME: temporal para que salga el texto en vez de "<dynamic>"
	// Habría que mandarlo desde el Main, por ejemplo
	private Texto t;

	public PanelServiciosEmergenteWifi(MicroControladorPanelesPadreHijo microControlador, String padre,
			Controlador controlador, Semaphore s) {
		this.s = s;
		
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102),
				new Color(0, 0, 102)));
		this.setSize(new Dimension(695, 315));
		this.setName("p" + this.getClass().getSimpleName().substring(1)); // No modificar
		setLayout(null);

		t = controlador.getTexto();
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
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // No modificar
				// Devuelve control al padre
				microControlador.cambiarPanel(padre);
				s.release(s.getQueueLength());
			}
		});
		btnCerrar.setBounds(610, 11, 75, 50);
		panelPrincipal.add(btnCerrar);

		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(t.getPanelServiciosEmergenteWifiTxt());
		txtpnInfo.setBounds(45, 63, 593, 75);
		panelPrincipal.add(txtpnInfo);

		JButton btnAdquirir = new JButton(t.getBtnAdquirir());
		btnAdquirir.setFont(new Font("Tahoma", Font.PLAIN, 15));

		btnAdquirir.setBounds(260, 223, 175, 53);
		panelPrincipal.add(btnAdquirir);

		JPanel panelPrecio = new JPanel();
		panelPrecio.setBackground(new Color(255, 255, 153));
		panelPrecio.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecio.setForeground(Color.ORANGE);
		panelPrecio.setBounds(45, 166, 593, 35);
		panelPrincipal.add(panelPrecio);

		JLabel lblPrecio = new JLabel(t.getLblCoste());
		panelPrecio.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel labelPrecioYPwd = new JLabel(
				String.valueOf(controlador.getServicios().getWifi().getPrecio()) + " \u20AC");
		panelPrecio.add(labelPrecioYPwd);
		labelPrecioYPwd.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblGif = new JLabel("");
		lblGif.setBorder(new LineBorder(Color.GREEN));
		lblGif.setOpaque(true);
		lblGif.setVisible(false);
		lblGif.setIcon(new ImageIcon(PanelServiciosEmergenteWifi.class.getResource("/iconos/check-gif-1.gif")));
		lblGif.setBounds(287, 103, 120, 109);
		panelPrincipal.add(lblGif);

		btnAdquirir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(String.valueOf(controlador.getServicios().getWifi().getPrecio()));

							s.acquire();

							if (((PanelConfirmacionServicios) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								txtpnInfo.setText(t.getPanelServiciosEmergenteWifiActivadoTxt());
								panelPrecio.setBorder(new LineBorder(Color.decode("#005cb9"), 3));
								panelPrecio.setBackground(Color.decode("#9bbfe3"));
								String pwd = controlador.getServicios().getWifi().activarWifi();
								controlador.getCuenta().getGasto().addGasto(new StringDouble("Contratar WiFi",
										controlador.getServicios().getWifi().getPrecio()));
								lblPrecio.setText("");
								labelPrecioYPwd.setText(t.getPanelServiciosEmergenteWifiPwdTxt() + " " + pwd);
								btnAdquirir.setVisible(false);
								lblGif.setVisible(true);
								Thread.sleep(2050);
								lblGif.setVisible(false);
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
