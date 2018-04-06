package vista;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JToggleButton;
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
	public PanelHabitacion() {
		this.setSize(new Dimension(931, 483));
		this.setName("panelHabitacion");
		setLayout(null);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 931, 483);
		add(layeredPane);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PanelHabitacion.class.getResource("/iconos/fotoHabitacion.jpg")));
		lblNewLabel.setBounds(0, 0, 931, 483);
		layeredPane.add(lblNewLabel);

		JButton btnCalefaccion = new JButton("Calefacci\u00F3n");
		btnCalefaccion.setForeground(Color.WHITE);
		btnCalefaccion.setContentAreaFilled(false);
		layeredPane.setLayer(btnCalefaccion, 1);
		btnCalefaccion.setBounds(10, 305, 101, 69);
		layeredPane.add(btnCalefaccion);

		JButton btnLuzTechoFondoIzquierda = new JButton("luz");
		btnLuzTechoFondoIzquierda.setForeground(Color.WHITE);
		btnLuzTechoFondoIzquierda.setContentAreaFilled(false);
		layeredPane.setLayer(btnLuzTechoFondoIzquierda, 1);
		btnLuzTechoFondoIzquierda.setBounds(250, 135, 50, 50);
		layeredPane.add(btnLuzTechoFondoIzquierda);

		JButton btnLuzTechoCentro = new JButton("luz");
		layeredPane.setLayer(btnLuzTechoCentro, 1);
		btnLuzTechoCentro.setForeground(Color.WHITE);
		btnLuzTechoCentro.setContentAreaFilled(false);
		btnLuzTechoCentro.setBounds(309, 115, 50, 50);
		layeredPane.add(btnLuzTechoCentro);

		JButton btnLuzTechoFrenteIzquierda = new JButton("luz");
		layeredPane.setLayer(btnLuzTechoFrenteIzquierda, 1);
		btnLuzTechoFrenteIzquierda.setForeground(Color.WHITE);
		btnLuzTechoFrenteIzquierda.setContentAreaFilled(false);
		btnLuzTechoFrenteIzquierda.setBounds(130, 100, 50, 50);
		layeredPane.add(btnLuzTechoFrenteIzquierda);

		JButton btnLuzTechoFrenteDerecha = new JButton("luz");
		layeredPane.setLayer(btnLuzTechoFrenteDerecha, 1);
		btnLuzTechoFrenteDerecha.setForeground(Color.WHITE);
		btnLuzTechoFrenteDerecha.setContentAreaFilled(false);
		btnLuzTechoFrenteDerecha.setBounds(460, 70, 50, 50);
		layeredPane.add(btnLuzTechoFrenteDerecha);

		JButton btnLuzTechoFondoDerecha = new JButton("luz");
		layeredPane.setLayer(btnLuzTechoFondoDerecha, 1);
		btnLuzTechoFondoDerecha.setForeground(Color.WHITE);
		btnLuzTechoFondoDerecha.setContentAreaFilled(false);
		btnLuzTechoFondoDerecha.setBounds(485, 120, 50, 50);
		layeredPane.add(btnLuzTechoFondoDerecha);

		JButton btnLuzBanyo = new JButton("luz");
		layeredPane.setLayer(btnLuzBanyo, 1);
		btnLuzBanyo.setForeground(Color.WHITE);
		btnLuzBanyo.setContentAreaFilled(false);
		btnLuzBanyo.setBounds(821, 150, 100, 105);
		layeredPane.add(btnLuzBanyo);

		JButton btnVentana = new JButton("ventana");
		btnVentana.setContentAreaFilled(false);
		layeredPane.setLayer(btnVentana, 1);
		btnVentana.setBounds(480, 185, 75, 90);
		layeredPane.add(btnVentana);

		JButton btnLuzMesillaIzquierda = new JButton("luz");
		layeredPane.setLayer(btnLuzMesillaIzquierda, 1);
		btnLuzMesillaIzquierda.setForeground(Color.WHITE);
		btnLuzMesillaIzquierda.setContentAreaFilled(false);
		btnLuzMesillaIzquierda.setBounds(319, 255, 50, 50);
		layeredPane.add(btnLuzMesillaIzquierda);

		JButton btnLuzMesillaDerecha = new JButton("luz");
		layeredPane.setLayer(btnLuzMesillaDerecha, 1);
		btnLuzMesillaDerecha.setForeground(Color.WHITE);
		btnLuzMesillaDerecha.setContentAreaFilled(false);
		btnLuzMesillaDerecha.setBounds(421, 255, 50, 50);
		layeredPane.add(btnLuzMesillaDerecha);

		JButton btnJacuzzi = new JButton("jacuzzi");
		btnJacuzzi.setForeground(Color.WHITE);
		btnJacuzzi.setContentAreaFilled(false);
		layeredPane.setLayer(btnJacuzzi, 1);
		btnJacuzzi.setBounds(589, 294, 95, 80);
		layeredPane.add(btnJacuzzi);

		JButton btnVentanaGrande = new JButton("ventana");
		btnVentanaGrande.setForeground(Color.WHITE);
		layeredPane.setLayer(btnVentanaGrande, 1);
		btnVentanaGrande.setContentAreaFilled(false);
		btnVentanaGrande.setBounds(111, 178, 120, 190);
		layeredPane.add(btnVentanaGrande);

		JToggleButton tglbtnPuerta = new JToggleButton("");
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
	}
}
