package vista;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import controlador.Controlador;
import controlador.MicroControladorLayersPadreHijo;
import idiomas.Texto;

import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.concurrent.Semaphore;
import javax.swing.JLayeredPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class PanelServicios extends JPanel {
	private static final long serialVersionUID = 1L;
	private MicroControladorLayersPadreHijo microControlador;
	private JPanel panelEmergenteContenedor;

	private JPanel panelToallas;
	private JPanel panelSabanas;
	private JPanel panelAlmohada;
	private JPanel panelMinibar;
	private JPanel panelTelefono;
	private JPanel panelBotones;
	private JPanel panelComida;
	private JPanel panelLimpieza;
	private JPanel panelWifi;
	private JPanel panelTaxi;
	private JPanel panelTelevision;
	private JPanel panelInformacion;
	
	private Texto t;

	private Semaphore s;
	private JLayeredPane layeredPane;
	private JPanel panelPrincipalAux;

	public PanelServicios(Controlador controlador) {
		s = new Semaphore(0);
		t = controlador.getTexto();
		this.setSize(new Dimension(931, 483));
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 931, 483);
		add(layeredPane);

		JPanel panelPrincipal = new JPanel();
		layeredPane.setLayer(panelPrincipal, 1);
		panelPrincipal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mostrarVentanaServicios();
			}
		});
		panelPrincipal.setBounds(0, 0, 931, 483);
		layeredPane.add(panelPrincipal);
		panelPrincipal.setName("panelServicios");
		panelPrincipal.setLayout(null);

		JButton btnCambioToalla = new JButton(t.getPanelServiciosBtnCambioToalla());
		btnCambioToalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteToallas) panelToallas).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelToallas);
			}
		});
		btnCambioToalla.setBounds(10, 11, 220, 146);
		btnCambioToalla.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/towel.png")));
		btnCambioToalla.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambioToalla.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambioToalla.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrincipal.add(btnCambioToalla);

		JButton btnCambiarSabanas = new JButton(t.getPanelServiciosBtnCambiarSabanas());
		btnCambiarSabanas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteSabanas) panelSabanas).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelSabanas);
			}
		});
		btnCambiarSabanas.setBounds(240, 11, 220, 146);
		btnCambiarSabanas.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/cambioropacama.png")));
		btnCambiarSabanas.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambiarSabanas.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambiarSabanas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrincipal.add(btnCambiarSabanas);

		JButton btnCambioAlmohada = new JButton(t.getPanelServiciosBtnCambioAlmohada());
		btnCambioAlmohada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteAlmohada) panelAlmohada).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelAlmohada);
			}
		});
		btnCambioAlmohada.setBounds(471, 11, 220, 146);
		btnCambioAlmohada.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/almohada.png")));
		btnCambioAlmohada.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambioAlmohada.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambioAlmohada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrincipal.add(btnCambioAlmohada);

		JButton btnMiniBar = new JButton(t.getPanelServiciosBtnMinibar());
		btnMiniBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteMinibar) panelMinibar).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelMinibar);
			}
		});
		btnMiniBar.setBounds(701, 11, 220, 146);
		btnMiniBar.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/minibarnew.png")));
		btnMiniBar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMiniBar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnMiniBar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrincipal.add(btnMiniBar);

		JButton btnTelefono = new JButton(t.getPanelServiciosBtnTelefono());
		btnTelefono.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteTelefono) panelTelefono).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelTelefono);
			}
		});
		btnTelefono.setBounds(10, 168, 220, 146);
		btnTelefono.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/phone.png")));
		btnTelefono.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelefono.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrincipal.add(btnTelefono);

		JButton btnBotones = new JButton(t.getPanelServiciosBtnBotones());
		btnBotones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteBotones) panelBotones).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelBotones);
			}
		});
		btnBotones.setBounds(240, 168, 220, 146);
		btnBotones.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/botones.png")));
		btnBotones.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBotones.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnBotones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrincipal.add(btnBotones);

		JButton btnComidaHab = new JButton(t.getPanelServiciosBtnComidaHab());
		btnComidaHab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteComida) panelComida).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelComida);
			}
		});
		btnComidaHab.setBounds(471, 168, 220, 146);
		btnComidaHab.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/comidahab.png")));
		btnComidaHab.setHorizontalTextPosition(SwingConstants.CENTER);
		btnComidaHab.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnComidaHab.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrincipal.add(btnComidaHab);

		JButton btnHorarioLimpieza = new JButton(t.getPanelServiciosBtnHorarioLimpieza());
		btnHorarioLimpieza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteLimpieza) panelLimpieza).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelLimpieza);
			}
		});
		btnHorarioLimpieza.setBounds(701, 168, 220, 146);
		btnHorarioLimpieza.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/horariolimpieza.png")));
		btnHorarioLimpieza.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHorarioLimpieza.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnHorarioLimpieza.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrincipal.add(btnHorarioLimpieza);

		JButton btnWifi = new JButton(t.getPanelServiciosBtnWifi());
		btnWifi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteWifi) panelWifi).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelWifi);
			}
		});
		btnWifi.setBounds(10, 325, 220, 146);
		btnWifi.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/wifi.png")));
		btnWifi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnWifi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnWifi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrincipal.add(btnWifi);

		JButton btnPedirTaxi = new JButton(t.getPanelServiciosBtnPedirTaxi());
		btnPedirTaxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteTaxi) panelTaxi).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelTaxi);
			}
		});
		btnPedirTaxi.setBounds(240, 325, 220, 146);
		btnPedirTaxi.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/taxi.png")));
		btnPedirTaxi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPedirTaxi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPedirTaxi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrincipal.add(btnPedirTaxi);

		JButton btnTelevision = new JButton(t.getPanelServiciosBtnTelevision());
		btnTelevision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteTelevision) panelTelevision).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelTelevision);
			}
		});
		btnTelevision.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/television.png")));
		btnTelevision.setBounds(471, 325, 220, 146);
		btnTelevision.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelevision.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTelevision.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrincipal.add(btnTelevision);

		JButton btnInformacion = new JButton(t.getPanelServiciosBtnInformacion());
		btnInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteInformacion) panelInformacion).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelInformacion);
			}
		});
		btnInformacion.setBounds(701, 325, 220, 146);
		btnInformacion.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/info.png")));
		btnInformacion.setHorizontalTextPosition(SwingConstants.CENTER);
		btnInformacion.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnInformacion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrincipal.add(btnInformacion);

		panelEmergenteContenedor = new JPanel();
		panelEmergenteContenedor.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "layeredContainerLayer") {
					layeredPane.setLayer(panelPrincipalAux, 0);
					
					if (evt.getNewValue().equals(0)) {
						btnBotones.setEnabled(true);
						btnCambiarSabanas.setEnabled(true);
						btnCambioAlmohada.setEnabled(true);
						btnCambioToalla.setEnabled(true);
						btnComidaHab.setEnabled(true);
						btnHorarioLimpieza.setEnabled(true);
						btnInformacion.setEnabled(true);
						btnMiniBar.setEnabled(true);
						btnPedirTaxi.setEnabled(true);
						btnTelefono.setEnabled(true);
						btnTelevision.setEnabled(true);
						btnWifi.setEnabled(true);
					} else if (evt.getNewValue().equals(3)) {
						btnBotones.setEnabled(false);
						btnCambiarSabanas.setEnabled(false);
						btnCambioAlmohada.setEnabled(false);
						btnCambioToalla.setEnabled(false);
						btnComidaHab.setEnabled(false);
						btnHorarioLimpieza.setEnabled(false);
						btnInformacion.setEnabled(false);
						btnMiniBar.setEnabled(false);
						btnPedirTaxi.setEnabled(false);
						btnTelefono.setEnabled(false);
						btnTelevision.setEnabled(false);
						btnWifi.setEnabled(false);
					}
				}
			}
		});
		panelEmergenteContenedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// No borrar
			}
		});
		panelEmergenteContenedor.setBounds(118, 84, 695, 315);
		layeredPane.add(panelEmergenteContenedor);
		panelEmergenteContenedor.setLayout(new CardLayout(0, 0));
		
		/* SEPARADOR */
		microControlador = new MicroControladorLayersPadreHijo(layeredPane, panelEmergenteContenedor);
		
		panelToallas = new PanelServiciosEmergenteToallas(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelToallas, panelToallas.getName());

		panelSabanas = new PanelServiciosEmergenteSabanas(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelSabanas, panelSabanas.getName());

		panelAlmohada = new PanelServiciosEmergenteAlmohada(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelAlmohada, panelAlmohada.getName());

		panelMinibar = new PanelServiciosEmergenteMinibar(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelMinibar, panelMinibar.getName());

		panelTelefono = new PanelServiciosEmergenteTelefono(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelTelefono, panelTelefono.getName());

		panelBotones = new PanelServiciosEmergenteBotones(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelBotones, panelBotones.getName());

		panelComida = new PanelServiciosEmergenteComida(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelComida, panelComida.getName());

		panelLimpieza = new PanelServiciosEmergenteLimpieza(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelLimpieza, panelLimpieza.getName());

		panelWifi = new PanelServiciosEmergenteWifi(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelWifi, panelWifi.getName());

		panelTaxi = new PanelServiciosEmergenteTaxi(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelTaxi, panelTaxi.getName());

		panelTelevision = new PanelServiciosEmergenteTelevision(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelTelevision, panelTelevision.getName());

		panelInformacion = new PanelServiciosEmergenteInformacion(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelInformacion, panelInformacion.getName());
		
		panelPrincipalAux = new JPanel();
		panelPrincipalAux.setEnabled(false);
		panelPrincipalAux.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mostrarVentanaServicios();
			}
		});
		panelPrincipalAux.setOpaque(false);
		layeredPane.setLayer(panelPrincipalAux, 0);
		panelPrincipalAux.setBounds(0, 0, 931, 483);
		layeredPane.add(panelPrincipalAux);
		panelPrincipalAux.setLayout(null);
	}

	private void establecerVentanaServicio(String panel) {
		CardLayout l = (CardLayout) panelEmergenteContenedor.getLayout();
		l.show(panelEmergenteContenedor, panel);
	}

	private void mostrarVentanaEmergente() {
		layeredPane.setLayer(panelEmergenteContenedor, 3);
		layeredPane.setLayer(panelPrincipalAux, 2);
	}

	private void mostrarVentanaServicios() {
		layeredPane.setLayer(panelEmergenteContenedor, 0);
		layeredPane.setLayer(panelPrincipalAux, 0);
	}

	private void changeToVentanaEmergente(JPanel panel) {
		establecerVentanaServicio(panel.getName());
		mostrarVentanaEmergente();
	}
}
