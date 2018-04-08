package vista;

import java.awt.Dimension;

import javax.swing.JPanel;

import controlador.MicroControladorPanelServicios;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PanelServicios extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanel panelServiciosPrincipal;
	private JPanel contentedorPanelServiciosEmergente;
	private JPanel panelServiciosEmergente;
	private MicroControladorPanelServicios m;

	public PanelServicios() {
		this.setSize(new Dimension(931, 483));
		this.setName("panelServicios");
		setLayout(new CardLayout(0, 0));
		
		panelServiciosPrincipal = new PanelServiciosPrincipal(this);
		add(panelServiciosPrincipal, panelServiciosPrincipal.getName());
		
		contentedorPanelServiciosEmergente = new JPanel();
		contentedorPanelServiciosEmergente.setName("contenedorPanelServiciosEmergente");
		add(contentedorPanelServiciosEmergente, contentedorPanelServiciosEmergente.getName());
		contentedorPanelServiciosEmergente.setLayout(null);
		
		panelServiciosEmergente = new PanelServiciosEmergente(this);
		panelServiciosEmergente.setBounds(118, 84, 695, 315);
		contentedorPanelServiciosEmergente.add(panelServiciosEmergente);
		
		JLabel lblImagenFondo = new JLabel("");
		lblImagenFondo.setIcon(new ImageIcon(PanelServicios.class.getResource("/iconos/imagenPanelServiciosFondoEditada.jpg")));
		lblImagenFondo.setBounds(0, 0, 931, 483);
		contentedorPanelServiciosEmergente.add(lblImagenFondo);
		
		m = new MicroControladorPanelServicios(panelServiciosPrincipal, panelServiciosEmergente);
	}
	
	void changeToPanelServicios() {
		CardLayout l = (CardLayout) getLayout();
		l.show(this, panelServiciosPrincipal.getName());
	}
	
	void changeToPanelEmergente() {
		CardLayout l = (CardLayout) getLayout();
		l.show(this, contentedorPanelServiciosEmergente.getName());
	}
}
