package vista;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import controlador.Controlador;
import idiomas.Texto;
import idiomas.TextoManager;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;

public class PanelCuenta extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Texto t = new TextoManager(TextoManager.english).getTexto();
	private final ButtonGroup btnIdiomas = new ButtonGroup();

	/**
	 * Create the panel.
	 */

	public PanelCuenta(Controlador controlador) {
		this.setSize(new Dimension(931, 483));
		this.setName("panelCuenta");

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

		JLabel lblElegirIdioma = new JLabel("Elegir idioma");
		lblElegirIdioma.setHorizontalAlignment(SwingConstants.CENTER);
		lblElegirIdioma.setBounds(166, 11, 104, 19);
		lblElegirIdioma.setFont(new Font("Tahoma", Font.BOLD, 15));

		JToggleButton btnESP = new JToggleButton("");
		btnESP.setBounds(31, 44, 108, 69);
		btnESP.setSelected(true);
		btnESP.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/espa\u00F1a.png")));
		btnESP.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/espa\u00F1aSelected.png")));
		btnESP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIdiomas.add(btnESP);
		btnESP.setOpaque(false);
		btnESP.setContentAreaFilled(false);

		JToggleButton btnUK = new JToggleButton("");
		btnUK.setBounds(170, 44, 108, 69);
		btnUK.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/ukSelected.png")));
		btnIdiomas.add(btnUK);
		btnUK.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/uk.png")));
		btnUK.setOpaque(false);
		btnUK.setContentAreaFilled(false);

		JToggleButton toggleButton = new JToggleButton("");
		toggleButton.setBounds(309, 44, 108, 69);
		toggleButton.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/rumaniaSelected.png")));
		btnIdiomas.add(toggleButton);
		toggleButton.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/rumania.png")));
		toggleButton.setOpaque(false);
		toggleButton.setContentAreaFilled(false);

		JLabel lblNewLabel = new JLabel("Castellano");
		lblNewLabel.setBounds(45, 116, 90, 26);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblIngls = new JLabel("Ingl\u00E9s");
		lblIngls.setBounds(180, 116, 90, 26);
		lblIngls.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblRumano = new JLabel("Rumano");
		lblRumano.setBounds(315, 116, 90, 26);
		lblRumano.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnLogout = new JButton("");
		btnLogout.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/logout.png")));
		panelLogout.add(btnLogout);
		btnLogout.setOpaque(true);
		btnLogout.setContentAreaFilled(false);
		setLayout(null);
		add(lblHabitacion);
		add(panelLogout);
		add(panelIdioma);
		panelIdioma.setLayout(null);
		panelIdioma.add(lblElegirIdioma);
		panelIdioma.add(lblNewLabel);
		panelIdioma.add(lblIngls);
		panelIdioma.add(lblRumano);
		panelIdioma.add(btnESP);
		panelIdioma.add(btnUK);
		panelIdioma.add(toggleButton);

		JPanel panelGasto = new JPanel();
		panelGasto.setLayout(null);
		panelGasto.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGasto.setBounds(468, 278, 451, 157);
		add(panelGasto);
		panelGasto.setBorder(new LineBorder(Color.decode("#006df0"), 5, true));

		JLabel lblGasto = new JLabel("Gastos");
		lblGasto.setHorizontalAlignment(SwingConstants.CENTER);
		lblGasto.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGasto.setBounds(186, 11, 79, 19);
		panelGasto.add(lblGasto);

		JButton btnMsDetalles = new JButton("M\u00E1s detalles...");
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
		
		JLabel lblGastoNumero = new JLabel("130.50 \u20AC");
		lblGastoNumero.setBackground(Color.ORANGE);
		lblGastoNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblGastoNumero.setBounds(122, 0, 103, 49);
		panelBorde.add(lblGastoNumero);
		lblGastoNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
				JLabel lblGastoTotal = new JLabel("Gasto total:");
				lblGastoTotal.setBounds(0, 0, 123, 49);
				panelBorde.add(lblGastoTotal);
				lblGastoTotal.setHorizontalAlignment(SwingConstants.CENTER);
				lblGastoTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JPanel panelPersonalizar = new JPanel();
		panelPersonalizar.setLayout(null);
		panelPersonalizar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelPersonalizar.setBounds(9, 113, 451, 322);
		add(panelPersonalizar);
		panelPersonalizar.setBorder(new LineBorder(Color.decode("#006df0"), 5, true));

		JLabel lblPersonalizar = new JLabel("Personalizar");
		lblPersonalizar.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalizar.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPersonalizar.setBounds(174, 11, 103, 19);
		panelPersonalizar.add(lblPersonalizar);
		
		JLabel lblModoNocturno = new JLabel("Modo nocturno");
		lblModoNocturno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModoNocturno.setBounds(66, 39, 132, 31);
		panelPersonalizar.add(lblModoNocturno);
		
		JToggleButton tglbtnModoNocturno = new JToggleButton("");
		tglbtnModoNocturno.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonON.png")));
		tglbtnModoNocturno.setContentAreaFilled(false);
		tglbtnModoNocturno.setBorderPainted(false);
		tglbtnModoNocturno.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonOFF.png")));
		tglbtnModoNocturno.setBounds(264, 33, 121, 39);
		panelPersonalizar.add(tglbtnModoNocturno);
		
		JLabel lblInvertirColores = new JLabel("Invertir colores");
		lblInvertirColores.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInvertirColores.setBounds(66, 109, 132, 31);
		panelPersonalizar.add(lblInvertirColores);
		
		JLabel lblSalidaTexto = new JLabel("Salida de texto por voz");
		lblSalidaTexto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSalidaTexto.setBounds(66, 179, 163, 31);
		panelPersonalizar.add(lblSalidaTexto);
		
		JLabel lblAumentarTexto = new JLabel("Aumentar texto");
		lblAumentarTexto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAumentarTexto.setBounds(66, 249, 132, 31);
		panelPersonalizar.add(lblAumentarTexto);
		
		JToggleButton tglbtnInvertirColores = new JToggleButton("");
		tglbtnInvertirColores.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonON.png")));
		tglbtnInvertirColores.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonOFF.png")));
		tglbtnInvertirColores.setContentAreaFilled(false);
		tglbtnInvertirColores.setBorderPainted(false);
		tglbtnInvertirColores.setBounds(264, 105, 121, 39);
		panelPersonalizar.add(tglbtnInvertirColores);
		
		JToggleButton tglbtnSalidaTexto = new JToggleButton("");
		tglbtnSalidaTexto.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonON.png")));
		tglbtnSalidaTexto.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonOFF.png")));
		tglbtnSalidaTexto.setContentAreaFilled(false);
		tglbtnSalidaTexto.setBorderPainted(false);
		tglbtnSalidaTexto.setBounds(264, 177, 121, 39);
		panelPersonalizar.add(tglbtnSalidaTexto);
		
		JToggleButton tglbtnAumentarTexto = new JToggleButton("");
		tglbtnAumentarTexto.setSelectedIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonON.png")));
		tglbtnAumentarTexto.setIcon(new ImageIcon(PanelCuenta.class.getResource("/iconos/botonOFF.png")));
		tglbtnAumentarTexto.setContentAreaFilled(false);
		tglbtnAumentarTexto.setBorderPainted(false);
		tglbtnAumentarTexto.setBounds(264, 249, 121, 39);
		panelPersonalizar.add(tglbtnAumentarTexto);
	}
}
