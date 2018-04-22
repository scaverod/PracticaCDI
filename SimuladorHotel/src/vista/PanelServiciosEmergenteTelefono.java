package vista;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import controlador.Controlador;
import controlador.MicroControladorLayers;
import controlador.MicroControladorLayersPadreHijo;
import idiomas.Texto;
import tiposVariable.StringDouble;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;

public class PanelServiciosEmergenteTelefono extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	private Semaphore s;

	// 1 -> America, 2-> Asia, 3-> Europa y 4-> Africa
	private int continente = 0;
	private Texto t;

	public PanelServiciosEmergenteTelefono(MicroControladorLayersPadreHijo microControlador, String padre, Controlador controlador, Semaphore s) {
		this.s = s;
		t = controlador.getTexto();
		this.setSize(new Dimension(695, 315));
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);
		JButton btnConfirmarLLamada = new JButton("Seleccione un continente");
		btnConfirmarLLamada.setEnabled(false);
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

		JLabel lblImagen = new JLabel("");
		ImageIcon mapa = new ImageIcon(PanelServiciosEmergenteTelefono.class.getResource("/iconos/continente.png"));
		ImageIcon europa = new ImageIcon(PanelServiciosEmergenteTelefono.class.getResource("/iconos/europa.jpg"));
		ImageIcon asia = new ImageIcon(PanelServiciosEmergenteTelefono.class.getResource("/iconos/asia.jpg"));
		ImageIcon america = new ImageIcon(PanelServiciosEmergenteTelefono.class.getResource("/iconos/america.jpg"));
		ImageIcon africa = new ImageIcon(PanelServiciosEmergenteTelefono.class.getResource("/iconos/africa.jpg"));

		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(
				"Seleccione el continente al que desea llamar y a continuaci\u00F3n confirme la llamada. \r\nDespu\u00E9s podr\u00E1 usar el tel\u00E9fono de la habitaci\u00F3n para realizar la llamada.");
		txtpnInfo.setBounds(10, 11, 593, 81);
		panelPrincipal.add(txtpnInfo);

		JLabel lblGif = new JLabel("");
		lblGif.setBorder(new LineBorder(Color.GREEN));
		lblGif.setOpaque(true);
		lblGif.setVisible(false);
		lblGif.setIcon(new ImageIcon(PanelServiciosEmergenteWifi.class.getResource("/iconos/check-gif-1.gif")));
		lblGif.setBounds(287, 103, 120, 109);
		panelPrincipal.add(lblGif);

		crearPanelConfirmacion("<precio>");

		JButton btnCerrar = new JButton(t.getBtnCerrar());
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // No modificar
				// Devuelve control al padre
				microControlador.changeLayer(0);
				s.release(s.getQueueLength());
			}
		});
		btnCerrar.setBounds(610, 11, 75, 50);
		panelPrincipal.add(btnCerrar);

		btnConfirmarLLamada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							switch (continente) {
							case 1:

								mostrarPanelConfirmacion(String
										.valueOf(controlador.getServicios().getLlamada().getPrecioAmerica() + " €"));

								s.acquire();

								if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
									controlador.getCuenta().getGasto().addGasto(new StringDouble(t.getAmerica(),
											controlador.getServicios().getLlamada().getPrecioAmerica()));
									btnConfirmarLLamada.setEnabled(false);
									btnConfirmarLLamada.setText("Seleccione un continente");
									lblGif.setVisible(true);
									Thread.sleep(2050);
									lblGif.setVisible(false);

									// Tiene que hacerse siempre!
									((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
								}
								break;
							case 2:

								mostrarPanelConfirmacion(
										String.valueOf(controlador.getServicios().getLlamada().getPrecioAsia() + " €"));

								s.acquire();

								if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
									controlador.getCuenta().getGasto().addGasto(new StringDouble(t.getAsia(),
											controlador.getServicios().getLlamada().getPrecioAsia()));
									btnConfirmarLLamada.setEnabled(false);
									btnConfirmarLLamada.setText("Seleccione un continente");
									lblGif.setVisible(true);
									Thread.sleep(2050);
									lblGif.setVisible(false);

									// Tiene que hacerse siempre!
									((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
								}
								break;
							case 3:

								mostrarPanelConfirmacion(String
										.valueOf(controlador.getServicios().getLlamada().getPrecioEuropa() + " €"));

								s.acquire();

								if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
									controlador.getCuenta().getGasto().addGasto(new StringDouble(t.getEuropa(),
											controlador.getServicios().getLlamada().getPrecioEuropa()));
									btnConfirmarLLamada.setEnabled(false);
									btnConfirmarLLamada.setText("Seleccione un continente");
									lblGif.setVisible(true);
									Thread.sleep(2050);
									lblGif.setVisible(false);

									// Tiene que hacerse siempre!
									((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
								}
								break;
							case 4:

								mostrarPanelConfirmacion(String
										.valueOf(controlador.getServicios().getLlamada().getPrecioAfrica() + " €"));

								s.acquire();

								if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
									controlador.getCuenta().getGasto().addGasto(new StringDouble(t.getAfrica(),
											controlador.getServicios().getLlamada().getPrecioAfrica()));
									btnConfirmarLLamada.setEnabled(false);
									btnConfirmarLLamada.setText("Seleccione un continente");
									lblGif.setVisible(true);
									Thread.sleep(2050);
									lblGif.setVisible(false);

									// Tiene que hacerse siempre!
									((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
								}
								break;
							}
							lblImagen.setIcon(mapa);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				}.start();
			}
		});
		btnConfirmarLLamada.setBounds(268, 266, 158, 38);
		panelPrincipal.add(btnConfirmarLLamada);

		JButton btnAmerica = new JButton("");
		btnAmerica.setFocusPainted(false);
		btnAmerica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				continente = 1;
				btnConfirmarLLamada.setEnabled(true);
				btnConfirmarLLamada.setText(t.getAmerica());
				lblImagen.setIcon(america);

			}
		});
		btnAmerica.setContentAreaFilled(false);
		btnAmerica.setBounds(111, 55, 166, 210);
		panelPrincipal.add(btnAmerica);

		JButton btnAsia = new JButton("");
		btnAsia.setFocusPainted(false);
		btnAsia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				continente = 2;
				btnConfirmarLLamada.setEnabled(true);
				btnConfirmarLLamada.setText(t.getAsia());
				lblImagen.setIcon(asia);
			}
		});
		btnAsia.setContentAreaFilled(false);
		btnAsia.setBounds(383, 55, 190, 210);
		panelPrincipal.add(btnAsia);

		JButton btnEuropa = new JButton("");
		btnEuropa.setFocusPainted(false);
		btnEuropa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				continente = 3;
				btnConfirmarLLamada.setEnabled(true);
				btnConfirmarLLamada.setText(t.getEuropa());
				lblImagen.setIcon(europa);
			}
		});
		btnEuropa.setContentAreaFilled(false);
		btnEuropa.setBounds(284, 56, 97, 75);
		panelPrincipal.add(btnEuropa);

		JButton btnAfrica = new JButton("");
		btnAfrica.setFocusPainted(false);
		btnAfrica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				continente = 4;
				btnConfirmarLLamada.setEnabled(true);
				btnConfirmarLLamada.setText(t.getAfrica());
				lblImagen.setIcon(africa);
			}
		});
		btnAfrica.setContentAreaFilled(false);
		btnAfrica.setBounds(287, 136, 94, 124);
		panelPrincipal.add(btnAfrica);

		lblImagen.setIcon(new ImageIcon(PanelServiciosEmergenteTelefono.class.getResource("/iconos/continente.png")));
		lblImagen.setBounds(111, 45, 472, 259);
		panelPrincipal.add(lblImagen);
	}

	public void cerrarPanelConfirmacion() {
		panelContenedor.setLayer(panelConfirmacion, 0);
	}

	public void crearPanelConfirmacion(String precio) {
		panelConfirmacion = new PanelConfirmacion(new MicroControladorLayers(panelContenedor), this.getName(), s, precio, t);
		panelConfirmacion.setBounds(147, 57, 400, 200);
		panelContenedor.setLayer(panelConfirmacion, 0);
		panelContenedor.add(panelConfirmacion);
	}

	public void mostrarPanelConfirmacion(String precio) {
		crearPanelConfirmacion(precio);
		panelContenedor.setLayer(panelConfirmacion, 2);
	}
}
