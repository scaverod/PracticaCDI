package controlador;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class MicroControladorPanelesPadreHijo {
	private JPanel contenedor;
	
	public MicroControladorPanelesPadreHijo(JPanel contenedor) {
		this.contenedor = contenedor;
	}

	public void cambiarPanel(String cardName) {
		CardLayout l = (CardLayout) contenedor.getLayout();
		l.show(contenedor, cardName);
	}
}