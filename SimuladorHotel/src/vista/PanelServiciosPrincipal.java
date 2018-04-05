package vista;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PanelServiciosPrincipal extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelServiciosPrincipal() {
		this.setSize(new Dimension(931, 483));
		this.setName("panelServicios");
		
		// NOTA: he usado absolute layout porque viene bien para este caso y el group layout se rompe cada vez que tienes que mover algo cuando hay tantas cosas
		setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 931, 483);
		add(layeredPane);
		
		JPanel ventanaEmergente = new JPanel();
		ventanaEmergente.setBounds(150, 60, 629, 339);
		layeredPane.add(ventanaEmergente);
		layeredPane.setLayer(ventanaEmergente, 0);
		
		JButton btnPene = new JButton("PENE");
		GroupLayout gl_ventanaEmergente = new GroupLayout(ventanaEmergente);
		gl_ventanaEmergente.setHorizontalGroup(
			gl_ventanaEmergente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ventanaEmergente.createSequentialGroup()
					.addGap(136)
					.addComponent(btnPene, GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
					.addGap(136))
		);
		gl_ventanaEmergente.setVerticalGroup(
			gl_ventanaEmergente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ventanaEmergente.createSequentialGroup()
					.addGap(87)
					.addComponent(btnPene, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
					.addGap(87))
		);
		ventanaEmergente.setLayout(gl_ventanaEmergente);
		
		JPanel listaServicios = new PanelServicios();
		layeredPane.setLayer(listaServicios, 1);
		listaServicios.setBounds(0, 0, 931, 483);
		layeredPane.add(listaServicios);
	}
}
