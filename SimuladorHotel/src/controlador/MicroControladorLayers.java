package controlador;

import java.awt.Component;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class MicroControladorLayers {
	JLayeredPane contenedorPadre;
	JPanel panel;
	
	public MicroControladorLayers(JLayeredPane contenedorPadre) {
		this.contenedorPadre = contenedorPadre;
	}
	
	public MicroControladorLayers(JLayeredPane contenedorPadre, JPanel panel) {
		this.contenedorPadre = contenedorPadre;
		this.panel = panel;
	}
	
	public void changeLayer(Component c, int layer) {
		contenedorPadre.setLayer(c, layer);
	}
	
	public void changeLayer(int layer) {
		contenedorPadre.setLayer(panel, layer);
	}
}