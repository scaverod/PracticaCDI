package vista;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Color;

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
		
		JButton btnLuz = new JButton("luz");
		btnLuz.setForeground(Color.WHITE);
		btnLuz.setContentAreaFilled(false);
		layeredPane.setLayer(btnLuz, 1);
		btnLuz.setBounds(250, 135, 50, 50);
		layeredPane.add(btnLuz);
		
		JButton button = new JButton("luz");
		layeredPane.setLayer(button, 1);
		button.setForeground(Color.WHITE);
		button.setContentAreaFilled(false);
		button.setBounds(309, 115, 50, 50);
		layeredPane.add(button);
		
		JButton button_1 = new JButton("luz");
		layeredPane.setLayer(button_1, 1);
		button_1.setForeground(Color.WHITE);
		button_1.setContentAreaFilled(false);
		button_1.setBounds(130, 100, 50, 50);
		layeredPane.add(button_1);
		
		JButton button_2 = new JButton("luz");
		layeredPane.setLayer(button_2, 1);
		button_2.setForeground(Color.WHITE);
		button_2.setContentAreaFilled(false);
		button_2.setBounds(460, 70, 50, 50);
		layeredPane.add(button_2);
		
		JButton button_3 = new JButton("luz");
		layeredPane.setLayer(button_3, 1);
		button_3.setForeground(Color.WHITE);
		button_3.setContentAreaFilled(false);
		button_3.setBounds(485, 120, 50, 50);
		layeredPane.add(button_3);
		
		JButton button_4 = new JButton("luz");
		layeredPane.setLayer(button_4, 1);
		button_4.setForeground(Color.WHITE);
		button_4.setContentAreaFilled(false);
		button_4.setBounds(821, 150, 100, 105);
		layeredPane.add(button_4);
		
		JButton btnNewButton = new JButton("agua");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setContentAreaFilled(false);
		layeredPane.setLayer(btnNewButton, 1);
		btnNewButton.setBounds(861, 255, 60, 60);
		layeredPane.add(btnNewButton);
		
		JButton button_5 = new JButton("agua");
		button_5.setForeground(Color.WHITE);
		button_5.setContentAreaFilled(false);
		layeredPane.setLayer(button_5, 1);
		button_5.setBounds(799, 255, 60, 60);
		layeredPane.add(button_5);
		
		JButton btnNewButton_1 = new JButton("ventana");
		btnNewButton_1.setContentAreaFilled(false);
		layeredPane.setLayer(btnNewButton_1, 1);
		btnNewButton_1.setBounds(480, 185, 75, 90);
		layeredPane.add(btnNewButton_1);
		
		JButton button_6 = new JButton("luz");
		layeredPane.setLayer(button_6, 1);
		button_6.setForeground(Color.WHITE);
		button_6.setContentAreaFilled(false);
		button_6.setBounds(319, 255, 50, 50);
		layeredPane.add(button_6);
		
		JButton button_7 = new JButton("luz");
		layeredPane.setLayer(button_7, 1);
		button_7.setForeground(Color.WHITE);
		button_7.setContentAreaFilled(false);
		button_7.setBounds(421, 255, 50, 50);
		layeredPane.add(button_7);
		
		JButton btnNewButton_2 = new JButton("jacuzzi");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setContentAreaFilled(false);
		layeredPane.setLayer(btnNewButton_2, 1);
		btnNewButton_2.setBounds(589, 294, 95, 80);
		layeredPane.add(btnNewButton_2);
	}
}
