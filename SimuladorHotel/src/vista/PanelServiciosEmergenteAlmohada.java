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
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.border.EtchedBorder;

public class PanelServiciosEmergenteAlmohada extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	private Semaphore s;

	// FIXME: temporal para que salga el texto en vez de "<dynamic>"
	// Habría que mandarlo desde el Main, por ejemplo
	private Texto t = new TextoManager(TextoManager.español).getTexto();
	// TODO: COMPLETAR TEXTO

	public PanelServiciosEmergenteAlmohada(MicroControladorPanelesPadreHijo microControlador, String padre,
			Controlador controlador, Semaphore s) {
		this.s = s;

		this.setSize(new Dimension(695, 315));
		this.setName("p" + this.getClass().getSimpleName().substring(1));
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

		JLabel lblGif = new JLabel("");
		lblGif.setBorder(new LineBorder(Color.GREEN));
		lblGif.setOpaque(true);
		lblGif.setVisible(false);
		lblGif.setIcon(new ImageIcon(PanelServiciosEmergenteWifi.class.getResource("/iconos/check-gif-1.gif")));
		lblGif.setBounds(287, 103, 120, 109);
		panelPrincipal.add(lblGif);

		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(t.getPanelServiciosEmergentealmohadaTxt());
		txtpnInfo.setBounds(45, 31, 555, 35);
		panelPrincipal.add(txtpnInfo);

		JPanel panelPrecioVisco = new JPanel();
		panelPrecioVisco.setBackground(new Color(255, 255, 153));
		panelPrecioVisco.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecioVisco.setForeground(Color.ORANGE);
		panelPrecioVisco.setBounds(271, 91, 175, 35);
		panelPrincipal.add(panelPrecioVisco);

		JLabel lblPrecio = new JLabel(t.getLblCoste());
		panelPrecioVisco.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel labelPrecioVisco = new JLabel(
				String.valueOf(controlador.getServicios().getAlmohada().getPrecioVisco()) + " \u20AC");
		panelPrecioVisco.add(labelPrecioVisco);
		labelPrecioVisco.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JPanel panelPrecioLatex = new JPanel();
		panelPrecioLatex.setForeground(Color.ORANGE);
		panelPrecioLatex.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecioLatex.setBackground(new Color(255, 255, 153));
		panelPrecioLatex.setBounds(271, 145, 175, 35);
		panelPrincipal.add(panelPrecioLatex);

		JLabel label = new JLabel("Coste:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelPrecioLatex.add(label);

		JLabel labelPrecioLatex = new JLabel(
				String.valueOf(controlador.getServicios().getAlmohada().getPrecioLatex()) + " \u20AC");
		labelPrecioLatex.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelPrecioLatex.add(labelPrecioLatex);

		JPanel panelPrecioPluma = new JPanel();
		panelPrecioPluma.setForeground(Color.ORANGE);
		panelPrecioPluma.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecioPluma.setBackground(new Color(255, 255, 153));
		panelPrecioPluma.setBounds(271, 199, 175, 35);
		panelPrincipal.add(panelPrecioPluma);

		JLabel label_2 = new JLabel("Coste:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelPrecioPluma.add(label_2);

		JLabel labelPrecioPluma = new JLabel(
				String.valueOf(controlador.getServicios().getAlmohada().getPrecioPluma()) + " \u20AC");
		labelPrecioPluma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelPrecioPluma.add(labelPrecioPluma);

		JPanel panelPrecioGel = new JPanel();
		panelPrecioGel.setForeground(Color.ORANGE);
		panelPrecioGel.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecioGel.setBackground(new Color(255, 255, 153));
		panelPrecioGel.setBounds(271, 253, 175, 35);
		panelPrincipal.add(panelPrecioGel);

		JLabel label_4 = new JLabel("Coste:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelPrecioGel.add(label_4);

		JLabel labelPrecioGel = new JLabel(
				String.valueOf(controlador.getServicios().getAlmohada().getPrecioLatex()) + " \u20AC");
		labelPrecioGel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelPrecioGel.add(labelPrecioGel);

		JTextPane textPaneVisco = new JTextPane();
		textPaneVisco.setText("Viscoel\u00E1stica");
		textPaneVisco.setOpaque(false);
		textPaneVisco.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPaneVisco.setEditable(false);
		textPaneVisco.setBounds(86, 97, 99, 23);
		panelPrincipal.add(textPaneVisco);

		JTextPane textPaneLatex = new JTextPane();
		textPaneLatex.setText(t.getPanelServiciosEmergentealmohadaLatex());
		textPaneLatex.setOpaque(false);
		textPaneLatex.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPaneLatex.setEditable(false);
		textPaneLatex.setBounds(86, 151, 99, 23);
		panelPrincipal.add(textPaneLatex);

		JTextPane textPanePluma = new JTextPane();
		textPanePluma.setText(t.getPanelServiciosEmergentealmohadaPluma());
		textPanePluma.setOpaque(false);
		textPanePluma.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPanePluma.setEditable(false);
		textPanePluma.setBounds(86, 205, 99, 23);
		panelPrincipal.add(textPanePluma);

		JTextPane textPaneGel = new JTextPane();
		textPaneGel.setText(t.getPanelServiciosEmergentealmohadaGel());
		textPaneGel.setOpaque(false);
		textPaneGel.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPaneGel.setEditable(false);
		textPaneGel.setBounds(86, 259, 99, 23);
		panelPrincipal.add(textPaneGel);

		JButton btnComprarLatex = new JButton("");
		btnComprarLatex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(
									String.valueOf(controlador.getServicios().getAlmohada().getPrecioLatex()) + " €");

							s.acquire();

							if (((PanelConfirmacionServicios) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								controlador.getCuenta().getGasto()
										.addGasto(new StringDouble("Contratar Almoahada Latex",
												controlador.getServicios().getAlmohada().getPrecioLatex()));
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

		JButton btnComprarVisco = new JButton("");
		btnComprarVisco.setContentAreaFilled(false);
		btnComprarVisco.setOpaque(false);
		btnComprarVisco
				.setIcon(new ImageIcon(PanelServiciosEmergenteAlmohada.class.getResource("/iconos/comprar.png")));
		btnComprarVisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(
									String.valueOf(controlador.getServicios().getAlmohada().getPrecioVisco()) + " €");

							s.acquire();

							if (((PanelConfirmacionServicios) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								controlador.getCuenta().getGasto()
										.addGasto(new StringDouble("Contratar Almoahada Viscoelástica",
												controlador.getServicios().getAlmohada().getPrecioVisco()));
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
		btnComprarVisco.setBounds(532, 91, 75, 35);
		panelPrincipal.add(btnComprarVisco);
		btnComprarLatex.setContentAreaFilled(false);
		btnComprarLatex
				.setIcon(new ImageIcon(PanelServiciosEmergenteAlmohada.class.getResource("/iconos/comprar.png")));
		btnComprarLatex.setBounds(532, 145, 75, 35);
		panelPrincipal.add(btnComprarLatex);

		JButton btnComprarPluma = new JButton("");
		btnComprarPluma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(
									String.valueOf(controlador.getServicios().getAlmohada().getPrecioPluma()) + " €");

							s.acquire();

							if (((PanelConfirmacionServicios) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								controlador.getCuenta().getGasto()
										.addGasto(new StringDouble("Contratar Almoahada Pluma",
												controlador.getServicios().getAlmohada().getPrecioPluma()));
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
		btnComprarPluma.setContentAreaFilled(false);
		btnComprarPluma
				.setIcon(new ImageIcon(PanelServiciosEmergenteAlmohada.class.getResource("/iconos/comprar.png")));
		btnComprarPluma.setBounds(532, 199, 75, 35);
		panelPrincipal.add(btnComprarPluma);

		JButton btnComprarGel = new JButton("");
		btnComprarGel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(
									String.valueOf(controlador.getServicios().getAlmohada().getPrecioGel()) + " €");

							s.acquire();

							if (((PanelConfirmacionServicios) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								controlador.getCuenta().getGasto().addGasto(new StringDouble("Contratar Almoahada Gel",
										controlador.getServicios().getAlmohada().getPrecioGel()));
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
		btnComprarGel.setContentAreaFilled(false);
		btnComprarGel.setOpaque(false);
		btnComprarGel.setIcon(new ImageIcon(PanelServiciosEmergenteAlmohada.class.getResource("/iconos/comprar.png")));
		btnComprarGel.setBounds(532, 253, 75, 35);
		panelPrincipal.add(btnComprarGel);

		JPanel panelBordeVisco = new JPanel();
		panelBordeVisco.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panelBordeVisco.setBounds(65, 86, 564, 44);
		panelPrincipal.add(panelBordeVisco);

		JPanel panelBordeLatex = new JPanel();
		panelBordeLatex.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panelBordeLatex.setBounds(65, 140, 564, 44);
		panelPrincipal.add(panelBordeLatex);

		JPanel panelBordePluma = new JPanel();
		panelBordePluma.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panelBordePluma.setBounds(65, 194, 564, 44);
		panelPrincipal.add(panelBordePluma);

		JPanel panelBordeGel = new JPanel();
		panelBordeGel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panelBordeGel.setBounds(65, 248, 564, 44);
		panelPrincipal.add(panelBordeGel);
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
