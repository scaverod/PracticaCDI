package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import idiomas.Texto;

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
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField campoPassword;
	private JTextField campoUsuario;
	private JPanel panelPrincipal;
	private JPanel panelLogin;
	private JPanel pantalla;
	private int xCoord;
	private int tolerancia = 50;
	private String pantallaMenuActiva;
	private JPanel pantallaMenu;
	private JToggleButton btnHabitacion;
	private JToggleButton btnSpa;
	private JToggleButton btnServicios;
	private JToggleButton btnCuenta;
	private JPanel panelHabitacion;
	private JPanel panelSpa;
	private JPanel panelServicios;
	private JPanel panelCuenta;
	private Controlador controlador;

	private Texto t;

	public Ventana() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		// TODO: cargar los datos
		this.controlador = new Controlador();
		this.t = controlador.getTexto();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLayeredPane layeredPane = new JLayeredPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(layeredPane,
				GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE));

		JLabel lblMarco = new JLabel("");
		lblMarco.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/marcoTablet.png")));
		lblMarco.setBounds(130, 3, 1080, 690);
		layeredPane.add(lblMarco);

		pantalla = new JPanel();
		layeredPane.setLayer(pantalla, 1);
		pantalla.setBounds(195, 51, 951, 594);
		layeredPane.add(pantalla);
		pantalla.setLayout(new CardLayout(0, 0));

		panelLogin = new JPanel();
		panelLogin.setName("panelLogin");
		pantalla.add(panelLogin, panelLogin.getName());

		JLabel lblInicieSesinPara = new JLabel(t.getLoginIniciaSesion());
		lblInicieSesinPara.setBounds(10, 11, 939, 76);
		lblInicieSesinPara.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicieSesinPara.setFont(new Font("Tahoma", Font.PLAIN, 24));

		JPanel panelDatosSesion = new JPanel();
		panelDatosSesion.setBounds(10, 93, 939, 490);

		JLabel lblContrasea = new JLabel(t.getLoginPassword() + ":");
		lblContrasea.setBounds(304, 289, 128, 29);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 24));

		campoPassword = new JPasswordField();
		campoPassword.setBounds(450, 287, 188, 32);
		campoPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginHandler();
			}
		});
		campoPassword.setToolTipText(t.getLoginPasswordToolTip());
		campoPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));

		JLabel lblUsuario = new JLabel(t.getLoginUsuario() + ":");
		lblUsuario.setBounds(304, 239, 120, 29);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));

		campoUsuario = new JTextField();
		campoUsuario.setBounds(450, 237, 188, 32);
		campoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginHandler();
			}
		});
		campoUsuario.setToolTipText(t.getLoginUsuarioToolTip());
		campoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));

		JButton btnAceptar = new JButton(t.getLoginBtnAceptar());
		btnAceptar.setBounds(304, 346, 334, 37);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginHandler();
			}
		});
		panelLogin.setLayout(null);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 24));

		JSeparator separador = new JSeparator();
		separador.setBounds(0, 0, 939, 1);

		// Es una prueba
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(301, 7, 337, 200);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/logoAplicacion.png")));

		JLabel lblEslogan = new JLabel("");
		lblEslogan.setBounds(304, 389, 334, 96);
		lblEslogan.setHorizontalAlignment(SwingConstants.CENTER);
		lblEslogan.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/eslogan1.png")));
		panelLogin.add(panelDatosSesion);
		panelDatosSesion.setLayout(null);
		panelDatosSesion.add(separador);
		panelDatosSesion.add(lblLogo);
		panelDatosSesion.add(lblUsuario);
		panelDatosSesion.add(campoUsuario);
		panelDatosSesion.add(btnAceptar);
		panelDatosSesion.add(lblContrasea);
		panelDatosSesion.add(campoPassword);
		panelDatosSesion.add(lblEslogan);
		panelLogin.add(lblInicieSesinPara);

		panelPrincipal = new JPanel();
		panelPrincipal.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xCoord = e.getX();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				int diferencia = e.getX() - xCoord;
				if ((diferencia > 0) && (diferencia > tolerancia))
					desplazamientoDerecha();
				else if ((diferencia < 0) && ((-diferencia) > tolerancia))
					desplazamientoIzquierda();
			}
		});
		panelPrincipal.setName("panelPrincipal");
		pantalla.add(panelPrincipal, panelPrincipal.getName());
		layeredPane.setLayer(panelPrincipal, 1);

		JPanel menuPrincipal = new JPanel();

		pantallaMenu = new JPanel();
		GroupLayout gl_panelPrincipal = new GroupLayout(panelPrincipal);
		gl_panelPrincipal.setHorizontalGroup(gl_panelPrincipal.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelPrincipal.createSequentialGroup().addContainerGap()
						.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.TRAILING)
								.addComponent(pantallaMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 931,
										Short.MAX_VALUE)
								.addComponent(menuPrincipal, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 931,
										Short.MAX_VALUE))
						.addContainerGap()));
		gl_panelPrincipal.setVerticalGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPrincipal.createSequentialGroup().addContainerGap()
						.addComponent(menuPrincipal, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pantallaMenu, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE).addContainerGap()));
		pantallaMenu.setLayout(new CardLayout(0, 0));

		panelHabitacion = new PanelHabitacion(controlador);
		pantallaMenu.add(panelHabitacion, panelHabitacion.getName());

		panelSpa = new PanelSpa(controlador);
		pantallaMenu.add(panelSpa, panelSpa.getName());

		panelServicios = new PanelServicios(controlador);
		pantallaMenu.add(panelServicios, panelServicios.getName());

		panelCuenta = new PanelCuenta(controlador, this);
		pantallaMenu.add(panelCuenta, panelCuenta.getName());

		btnSpa = new JToggleButton(t.getMenuPrincipalBtnSpa());
		btnSpa.setFocusPainted(false);
		btnSpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToSpa();
			}
		});
		btnSpa.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSpa.setSelectedIcon(new ImageIcon(Ventana.class.getResource("/iconos/spa_x32_black.png")));
		btnSpa.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/spa_x32_blue.png")));
		buttonGroup.add(btnSpa);

		btnHabitacion = new JToggleButton(t.getMenuPrincipalBtnHabitacion());
		btnHabitacion.setFocusPainted(false);
		btnHabitacion.setSelected(true);
		btnHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToHabitacion();
				changeIdioma();
			}
		});
		btnHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnHabitacion.setSelectedIcon(new ImageIcon(Ventana.class.getResource("/iconos/cama_x32_black.png")));
		btnHabitacion.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/cama_x32_blue.png")));
		buttonGroup.add(btnHabitacion);

		btnCuenta = new JToggleButton(t.getMenuPrincipalBtnCuenta());
		btnCuenta.setFocusPainted(false);
		btnCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: Controlar esto para que se guarde el estado del resto de las cosas
//				panelCuenta = new PanelCuenta(controlador);
//				pantallaMenu.add(panelCuenta, panelCuenta.getName());
				changeToCuenta();
			}
		});
		btnCuenta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnCuenta.setSelectedIcon(new ImageIcon(Ventana.class.getResource("/iconos/usuario_x32_black.png")));
		buttonGroup.add(btnCuenta);
		btnCuenta.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/usuario_x32_blue.png")));

		btnServicios = new JToggleButton(t.getMenuPrincipalBtnServicios());
		btnServicios.setFocusPainted(false);
		btnServicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToServicios();
			}
		});
		btnServicios.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnServicios.setSelectedIcon(new ImageIcon(Ventana.class.getResource("/iconos/servicios_x32_black.png")));
		btnServicios.setIcon(new ImageIcon(Ventana.class.getResource("/iconos/servicios_x32_blue.png")));
		buttonGroup.add(btnServicios);
		GroupLayout gl_menuPrincipal = new GroupLayout(menuPrincipal);
		gl_menuPrincipal.setHorizontalGroup(gl_menuPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menuPrincipal.createSequentialGroup().addContainerGap()
						.addComponent(btnHabitacion, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnSpa, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
						.addComponent(btnServicios, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnCuenta, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_menuPrincipal.setVerticalGroup(gl_menuPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menuPrincipal.createSequentialGroup().addContainerGap().addGroup(gl_menuPrincipal
						.createParallelGroup(Alignment.LEADING)
						.addComponent(btnHabitacion, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_menuPrincipal.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnServicios, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSpa, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCuenta, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		menuPrincipal.setLayout(gl_menuPrincipal);
		panelPrincipal.setLayout(gl_panelPrincipal);
		contentPane.setLayout(gl_contentPane);
	}

	/* ******* */
	/* METHODS */
	/* ******* */

	private void loginHandler() {
		// TODO: call user validation method

		if (campoUsuario.getText().length() == 0 || campoPassword.getPassword().length == 0) {
			// TODO: esto es temporal; hay que crear los mensajes en otra clase para poder
			// cambiar de idioma fácilmente
			JOptionPane.showMessageDialog(contentPane, t.getLoginErrorMensaje() + ".", t.getLoginErrorTitulo(),
					JOptionPane.ERROR_MESSAGE);
		} else {
			CardLayout l = (CardLayout) pantalla.getLayout();
			l.show(pantalla, panelPrincipal.getName());
			pantallaMenuActiva = "panelHabitacion";
		}
	}
	
	public void changeIdioma() {
		t = controlador.getTexto();
		
		btnHabitacion.setText(t.getMenuPrincipalBtnHabitacion());
		btnSpa.setText(t.getMenuPrincipalBtnSpa());
		btnServicios.setText(t.getMenuPrincipalBtnServicios());
		btnCuenta.setText(t.getMenuPrincipalBtnCuenta());
	}
	
	private void changeToHabitacion() {
		CardLayout l = (CardLayout) pantallaMenu.getLayout();
		l.show(pantallaMenu, panelHabitacion.getName());
		pantallaMenuActiva = panelHabitacion.getName();
	}

	private void changeToSpa() {
		CardLayout l = (CardLayout) pantallaMenu.getLayout();
		l.show(pantallaMenu, panelSpa.getName());
		pantallaMenuActiva = panelSpa.getName();
	}

	private void changeToServicios() {
		CardLayout l = (CardLayout) pantallaMenu.getLayout();
		l.show(pantallaMenu, panelServicios.getName());
		pantallaMenuActiva = panelServicios.getName();
	}

	private void changeToCuenta() {
		CardLayout l = (CardLayout) pantallaMenu.getLayout();
		l.show(pantallaMenu, panelCuenta.getName());
		pantallaMenuActiva = panelCuenta.getName();
	}

	private void desplazamientoDerecha() {
		switch (pantallaMenuActiva) {
			case "panelHabitacion":
				btnCuenta.setSelected(true);
				changeToCuenta();
				break;
			case "panelSpa":
				btnHabitacion.setSelected(true);
				changeToHabitacion();
				break;
			case "panelServicios":
				btnSpa.setSelected(true);
				changeToSpa();
				break;
			case "panelCuenta":
				btnServicios.setSelected(true);
				changeToServicios();
				break;
			}
	}

	private void desplazamientoIzquierda() {
		switch (pantallaMenuActiva) {
			case "panelHabitacion":
				btnSpa.setSelected(true);
				changeToSpa();
				break;
			case "panelSpa":
				btnServicios.setSelected(true);
				changeToServicios();
				break;
			case "panelServicios":
				btnCuenta.setSelected(true);
				changeToCuenta();
				break;
			case "panelCuenta":
				btnHabitacion.setSelected(true);
				changeToHabitacion();
				break;
			}
	}
}
