package vista;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import controlador.Controlador;
import controlador.MicroControladorPanelesPadreHijo;
import idiomas.Texto;
import idiomas.TextoManager;

import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelServicios extends JPanel {
	private static final long serialVersionUID = 1L;

	// FIXME: temporal para que salga el texto en vez de "<dynamic>"
	// Habría que mandarlo desde el Main, por ejemplo
	private Texto t = new TextoManager(TextoManager.english).getTexto();
	private MicroControladorPanelesPadreHijo microControlador;
	
	private JPanel panelServicios;
	private JPanel panelEmergente;
	private JPanel panelServicio;
	
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

	public PanelServicios(Controlador controlador) {
		this.setSize(new Dimension(931, 483));
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(new CardLayout(0, 0));

		panelServicios = new JPanel();
		panelServicios.setName("panelServicios"); // FIXME: mismo nombre para JPanel y PanelServicios!
		this.add(panelServicios, "panelServicios");
		panelServicios.setLayout(null);

		JButton btnCambioToalla = new JButton(t.getPanelServiciosBtnCambioToalla());
		btnCambioToalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				establecerVentanaServicio(panelToallas.getName());
				mostrarVentanaEmergente();
			}
		});
		btnCambioToalla.setBounds(10, 11, 220, 146);
		btnCambioToalla.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/towel.png")));
		btnCambioToalla.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambioToalla.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambioToalla.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnCambioToalla);

		JButton btnCambiarSabanas = new JButton(t.getPanelServiciosBtnCambiarSabanas());
		btnCambiarSabanas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				establecerVentanaServicio(panelSabanas.getName());
				mostrarVentanaEmergente();
			}
		});
		btnCambiarSabanas.setBounds(240, 11, 220, 146);
		btnCambiarSabanas.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/cambioropacama.png")));
		btnCambiarSabanas.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambiarSabanas.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambiarSabanas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnCambiarSabanas);

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
		panelServicios.add(btnCambioAlmohada);

		JButton btnMiniBar = new JButton(t.getPanelServiciosBtnMinibar());
		btnMiniBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteAlmohada) panelMinibar).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelMinibar);
			}
		});
		btnMiniBar.setBounds(701, 11, 220, 146);
		btnMiniBar.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/minibarnew.png")));
		btnMiniBar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMiniBar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnMiniBar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnMiniBar);

		JButton btnTelefono = new JButton(t.getPanelServiciosBtnTelefono());
		btnTelefono.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteAlmohada) panelTelefono).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelTelefono);
			}
		});
		btnTelefono.setBounds(10, 168, 220, 146);
		btnTelefono.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/phone.png")));
		btnTelefono.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelefono.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnTelefono);

		JButton btnBotones = new JButton(t.getPanelServiciosBtnBotones());
		btnBotones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteAlmohada) panelBotones).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelBotones);
			}
		});
		btnBotones.setBounds(240, 168, 220, 146);
		btnBotones.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/botones.png")));
		btnBotones.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBotones.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnBotones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnBotones);

		JButton btnComidaHab = new JButton(t.getPanelServiciosBtnComidaHab());
		btnComidaHab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteAlmohada) panelComida).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelComida);
			}
		});
		btnComidaHab.setBounds(471, 168, 220, 146);
		btnComidaHab.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/comidahab.png")));
		btnComidaHab.setHorizontalTextPosition(SwingConstants.CENTER);
		btnComidaHab.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnComidaHab.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnComidaHab);

		JButton btnHorarioLimpieza = new JButton(t.getPanelServiciosBtnHorarioLimpieza());
		btnHorarioLimpieza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((PanelServiciosEmergenteAlmohada) panelLimpieza).cerrarPanelConfirmacion();
				changeToVentanaEmergente(panelLimpieza);
			}
		});
		btnHorarioLimpieza.setBounds(701, 168, 220, 146);
		btnHorarioLimpieza.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/horariolimpieza.png")));
		btnHorarioLimpieza.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHorarioLimpieza.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnHorarioLimpieza.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnHorarioLimpieza);

		JButton btnWifi = new JButton(t.getPanelServiciosBtnWifi());
		btnWifi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				establecerVentanaServicio(panelWifi.getName());
				mostrarVentanaEmergente();
			}
		});
		btnWifi.setBounds(10, 325, 220, 146);
		btnWifi.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/wifi.png")));
		btnWifi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnWifi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnWifi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnWifi);

		JButton btnPedirTaxi = new JButton(t.getPanelServiciosBtnPedirTaxi());
		btnPedirTaxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				establecerVentanaServicio(panelTaxi.getName());
				mostrarVentanaEmergente();
			}
		});
		btnPedirTaxi.setBounds(240, 325, 220, 146);
		btnPedirTaxi.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/taxi.png")));
		btnPedirTaxi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPedirTaxi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPedirTaxi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnPedirTaxi);

		JButton btnTelevision = new JButton(t.getPanelServiciosBtnTelevision());
		btnTelevision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				establecerVentanaServicio(panelTelevision.getName());
				mostrarVentanaEmergente();
			}
		});
		btnTelevision.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/television.png")));
		btnTelevision.setBounds(471, 325, 220, 146);
		btnTelevision.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelevision.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTelevision.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnTelevision);

		JButton btnInformacion = new JButton(t.getPanelServiciosBtnInformacion());
		btnInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				establecerVentanaServicio(panelInformacion.getName());
				mostrarVentanaEmergente();
			}
		});
		btnInformacion.setBounds(701, 325, 220, 146);
		btnInformacion.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/info.png")));
		btnInformacion.setHorizontalTextPosition(SwingConstants.CENTER);
		btnInformacion.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnInformacion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnInformacion);

		panelEmergente = new JPanel();
		panelEmergente.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (!((e.getX() >= panelServicio.getX())
						&& (e.getX() <= (panelServicio.getX() + panelServicio.getWidth()))
						&& (e.getY() >= panelServicio.getY())
						&& (e.getY() <= (panelServicio.getY() + panelServicio.getHeight())))) {
					mostrarVentanaServicios();
				}
			}
		});
		panelEmergente.setName("panelEmergente");
		add(panelEmergente, "panelEmergente");
		panelEmergente.setLayout(null);
		
		panelServicio = new JPanel();
		panelServicio.setBounds(118, 84, 695, 315);
		panelEmergente.add(panelServicio);
		panelServicio.setLayout(new CardLayout(0, 0));
		
		/* SEPARADOR */
		microControlador = new MicroControladorPanelesPadreHijo(this);
		
		panelToallas = new PanelServiciosEmergenteToallas(microControlador, this.getName(), controlador);
		panelServicio.add(panelToallas, panelToallas.getName());
		
		panelSabanas = new PanelServiciosEmergenteSabanas(microControlador, this.getName(), controlador);
		panelServicio.add(panelSabanas, panelSabanas.getName());
		
		panelAlmohada = new PanelServiciosEmergenteAlmohada(microControlador, this.getName(), controlador);
		panelServicio.add(panelAlmohada, panelAlmohada.getName());
		
		panelMinibar = new PanelServiciosEmergenteMinibar(microControlador, this.getName(), controlador);
		panelServicio.add(panelMinibar, panelMinibar.getName());
		
		panelTelefono = new PanelServiciosEmergenteTelefono(microControlador, this.getName(), controlador);
		panelServicio.add(panelTelefono, panelTelefono.getName());
		
		panelBotones = new PanelServiciosEmergenteBotones(microControlador, this.getName(), controlador);
		panelServicio.add(panelBotones, panelBotones.getName());
		
		panelComida = new PanelServiciosEmergenteComida(microControlador, this.getName(), controlador);
		panelServicio.add(panelComida, panelComida.getName());
		
		panelLimpieza = new PanelServiciosEmergenteLimpieza(microControlador, this.getName(), controlador);
		panelServicio.add(panelLimpieza, panelLimpieza.getName());
		
		panelWifi = new PanelServiciosEmergenteWifi(microControlador, this.getName(), controlador);
		panelServicio.add(panelWifi, panelWifi.getName());
		
		panelTaxi = new PanelServiciosEmergenteTaxi(microControlador, this.getName(), controlador);
		panelServicio.add(panelTaxi, panelTaxi.getName());
		
		panelTelevision = new PanelServiciosEmergenteTelevision(microControlador, this.getName(), controlador);
		panelServicio.add(panelTelevision, panelTelevision.getName());
		
		panelInformacion = new PanelServiciosEmergenteInformacion(microControlador, this.getName(), controlador);
		panelServicio.add(panelInformacion, panelInformacion.getName());
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/imagenPanelServiciosFondoEditada.jpg")));
		lblFondo.setBounds(0, 0, 931, 483);
		panelEmergente.add(lblFondo);
	}
	
	private void establecerVentanaServicio(String panel) {
		CardLayout l = (CardLayout) panelServicio.getLayout();
		l.show(panelServicio, panel);
	}
	
	private void mostrarVentanaEmergente() {
		CardLayout l = (CardLayout) this.getLayout();
		l.show(this, panelEmergente.getName());
	}
	
	private void mostrarVentanaServicios() {
		CardLayout l = (CardLayout) this.getLayout();
		l.show(this, panelServicios.getName());
	}
	
	private void changeToVentanaEmergente(JPanel panel) {
		establecerVentanaServicio(panel.getName());
		mostrarVentanaEmergente();
	}
}
