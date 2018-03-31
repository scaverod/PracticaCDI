package vista;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class PanelServicios extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelServicios() {
		this.setSize(new Dimension(931, 483));
		this.setName("panelServicios");

		JButton btnMiniBar = new JButton("Reponer Minibar");
		btnMiniBar.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/minibarnew.png")));
		btnMiniBar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMiniBar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnMiniBar.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnCambioToalla = new JButton("Cambiar Toallas");
		btnCambioToalla.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/towel.png")));
		btnCambioToalla.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambioToalla.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambioToalla.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnTelefono = new JButton("Realizar Llamada");
		btnTelefono.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/phone.png")));
		btnTelefono.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelefono.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnHorarioLimpieza = new JButton("Hora Limpieza");
		btnHorarioLimpieza.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/horariolimpieza.png")));
		btnHorarioLimpieza.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHorarioLimpieza.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnHorarioLimpieza.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnBotones = new JButton("Llamar al Botones");
		btnBotones.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/botones.png")));
		btnBotones.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBotones.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnBotones.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnCambioAlmohada = new JButton("Cambiar Almohada");
		btnCambioAlmohada.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/almohada.png")));
		btnCambioAlmohada.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambioAlmohada.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambioAlmohada.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnCambiarSabanas = new JButton("Cambiar Sabanas");
		btnCambiarSabanas.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/cambioropacama.png")));
		btnCambiarSabanas.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCambiarSabanas.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCambiarSabanas.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnComidaHab = new JButton("Solicitar Comida");
		btnComidaHab.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/comidahab.png")));
		btnComidaHab.setHorizontalTextPosition(SwingConstants.CENTER);
		btnComidaHab.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnComidaHab.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnPedirTaxi = new JButton("Pedir Taxi");
		btnPedirTaxi.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/taxi.png")));
		btnPedirTaxi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPedirTaxi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPedirTaxi.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton button_9 = new JButton("New button");

		JButton btnWifi = new JButton("Activar Wifi");
		btnWifi.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/wifi.png")));
		btnWifi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnWifi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnWifi.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton button_11 = new JButton("New button");

		JButton button_12 = new JButton("New button");

		JButton btnInformacion = new JButton("Solicitar Informaci\u00F3n");
		btnInformacion.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/info.png")));
		btnInformacion.setHorizontalTextPosition(SwingConstants.CENTER);
		btnInformacion.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPedirTaxi.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton button = new JButton("New button");

		GroupLayout gl_panelServicios = new GroupLayout(this);
		gl_panelServicios.setHorizontalGroup(gl_panelServicios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelServicios.createSequentialGroup().addContainerGap()
						.addGroup(gl_panelServicios.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCambioToalla, GroupLayout.PREFERRED_SIZE, 143,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTelefono, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnMiniBar, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
						.addGap(43)
						.addGroup(gl_panelServicios.createParallelGroup(Alignment.LEADING)
								.addComponent(btnBotones, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnHorarioLimpieza, GroupLayout.PREFERRED_SIZE, 143,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCambioAlmohada, GroupLayout.PREFERRED_SIZE, 143,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
						.addGroup(gl_panelServicios.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnComidaHab, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPedirTaxi, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCambiarSabanas, GroupLayout.PREFERRED_SIZE, 143,
										GroupLayout.PREFERRED_SIZE))
						.addGap(46)
						.addGroup(gl_panelServicios.createParallelGroup(Alignment.TRAILING)
								.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnWifi, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
						.addGap(49)
						.addGroup(gl_panelServicios.createParallelGroup(Alignment.TRAILING)
								.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnInformacion, GroupLayout.PREFERRED_SIZE, 143,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		gl_panelServicios.setVerticalGroup(gl_panelServicios.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelServicios.createSequentialGroup().addContainerGap()
						.addGroup(gl_panelServicios.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelServicios.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnCambioToalla, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnCambioAlmohada, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnCambiarSabanas, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
						.addGap(38)
						.addGroup(gl_panelServicios.createParallelGroup(Alignment.LEADING).addGroup(gl_panelServicios
								.createSequentialGroup()
								.addGroup(gl_panelServicios.createParallelGroup(Alignment.BASELINE)
										.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
								.addGroup(gl_panelServicios.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnInformacion, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnWifi, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panelServicios.createSequentialGroup()
										.addComponent(btnTelefono, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
										.addGroup(gl_panelServicios.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnMiniBar, GroupLayout.PREFERRED_SIZE, 126,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btnHorarioLimpieza, GroupLayout.PREFERRED_SIZE, 126,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btnPedirTaxi, GroupLayout.PREFERRED_SIZE, 126,
														GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panelServicios.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnBotones, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnComidaHab, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		this.setLayout(gl_panelServicios);
	}
}
