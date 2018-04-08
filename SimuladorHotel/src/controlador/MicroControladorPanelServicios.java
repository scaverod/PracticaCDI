package controlador;

import java.awt.CardLayout;

import vista.PanelServiciosEmergente;
import vista.PanelServiciosPrincipal;

public class MicroControladorPanelServicios {
	private PanelServiciosPrincipal p;
	private PanelServiciosEmergente e;
	
	public MicroControladorPanelServicios(PanelServiciosPrincipal p, PanelServiciosEmergente e) {
		this.p = p;
		this.e = e;
	}
	
	void changeToPanelServicios() {
		CardLayout l = (CardLayout) p.getLayout();
		l.show(p, p.getName());
	}
	
	void changeToPanelEmergente() {
		CardLayout l = (CardLayout) p.getLayout();
		l.show(p, e.getName());
	}
}