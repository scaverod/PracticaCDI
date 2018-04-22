package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.Controlador;
import controlador.MicroControladorLayersPadreHijo;
import idiomas.Texto;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;

public class PanelHabitacionEmergenteVentana extends JPanel {
	private static final long serialVersionUID = 1L;
	private Texto t;
	// Valores de la posicion de las persianas del 0 al 4
	private int persianas;
	// Valores de la posicion de las persianas del 0 al 2
	private int ventanas;
	private ImageIcon[] persianasIcon = {
			new ImageIcon(PanelHabitacionEmergenteVentana.class.getResource("/iconos/persiana0.png")),
			new ImageIcon(PanelHabitacionEmergenteVentana.class.getResource("/iconos/persiana1.png")),
			new ImageIcon(PanelHabitacionEmergenteVentana.class.getResource("/iconos/persiana2.png")),
			new ImageIcon(PanelHabitacionEmergenteVentana.class.getResource("/iconos/persiana3.png")),
			new ImageIcon(PanelHabitacionEmergenteVentana.class.getResource("/iconos/persiana4.png")) };
	private ImageIcon[] ventanasIcon = {
			new ImageIcon(PanelHabitacionEmergenteVentana.class.getResource("/iconos/ventana20.png")),
			new ImageIcon(PanelHabitacionEmergenteVentana.class.getResource("/iconos/ventana21.png")),
			new ImageIcon(PanelHabitacionEmergenteVentana.class.getResource("/iconos/ventana22.png")) };

	public PanelHabitacionEmergenteVentana(MicroControladorLayersPadreHijo m, Controlador controlador) {
		addHierarchyListener(new HierarchyListener() {
			public void hierarchyChanged(HierarchyEvent e) {
				if (e.getChangeFlags() == HierarchyEvent.HIERARCHY_FIRST) {
					// TODO: comprobar estado de persianas y ventnas y cambiar si necesario
				}
			}
		});
		t = controlador.getTexto();
		ventanas = 0;
		persianas = 0;
		this.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)));
		this.setSize(695, 315);
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);

		JLabel lblPersiana = new JLabel("");
		JButton btnCerrar = new JButton(t.getBtnCerrar());
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ocultar panel
				m.changeLayer(0);
			}
		});
		btnCerrar.setBounds(610, 11, 75, 50);
		add(btnCerrar);

		JPanel panelVentana = new JPanel();
		panelVentana.setBorder(new TitledBorder(
				new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
						new Color(0, 109, 240), new Color(0, 109, 240)),
				"Ventana", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
		panelVentana.setBounds(10, 64, 334, 240);
		add(panelVentana);
		panelVentana.setLayout(null);

		JLabel lblVentana = new JLabel("");
		lblVentana.setIcon(ventanasIcon[0]);
		lblVentana.setBounds(92, 24, 150, 150);
		panelVentana.add(lblVentana);

		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.setRequestFocusEnabled(false);
		JButton btnCerrarV = new JButton("Cerrar");
		btnCerrarV.setRequestFocusEnabled(false);

		btnCerrarV.setEnabled(false);

		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCerrarV.setEnabled(true);
				if(ventanas == 0) {
					ventanas++;
					lblVentana.setIcon(ventanasIcon[ventanas]);
					controlador.getHabitacion().setVentanaIzq(ventanas);
				}else if (ventanas == 1) {
					ventanas++;
					lblVentana.setIcon(ventanasIcon[ventanas]);
					btnAbrir.setEnabled(false);
					controlador.getHabitacion().setVentanaIzq(ventanas);
				}
			}
		});
		btnAbrir.setBounds(59, 185, 78, 44);
		panelVentana.add(btnAbrir);

		btnCerrarV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAbrir.setEnabled(true);
				if(ventanas==2) {
					ventanas--;
					lblVentana.setIcon(ventanasIcon[ventanas]);
					controlador.getHabitacion().setVentanaIzq(ventanas);
				} else if(ventanas == 1) {
					ventanas --;
					lblVentana.setIcon(ventanasIcon[ventanas]);
					btnCerrarV.setEnabled(false);
					controlador.getHabitacion().setVentanaIzq(ventanas);
				}
			}
		});
		btnCerrarV.setBounds(196, 185, 78, 44);
		panelVentana.add(btnCerrarV);

		JPanel panelPersiana = new JPanel();
		panelPersiana.setBorder(new TitledBorder(
				new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
						new Color(0, 109, 240), new Color(0, 109, 240)),
				"Persianas", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
		panelPersiana.setLayout(null);
		panelPersiana.setBounds(354, 64, 334, 240);
		add(panelPersiana);

		JButton btnSubir = new JButton("");
		btnSubir.setRequestFocusEnabled(false);
		JButton btnBajar = new JButton("");
		btnBajar.setRequestFocusEnabled(false);

		btnSubir.setEnabled(false);
		btnSubir.setIcon(
				new ImageIcon(PanelHabitacionEmergenteVentana.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnSubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (persianas > 1) {
					persianas--;
					lblPersiana.setIcon(persianasIcon[persianas]);
					btnBajar.setEnabled(true);
					controlador.getHabitacion().setPersianaIzq(persianas);
				} else if (persianas == 1) {
					persianas--;
					lblPersiana.setIcon(persianasIcon[persianas]);
					btnSubir.setEnabled(false);
					controlador.getHabitacion().setPersianaIzq(persianas);
				}
			}
		});
		btnSubir.setBounds(59, 185, 78, 44);
		panelPersiana.add(btnSubir);

		lblPersiana.setIcon(persianasIcon[0]);
		lblPersiana.setBounds(92, 24, 150, 150);
		panelPersiana.add(lblPersiana);

		btnBajar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (persianas < 3) {
					persianas++;
					btnSubir.setEnabled(true);
					lblPersiana.setIcon(persianasIcon[persianas]);
					controlador.getHabitacion().setPersianaIzq(persianas);
				} else if (persianas == 3) {
					persianas++;
					lblPersiana.setIcon(persianasIcon[persianas]);
					btnBajar.setEnabled(false);
					controlador.getHabitacion().setPersianaIzq(persianas);
				}

			}
		});
		btnBajar.setIcon(
				new ImageIcon(PanelHabitacionEmergenteVentana.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnBajar.setBounds(196, 185, 78, 44);
		panelPersiana.add(btnBajar);

		JLabel lblTitulo = new JLabel("Control de la ventana");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(10, 31, 167, 14);
		add(lblTitulo);
	}
}
