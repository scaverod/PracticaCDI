package vista;

import java.awt.Dimension;

import javax.swing.JPanel;

import controlador.Controlador;
import controlador.MicroControladorLayersPadreHijo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class PanelSpa extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JPanel panelEmergenteContenedor;
	private JPanel panelPrincipal;
	private JPanel panelBase;
	private JButton btnOtroBoton;

	public PanelSpa (Controlador controlador) {
		this.setSize(new Dimension(931, 483));
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 931, 483);
		add(layeredPane);
		
		panelPrincipal = new JPanel();
		layeredPane.setLayer(panelPrincipal, 1);
		panelPrincipal.setBounds(0, 0, 931, 483);
		layeredPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JButton btnConEstoSaco = new JButton("Con esto saco un panel emergente");
		btnConEstoSaco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout l = (CardLayout) panelEmergenteContenedor.getLayout();
				l.show(panelEmergenteContenedor, panelBase.getName());
				
				layeredPane.setLayer(panelEmergenteContenedor, 2);
				btnOtroBoton.setEnabled(false);
			}
		});
		btnConEstoSaco.setBounds(290, 160, 351, 162);
		panelPrincipal.add(btnConEstoSaco);
		
		btnOtroBoton = new JButton("Otro boton");
		btnOtroBoton.setBounds(31, 36, 211, 109);
		panelPrincipal.add(btnOtroBoton);
		
		panelEmergenteContenedor = new JPanel();
		panelEmergenteContenedor.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				
				System.out.println(evt.getPropertyName());
			}
		});
		layeredPane.setLayer(panelEmergenteContenedor, 0);
		panelEmergenteContenedor.setBounds(118, 84, 695, 315);
		layeredPane.add(panelEmergenteContenedor);
		panelEmergenteContenedor.setLayout(new CardLayout(0, 0));
		
		panelBase = new PanelSpaEmergenteBase(new MicroControladorLayersPadreHijo(layeredPane, panelEmergenteContenedor));
		panelEmergenteContenedor.add(panelBase, "panelBase");
	}
}
