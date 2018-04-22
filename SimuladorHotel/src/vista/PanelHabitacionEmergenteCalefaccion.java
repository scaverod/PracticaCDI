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
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JToggleButton;
import javax.swing.JSlider;

public class PanelHabitacionEmergenteCalefaccion extends JPanel {
	private static final long serialVersionUID = 1L;
	private Texto t;

	public PanelHabitacionEmergenteCalefaccion(MicroControladorLayersPadreHijo m, Controlador controlador) {
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)), "Control manual", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
		panel.setBounds(10, 70, 675, 234);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new SelectorHora(0, 24);
		panel_1.setBounds(10, 21, 200, 200);
		panel.add(panel_1);
		
		JLabel lblTemperatura = new JLabel("Control de temperatura");
		lblTemperatura.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTemperatura.setBounds(10, 11, 174, 23);
		add(lblTemperatura);
		
		JToggleButton tglBtnManual = new JToggleButton("Activar");
		tglBtnManual.setBounds(194, 9, 113, 50);
		add(tglBtnManual);
		tglBtnManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglBtnManual.isSelected()) {
					tglBtnManual.setText("Desactivar");
				}
				else {
					tglBtnManual.setText("Activar");
				}
			}
		});
		tglBtnManual.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JSlider slider = new JSlider();
		slider.setBounds(317, 11, 283, 50);
		add(slider);
		slider.setMajorTickSpacing(2);
		slider.setFont(new Font("Tahoma", Font.PLAIN, 15));
		slider.setMinorTickSpacing(1);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinimum(15);
		slider.setMaximum(29);
	}
}
