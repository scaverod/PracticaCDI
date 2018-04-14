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

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLayeredPane;

import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextPane;

public class PanelServiciosEmergenteTelevision extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	private Semaphore s;

	// FIXME: temporal para que salga el texto en vez de "<dynamic>"
	// Habría que mandarlo desde el Main, por ejemplo
	private Texto t = new TextoManager(TextoManager.español).getTexto();

	public PanelServiciosEmergenteTelevision(MicroControladorPanelesPadreHijo microControlador, String padre,
			Controlador controlador, Semaphore s) {
		this.s = s;

		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102),
				new Color(0, 0, 102)));
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

		JButton btnMoviestar = new JButton("");
		btnMoviestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(String
									.valueOf(controlador.getServicios().getTelevision().getPrecioMoviestarPlus()));

							s.acquire();

							if (((PanelConfirmacionServicios) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								btnMoviestar.setEnabled(false);
								controlador.getCuenta().getGasto().addGasto(new StringDouble("Contratar Moviestar +",
										controlador.getServicios().getTelevision().getPrecioMoviestarPlus()));
								controlador.getServicios().getTelevision().setActivadoMoviestarPlus(true);

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
		btnMoviestar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnMoviestar
				.setIcon(new ImageIcon(PanelServiciosEmergenteTelevision.class.getResource("/iconos/movistar.png")));
		btnMoviestar.setBounds(59, 138, 100, 90);
		btnMoviestar.setContentAreaFilled(false);
		panelPrincipal.add(btnMoviestar);

		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(t.getPanelServiciosEmergenteTelevisionTxt());
		txtpnInfo.setBounds(51, 63, 593, 75);
		panelPrincipal.add(txtpnInfo);

		JButton btnNetflix = new JButton("");
		btnNetflix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(
									String.valueOf(controlador.getServicios().getTelevision().getPrecioNetflix()));

							s.acquire();

							if (((PanelConfirmacionServicios) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								btnNetflix.setEnabled(false);
								controlador.getCuenta().getGasto().addGasto(new StringDouble("Contratar Netflix",
										controlador.getServicios().getTelevision().getPrecioNetflix()));
								controlador.getServicios().getTelevision().setActivadoNetflix(true);

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
		btnNetflix.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNetflix.setIcon(new ImageIcon(PanelServiciosEmergenteTelevision.class.getResource("/iconos/netflix.png")));
		btnNetflix.setBounds(218, 138, 100, 90);
		btnNetflix.setContentAreaFilled(false);
		panelPrincipal.add(btnNetflix);

		JButton btnBBC = new JButton("");
		btnBBC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(
									String.valueOf(controlador.getServicios().getTelevision().getPrecioBBC()));

							s.acquire();

							if (((PanelConfirmacionServicios) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								btnBBC.setEnabled(false);
								controlador.getCuenta().getGasto().addGasto(new StringDouble("Contratar BBC",
										controlador.getServicios().getTelevision().getPrecioBBC()));
								controlador.getServicios().getTelevision().setActivadoBBC(true);

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
		btnBBC.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnBBC.setIcon(new ImageIcon(PanelServiciosEmergenteTelevision.class.getResource("/iconos/bbc.png")));
		btnBBC.setBounds(377, 138, 100, 90);
		btnBBC.setContentAreaFilled(false);
		panelPrincipal.add(btnBBC);

		JButton btnBeinSport = new JButton("");
		btnBeinSport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(
									String.valueOf(controlador.getServicios().getTelevision().getPrecioBeinSport()));

							s.acquire();

							if (((PanelConfirmacionServicios) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								btnBeinSport.setEnabled(false);
								controlador.getCuenta().getGasto().addGasto(new StringDouble("Contratar Bein Sport",
										controlador.getServicios().getTelevision().getPrecioBeinSport()));
								controlador.getServicios().getTelevision().setActivadoBeinSport(true);

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
		btnBeinSport.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnBeinSport
				.setIcon(new ImageIcon(PanelServiciosEmergenteTelevision.class.getResource("/iconos/beinsport.png")));
		btnBeinSport.setBounds(536, 138, 100, 90);
		btnBeinSport.setContentAreaFilled(false);
		panelPrincipal.add(btnBeinSport);
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
