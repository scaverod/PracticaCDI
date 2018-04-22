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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.border.EtchedBorder;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;

public class PanelServiciosEmergenteAlmohada extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	private Semaphore s;
	private Texto t;

	public PanelServiciosEmergenteAlmohada(MicroControladorLayersPadreHijo microControlador, String padre, Controlador controlador, Semaphore s) {
		this.s = s;
		this.t = controlador.getTexto();
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
				microControlador.changeLayer(0);
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
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(t.getPanelServiciosEmergentealmohadaTxt());
		txtpnInfo.setBounds(10, 11, 590, 50);
		panelPrincipal.add(txtpnInfo);

		JPanel panelPrecioVisco = new JPanel();
		panelPrecioVisco.setBackground(new Color(255, 255, 153));
		panelPrecioVisco.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecioVisco.setForeground(Color.ORANGE);
		panelPrecioVisco.setBounds(272, 103, 175, 35);
		panelPrincipal.add(panelPrecioVisco);

		JLabel lblVisco = new JLabel(t.getLblCoste());
		panelPrecioVisco.add(lblVisco);
		lblVisco.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel labelPrecioVisco = new JLabel(
				String.valueOf(controlador.getServicios().getAlmohada().getPrecioVisco()) + " \u20AC");
		panelPrecioVisco.add(labelPrecioVisco);
		labelPrecioVisco.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JPanel panelPrecioLatex = new JPanel();
		panelPrecioLatex.setForeground(Color.ORANGE);
		panelPrecioLatex.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecioLatex.setBackground(new Color(255, 255, 153));
		panelPrecioLatex.setBounds(272, 157, 175, 35);
		panelPrincipal.add(panelPrecioLatex);

		JLabel lblLatex = new JLabel("Coste:");
		lblLatex.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelPrecioLatex.add(lblLatex);

		JLabel labelPrecioLatex = new JLabel(
				String.valueOf(controlador.getServicios().getAlmohada().getPrecioLatex()) + " \u20AC");
		labelPrecioLatex.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelPrecioLatex.add(labelPrecioLatex);

		JPanel panelPrecioPluma = new JPanel();
		panelPrecioPluma.setForeground(Color.ORANGE);
		panelPrecioPluma.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecioPluma.setBackground(new Color(255, 255, 153));
		panelPrecioPluma.setBounds(272, 211, 175, 35);
		panelPrincipal.add(panelPrecioPluma);

		JLabel lblPluma = new JLabel("Coste:");
		lblPluma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelPrecioPluma.add(lblPluma);

		JLabel labelPrecioPluma = new JLabel(
				String.valueOf(controlador.getServicios().getAlmohada().getPrecioPluma()) + " \u20AC");
		labelPrecioPluma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelPrecioPluma.add(labelPrecioPluma);

		JPanel panelPrecioGel = new JPanel();
		panelPrecioGel.setForeground(Color.ORANGE);
		panelPrecioGel.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecioGel.setBackground(new Color(255, 255, 153));
		panelPrecioGel.setBounds(272, 265, 175, 35);
		panelPrincipal.add(panelPrecioGel);

		JLabel lblGel = new JLabel("Coste:");
		lblGel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelPrecioGel.add(lblGel);

		JLabel labelPrecioGel = new JLabel(
				String.valueOf(controlador.getServicios().getAlmohada().getPrecioLatex()) + " \u20AC");
		labelPrecioGel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelPrecioGel.add(labelPrecioGel);

		JButton btnComprarLatex = new JButton("");
		btnComprarLatex.setFocusPainted(false);
		btnComprarLatex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Thread() {
					public void run() {
						try {
							// FIXME
							System.out.println(controlador.getTexto());
							
							mostrarPanelConfirmacion(
									String.valueOf(controlador.getServicios().getAlmohada().getPrecioLatex()) + " €");

							s.acquire();

							if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								controlador.getCuenta().getGasto()
										.addGasto(new StringDouble(t.getLatex(),
												controlador.getServicios().getAlmohada().getPrecioLatex()));
								lblGif.setVisible(true);
								Thread.sleep(2050);
								lblGif.setVisible(false);

								// Tiene que hacerse siempre!
								((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
							}
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				}.start();
			}
		});

		JButton btnComprarVisco = new JButton("");
		btnComprarVisco.setFocusPainted(false);
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

							if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								controlador.getCuenta().getGasto()
										.addGasto(new StringDouble(t.getViscoelastica(),
												controlador.getServicios().getAlmohada().getPrecioVisco()));
								lblGif.setVisible(true);
								Thread.sleep(2050);
								lblGif.setVisible(false);

								// Tiene que hacerse siempre!
								((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
							}
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				}.start();
			}
		});
		btnComprarVisco.setBounds(533, 103, 75, 35);
		panelPrincipal.add(btnComprarVisco);
		btnComprarLatex.setContentAreaFilled(false);
		btnComprarLatex
				.setIcon(new ImageIcon(PanelServiciosEmergenteAlmohada.class.getResource("/iconos/comprar.png")));
		btnComprarLatex.setBounds(533, 157, 75, 35);
		panelPrincipal.add(btnComprarLatex);

		JButton btnComprarPluma = new JButton("");
		btnComprarPluma.setFocusPainted(false);
		btnComprarPluma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(
									String.valueOf(controlador.getServicios().getAlmohada().getPrecioPluma()) + " €");

							s.acquire();

							if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								controlador.getCuenta().getGasto()
										.addGasto(new StringDouble(t.getPluma(),
												controlador.getServicios().getAlmohada().getPrecioPluma()));
								lblGif.setVisible(true);
								Thread.sleep(2050);
								lblGif.setVisible(false);

								// Tiene que hacerse siempre!
								((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
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
		btnComprarPluma.setBounds(533, 211, 75, 35);
		panelPrincipal.add(btnComprarPluma);

		JButton btnComprarGel = new JButton("");
		btnComprarGel.setFocusPainted(false);
		btnComprarGel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(
									String.valueOf(controlador.getServicios().getAlmohada().getPrecioGel()) + " €");

							s.acquire();

							if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								controlador.getCuenta().getGasto().addGasto(new StringDouble(t.getGel(),
										controlador.getServicios().getAlmohada().getPrecioGel()));
								lblGif.setVisible(true);
								Thread.sleep(2050);
								lblGif.setVisible(false);

								// Tiene que hacerse siempre!
								((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
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
		btnComprarGel.setBounds(533, 265, 75, 35);
		panelPrincipal.add(btnComprarGel);

		JPanel panelBordeVisco = new JPanel();
		panelBordeVisco.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panelBordeVisco.setBounds(66, 98, 564, 44);
		panelPrincipal.add(panelBordeVisco);
		panelBordeVisco.setLayout(null);

		JTextPane textPaneVisco = new JTextPane();
		textPaneVisco.setBounds(10, 11, 99, 23);
		panelBordeVisco.add(textPaneVisco);
		textPaneVisco.setText("Viscoel\u00E1stica");
		textPaneVisco.setOpaque(false);
		textPaneVisco.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPaneVisco.setEditable(false);

		JPanel panelBordeLatex = new JPanel();
		panelBordeLatex.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panelBordeLatex.setBounds(66, 152, 564, 44);
		panelPrincipal.add(panelBordeLatex);
		panelBordeLatex.setLayout(null);

		JTextPane textPaneLatex = new JTextPane();
		textPaneLatex.setBounds(10, 11, 99, 23);
		panelBordeLatex.add(textPaneLatex);
		textPaneLatex.setText(t.getPanelServiciosEmergentealmohadaLatex());
		textPaneLatex.setOpaque(false);
		textPaneLatex.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPaneLatex.setEditable(false);

		JPanel panelBordePluma = new JPanel();
		panelBordePluma.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panelBordePluma.setBounds(66, 206, 564, 44);
		panelPrincipal.add(panelBordePluma);
		panelBordePluma.setLayout(null);

		JTextPane textPanePluma = new JTextPane();
		textPanePluma.setBounds(10, 11, 99, 23);
		panelBordePluma.add(textPanePluma);
		textPanePluma.setText(t.getPanelServiciosEmergentealmohadaPluma());
		textPanePluma.setOpaque(false);
		textPanePluma.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPanePluma.setEditable(false);

		JPanel panelBordeGel = new JPanel();
		panelBordeGel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panelBordeGel.setBounds(66, 260, 564, 44);
		panelPrincipal.add(panelBordeGel);
		panelBordeGel.setLayout(null);

		JTextPane textPaneGel = new JTextPane();
		textPaneGel.setBounds(10, 11, 99, 23);
		panelBordeGel.add(textPaneGel);
		textPaneGel.setText(t.getPanelServiciosEmergentealmohadaGel());
		textPaneGel.setOpaque(false);
		textPaneGel.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPaneGel.setEditable(false);
		
		this.addHierarchyListener(new HierarchyListener() {
			public void hierarchyChanged(HierarchyEvent e) {
				if (e.getChangeFlags() == HierarchyEvent.HIERARCHY_FIRST || e.getChangeFlags() == HierarchyEvent.SHOWING_CHANGED) {
					t = controlador.getTexto();
					
					btnCerrar.setText(t.getBtnCerrar());
					txtpnInfo.setText(t.getPanelServiciosEmergentealmohadaTxt());
					textPaneVisco.setText(t.getPanelServiciosEmergentealmohadaVisco());
					textPaneLatex.setText(t.getPanelServiciosEmergentealmohadaLatex());
					textPanePluma.setText(t.getPanelServiciosEmergentealmohadaPluma());
					textPaneGel.setText(t.getPanelServiciosEmergentealmohadaGel());
					
					lblVisco.setText(t.getLblCoste());
					lblLatex.setText(t.getLblCoste());
					lblPluma.setText(t.getLblCoste());
					lblGel.setText(t.getLblCoste());
				}
			}
		});
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
