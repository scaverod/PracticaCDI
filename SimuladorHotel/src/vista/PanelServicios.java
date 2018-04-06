package vista;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import modelo.Texto;
import modelo.TextoManager;

import javax.swing.ImageIcon;

public class PanelServicios extends JPanel {
	private static final long serialVersionUID = 1L;
	
	// FIXME: temporal para que salga el texto en vez de "<dynamic>"
	// Habría que mandarlo desde el Main, por ejemplo
	private Texto t = new TextoManager(TextoManager.english).getTexto();

	public PanelServicios() {
		this.setSize(new Dimension(931, 483));
		this.setName("panelServicios");

		JButton btnMiniBar = new JButton(t.getPanelServiciosBtnMinibar());
		btnMiniBar.setBounds(701, 11, 220, 146);
		btnMiniBar.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/minibarnew.png")));
		btnMiniBar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMiniBar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnMiniBar.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnCambioToalla = new JButton(t.getPanelServiciosBtnCambioToalla());
		btnCambioToalla.setBounds(10, 11, 220, 146);
		btnCambioToalla.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/towel.png")));
		btnCambioToalla.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambioToalla.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambioToalla.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnTelefono = new JButton(t.getPanelServiciosBtnTelefono());
		btnTelefono.setBounds(10, 168, 220, 146);
		btnTelefono.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/phone.png")));
		btnTelefono.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelefono.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnHorarioLimpieza = new JButton(t.getPanelServiciosBtnHorarioLimpieza());
		btnHorarioLimpieza.setBounds(701, 168, 220, 146);
		btnHorarioLimpieza.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/horariolimpieza.png")));
		btnHorarioLimpieza.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHorarioLimpieza.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnHorarioLimpieza.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnBotones = new JButton(t.getPanelServiciosBtnBotones());
		btnBotones.setBounds(240, 168, 220, 146);
		btnBotones.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/botones.png")));
		btnBotones.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBotones.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnBotones.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnCambioAlmohada = new JButton(t.getPanelServiciosBtnCambioAlmohada());
		btnCambioAlmohada.setBounds(471, 11, 220, 146);
		btnCambioAlmohada.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/almohada.png")));
		btnCambioAlmohada.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambioAlmohada.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambioAlmohada.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnCambiarSabanas = new JButton(t.getPanelServiciosBtnCambiarSabanas());
		btnCambiarSabanas.setBounds(240, 11, 220, 146);
		btnCambiarSabanas.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/cambioropacama.png")));
		btnCambiarSabanas.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambiarSabanas.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambiarSabanas.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnComidaHab = new JButton(t.getPanelServiciosBtnComidaHab());
		btnComidaHab.setBounds(471, 168, 220, 146);
		btnComidaHab.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/comidahab.png")));
		btnComidaHab.setHorizontalTextPosition(SwingConstants.CENTER);
		btnComidaHab.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnComidaHab.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnPedirTaxi = new JButton(t.getPanelServiciosBtnPedirTaxi());
		btnPedirTaxi.setBounds(240, 325, 220, 146);
		btnPedirTaxi.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/taxi.png")));
		btnPedirTaxi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPedirTaxi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPedirTaxi.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnTelevision = new JButton(t.getPanelServiciosBtnTelevision());
		btnTelevision.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/television.png")));
		btnTelevision.setBounds(471, 325, 220, 146);
		btnTelevision.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelevision.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTelevision.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnWifi = new JButton(t.getPanelServiciosBtnWifi());
		btnWifi.setBounds(10, 325, 220, 146);
		btnWifi.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/wifi.png")));
		btnWifi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnWifi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnWifi.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnInformacion = new JButton(t.getPanelServiciosBtnInformacion());
		btnInformacion.setBounds(701, 325, 220, 146);
		btnInformacion.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/info.png")));
		btnInformacion.setHorizontalTextPosition(SwingConstants.CENTER);
		btnInformacion.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPedirTaxi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		// NOTA: he usado absolute layout porque viene bien para este caso y el group layout se rompe cada vez que tienes que mover algo cuando hay tantas cosas
		setLayout(null);
		add(btnComidaHab);
		add(btnTelevision);
		add(btnTelefono);
		add(btnBotones);
		add(btnHorarioLimpieza);
		add(btnPedirTaxi);
		add(btnInformacion);
		add(btnWifi);
		add(btnCambioToalla);
		add(btnCambioAlmohada);
		add(btnCambiarSabanas);
		add(btnMiniBar);
	}
}
