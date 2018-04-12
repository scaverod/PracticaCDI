package vista;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import controlador.Controlador;
import controlador.MicroControladorLayers;
import controlador.MicroControladorPanelesPadreHijo;
import idiomas.Texto;
import idiomas.TextoManager;
import tiposVariable.StringDouble;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PanelServiciosEmergenteTaxi extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	
	// FIXME: temporal para que salga el texto en vez de "<dynamic>"
	// Habría que mandarlo desde el Main, por ejemplo
	private Texto t = new TextoManager(TextoManager.español).getTexto();

	public PanelServiciosEmergenteTaxi(MicroControladorPanelesPadreHijo microControlador, String padre, Controlador controlador) {
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102)));
		this.setSize(new Dimension(695, 315));
		this.setName("p" + this.getClass().getSimpleName().substring(1)); // No modificar
		setLayout(null);
		
		panelContenedor = new JLayeredPane();
		panelContenedor.setBounds(0, 0, 695, 315);
		add(panelContenedor);
		panelContenedor.setLayout(null);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240)));
		panelPrincipal.setBounds(0, 0, 695, 315);
		panelContenedor.setLayer(panelPrincipal, 1);
		panelContenedor.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		panelConfirmacion = new PanelConfirmacion(new MicroControladorLayers(panelContenedor), this.getName());
		panelConfirmacion.setBounds(147, 57, 400, 200);
		panelContenedor.setLayer(panelConfirmacion, 0);
		panelContenedor.add(panelConfirmacion);
		
		JButton btnCerrar = new JButton(t.getBtnCerrar());
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // No modificar
				// Devuelve control al padre
				microControlador.cambiarPanel(padre);
			}
		});
		btnCerrar.setBounds(596, 11, 89, 23);
		panelPrincipal.add(btnCerrar);

		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(t.getPanelServiciosEmergenteTaxiTxt());
		txtpnInfo.setBounds(45, 63, 593, 75);
		panelPrincipal.add(txtpnInfo);

		JButton btnCabify = new JButton("");
		btnCabify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// FIXME: abrir ventana confirmacion
//				generarGasto("Cabifay", controlador);
			}
		});
		btnCabify.setContentAreaFilled(false);
		btnCabify.setIcon(new ImageIcon(PanelServiciosEmergenteTaxi.class.getResource("/iconos/cabify.png")));
		btnCabify.setBounds(296, 138, 100, 90);
		panelPrincipal.add(btnCabify);

		JButton btnUber = new JButton("");
		btnUber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// FIXME: abrir ventana confirmacion
//				generarGasto("Uber", controlador);
			}
		});
		btnUber.setContentAreaFilled(false);
		btnUber.setIcon(new ImageIcon(PanelServiciosEmergenteTaxi.class.getResource("/iconos/Uber.png")));
		btnUber.setBounds(494, 138, 100, 90);
		panelPrincipal.add(btnUber);

		JButton btnTaxi = new JButton("");
		btnTaxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// FIXME: abrir ventana confirmacion
//				generarGasto("Taxi", controlador);
			}
		});
		btnTaxi.setContentAreaFilled(false);
		btnTaxi.setIcon(new ImageIcon(PanelServiciosEmergenteTaxi.class.getResource("/iconos/taxi2.png")));
		btnTaxi.setBounds(98, 138, 100, 90);
		panelPrincipal.add(btnTaxi);

		JPanel panelPrecio = new JPanel();
		panelPrecio.setBackground(new Color(255, 255, 153));
		panelPrecio.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecio.setForeground(Color.ORANGE);
		panelPrecio.setBounds(51, 248, 593, 35);
		panelPrincipal.add(panelPrecio);

		JLabel lblPrecio = new JLabel(t.getLblCoste());
		panelPrecio.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel labelPrecioYPwd = new JLabel(
				String.valueOf(controlador.getServicios().getTaxi().getPrecio()) + " \u20AC");
		panelPrecio.add(labelPrecioYPwd);
		labelPrecioYPwd.setFont(new Font("Tahoma", Font.PLAIN, 15));

	}

	public void generarGasto(String compania, Controlador controlador) {
		controlador.getCuenta().getGasto().addGasto(
				new StringDouble("Contrata servicio " + compania, controlador.getServicios().getTaxi().getPrecio()));
	}
	
	public void cerrarPanelConfirmacion() {
		panelContenedor.setLayer(panelConfirmacion, 0);
	}
}
