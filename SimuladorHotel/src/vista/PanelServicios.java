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
	private JPanel panelServiciosEmergente;
	private JPanel contenedor;
	private MicroControladorPanelesPadreHijo m;

	public PanelServicios() {
		this.setSize(new Dimension(931, 483));
		this.setName("panelServicios");
		setLayout(null);
		
		contenedor = new JPanel();
		contenedor.setBounds(0, 0, 931, 483);
		add(contenedor);
		contenedor.setLayout(new CardLayout(0, 0));
		
		m = new MicroControladorPanelesPadreHijo(contenedor);
		
		// FIXME: esto no deberia ser asi; funciona, pero no es la mejor manera de hacerlo
		panelServiciosPrincipal = new PanelServiciosPrincipal(m, "contenedorPanelServiciosEmergente");
		contenedor.add(panelServiciosPrincipal, panelServiciosPrincipal.getName());
		
		contentedorPanelServiciosEmergente = new JPanel();
		contentedorPanelServiciosEmergente.setName("contenedorPanelServiciosEmergente");
		contenedor.add(contentedorPanelServiciosEmergente, contentedorPanelServiciosEmergente.getName());
		contentedorPanelServiciosEmergente.setLayout(null);
		
		// FIXME: esto no deberia ser asi; funciona, pero no es la mejor manera de hacerlo
		panelServiciosEmergente = new PanelServiciosEmergente(m, "panelServiciosPrincipal");
		panelServiciosEmergente.setBounds(118, 84, 695, 315);
		contentedorPanelServiciosEmergente.add(panelServiciosEmergente);
		
		JLabel lblImagenFondo = new JLabel("");
		lblImagenFondo.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/imagenPanelServiciosFondoEditada.jpg")));
		lblImagenFondo.setBounds(0, 0, 931, 483);
		contentedorPanelServiciosEmergente.add(lblImagenFondo);
	}
}
