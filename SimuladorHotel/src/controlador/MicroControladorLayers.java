package controlador;

import java.awt.Component;

import javax.swing.JLayeredPane;

public class MicroControladorLayers {
	JLayeredPane contenedorPadre;
	
	public MicroControladorLayers(JLayeredPane contenedorPadre) {
		this.contenedorPadre = contenedorPadre;
	}
	
	public void changeLayer(Component c, int layer) {
		contenedorPadre.setLayer(c, layer);
	}
}