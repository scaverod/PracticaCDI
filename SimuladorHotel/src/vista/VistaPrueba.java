package vista;

import javax.swing.JPanel;
import javax.swing.JButton;

public class VistaPrueba extends JPanel {
	private static final long serialVersionUID = 1L;

	public VistaPrueba() {
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 607, 326);
		add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(165, 5, 89, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(259, 5, 89, 23);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(353, 5, 89, 23);
		panel.add(btnNewButton_2);

	}
}