package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class Ventana extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField campoPassword;
	private JPasswordField campoUsuario;

	public Ventana() {
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
		label.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/marcoTablet.png")));
		label.setBounds(130, 3, 1080, 690);
		layeredPane.add(label);
		
		JPanel pantallaLogin = new JPanel();
		layeredPane.setLayer(pantallaLogin, 2);
		pantallaLogin.setBounds(195, 51, 951, 594);
		layeredPane.add(pantallaLogin);
		
		JLabel lblInicieSesinPara = new JLabel("Inicie sesi\u00F3n para usar la aplicaci\u00F3n");
		lblInicieSesinPara.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicieSesinPara.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel panelDatosSesion = new JPanel();
		GroupLayout gl_pantallaLogin = new GroupLayout(pantallaLogin);
		gl_pantallaLogin.setHorizontalGroup(
			gl_pantallaLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pantallaLogin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pantallaLogin.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelDatosSesion, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
						.addComponent(lblInicieSesinPara, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_pantallaLogin.setVerticalGroup(
			gl_pantallaLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pantallaLogin.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInicieSesinPara, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelDatosSesion, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		campoPassword = new JPasswordField();
		campoPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		campoUsuario = new JPasswordField();
		campoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: validación datos
				
				// TODO: solución temporal
				/* Habría que usar un card layout como en la pantalla principal porque exige estar cambiando constantemente de capa para poder editarlas */
				if (campoUsuario.getPassword().length == 0 && campoPassword.getPassword().length == 0) {
					// TODO: esto es temporal; hay que crear los mensajes en otra clase para poder cambiar de idioma fácilmente
					JOptionPane.showMessageDialog(contentPane, "Los campos no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
					pantallaLogin.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JSeparator separator = new JSeparator();
		GroupLayout gl_panelDatosSesion = new GroupLayout(panelDatosSesion);
		gl_panelDatosSesion.setHorizontalGroup(
			gl_panelDatosSesion.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDatosSesion.createSequentialGroup()
					.addGap(298)
					.addGroup(gl_panelDatosSesion.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panelDatosSesion.createSequentialGroup()
							.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(campoUsuario, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelDatosSesion.createSequentialGroup()
							.addComponent(lblContrasea)
							.addGap(18)
							.addComponent(campoPassword, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(299, Short.MAX_VALUE))
				.addComponent(separator, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
		);
		gl_panelDatosSesion.setVerticalGroup(
			gl_panelDatosSesion.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDatosSesion.createSequentialGroup()
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(135)
					.addGroup(gl_panelDatosSesion.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(campoUsuario, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(19)
					.addGroup(gl_panelDatosSesion.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContrasea)
						.addComponent(campoPassword, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap(194, Short.MAX_VALUE))
		);
		panelDatosSesion.setLayout(gl_panelDatosSesion);
		pantallaLogin.setLayout(gl_pantallaLogin);
		
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
		pantallaMenu.setLayout(new CardLayout(0, 0));
		
		JPanel panelBienvenida = new JPanel();
		panelBienvenida.setName("panelBienvenida");
		pantallaMenu.add(panelBienvenida, panelBienvenida.getName());
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/imagen_bienvenida.png")));
		GroupLayout gl_panelBienvenida = new GroupLayout(panelBienvenida);
		gl_panelBienvenida.setHorizontalGroup(
			gl_panelBienvenida.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBienvenida.createSequentialGroup()
					.addGap(88)
					.addComponent(label_1)
					.addContainerGap(89, Short.MAX_VALUE))
		);
		gl_panelBienvenida.setVerticalGroup(
			gl_panelBienvenida.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBienvenida.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		panelBienvenida.setLayout(gl_panelBienvenida);
		
		JPanel panelHabitacion = new JPanel();
		panelHabitacion.setName("panelHabitacion");
		pantallaMenu.add(panelHabitacion, panelHabitacion.getName());
		GroupLayout gl_panelHabitacion = new GroupLayout(panelHabitacion);
		gl_panelHabitacion.setHorizontalGroup(
			gl_panelHabitacion.createParallelGroup(Alignment.LEADING)
				.addGap(0, 931, Short.MAX_VALUE)
		);
		gl_panelHabitacion.setVerticalGroup(
			gl_panelHabitacion.createParallelGroup(Alignment.LEADING)
				.addGap(0, 483, Short.MAX_VALUE)
		);
		panelHabitacion.setLayout(gl_panelHabitacion);
		
		JToggleButton btnSpa = new JToggleButton("Spa");
		btnSpa.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSpa.setSelectedIcon(new ImageIcon(Ventana.class.getResource("/iconos/spa_x32_black.png")));
		btnSpa.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/spa_x32_blue.png")));
		buttonGroup.add(btnSpa);
		
		JToggleButton btnHabitacion = new JToggleButton("Habitaci\u00F3n");
		btnHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout l = (CardLayout) pantallaMenu.getLayout();
				l.show(pantallaMenu, panelHabitacion.getName());
			}
		});
		btnHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnHabitacion.setSelectedIcon(new ImageIcon(Ventana.class.getResource("/iconos/cama_x32_black.png")));
		btnHabitacion.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/cama_x32_blue.png")));
		buttonGroup.add(btnHabitacion);
		
		JToggleButton btnCuenta = new JToggleButton("Cuenta");
		btnCuenta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnCuenta.setSelectedIcon(new ImageIcon(Ventana.class.getResource("/iconos/usuario_x32_black.png")));
		buttonGroup.add(btnCuenta);
		btnCuenta.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/usuario_x32_blue.png")));
		
		JToggleButton btnServicios = new JToggleButton("Servicios");
		btnServicios.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnServicios.setSelectedIcon(new ImageIcon(Ventana.class.getResource("/iconos/servicios_x32_black.png")));
		btnServicios.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/servicios_x32_blue.png")));
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
