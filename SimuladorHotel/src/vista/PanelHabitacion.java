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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelHabitacion extends JPanel {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */

	private int encendidas;

	public PanelHabitacion(Controlador controlador) {
		this.setSize(new Dimension(931, 483));
		this.setName("panelHabitacion");
		setLayout(null);
		encendidas = 0;

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 931, 483);
		add(layeredPane);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/habitacion.jpg")));
		lblNewLabel.setBounds(0, 0, 931, 483);
		layeredPane.add(lblNewLabel);

		// Luces
		JToggleButton tglbtnLuz = new JToggleButton("");
		JButton btnLuzTechoCentro = new JButton("");
		JButton btnLuzMesillaIzquierda = new JButton("");
		JButton btnLuzBanyo = new JButton("");
		JButton btnLuzMesillaDerecha = new JButton("");

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
							.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/luztechocentro.png")));
					controlador.getHabitacion().setLuzTechoHab(true);
					btnLuzMesillaIzquierda
							.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/luzmesilla.png")));
					controlador.getHabitacion().setLuzMesaIzq(true);
					btnLuzMesillaDerecha
							.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/luzmesilla.png")));
					controlador.getHabitacion().setLuzMesaDer(true);
					btnLuzBanyo.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/luzbanyo.png")));
					controlador.getHabitacion().setLuzTechoBan(true);
				}
			}
		});

		JButton btnCalefaccion = new JButton("");
		btnCalefaccion.setForeground(Color.WHITE);
		btnCalefaccion.setContentAreaFilled(false);
		layeredPane.setLayer(btnCalefaccion, 1);
		btnCalefaccion.setBounds(10, 305, 101, 69);
		layeredPane.add(btnCalefaccion);

		btnLuzTechoCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!controlador.getHabitacion().isLuzTechoHab()) {
					btnLuzTechoCentro
							.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/luztechocentro.png")));
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
		layeredPane.setLayer(btnLuzTechoCentro, 1);
		btnLuzTechoCentro.setForeground(Color.WHITE);
		btnLuzTechoCentro.setContentAreaFilled(false);
		btnLuzTechoCentro.setBounds(144, 11, 426, 156);
		layeredPane.add(btnLuzTechoCentro);

		btnLuzBanyo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!controlador.getHabitacion().isLuzTechoBan()) {
					btnLuzBanyo.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/luzbanyo.png")));
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

		layeredPane.setLayer(btnLuzBanyo, 1);
		btnLuzBanyo.setForeground(Color.WHITE);
		btnLuzBanyo.setContentAreaFilled(false);
		btnLuzBanyo.setBounds(609, 11, 284, 114);
		layeredPane.add(btnLuzBanyo);

		JButton btnVentana = new JButton("");
		btnVentana.setContentAreaFilled(false);
		layeredPane.setLayer(btnVentana, 1);
		btnVentana.setBounds(480, 185, 75, 90);
		layeredPane.add(btnVentana);

		btnLuzMesillaIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!controlador.getHabitacion().isLuzMesaIzq()) {
					btnLuzMesillaIzquierda
							.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/luzmesilla.png")));
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
		layeredPane.setLayer(btnLuzMesillaIzquierda, 1);
		btnLuzMesillaIzquierda.setForeground(Color.WHITE);
		btnLuzMesillaIzquierda.setContentAreaFilled(false);
		btnLuzMesillaIzquierda.setBounds(319, 255, 50, 50);
		layeredPane.add(btnLuzMesillaIzquierda);

		btnLuzMesillaDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!controlador.getHabitacion().isLuzMesaDer()) {
					btnLuzMesillaDerecha
							.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/luzmesilla.png")));
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

		layeredPane.setLayer(btnLuzMesillaDerecha, 1);
		btnLuzMesillaDerecha.setForeground(Color.WHITE);
		btnLuzMesillaDerecha.setContentAreaFilled(false);
		btnLuzMesillaDerecha.setBounds(421, 255, 50, 50);
		layeredPane.add(btnLuzMesillaDerecha);

		JButton btnJacuzzi = new JButton("");
		btnJacuzzi.setForeground(Color.WHITE);
		btnJacuzzi.setContentAreaFilled(false);
		layeredPane.setLayer(btnJacuzzi, 1);
		btnJacuzzi.setBounds(589, 294, 95, 80);
		layeredPane.add(btnJacuzzi);

		JButton btnVentanaGrande = new JButton("");
		btnVentanaGrande.setForeground(Color.WHITE);
		layeredPane.setLayer(btnVentanaGrande, 1);
		btnVentanaGrande.setContentAreaFilled(false);
		btnVentanaGrande.setBounds(111, 178, 120, 190);
		layeredPane.add(btnVentanaGrande);

		JToggleButton tglbtnPuerta = new JToggleButton("");
		tglbtnPuerta.setToolTipText("Abrir o cerrar la puerta principal.");
		tglbtnPuerta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO:
			}
		});
		tglbtnPuerta.setSelectedIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/puertaAbierta.png")));
		tglbtnPuerta.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/puertaCerrada.png")));
		layeredPane.setLayer(tglbtnPuerta, 1);
		tglbtnPuerta.setBounds(10, 403, 75, 69);
		tglbtnPuerta.setOpaque(false);
		tglbtnPuerta.setContentAreaFilled(false);
		layeredPane.add(tglbtnPuerta);

		JButton btnAlarma = new JButton("");
		btnAlarma.setToolTipText("Programar una alarma.");
		btnAlarma.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/alarm.png")));
		layeredPane.setLayer(btnAlarma, 1);
		btnAlarma.setBounds(174, 403, 89, 69);
		btnAlarma.setContentAreaFilled(false);
		layeredPane.add(btnAlarma);

		tglbtnLuz.setToolTipText("Encender o apagar todas las luces.");
		tglbtnLuz.setSelectedIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/lucesON.png")));
		tglbtnLuz.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/lucesOFF.png")));
		layeredPane.setLayer(tglbtnLuz, 1);
		tglbtnLuz.setOpaque(false);
		tglbtnLuz.setContentAreaFilled(false);
		tglbtnLuz.setBounds(91, 403, 75, 69);
		layeredPane.add(tglbtnLuz);

		JButton btnAyuda = new JButton("");
		btnAyuda.setToolTipText("<consejos>");
		btnAyuda.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/help.png")));
		layeredPane.setLayer(btnAyuda, 1);
		btnAyuda.setBounds(881, 0, 50, 50);
		btnAyuda.setOpaque(false);
		btnAyuda.setContentAreaFilled(false);
		layeredPane.add(btnAyuda);

		JButton btnTemperatura = new JButton("");
		btnTemperatura.setToolTipText("Ajustar la temperatura de la habitaci\u00F3n.");
		layeredPane.setLayer(btnTemperatura, 1);
		btnTemperatura.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/thermometer.png")));
		btnTemperatura.setBounds(10, 11, 97, 73);
		btnTemperatura.setContentAreaFilled(false);
		layeredPane.add(btnTemperatura);

		JLabel lblTemperatura = new JLabel("23\u00BA");
		lblTemperatura.setForeground(Color.WHITE);
		layeredPane.setLayer(lblTemperatura, 2);
		lblTemperatura.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTemperatura.setBounds(65, 33, 46, 27);
		layeredPane.add(lblTemperatura);

	}
}
