package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import java.awt.Font;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
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
						.addComponent(pantallaMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
						.addComponent(menuPrincipal, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_pantalla.setVerticalGroup(
			gl_pantalla.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_pantalla.createSequentialGroup()
					.addContainerGap()
					.addComponent(menuPrincipal, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pantallaMenu, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JToggleButton btnSpa = new JToggleButton("Spa");
		btnSpa.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSpa.setSelectedIcon(new ImageIcon(Main.class.getResource("/iconos/spa_x32_black.png")));
		btnSpa.setIcon(new ImageIcon(Main.class.getResource("/iconos/spa_x32_blue.png")));
		buttonGroup.add(btnSpa);
		
		JToggleButton btnHabitacion = new JToggleButton("Habitaci\u00F3n");
		btnHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnHabitacion.setSelectedIcon(new ImageIcon(Main.class.getResource("/iconos/cama_x32_black.png")));
		btnHabitacion.setIcon(new ImageIcon(Main.class.getResource("/iconos/cama_x32_blue.png")));
		buttonGroup.add(btnHabitacion);
		
		JToggleButton btnCuenta = new JToggleButton("Cuenta");
		btnCuenta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnCuenta.setSelectedIcon(new ImageIcon(Main.class.getResource("/iconos/usuario_x32_black.png")));
		buttonGroup.add(btnCuenta);
		btnCuenta.setIcon(new ImageIcon(Main.class.getResource("/iconos/usuario_x32_blue.png")));
		
		JToggleButton btnServicios = new JToggleButton("Servicios");
		btnServicios.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnServicios.setSelectedIcon(new ImageIcon(Main.class.getResource("/iconos/servicios_x32_black.png")));
		btnServicios.setIcon(new ImageIcon(Main.class.getResource("/iconos/servicios_x32_blue.png")));
		buttonGroup.add(btnServicios);
		GroupLayout gl_menuPrincipal = new GroupLayout(menuPrincipal);
		gl_menuPrincipal.setHorizontalGroup(
			gl_menuPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menuPrincipal.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnHabitacion, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSpa, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
					.addComponent(btnServicios, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCuenta, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_menuPrincipal.setVerticalGroup(
			gl_menuPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menuPrincipal.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_menuPrincipal.createParallelGroup(Alignment.LEADING)
						.addComponent(btnHabitacion, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_menuPrincipal.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnServicios, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnSpa, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnCuenta, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		menuPrincipal.setLayout(gl_menuPrincipal);
		pantalla.setLayout(gl_pantalla);
		contentPane.setLayout(gl_contentPane);
	}
}
