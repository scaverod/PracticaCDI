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

public class PanelServiciosEmergenteTaxi extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	private Semaphore s;
	private Texto t;

	public PanelServiciosEmergenteTaxi(MicroControladorPanelesPadreHijo microControlador, String padre, Controlador controlador, Semaphore s) {
		this.s = s;
		t = controlador.getTexto();
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102)));
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
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(t.getPanelServiciosEmergenteTaxiTxt());
		txtpnInfo.setBounds(45, 63, 593, 75);
		panelPrincipal.add(txtpnInfo);

		JLabel lblGif = new JLabel("");
		lblGif.setBorder(new LineBorder(Color.GREEN));
		lblGif.setOpaque(true);
		lblGif.setVisible(false);
		lblGif.setIcon(new ImageIcon(PanelServiciosEmergenteWifi.class.getResource("/iconos/check-gif-1.gif")));
		lblGif.setBounds(287, 103, 120, 109);
		panelPrincipal.add(lblGif);

		JButton btnCabify = new JButton("");
		btnCabify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(String.valueOf(controlador.getServicios().getTaxi().getPrecio())+ " €");

							s.acquire();

							if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								generarGasto("Cabifay", controlador);
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
		btnCabify.setContentAreaFilled(false);
		btnCabify.setIcon(new ImageIcon(PanelServiciosEmergenteTaxi.class.getResource("/iconos/cabify.png")));
		btnCabify.setBounds(296, 138, 100, 90);
		panelPrincipal.add(btnCabify);

		JButton btnUber = new JButton("");
		btnUber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(String.valueOf(controlador.getServicios().getTaxi().getPrecio())+ " €");

							s.acquire();

							if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								generarGasto("Uber", controlador);
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
		btnUber.setContentAreaFilled(false);
		btnUber.setIcon(new ImageIcon(PanelServiciosEmergenteTaxi.class.getResource("/iconos/Uber.png")));
		btnUber.setBounds(494, 138, 100, 90);
		panelPrincipal.add(btnUber);

		JButton btnTaxi = new JButton("");
		btnTaxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(String.valueOf(controlador.getServicios().getTaxi().getPrecio())+ " €");

							s.acquire();

							if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								generarGasto("Taxi", controlador);
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
		btnTaxi.setContentAreaFilled(false);
		btnTaxi.setIcon(new ImageIcon(PanelServiciosEmergenteTaxi.class.getResource("/iconos/taxi2.png")));
		btnTaxi.setBounds(98, 138, 100, 90);
		panelPrincipal.add(btnTaxi);

		JPanel panelPrecio = new JPanel();
		panelPrecio.setBackground(new Color(255, 255, 153));
		panelPrecio.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecio.setForeground(Color.ORANGE);
		panelPrecio.setBounds(51, 248, 593, 35);
		panelPrincipal.add(panelPrecio);

		JLabel lblPrecio = new JLabel(t.getLblCoste());
		panelPrecio.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel labelPrecioYPwd = new JLabel(
				String.valueOf(controlador.getServicios().getTaxi().getPrecio()) + " \u20AC");
		panelPrecio.add(labelPrecioYPwd);
		labelPrecioYPwd.setFont(new Font("Tahoma", Font.PLAIN, 15));

	}

	public void generarGasto(String compania, Controlador controlador) {
		controlador.getCuenta().getGasto().addGasto(
				new StringDouble("Contrata servicio " + compania, controlador.getServicios().getTaxi().getPrecio()));
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
