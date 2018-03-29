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

		// TODO: Completar los botones con los servicios restantes
		JButton button_6 = new JButton("New button");

		JButton button_7 = new JButton("New button");

		JButton button_8 = new JButton("New button");

		JButton button_9 = new JButton("New button");

		JButton button_10 = new JButton("New button");

		JButton button_11 = new JButton("New button");

		JButton button_12 = new JButton("New button");

		// TODO: POsibilidad de adquirir un servicio especial
		JButton button_13 = new JButton("New button");

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
								.addComponent(btnHorarioLimpieza, GroupLayout.PREFERRED_SIZE, 143,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBotones, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCambioAlmohada, GroupLayout.PREFERRED_SIZE, 143,
										GroupLayout.PREFERRED_SIZE))
						.addGap(49)
						.addGroup(gl_panelServicios.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCambiarSabanas, GroupLayout.PREFERRED_SIZE, 143,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
						.addGap(53)
						.addGroup(gl_panelServicios.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelServicios.createSequentialGroup()
										.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 143,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE).addComponent(
												button_13, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelServicios.createSequentialGroup()
										.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 143,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE).addComponent(
												button_12, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelServicios.createSequentialGroup()
										.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 143,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
										.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 143,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		gl_panelServicios.setVerticalGroup(gl_panelServicios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelServicios.createSequentialGroup().addContainerGap().addGroup(gl_panelServicios
						.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCambioToalla, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnHorarioLimpieza, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCambiarSabanas, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
						.addGap(38)
						.addGroup(gl_panelServicios.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelServicios.createSequentialGroup()
										.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE).addComponent(
												button_13, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelServicios.createSequentialGroup()
										.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE).addComponent(
												button_10, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelServicios.createSequentialGroup()
										.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE).addComponent(
												button_7, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelServicios.createSequentialGroup()
										.addComponent(btnTelefono, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
										.addComponent(btnMiniBar, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelServicios.createSequentialGroup()
										.addComponent(btnBotones, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
										.addComponent(btnCambioAlmohada, GroupLayout.PREFERRED_SIZE, 126,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		this.setLayout(gl_panelServicios);
	}
}
