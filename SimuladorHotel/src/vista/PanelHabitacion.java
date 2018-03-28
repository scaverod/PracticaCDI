package vista;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Font;

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
		
		JButton btnNewButton = new JButton("Calefacci\u00F3n");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		layeredPane.setLayer(btnNewButton, 1);
		btnNewButton.setBounds(20, 265, 111, 69);
		layeredPane.add(btnNewButton);
	}
}
