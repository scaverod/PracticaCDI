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
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JToggleButton;

public class PanelHabitacionEmergenteJacuzzi extends JPanel {
	private static final long serialVersionUID = 1L;
	private Texto t;

	public PanelHabitacionEmergenteJacuzzi(MicroControladorLayersPadreHijo m, Controlador controlador) {
		t = controlador.getTexto();
		
		this.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240)));
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
		
		JLabel lblBurbujas = new JLabel("");
		lblBurbujas.setBounds(485, 104, 200, 200);
		add(lblBurbujas);
		
		JLabel lbljacuzzi = new JLabel("");
		lbljacuzzi.setBounds(485, 104, 200, 200);
		add(lbljacuzzi);
		lbljacuzzi.setIcon(new ImageIcon(PanelHabitacionEmergenteJacuzzi.class.getResource("/iconos/jacuzziVacio.png")));
		
		JToggleButton tglBtnBurbujas = new JToggleButton("Activar/Desactivar");
		tglBtnBurbujas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tglBtnBurbujas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglBtnBurbujas.isSelected())
					lblBurbujas.setIcon(new ImageIcon(PanelHabitacionEmergenteJacuzzi.class.getResource("/iconos/jacuzziBurbujas.png")));
				else
					lblBurbujas.setIcon(null);
			}
		});
		tglBtnBurbujas.setBounds(307, 106, 151, 27);
		add(tglBtnBurbujas);
		
		JPanel panelTemperatura = new JPanel();
		panelTemperatura.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
						new Color(0, 109, 240), new Color(0, 109, 240)), "Temperatura", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
		panelTemperatura.setBounds(10, 239, 465, 65);
		add(panelTemperatura);

		JPanel panelAgua = new JPanel();
		panelAgua.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)), "Agua", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
		panelAgua.setBounds(10, 163, 465, 65);
		add(panelAgua);
		panelAgua.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (slider.getValue() == 0) {
					tglBtnBurbujas.setEnabled(false);
					lblBurbujas.setIcon(null);
				}
				else {
					tglBtnBurbujas.setEnabled(true);
					if (tglBtnBurbujas.isSelected())
						lblBurbujas.setIcon(new ImageIcon(PanelHabitacionEmergenteJacuzzi.class.getResource("/iconos/jacuzziBurbujas.png")));
				}
				
				switch (slider.getValue()) {
					case 0:
						lbljacuzzi.setIcon(new ImageIcon(PanelHabitacionEmergenteJacuzzi.class.getResource("/iconos/jacuzziVacio.png")));
						break;
					case 25:
						lbljacuzzi.setIcon(new ImageIcon(PanelHabitacionEmergenteJacuzzi.class.getResource("/iconos/jacuzzi25.png")));
						break;
					case 50:
						lbljacuzzi.setIcon(new ImageIcon(PanelHabitacionEmergenteJacuzzi.class.getResource("/iconos/jacuzzi50.png")));
						break;
					case 75:
						lbljacuzzi.setIcon(new ImageIcon(PanelHabitacionEmergenteJacuzzi.class.getResource("/iconos/jacuzzi75.png")));
						break;
					case 100:
						lbljacuzzi.setIcon(new ImageIcon(PanelHabitacionEmergenteJacuzzi.class.getResource("/iconos/jacuzzi100.png")));
						break;
				}
			}
		});
		slider.setBounds(206, 11, 200, 50);
		panelAgua.add(slider);
		slider.setFont(new Font("Tahoma", Font.PLAIN, 15));
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setSnapToTicks(true);
		slider.setValue(0);
		slider.setMajorTickSpacing(25);
		slider.setMinorTickSpacing(25);
		
		JLabel lblNewLabel = new JLabel("Rellenar(%):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(62, 26, 82, 20);
		panelAgua.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 11, 46, 14);
		add(lblNewLabel_1);
	}
}
