//package vista;
//
//import java.awt.Dimension;
//
//import javax.swing.JPanel;
//
//import java.awt.CardLayout;
//import javax.swing.JLabel;
//import javax.swing.ImageIcon;
//
//public class PanelServicios_OFF extends JPanel {
//	private static final long serialVersionUID = 1L;
//	private JPanel panelServiciosPrincipal;
//	private JPanel panelServiciosEmergente;
//	private JPanel ventanaEmergente;
//
//	public PanelServicios_OFF() {
//		this.setSize(new Dimension(931, 483));
//		this.setName("panelServicios");
//		setLayout(new CardLayout(0, 0));
//		
//		panelServiciosPrincipal = new PanelServicios();
//		add(panelServiciosPrincipal, "name_37268578413940");
//		
//		panelServiciosEmergente = new JPanel();
//		add(panelServiciosEmergente, "name_37268585647109");
//		panelServiciosEmergente.setName("contenedorPanelServiciosEmergente");
//		panelServiciosEmergente.setLayout(null);
//		
//		ventanaEmergente = new PanelServiciosEmergenteToallas();
//		ventanaEmergente.setBounds(118, 84, 695, 315);
//		panelServiciosEmergente.add(ventanaEmergente);
//		ventanaEmergente.setLayout(null);
//		
//		JLabel lblImagenFondo = new JLabel("");
//		lblImagenFondo.setIcon(new ImageIcon(PanelServicios_OFF.class.getResource("/iconos/imagenPanelServiciosFondoEditada.jpg")));
//		lblImagenFondo.setBounds(0, 0, 931, 483);
//		panelServiciosEmergente.add(lblImagenFondo);
//	}
//}
