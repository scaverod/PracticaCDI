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
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PanelSpa extends JPanel {
	private static final long serialVersionUID = 1L;

	private JPanel panelEmergenteContenedor;
	private JPanel panelPrincipal;
	private JPanel panelBase;
	private JButton btnOtroBoton;
	private JLabel lblNewLabel;
	private JLayeredPane layeredPane;
	private JPanel panelOtro;

	public PanelSpa(Controlador controlador) {
		this.setSize(new Dimension(931, 483));
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 931, 483);
		add(layeredPane);

		panelPrincipal = new JPanel();
		layeredPane.setLayer(panelPrincipal, 1);
		panelPrincipal.setBounds(0, 0, 931, 483);
		layeredPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);

		JButton btnConEstoSaco = new JButton("Con esto saco UN DETERMINADO panel emergente");
		btnConEstoSaco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToPanelEmergente(panelBase);
			}
		});
		btnConEstoSaco.setBounds(290, 160, 351, 162);
		panelPrincipal.add(btnConEstoSaco);

		btnOtroBoton = new JButton("Con este saco OTRO");
		btnOtroBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToPanelEmergente(panelOtro);
			}
		});
		btnOtroBoton.setIcon(new ImageIcon(PanelSpa.class.getResource("/iconos/tick.png")));
		btnOtroBoton.setBounds(31, 36, 211, 109);
		panelPrincipal.add(btnOtroBoton);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PanelSpa.class.getResource("/iconos/espa\u00F1a.png")));
		lblNewLabel.setBounds(54, 335, 311, 109);
		panelPrincipal.add(lblNewLabel);

		panelEmergenteContenedor = new JPanel();
		panelEmergenteContenedor.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getNewValue().equals(0)) {
					// TODO: reactivar elementos del panelPrincipal (ahora panel al frente)
					btnConEstoSaco.setEnabled(true);
					btnOtroBoton.setEnabled(true);
					lblNewLabel.setEnabled(true);
				} else if (evt.getNewValue().equals(2)) {
					// TODO: desactivar elementos del panelPrincipal (ahora panel al fondo)
					btnConEstoSaco.setEnabled(false);
					btnOtroBoton.setEnabled(false);
					lblNewLabel.setEnabled(false);
				}
			}
		});
		layeredPane.setLayer(panelEmergenteContenedor, 0);
		panelEmergenteContenedor.setBounds(118, 84, 695, 315);
		layeredPane.add(panelEmergenteContenedor);
		panelEmergenteContenedor.setLayout(new CardLayout(0, 0));

		panelBase = new PanelSpaEmergenteBase(
				new MicroControladorLayersPadreHijo(layeredPane, panelEmergenteContenedor));
		panelEmergenteContenedor.add(panelBase, panelBase.getName());

		panelOtro = new PanelSpaEmergenteOtro(
				new MicroControladorLayersPadreHijo(layeredPane, panelEmergenteContenedor));
		panelEmergenteContenedor.add(panelOtro, panelOtro.getName());
	}

	private void changeToPanelEmergente(JPanel subPanel) {
		// Cambio el panel activo dentro del panel emergente
		CardLayout l = (CardLayout) panelEmergenteContenedor.getLayout();
		l.show(panelEmergenteContenedor, subPanel.getName());

		// Pongo el panel emergente por encima del principal
		layeredPane.setLayer(panelEmergenteContenedor, 2);
	}
}