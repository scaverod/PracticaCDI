package controlador;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class MicroControladorLayersPadreHijo {
	JLayeredPane contenedorPadre;
	JPanel panel;
	
	public MicroControladorLayersPadreHijo(JLayeredPane contenedorPadre, JPanel panel) {
		this.contenedorPadre = contenedorPadre;
		this.panel = panel;
	}
	
	public void changeLayer(int layer) {
		contenedorPadre.setLayer(panel, layer);
	}
}