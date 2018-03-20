package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.FlowLayout;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
		);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Main.class.getResource("/iconos/marcoTablet.png")));
		label.setBounds(130, 3, 1080, 690);
		layeredPane.add(label);
		
		JPanel pantalla = new JPanel();
		layeredPane.setLayer(pantalla, 1);
		pantalla.setBounds(195, 51, 951, 594);
		layeredPane.add(pantalla);
		
		JPanel menuPrincipal = new JPanel();
		
		JPanel pantallaMenu = new JPanel();
		GroupLayout gl_pantalla = new GroupLayout(pantalla);
		gl_pantalla.setHorizontalGroup(
			gl_pantalla.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pantalla.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pantalla.createParallelGroup(Alignment.TRAILING)
						.addComponent(menuPrincipal, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
						.addComponent(pantallaMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_pantalla.setVerticalGroup(
			gl_pantalla.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pantalla.createSequentialGroup()
					.addContainerGap()
					.addComponent(menuPrincipal, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
					.addComponent(pantallaMenu, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JButton btnNewButton_2 = new JButton("New button");
		
		JButton button = new JButton("New button");
		
		JButton button_1 = new JButton("New button");
		
		JButton button_2 = new JButton("New button");
		GroupLayout gl_menuPrincipal = new GroupLayout(menuPrincipal);
		gl_menuPrincipal.setHorizontalGroup(
			gl_menuPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menuPrincipal.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_menuPrincipal.setVerticalGroup(
			gl_menuPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menuPrincipal.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_menuPrincipal.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(button)
						.addComponent(button_1)
						.addComponent(button_2))
					.addContainerGap(96, Short.MAX_VALUE))
		);
		menuPrincipal.setLayout(gl_menuPrincipal);
		pantalla.setLayout(gl_pantalla);
		contentPane.setLayout(gl_contentPane);
	}
}
