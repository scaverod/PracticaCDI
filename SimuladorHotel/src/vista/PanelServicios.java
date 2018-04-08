package vista;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import controlador.MicroControladorPanelesPadreHijo;
import modelo.Texto;
import modelo.TextoManager;

import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PanelServicios extends JPanel {
	private static final long serialVersionUID = 1L;

	// FIXME: temporal para que salga el texto en vez de "<dynamic>"
	// Habría que mandarlo desde el Main, por ejemplo
	private Texto t = new TextoManager(TextoManager.english).getTexto();
	private JPanel panelServicios;
	private JPanel panelEmergente;
	private JPanel panelServicio;
	private JPanel panelToallas;
	private MicroControladorPanelesPadreHijo microControlador;

	public PanelServicios() {
		this.setSize(new Dimension(931, 483));
		this.setName("panelServicios");
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
		btnCambiarSabanas.setBounds(240, 11, 220, 146);
		btnCambiarSabanas.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/cambioropacama.png")));
		btnCambiarSabanas.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambiarSabanas.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambiarSabanas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnCambiarSabanas);

		JButton btnCambioAlmohada = new JButton(t.getPanelServiciosBtnCambioAlmohada());
		btnCambioAlmohada.setBounds(471, 11, 220, 146);
		btnCambioAlmohada.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/almohada.png")));
		btnCambioAlmohada.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambioAlmohada.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambioAlmohada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnCambioAlmohada);

		JButton btnMiniBar = new JButton(t.getPanelServiciosBtnMinibar());
		btnMiniBar.setBounds(701, 11, 220, 146);
		btnMiniBar.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/minibarnew.png")));
		btnMiniBar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMiniBar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnMiniBar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnMiniBar);

		JButton btnTelefono = new JButton(t.getPanelServiciosBtnTelefono());
		btnTelefono.setBounds(10, 168, 220, 146);
		btnTelefono.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/phone.png")));
		btnTelefono.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelefono.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnTelefono);

		JButton btnBotones = new JButton(t.getPanelServiciosBtnBotones());
		btnBotones.setBounds(240, 168, 220, 146);
		btnBotones.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/botones.png")));
		btnBotones.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBotones.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnBotones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnBotones);

		JButton btnComidaHab = new JButton(t.getPanelServiciosBtnComidaHab());
		btnComidaHab.setBounds(471, 168, 220, 146);
		btnComidaHab.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/comidahab.png")));
		btnComidaHab.setHorizontalTextPosition(SwingConstants.CENTER);
		btnComidaHab.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnComidaHab.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnComidaHab);

		JButton btnHorarioLimpieza = new JButton(t.getPanelServiciosBtnHorarioLimpieza());
		btnHorarioLimpieza.setBounds(701, 168, 220, 146);
		btnHorarioLimpieza.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/horariolimpieza.png")));
		btnHorarioLimpieza.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHorarioLimpieza.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnHorarioLimpieza.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnHorarioLimpieza);

		JButton btnWifi = new JButton(t.getPanelServiciosBtnWifi());
		btnWifi.setBounds(10, 325, 220, 146);
		btnWifi.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/wifi.png")));
		btnWifi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnWifi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnWifi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnWifi);

		JButton btnPedirTaxi = new JButton(t.getPanelServiciosBtnPedirTaxi());
		btnPedirTaxi.setBounds(240, 325, 220, 146);
		btnPedirTaxi.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/taxi.png")));
		btnPedirTaxi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPedirTaxi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPedirTaxi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnPedirTaxi);

		JButton btnTelevision = new JButton(t.getPanelServiciosBtnTelevision());
		btnTelevision.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/television.png")));
		btnTelevision.setBounds(471, 325, 220, 146);
		btnTelevision.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelevision.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTelevision.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnTelevision);

		JButton btnInformacion = new JButton(t.getPanelServiciosBtnInformacion());
		btnInformacion.setBounds(701, 325, 220, 146);
		btnInformacion.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/info.png")));
		btnInformacion.setHorizontalTextPosition(SwingConstants.CENTER);
		btnInformacion.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnInformacion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelServicios.add(btnInformacion);

		panelEmergente = new JPanel();
		panelEmergente.setName("panelEmergente");
		add(panelEmergente, "panelEmergente");
		panelEmergente.setLayout(null);
		
		panelServicio = new JPanel();
		panelServicio.setBounds(118, 84, 695, 315);
		panelEmergente.add(panelServicio);
		panelServicio.setLayout(new CardLayout(0, 0));
		
		/* SEPARADOR */
		microControlador = new MicroControladorPanelesPadreHijo(this);
		panelToallas = new PanelServiciosEmergenteToallas(microControlador);
		panelServicio.add(panelToallas, panelToallas.getName());
		
		JPanel panel_1 = new JPanel();
		panelServicio.add(panel_1, "name_51395040164721");
		
		JPanel panel_2 = new JPanel();
		panelServicio.add(panel_2, "name_51396525379081");
		
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
	
	void mostrarVentanaServicios() {
		CardLayout l = (CardLayout) this.getLayout();
		l.show(this, panelServicios.getName());
	}
}
