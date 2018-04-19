package vista;

import java.awt.Dimension;

import javax.swing.JPanel;

import controlador.Controlador;
import controlador.MicroControladorLayersPadreHijo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Color;
import java.beans.PropertyChangeListener;
import java.util.concurrent.Semaphore;
import java.beans.PropertyChangeEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class PanelSpa extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private MicroControladorLayersPadreHijo microControlador;
	
	private JPanel panelEmergenteContenedor;
	private JPanel panelPrincipal;
	private JPanel panelBase;
	private JLayeredPane layeredPane;
	private JPanel panelOtro;
	
	private Semaphore s;

	public PanelSpa(Controlador controlador) {
		this.s = new Semaphore(0);
		this.setSize(new Dimension(931, 483));
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 931, 483);
		add(layeredPane);

		panelPrincipal = new JPanel();
		panelPrincipal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mostrarVentanaServicios();
			}
		});
		layeredPane.setLayer(panelPrincipal, 1);
		panelPrincipal.setBounds(0, 0, 931, 483);
		layeredPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setBorder(new LineBorder(Color.decode("#006df0"), 5, true));
		panelIzquierdo.setBounds(10, 11, 450, 461);
		panelPrincipal.add(panelIzquierdo);
		panelIzquierdo.setLayout(null);

		JButton btnAdquirirIzq = new JButton("Adquirir");
		btnAdquirirIzq.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdquirirIzq.setBounds(301, 425, 125, 25);
		panelIzquierdo.add(btnAdquirirIzq);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 109, 240), 5));
		panel.setBackground(new Color(227, 233, 255));
		panel.setBounds(0, 0, 450, 60);
		panelIzquierdo.add(panel);
		
		JLabel lblTratamiento = new JLabel("Tratamiento");
		lblTratamiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblTratamiento.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblTratamiento.setBounds(10, 10, 430, 39);
		panel.add(lblTratamiento);
		
		JComboBox<String> comboBoxTratamiento = new JComboBox<String>();
		comboBoxTratamiento.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			}
		});
		comboBoxTratamiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxTratamiento.setToolTipText("");
		comboBoxTratamiento.setModel(new DefaultComboBoxModel(controlador.getServiciosSpa().getNombresTratamientos()));
		comboBoxTratamiento.setBounds(55, 110, 221, 25);
		panelIzquierdo.add(comboBoxTratamiento);
		
		JLabel lblSeleccionTratamiento = new JLabel("Seleccione el tratamiento deseado");
		lblSeleccionTratamiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSeleccionTratamiento.setBounds(55, 71, 221, 41);
		panelIzquierdo.add(lblSeleccionTratamiento);
		
		JLabel iconoTratamiento = new JLabel("");
		iconoTratamiento.setIcon(new ImageIcon(PanelSpa.class.getResource("/iconos/massage (1).png")));
		iconoTratamiento.setBounds(331, 71, 64, 64);
		panelIzquierdo.add(iconoTratamiento);
		
		JComboBox comboBoxDuracion = new JComboBox();
		comboBoxDuracion.setModel(new DefaultComboBoxModel(new String[] {"30 minutos", "1 hora", "2 horas"}));
		comboBoxDuracion.setToolTipText("");
		comboBoxDuracion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxDuracion.setBounds(55, 185, 221, 25);
		panelIzquierdo.add(comboBoxDuracion);
		
		JLabel lblDuracion = new JLabel("Duraci\u00F3n");
		lblDuracion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuracion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDuracion.setBounds(55, 146, 221, 41);
		panelIzquierdo.add(lblDuracion);
		
		JLabel iconoDuracion = new JLabel("");
		iconoDuracion.setIcon(new ImageIcon(PanelSpa.class.getResource("/iconos/time.png")));
		iconoDuracion.setBounds(331, 146, 64, 64);
		panelIzquierdo.add(iconoDuracion);
		
		JLabel lblLugar = new JLabel("Lugar");
		lblLugar.setHorizontalAlignment(SwingConstants.CENTER);
		lblLugar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLugar.setBounds(55, 221, 221, 41);
		panelIzquierdo.add(lblLugar);
		
		JComboBox comboBoxLugar = new JComboBox();
		comboBoxLugar.setModel(new DefaultComboBoxModel(new String[] {"Cabina 1", "Cabina 2", "Cabina 3", "Habitaci\u00F3n"}));
		comboBoxLugar.setToolTipText("");
		comboBoxLugar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxLugar.setBounds(55, 260, 221, 25);
		panelIzquierdo.add(comboBoxLugar);
		
		JLabel iconoLugar = new JLabel("");
		iconoLugar.setIcon(new ImageIcon(PanelSpa.class.getResource("/iconos/room.png")));
		iconoLugar.setBounds(331, 221, 64, 64);
		panelIzquierdo.add(iconoLugar);
		
		JButton btnFechaIzq = new JButton("Fecha");
		btnFechaIzq.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFechaIzq.setBounds(49, 394, 94, 31);
		panelIzquierdo.add(btnFechaIzq);
		
		JButton btnHoraIzq = new JButton("Hora");
		btnHoraIzq.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHoraIzq.setBounds(182, 394, 94, 31);
		panelIzquierdo.add(btnHoraIzq);
		
		JComboBox comboBoxEmpleado = new JComboBox();
		comboBoxEmpleado.setModel(new DefaultComboBoxModel(new String[] {"Angelina Jolie", "Brad Pitt", "Michael Fassbender", "Alicia Vikander", "Falete"}));
		comboBoxEmpleado.setToolTipText("");
		comboBoxEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxEmpleado.setBounds(55, 335, 221, 25);
		panelIzquierdo.add(comboBoxEmpleado);
		
		JLabel lblEmpleado = new JLabel("Empleado");
		lblEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmpleado.setBounds(55, 296, 221, 41);
		panelIzquierdo.add(lblEmpleado);
		
		JLabel iconoEmpleado = new JLabel("");
		iconoEmpleado.setIcon(new ImageIcon(PanelSpa.class.getResource("/iconos/users.png")));
		iconoEmpleado.setBounds(331, 300, 64, 60);
		panelIzquierdo.add(iconoEmpleado);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(301, 381, 125, 31);
		panelIzquierdo.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setForeground(Color.ORANGE);
		panel_1.setBorder(new LineBorder(Color.ORANGE, 3));
		panel_1.setBackground(new Color(255, 255, 153));
		
		JLabel lblCoste = new JLabel("Coste:");
		lblCoste.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCoste.setBounds(14, 0, 47, 31);
		panel_1.add(lblCoste);
		
		JLabel label_3 = new JLabel("0 \u20AC");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(60, 0, 65, 31);
		panel_1.add(label_3);

		JPanel panelDerecho = new JPanel();
		panelDerecho.setBorder(new LineBorder(Color.decode("#006df0"), 5, true));
		panelDerecho.setLayout(null);
		panelDerecho.setBounds(471, 11, 450, 461);
		panelPrincipal.add(panelDerecho);
				
				JPanel panelTituloSpa = new JPanel();
				panelTituloSpa.setBounds(0, 0, 450, 60);
				panelTituloSpa.setBorder(new LineBorder(new Color(0, 109, 240), 5));
				panelTituloSpa.setBackground(Color.decode("#E3E9FF"));
				panelDerecho.add(panelTituloSpa);
				panelTituloSpa.setLayout(null);
				
				JLabel lblSpa = new JLabel("SPA");
				lblSpa.setHorizontalAlignment(SwingConstants.CENTER);
				lblSpa.setBounds(10, 10, 430, 39);
				lblSpa.setFont(new Font("Tahoma", Font.PLAIN, 27));
				panelTituloSpa.add(lblSpa);
				
				JLabel lblSeleccioneElServicio = new JLabel("Seleccione el servicio deseado");
				lblSeleccioneElServicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblSeleccioneElServicio.setBounds(61, 136, 221, 41);
				panelDerecho.add(lblSeleccioneElServicio);
				
				JComboBox comboBoxPiscina = new JComboBox();
				comboBoxPiscina.setModel(new DefaultComboBoxModel(new String[] {"Piscina", "Sauna", "Ba\u00F1o Turco"}));
				comboBoxPiscina.setToolTipText("");
				comboBoxPiscina.setFont(new Font("Tahoma", Font.PLAIN, 15));
				comboBoxPiscina.setBounds(61, 175, 221, 25);
				panelDerecho.add(comboBoxPiscina);
				
				JLabel label_1 = new JLabel("");
				label_1.setIcon(new ImageIcon(PanelSpa.class.getResource("/iconos/jacuzzi.png")));
				label_1.setBounds(324, 193, 64, 64);
				panelDerecho.add(label_1);
				
				JLabel label = new JLabel("");
				label.setBounds(324, 71, 64, 64);
				panelDerecho.add(label);
				
				JPanel panelPlazas = new JPanel();
				panelPlazas.setBackground(new Color(255, 255, 153));
				panelPlazas.setBorder(new LineBorder(Color.ORANGE, 3));
				panelPlazas.setForeground(Color.ORANGE);
				panelPlazas.setBounds(61, 287, 221, 31);
				panelDerecho.add(panelPlazas);
				panelPlazas.setLayout(null);
				
				JLabel lblPlazasDisponibles = new JLabel("Plazas disponibles:");
				lblPlazasDisponibles.setBounds(45, 0, 118, 31);
				lblPlazasDisponibles.setFont(new Font("Tahoma", Font.PLAIN, 15));
				panelPlazas.add(lblPlazasDisponibles);
				
				JLabel labelNumPlazas = new JLabel("0");
				labelNumPlazas.setBounds(168, 0, 8, 31);
				labelNumPlazas.setFont(new Font("Tahoma", Font.PLAIN, 15));
				panelPlazas.add(labelNumPlazas);
				
				JButton btnFechaDcha = new JButton("Fecha");
				btnFechaDcha.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnFechaDcha.setBounds(61, 226, 94, 31);
				panelDerecho.add(btnFechaDcha);
				
				JButton btnHoraDcha = new JButton("Hora");
				btnHoraDcha.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnHoraDcha.setBounds(188, 226, 94, 31);
				panelDerecho.add(btnHoraDcha);
				
				JButton btnAdquirirDcha = new JButton("Adquirir");
				btnAdquirirDcha.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnAdquirirDcha.setBounds(315, 425, 125, 25);
				panelDerecho.add(btnAdquirirDcha);
		btnAdquirirIzq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToVentanaEmergente(panelBase);
			}
		});

		panelEmergenteContenedor = new JPanel();
		panelEmergenteContenedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//NO BORRAR
			}
		});
		
		btnAdquirirDcha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToVentanaEmergente(panelOtro);
			}
		});
		
		panelEmergenteContenedor.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getNewValue().equals(0)) {
					// TODO: reactivar elementos del panelPrincipal (ahora panel al frente)
					btnAdquirirDcha.setEnabled(true);
					btnAdquirirIzq.setEnabled(true);
					btnFechaIzq.setEnabled(true);
					btnFechaDcha.setEnabled(true);
					btnHoraDcha.setEnabled(true);
					btnHoraIzq.setEnabled(true);
					comboBoxDuracion.setEnabled(true);
					comboBoxEmpleado.setEnabled(true);
					comboBoxLugar.setEnabled(true);
					comboBoxTratamiento.setEnabled(true);
					comboBoxPiscina.setEnabled(true);
				} else if (evt.getNewValue().equals(2)) {
					// TODO: desactivar elementos del panelPrincipal (ahora panel al fondo)
					btnAdquirirDcha.setEnabled(false);
					btnAdquirirIzq.setEnabled(false);
					btnFechaIzq.setEnabled(false);
					btnFechaDcha.setEnabled(false);
					btnHoraDcha.setEnabled(false);
					btnHoraIzq.setEnabled(false);
					comboBoxDuracion.setEnabled(false);
					comboBoxEmpleado.setEnabled(false);
					comboBoxLugar.setEnabled(false);
					comboBoxTratamiento.setEnabled(false);
					comboBoxPiscina.setEnabled(false);
				}
			}
		});
		
		
		layeredPane.setLayer(panelEmergenteContenedor, 0);
		panelEmergenteContenedor.setBounds(118, 84, 695, 315);
		layeredPane.add(panelEmergenteContenedor);
		panelEmergenteContenedor.setLayout(new CardLayout(0, 0));
		
		
		
		/* SEPARADOR */
		microControlador = new MicroControladorLayersPadreHijo(layeredPane, panelEmergenteContenedor);
		
		panelBase = new PanelSpaEmergenteBase(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelBase, panelBase.getName());

		panelOtro = new PanelSpaEmergenteOtro(microControlador, this.getName(), controlador, s);
		panelEmergenteContenedor.add(panelOtro, panelOtro.getName());
	}
	
	private void establecerVentanaServicio(String panel) {
		CardLayout l = (CardLayout) panelEmergenteContenedor.getLayout();
		l.show(panelEmergenteContenedor, panel);
	}

	private void mostrarVentanaEmergente() {
		layeredPane.setLayer(panelEmergenteContenedor, 2);
	}

	private void mostrarVentanaServicios() {
		layeredPane.setLayer(panelEmergenteContenedor, 0);
	}

	private void changeToVentanaEmergente(JPanel panel) {
		establecerVentanaServicio(panel.getName());
		mostrarVentanaEmergente();
	}
}