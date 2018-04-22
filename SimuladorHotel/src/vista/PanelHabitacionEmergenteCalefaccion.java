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
		panel.setBounds(10, 45, 210, 259);
		add(panel);
		panel.setLayout(null);
		
		JSlider sliderTemperaturaManual = new JSlider();
		sliderTemperaturaManual.setBounds(10, 23, 89, 225);
		panel.add(sliderTemperaturaManual);
		sliderTemperaturaManual.setOrientation(SwingConstants.VERTICAL);
		sliderTemperaturaManual.setMajorTickSpacing(2);
		sliderTemperaturaManual.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sliderTemperaturaManual.setMinorTickSpacing(1);
		sliderTemperaturaManual.setSnapToTicks(true);
		sliderTemperaturaManual.setPaintTicks(true);
		sliderTemperaturaManual.setPaintLabels(true);
		sliderTemperaturaManual.setMinimum(15);
		sliderTemperaturaManual.setMaximum(29);
		
		JToggleButton tglBtnManual = new JToggleButton("Desactivar");
		tglBtnManual.setBounds(99, 23, 101, 50);
		panel.add(tglBtnManual);
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
		
		JLabel lblTemperatura = new JLabel("Control de temperatura");
		lblTemperatura.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTemperatura.setBounds(10, 11, 174, 23);
		add(lblTemperatura);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
						new Color(0, 109, 240), new Color(0, 109, 240)), "Programación automática", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
		panel_2.setBounds(230, 70, 455, 234);
		add(panel_2);
		
		SelectorHora selectorHora = new SelectorHora(0, 24);
		selectorHora.setBounds(10, 21, 200, 200);
		panel_2.add(selectorHora);
	}
}
