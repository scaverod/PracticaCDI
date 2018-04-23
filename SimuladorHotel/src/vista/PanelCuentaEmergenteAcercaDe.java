package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.Controlador;
import controlador.MicroControladorLayersPadreHijo;
import idiomas.Texto;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.ActionEvent;

public class PanelCuentaEmergenteAcercaDe extends JPanel {
	private static final long serialVersionUID = 1L;
	private Texto t;

	public PanelCuentaEmergenteAcercaDe(MicroControladorLayersPadreHijo m, Controlador controlador) {
		t = controlador.getTexto();

		this.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)));
		this.setSize(695, 315);
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);

		JButton btnCerrar = new JButton(t.getBtnCerrar());

		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ocultar panel
				m.changeLayer(0);
			}
		});
		btnCerrar.setBounds(610, 11, 75, 50);
		add(btnCerrar);

		this.addHierarchyListener(new HierarchyListener() {
			public void hierarchyChanged(HierarchyEvent e) {
				if (e.getChangeFlags() == HierarchyEvent.HIERARCHY_FIRST || e.getChangeFlags() == HierarchyEvent.SHOWING_CHANGED) {

					t = controlador.getTexto();
				}
			}
		});
	}
}
