package vista;

import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PanelServiciosPrincipal extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanel panelServicios;
	private JPanel contentedorPanelServiciosEmergente;

	public PanelServiciosPrincipal() {
		this.setSize(new Dimension(931, 483));
		this.setName("panelServiciosPrincipal");
		setLayout(new CardLayout(0, 0));
		
		panelServicios = new PanelServicios();
		add(panelServicios, panelServicios.getName());
		
		contentedorPanelServiciosEmergente = new JPanel();
		add(contentedorPanelServiciosEmergente, "contenedorPanelServiciosEmergente");
		contentedorPanelServiciosEmergente.setLayout(null);
		
		JPanel PanelServiciosEmergente = new PanelServiciosEmergente();
		PanelServiciosEmergente.setBounds(118, 84, 695, 315);
		contentedorPanelServiciosEmergente.add(PanelServiciosEmergente);
		
		JLabel lblImagenFondo = new JLabel("");
		lblImagenFondo.setIcon(new ImageIcon(PanelServiciosPrincipal.class.getResource("/iconos/imagenPanelServiciosFondoEditada.jpg")));
		lblImagenFondo.setBounds(0, 0, 931, 483);
		contentedorPanelServiciosEmergente.add(lblImagenFondo);
		
		// Cambiar al panel emergente
		changeToPanelEmergente();
		
		// Cambiar al panel servicios
		changeToPanelServicios();
	}
	
	private void changeToPanelServicios() {
		CardLayout l = (CardLayout) getLayout();
		l.show(this, panelServicios.getName());
	}
	
	private void changeToPanelEmergente() {
		CardLayout l = (CardLayout) getLayout();
		l.show(this, contentedorPanelServiciosEmergente.getName());
	}
}
