package vista;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JToggleButton;

import controlador.Controlador;
import controlador.MicroControladorLayersPadreHijo;
import idiomas.Texto;
import idiomas.TextoManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelHabitacion extends JPanel {
	private static final long serialVersionUID = 1L;
	private Texto t = new TextoManager(TextoManager.español).getTexto();

	private MicroControladorLayersPadreHijo microControlador;

	private int encendidas;
	private JLayeredPane layeredPane;
	private JPanel panelPrincipal;
	private JPanel panelEmergenteContenedor;
	private JPanel panelAyuda;
	private JPanel panelAlarma;
	private JPanel panelVentana;
	private JPanel panelVentana2;
	private JPanel panelJacuzzi;
	private JPanel panelCalefaccion;

	public PanelHabitacion(Controlador controlador) {
		this.setSize(new Dimension(931, 483));
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);
		encendidas = 0;

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 931, 483);
		add(layeredPane);

		JPanel panelFondo = new JPanel();
		layeredPane.setLayer(panelFondo, 1);
		panelFondo.setBounds(0, 0, 931, 483);
		layeredPane.add(panelFondo);
		panelFondo.setLayout(null);

		JLabel lblImagenHabitacion = new JLabel("");
		lblImagenHabitacion.setBounds(0, 0, 931, 483);
		panelFondo.add(lblImagenHabitacion);
		lblImagenHabitacion.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/habitacion.jpg")));
		JButton btnLuzTechoCentro = new JButton("");
		btnLuzTechoCentro.setFocusPainted(false);
		btnLuzTechoCentro.setContentAreaFilled(false);
		JButton btnLuzMesillaIzquierda = new JButton("");
		btnLuzMesillaIzquierda.setFocusPainted(false);
		JButton btnLuzBanyo = new JButton("");
		btnLuzBanyo.setFocusPainted(false);
		JButton btnLuzMesillaDerecha = new JButton("");
		btnLuzMesillaDerecha.setFocusPainted(false);

		panelPrincipal = new JPanel();
		panelPrincipal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mostrarVentanaServicios();
			}
		});
		panelPrincipal.setOpaque(false);
		layeredPane.setLayer(panelPrincipal, 2);
		panelPrincipal.setBounds(0, 0, 931, 483);
		layeredPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);

		panelEmergenteContenedor = new JPanel();
		panelEmergenteContenedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// No borrar
			}
		});
		layeredPane.setLayer(panelEmergenteContenedor, 0);
		panelEmergenteContenedor.setBounds(118, 84, 695, 315);
		layeredPane.add(panelEmergenteContenedor);
		panelEmergenteContenedor.setLayout(new CardLayout(0, 0));

		JButton btnCalefaccion = new JButton("");
		btnCalefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToVentanaEmergente(panelCalefaccion);
			}
		});

		// Luces
		JToggleButton tglbtnLuz = new JToggleButton("");
		tglbtnLuz.setFocusPainted(false);

		tglbtnLuz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (encendidas > 0) {
					encendidas = 0;
					btnLuzTechoCentro.setIcon(null);
					controlador.getHabitacion().setLuzTechoHab(false);
					btnLuzMesillaIzquierda.setIcon(null);
					controlador.getHabitacion().setLuzMesaIzq(false);
					btnLuzMesillaDerecha.setIcon(null);
					controlador.getHabitacion().setLuzMesaDer(false);
					btnLuzBanyo.setIcon(null);
					controlador.getHabitacion().setLuzTechoBan(false);
					tglbtnLuz.setSelected(false);
				} else {
					encendidas = 4;
					tglbtnLuz.setSelected(true);
					btnLuzTechoCentro
							.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/btnLucesCuarto.png")));
					controlador.getHabitacion().setLuzTechoHab(true);
					btnLuzMesillaIzquierda
							.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/btnLucesMesa.png")));
					controlador.getHabitacion().setLuzMesaIzq(true);
					btnLuzMesillaDerecha
							.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/btnLucesMesa.png")));
					controlador.getHabitacion().setLuzMesaDer(true);
					btnLuzBanyo.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/btnLucesBanyo.png")));
					controlador.getHabitacion().setLuzTechoBan(true);
				}
			}
		});

		tglbtnLuz.setToolTipText("Encender o apagar todas las luces.");
		tglbtnLuz.setSelectedIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/lucesON.png")));
		tglbtnLuz.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/lucesOFF.png")));
		tglbtnLuz.setOpaque(false);
		tglbtnLuz.setContentAreaFilled(false);
		tglbtnLuz.setBounds(91, 403, 75, 69);
		panelPrincipal.add(tglbtnLuz);

		JToggleButton tglbtnPuerta = new JToggleButton("");
		tglbtnPuerta.setFocusPainted(false);
		tglbtnPuerta.setToolTipText("Abrir o cerrar la puerta principal.");
		tglbtnPuerta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO:
			}
		});
		tglbtnPuerta.setSelectedIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/puertaAbierta.png")));
		tglbtnPuerta.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/puertaCerrada.png")));
		tglbtnPuerta.setBounds(10, 403, 75, 69);
		tglbtnPuerta.setOpaque(false);
		tglbtnPuerta.setContentAreaFilled(false);
		panelPrincipal.add(tglbtnPuerta);

		btnCalefaccion.setFocusPainted(false);
		btnCalefaccion.setForeground(Color.WHITE);
		btnCalefaccion.setContentAreaFilled(false);
		btnCalefaccion.setBounds(10, 305, 101, 69);
		panelPrincipal.add(btnCalefaccion);

		btnLuzTechoCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!controlador.getHabitacion().isLuzTechoHab()) {
					btnLuzTechoCentro
							.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/btnLucesCuarto.png")));
					controlador.getHabitacion().setLuzTechoHab(true);
					tglbtnLuz.setSelected(true);
					encendidas++;
				} else {
					btnLuzTechoCentro.setIcon(null);
					controlador.getHabitacion().setLuzTechoHab(false);
					encendidas--;
					if (encendidas == 0) {
						tglbtnLuz.setSelected(false);
					}
				}
			}
		});
		btnLuzTechoCentro.setForeground(Color.WHITE);
		btnLuzTechoCentro.setBounds(130, 80, 405, 105);
		panelPrincipal.add(btnLuzTechoCentro);

		btnLuzBanyo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!controlador.getHabitacion().isLuzTechoBan()) {
					btnLuzBanyo.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/btnLucesBanyo.png")));
					controlador.getHabitacion().setLuzTechoBan(true);
					tglbtnLuz.setSelected(true);
					encendidas++;
				} else {
					btnLuzBanyo.setIcon(null);
					controlador.getHabitacion().setLuzTechoBan(false);
					encendidas--;
					if (encendidas == 0) {
						tglbtnLuz.setSelected(false);
					}
				}
			}
		});
		btnLuzBanyo.setForeground(Color.WHITE);
		btnLuzBanyo.setContentAreaFilled(false);
		btnLuzBanyo.setBounds(675, 31, 200, 95);
		panelPrincipal.add(btnLuzBanyo);

		JButton btnVentana = new JButton("");
		btnVentana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToVentanaEmergente(panelVentana);
			}
		});
		btnVentana.setFocusPainted(false);
		btnVentana.setContentAreaFilled(false);
		btnVentana.setBounds(480, 185, 75, 90);
		panelPrincipal.add(btnVentana);

		btnLuzMesillaIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!controlador.getHabitacion().isLuzMesaIzq()) {
					btnLuzMesillaIzquierda
							.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/btnLucesMesa.png")));
					controlador.getHabitacion().setLuzMesaIzq(true);
					tglbtnLuz.setSelected(true);
					encendidas++;
				} else {
					btnLuzMesillaIzquierda.setIcon(null);
					controlador.getHabitacion().setLuzMesaIzq(false);
					encendidas--;
					if (encendidas == 0) {
						tglbtnLuz.setSelected(false);
					}
				}
			}
		});
		btnLuzMesillaIzquierda.setForeground(Color.WHITE);
		btnLuzMesillaIzquierda.setContentAreaFilled(false);
		btnLuzMesillaIzquierda.setBounds(319, 255, 50, 50);
		panelPrincipal.add(btnLuzMesillaIzquierda);

		btnLuzMesillaDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!controlador.getHabitacion().isLuzMesaDer()) {
					btnLuzMesillaDerecha
							.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/btnLucesMesa.png")));
					controlador.getHabitacion().setLuzMesaDer(true);
					tglbtnLuz.setSelected(true);
					encendidas++;
				} else {
					btnLuzMesillaDerecha.setIcon(null);
					controlador.getHabitacion().setLuzMesaDer(false);
					encendidas--;
					if (encendidas == 0) {
						tglbtnLuz.setSelected(false);
					}
				}
			}
		});
		btnLuzMesillaDerecha.setForeground(Color.WHITE);
		btnLuzMesillaDerecha.setContentAreaFilled(false);
		btnLuzMesillaDerecha.setBounds(421, 255, 50, 50);
		panelPrincipal.add(btnLuzMesillaDerecha);

		JButton btnJacuzzi = new JButton("");
		btnJacuzzi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToVentanaEmergente(panelJacuzzi);
			}
		});
		btnJacuzzi.setFocusPainted(false);
		btnJacuzzi.setForeground(Color.WHITE);
		btnJacuzzi.setContentAreaFilled(false);
		btnJacuzzi.setBounds(586, 284, 100, 100);
		panelPrincipal.add(btnJacuzzi);

		JButton btnVentanaGrande = new JButton("");
		btnVentanaGrande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToVentanaEmergente(panelVentana2);
			}
		});
		btnVentanaGrande.setFocusPainted(false);
		btnVentanaGrande.setForeground(Color.WHITE);
		btnVentanaGrande.setContentAreaFilled(false);
		btnVentanaGrande.setBounds(111, 178, 120, 190);
		panelPrincipal.add(btnVentanaGrande);

		JButton btnAlarma = new JButton("");
		btnAlarma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToVentanaEmergente(panelAlarma);
			}
		});
		btnAlarma.setFocusPainted(false);
		btnAlarma.setToolTipText("Programar una alarma.");
		btnAlarma.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/alarm.png")));
		btnAlarma.setBounds(772, 403, 89, 69);
		btnAlarma.setContentAreaFilled(false);
		panelPrincipal.add(btnAlarma);

		JButton btnAyuda = new JButton("");
		btnAyuda.setFocusPainted(false);
		btnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToVentanaEmergente(panelAyuda);
			}
		});
		btnAyuda.setToolTipText("<consejos>");
		btnAyuda.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/help.png")));
		btnAyuda.setBounds(871, 411, 50, 50);
		btnAyuda.setOpaque(false);
		btnAyuda.setContentAreaFilled(false);
		panelPrincipal.add(btnAyuda);

		JButton btnTemperatura = new JButton("");
		btnTemperatura.setFocusPainted(false);
		btnTemperatura.setToolTipText("Ajustar la temperatura de la habitaci\u00F3n.");
		btnTemperatura.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/thermometer.png")));
		btnTemperatura.setBounds(10, 11, 80, 80);
		btnTemperatura.setContentAreaFilled(false);
		panelPrincipal.add(btnTemperatura);

		JLabel lblTemperatura = new JLabel("23\u00BA");
		lblTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatura.setForeground(Color.WHITE);
		lblTemperatura.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTemperatura.setBounds(10, 80, 80, 27);
		panelPrincipal.add(lblTemperatura);

		// En principio no tiene que estar al final, pero por seguir la misma estructura
		// que en panelSpa y porque tiene sentido lo voy a poner aquí

		/* SEPARADOR */
		microControlador = new MicroControladorLayersPadreHijo(layeredPane, panelEmergenteContenedor);

		panelAlarma = new PanelHabitacionEmergenteAlarma(microControlador, controlador);
		panelEmergenteContenedor.add(panelAlarma, panelAlarma.getName());

		panelAyuda = new PanelHabitacionEmergenteAyuda(microControlador, controlador);
		panelEmergenteContenedor.add(panelAyuda, panelAyuda.getName());

		panelCalefaccion = new PanelHabitacionEmergenteCalefaccion(microControlador, controlador);
		panelEmergenteContenedor.add(panelCalefaccion, panelCalefaccion.getName());

		panelJacuzzi = new PanelHabitacionEmergenteJacuzzi(microControlador, controlador);
		panelEmergenteContenedor.add(panelJacuzzi, panelJacuzzi.getName());

		panelVentana = new PanelHabitacionEmergenteVentana(microControlador, controlador);
		panelEmergenteContenedor.add(panelVentana, panelVentana.getName());

		panelVentana2 = new PanelHabitacionEmergenteVentana2(microControlador, controlador);
		panelEmergenteContenedor.add(panelVentana2, panelVentana2.getName());
	}

	private void establecerVentanaServicio(String panel) {
		CardLayout l = (CardLayout) panelEmergenteContenedor.getLayout();
		l.show(panelEmergenteContenedor, panel);
	}

	private void mostrarVentanaEmergente() {
		layeredPane.setLayer(panelEmergenteContenedor, 3);
	}

	private void mostrarVentanaServicios() {
		layeredPane.setLayer(panelEmergenteContenedor, 0);
	}

	private void changeToVentanaEmergente(JPanel panel) {
		establecerVentanaServicio(panel.getName());
		mostrarVentanaEmergente();
	}
}
