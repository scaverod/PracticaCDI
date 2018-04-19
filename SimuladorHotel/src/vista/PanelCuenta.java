package vista;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import controlador.Controlador;
import controlador.MicroControladorLayersPadreHijo;
import idiomas.Texto;
import idiomas.TextoManager;
import modelo.Cuenta.Idioma;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import javax.swing.JLayeredPane;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelCuenta extends JPanel {
	private static final long serialVersionUID = 1L;
	private Texto t;
	private final ButtonGroup grupoBtnIdiomas = new ButtonGroup();
	private JPanel panelPrincipal;
	private JLayeredPane layeredPane;
	private JPanel panelEmergenteContenedor;
	private JPanel panelDetalles;

	public PanelCuenta(Controlador controlador) {

		this.setSize(new Dimension(931, 483));
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		t = controlador.getTexto();
		JLabel lblHabitacion = new JLabel(t.getLblCuentaHabitacion() + ": " + controlador.getCuenta().getUsuario());
		lblHabitacion.setBounds(10, 11, 829, 47);
		lblHabitacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblHabitacion.setOpaque(true);
		lblHabitacion.setForeground(new Color(255, 255, 255));
		lblHabitacion.setBackground(Color.decode("#006df0"));
		lblHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		// TODO: Cambiar para que quede más bonito
		lblHabitacion.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));

		JPanel panelLogout = new JPanel();
		panelLogout.setBounds(843, 11, 76, 47);
		panelLogout.setBackground(Color.ORANGE);

		JPanel panelIdioma = new JPanel();
		panelIdioma.setBorder(new LineBorder(Color.decode("#006df0"), 5, true));
		panelIdioma.setBounds(469, 113, 451, 157);

		JLabel lblElegirIdioma = new JLabel(t.getLblElegirIdioma());
		lblElegirIdioma.setHorizontalAlignment(SwingConstants.CENTER);
		lblElegirIdioma.setBounds(153, 11, 144, 19);
		lblElegirIdioma.setFont(new Font("Tahoma", Font.BOLD, 15));

		JToggleButton btnESP = new JToggleButton("");
		btnESP.setBounds(31, 44, 108, 69);
		btnESP.setSelected(true);
		btnESP.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/espa\u00F1a.png")));
		btnESP.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/espa\u00F1aSelected.png")));
		grupoBtnIdiomas.add(btnESP);
		btnESP.setOpaque(false);
		btnESP.setContentAreaFilled(false);

		JToggleButton btnUK = new JToggleButton("");

		btnUK.setBounds(170, 44, 108, 69);
		btnUK.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/ukSelected.png")));
		grupoBtnIdiomas.add(btnUK);
		btnUK.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/uk.png")));
		btnUK.setOpaque(false);
		btnUK.setContentAreaFilled(false);

		JToggleButton btnRU = new JToggleButton("");

		btnRU.setBounds(309, 44, 108, 69);
		btnRU.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/rumaniaSelected.png")));
		grupoBtnIdiomas.add(btnRU);
		btnRU.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/rumania.png")));
		btnRU.setOpaque(false);
		btnRU.setContentAreaFilled(false);

		JLabel lblCastellano = new JLabel("Español");
		lblCastellano.setBounds(31, 116, 108, 26);
		lblCastellano.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblIngles = new JLabel("English");
		lblIngles.setBounds(170, 116, 108, 26);
		lblIngles.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblRumano = new JLabel("Română");
		lblRumano.setBounds(309, 116, 108, 26);
		lblRumano.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnLogout = new JButton("");
		btnLogout.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/logout.png")));
		panelLogout.add(btnLogout);
		btnLogout.setOpaque(true);
		btnLogout.setContentAreaFilled(false);
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
		panelPrincipal.add(lblHabitacion);
		panelPrincipal.add(panelLogout);
		panelPrincipal.add(panelIdioma);
		panelIdioma.setLayout(null);
		panelIdioma.add(lblElegirIdioma);
		panelIdioma.add(lblCastellano);
		panelIdioma.add(lblIngles);
		panelIdioma.add(lblRumano);
		panelIdioma.add(btnESP);
		panelIdioma.add(btnUK);
		panelIdioma.add(btnRU);

		JPanel panelGasto = new JPanel();
		panelGasto.setLayout(null);
		panelGasto.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGasto.setBounds(468, 278, 451, 157);
		panelPrincipal.add(panelGasto);
		panelGasto.setBorder(new LineBorder(Color.decode("#006df0"), 5, true));

		JLabel lblGasto = new JLabel(t.getLblGasto());
		lblGasto.setHorizontalAlignment(SwingConstants.CENTER);
		lblGasto.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGasto.setBounds(186, 11, 79, 19);
		panelGasto.add(lblGasto);

		JButton btnMsDetalles = new JButton(t.getBtnMsDetalles());
		btnMsDetalles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToVentanaEmergente(panelDetalles);
			}
		});
		btnMsDetalles.setBorder(new LineBorder(Color.decode("#9bbfe3"), 3, true));
		btnMsDetalles.setContentAreaFilled(false);
		btnMsDetalles.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/details.png")));
		btnMsDetalles.setBounds(273, 54, 153, 49);
		panelGasto.add(btnMsDetalles);

		JPanel panelBorde = new JPanel();
		panelBorde.setBackground(Color.decode("#bed5ed"));
		panelBorde.setBorder(new LineBorder(Color.decode("#9bbfe3"), 3, true));
		panelBorde.setBounds(24, 54, 225, 49);
		panelGasto.add(panelBorde);
		panelBorde.setLayout(null);

		JLabel lblGastoNumero = new JLabel(controlador.getCuenta().getGasto().getGastoTotal() + " \u20AC");
		lblGastoNumero.setBackground(Color.ORANGE);
		lblGastoNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblGastoNumero.setBounds(122, 0, 103, 49);
		panelBorde.add(lblGastoNumero);
		lblGastoNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblGastoTotal = new JLabel(t.getLblGastoTotal());
		lblGastoTotal.setBounds(0, 0, 123, 49);
		panelBorde.add(lblGastoTotal);
		lblGastoTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblGastoTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JPanel panelPersonalizar = new JPanel();
		panelPersonalizar.setLayout(null);
		panelPersonalizar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelPersonalizar.setBounds(9, 113, 451, 322);
		panelPrincipal.add(panelPersonalizar);
		panelPersonalizar.setBorder(new LineBorder(Color.decode("#006df0"), 5, true));

		JLabel lblPersonalizar = new JLabel(t.getLblPersonalizar());
		lblPersonalizar.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalizar.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPersonalizar.setBounds(174, 11, 103, 19);
		panelPersonalizar.add(lblPersonalizar);

		JLabel lblModoNocturno = new JLabel(t.getLblModoNocturno());
		lblModoNocturno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModoNocturno.setBounds(66, 39, 132, 31);
		panelPersonalizar.add(lblModoNocturno);

		JToggleButton tglbtnModoNocturno = new JToggleButton();
		tglbtnModoNocturno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (controlador.getCuenta().getPersonalizacion().isModoNocturno()) {
					controlador.getCuenta().getPersonalizacion().setModoNocturno(false);
				} else {
					controlador.getCuenta().getPersonalizacion().setModoNocturno(true);
				}
			}
		});
		tglbtnModoNocturno.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonON.png")));
		tglbtnModoNocturno.setContentAreaFilled(false);
		tglbtnModoNocturno.setBorderPainted(false);
		tglbtnModoNocturno.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonOFF.png")));
		tglbtnModoNocturno.setBounds(264, 33, 121, 39);
		panelPersonalizar.add(tglbtnModoNocturno);

		JLabel lblInvertirColores = new JLabel(t.getLblInvertirColores());
		lblInvertirColores.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInvertirColores.setBounds(66, 109, 132, 31);
		panelPersonalizar.add(lblInvertirColores);

		JLabel lblSalidaTexto = new JLabel(t.getLblSalidaTexto());
		lblSalidaTexto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSalidaTexto.setBounds(66, 179, 163, 31);
		panelPersonalizar.add(lblSalidaTexto);

		JLabel lblAumentarTexto = new JLabel(t.getLblAumentarTexto());
		lblAumentarTexto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAumentarTexto.setBounds(66, 249, 132, 31);
		panelPersonalizar.add(lblAumentarTexto);

		JToggleButton tglbtnInvertirColores = new JToggleButton("");
		tglbtnInvertirColores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (controlador.getCuenta().getPersonalizacion().isInvertiColores()) {
					controlador.getCuenta().getPersonalizacion().setInvertiColores(false);
				} else {
					controlador.getCuenta().getPersonalizacion().setInvertiColores(true);
				}
			}
		});
		tglbtnInvertirColores.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonON.png")));
		tglbtnInvertirColores.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonOFF.png")));
		tglbtnInvertirColores.setContentAreaFilled(false);
		tglbtnInvertirColores.setBorderPainted(false);
		tglbtnInvertirColores.setBounds(264, 105, 121, 39);
		panelPersonalizar.add(tglbtnInvertirColores);

		JToggleButton tglbtnSalidaTexto = new JToggleButton("");
		tglbtnSalidaTexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (controlador.getCuenta().getPersonalizacion().isTextoVoz()) {
					controlador.getCuenta().getPersonalizacion().setTextoVoz(false);
				} else {
					controlador.getCuenta().getPersonalizacion().setTextoVoz(true);
				}
			}
		});
		tglbtnSalidaTexto.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonON.png")));
		tglbtnSalidaTexto.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonOFF.png")));
		tglbtnSalidaTexto.setContentAreaFilled(false);
		tglbtnSalidaTexto.setBorderPainted(false);
		tglbtnSalidaTexto.setBounds(264, 177, 121, 39);
		panelPersonalizar.add(tglbtnSalidaTexto);

		JToggleButton tglbtnAumentarTexto = new JToggleButton("");
		tglbtnAumentarTexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (controlador.getCuenta().getPersonalizacion().isAumentoTexto()) {
					controlador.getCuenta().getPersonalizacion().setAumentoTexto(false);
				} else {
					controlador.getCuenta().getPersonalizacion().setAumentoTexto(true);
				}
			}
		});
		tglbtnAumentarTexto.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonON.png")));
		tglbtnAumentarTexto.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonOFF.png")));
		tglbtnAumentarTexto.setContentAreaFilled(false);
		tglbtnAumentarTexto.setBorderPainted(false);
		tglbtnAumentarTexto.setBounds(264, 249, 121, 39);
		panelPersonalizar.add(tglbtnAumentarTexto);

		panelEmergenteContenedor = new JPanel();
		panelEmergenteContenedor.setSize(400, 330);
		panelEmergenteContenedor.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getNewValue().equals(0)) {
					// TODO: reactivar elementos del panelPrincipal (ahora panel al frente)
					lblHabitacion.setEnabled(true);
					lblElegirIdioma.setEnabled(true);
					lblCastellano.setEnabled(true);
					lblIngles.setEnabled(true);
					lblRumano.setEnabled(true);
					btnESP.setEnabled(true);
					btnUK.setEnabled(true);
					btnRU.setEnabled(true);
					lblGasto.setEnabled(true);
					btnMsDetalles.setEnabled(true);
					lblGastoNumero.setEnabled(true);
					lblGastoTotal.setEnabled(true);
					lblPersonalizar.setEnabled(true);
					lblModoNocturno.setEnabled(true);
					tglbtnModoNocturno.setEnabled(true);
					lblInvertirColores.setEnabled(true);
					lblSalidaTexto.setEnabled(true);
					lblAumentarTexto.setEnabled(true);
					tglbtnInvertirColores.setEnabled(true);
					tglbtnSalidaTexto.setEnabled(true);
					tglbtnAumentarTexto.setEnabled(true);
					btnLogout.setEnabled(true);
				} else if (evt.getNewValue().equals(2)) {
					// TODO: desactivar elementos del panelPrincipal (ahora panel al fondo)
					lblHabitacion.setEnabled(false);
					lblElegirIdioma.setEnabled(false);
					lblCastellano.setEnabled(false);
					lblIngles.setEnabled(false);
					lblRumano.setEnabled(false);
					btnESP.setEnabled(false);
					btnUK.setEnabled(false);
					btnRU.setEnabled(false);
					lblGasto.setEnabled(false);
					btnMsDetalles.setEnabled(false);
					lblGastoNumero.setEnabled(false);
					lblGastoTotal.setEnabled(false);
					lblPersonalizar.setEnabled(false);
					lblModoNocturno.setEnabled(false);
					tglbtnModoNocturno.setEnabled(false);
					lblInvertirColores.setEnabled(false);
					lblSalidaTexto.setEnabled(false);
					lblAumentarTexto.setEnabled(false);
					tglbtnInvertirColores.setEnabled(false);
					tglbtnSalidaTexto.setEnabled(false);
					tglbtnAumentarTexto.setEnabled(false);
					btnLogout.setEnabled(false);
				}
			}
		});
		panelEmergenteContenedor.setBounds(267, 84, 397, 315);
		layeredPane.add(panelEmergenteContenedor);
		panelEmergenteContenedor.setLayout(new CardLayout(0, 0));

		panelDetalles = new PanelCuentaEmergenteDetalles(new MicroControladorLayersPadreHijo(layeredPane, panelEmergenteContenedor), controlador);
		panelEmergenteContenedor.add(panelDetalles, panelDetalles.getName());

		btnESP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.getCuenta().setIdioma(Idioma.Castellano);
				controlador.setTexto(new TextoManager(TextoManager.español).getTexto());
				t = controlador.getTexto();
				lblHabitacion.setText(t.getLblCuentaHabitacion() + ": " + controlador.getCuenta().getUsuario());
				lblElegirIdioma.setText(t.getLblElegirIdioma());
				lblAumentarTexto.setText(t.getLblAumentarTexto());
				lblSalidaTexto.setText(t.getLblSalidaTexto());
				lblInvertirColores.setText(t.getLblInvertirColores());
				lblModoNocturno.setText(t.getLblModoNocturno());
				lblPersonalizar.setText(t.getLblPersonalizar());
				lblGastoTotal.setText(t.getLblGastoTotal());
				btnMsDetalles.setText(t.getBtnMsDetalles());
				lblGasto.setText(t.getLblGasto());
			}
		});

		btnUK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.getCuenta().setIdioma(Idioma.Ingles);
				controlador.setTexto(new TextoManager(TextoManager.english).getTexto());
				t = controlador.getTexto();
				lblHabitacion.setText(t.getLblCuentaHabitacion() + ": " + controlador.getCuenta().getUsuario());
				lblElegirIdioma.setText(t.getLblElegirIdioma());
				lblAumentarTexto.setText(t.getLblAumentarTexto());
				lblSalidaTexto.setText(t.getLblSalidaTexto());
				lblInvertirColores.setText(t.getLblInvertirColores());
				lblModoNocturno.setText(t.getLblModoNocturno());
				lblPersonalizar.setText(t.getLblPersonalizar());
				lblGastoTotal.setText(t.getLblGastoTotal());
				btnMsDetalles.setText(t.getBtnMsDetalles());
				lblGasto.setText(t.getLblGasto());
			}
		});

		btnRU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.getCuenta().setIdioma(Idioma.Rumano);
				controlador.setTexto(new TextoManager(TextoManager.romana).getTexto());
				t = controlador.getTexto();
				lblHabitacion.setText(t.getLblCuentaHabitacion() + ": " + controlador.getCuenta().getUsuario());
				lblElegirIdioma.setText(t.getLblElegirIdioma());
				lblAumentarTexto.setText(t.getLblAumentarTexto());
				lblSalidaTexto.setText(t.getLblSalidaTexto());
				lblInvertirColores.setText(t.getLblInvertirColores());
				lblModoNocturno.setText(t.getLblModoNocturno());
				lblPersonalizar.setText(t.getLblPersonalizar());
				lblGastoTotal.setText(t.getLblGastoTotal());
				btnMsDetalles.setText(t.getBtnMsDetalles());
				lblGasto.setText(t.getLblGasto());
			}
		});

		// Actualizar interfaz
		if (controlador.getCuenta().getPersonalizacion().isModoNocturno()) {
			tglbtnModoNocturno.setSelected(true);
		}
		if (controlador.getCuenta().getPersonalizacion().isInvertiColores()) {
			tglbtnInvertirColores.setSelected(true);
		}
		if (controlador.getCuenta().getPersonalizacion().isTextoVoz()) {
			tglbtnSalidaTexto.setSelected(true);
		}
		if (controlador.getCuenta().getPersonalizacion().isAumentoTexto()) {
			tglbtnAumentarTexto.setSelected(true);
		}
		System.out.println();
		if (controlador.getCuenta().getIdioma() == Idioma.Castellano) {
			btnESP.setSelected(true);
		} else if (controlador.getCuenta().getIdioma() == Idioma.Ingles) {
			btnUK.setSelected(true);
		} else {
			btnRU.setSelected(true);
		}
	}

//	private void changeToPanelEmergente(JPanel subPanel) {
//		// Cambio el panel activo dentro del panel emergente
//		CardLayout l = (CardLayout) panelEmergenteContenedor.getLayout();
//		l.show(panelEmergenteContenedor, subPanel.getName());
//
//		// Pongo el panel emergente por encima del principal
//		layeredPane.setLayer(panelEmergenteContenedor, 2);
//	}
	
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
