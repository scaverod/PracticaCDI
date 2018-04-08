package vista;

import java.awt.Dimension;

import javax.swing.JPanel;

import controlador.MicroControladorPanelesPadreHijo;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PanelServicios extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanel panelServiciosPrincipal;
	private JPanel contentedorPanelServiciosEmergente;
	private JPanel ventanaEmergente;
	private JPanel contenedor;
	private MicroControladorPanelesPadreHijo m;
	private JPanel panel;

	public PanelServicios() {
		this.setSize(new Dimension(931, 483));
		this.setName("panelServicios");
		setLayout(null);
		
		contenedor = new JPanel();
		contenedor.setBounds(0, 0, 931, 483);
		add(contenedor);
		contenedor.setLayout(new CardLayout(0, 0));
		
		m = new MicroControladorPanelesPadreHijo(contenedor);
		
		contentedorPanelServiciosEmergente = new JPanel();
		contentedorPanelServiciosEmergente.setName("contenedorPanelServiciosEmergente");
		contentedorPanelServiciosEmergente.setLayout(null);
		
		panelServiciosPrincipal = new PanelServiciosPrincipal(m, contentedorPanelServiciosEmergente.getName());
		
		contenedor.add(panelServiciosPrincipal, panelServiciosPrincipal.getName());
		contenedor.add(contentedorPanelServiciosEmergente, contentedorPanelServiciosEmergente.getName());
		
		ventanaEmergente = new JPanel();
		ventanaEmergente.setBounds(118, 84, 695, 315);
		contentedorPanelServiciosEmergente.add(ventanaEmergente);
		ventanaEmergente.setLayout(new CardLayout(0, 0));
		
		panel = new PanelServiciosEmergenteToallas(m, "nusep");
		ventanaEmergente.add(panel, "name_27882405820171");
		
		JLabel lblImagenFondo = new JLabel("");
		lblImagenFondo.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/imagenPanelServiciosFondoEditada.jpg")));
		lblImagenFondo.setBounds(0, 0, 931, 483);
		contentedorPanelServiciosEmergente.add(lblImagenFondo);
	}
}
