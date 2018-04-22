package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.Controlador;
import controlador.MicroControladorLayersPadreHijo;
import idiomas.Texto;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class PanelHabitacionEmergenteAyuda extends JPanel {
	private static final long serialVersionUID = 1L;
	private Texto t;

	public PanelHabitacionEmergenteAyuda(MicroControladorLayersPadreHijo m, Controlador controlador) {
		t = controlador.getTexto();

		this.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)));
		this.setSize(695, 315);
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);

		JButton btnCerrar = new JButton(t.getBtnCerrar());
		JLabel lblTip1 = new JLabel("");
		JLabel lblTip2 = new JLabel("");
		JLabel lblTip3 = new JLabel("");
		JTextArea txtTip1 = new JTextArea();
		txtTip1.setOpaque(false);
		JTextArea txtTip2 = new JTextArea();
		txtTip2.setOpaque(false);
		JTextArea txtTip3 = new JTextArea();
		txtTip3.setOpaque(false);

		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ocultar panel
				m.changeLayer(0);
			}
		});
		btnCerrar.setBounds(610, 11, 75, 50);
		add(btnCerrar);
		lblTip1.setIcon(new ImageIcon(PanelHabitacionEmergenteAyuda.class.getResource("/iconos/punto.png")));
		lblTip1.setBounds(45, 60, 16, 14);
		add(lblTip1);
		lblTip2.setIcon(new ImageIcon(PanelHabitacionEmergenteAyuda.class.getResource("/iconos/punto.png")));
		lblTip2.setBounds(45, 149, 16, 14);
		add(lblTip2);
		lblTip3.setIcon(new ImageIcon(PanelHabitacionEmergenteAyuda.class.getResource("/iconos/punto.png")));
		lblTip3.setBounds(45, 238, 16, 14);
		add(lblTip3);
		txtTip1.setLineWrap(true);
		txtTip1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTip1.setText(t.getTxtTip1());
		txtTip1.setBounds(97, 46, 471, 43);
		add(txtTip1);
		txtTip2.setText(t.getTxtTip2());
		txtTip2.setLineWrap(true);
		txtTip2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTip2.setBounds(97, 135, 471, 43);
		add(txtTip2);
		txtTip3.setText(t.getTxtTip3());
		txtTip3.setLineWrap(true);
		txtTip3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTip3.setBounds(97, 224, 471, 43);
		add(txtTip3);

		this.addHierarchyListener(new HierarchyListener() {
			public void hierarchyChanged(HierarchyEvent e) {
				if (e.getChangeFlags() == HierarchyEvent.HIERARCHY_FIRST
						|| e.getChangeFlags() == HierarchyEvent.SHOWING_CHANGED) {

					t = controlador.getTexto();
					txtTip1.setText(t.getTxtTip1());
					txtTip2.setText(t.getTxtTip2());
					txtTip3.setText(t.getTxtTip3());
				}
			}
		});
	}
}
