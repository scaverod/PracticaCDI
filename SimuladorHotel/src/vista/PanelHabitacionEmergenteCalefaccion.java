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
import javax.swing.ImageIcon;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class PanelHabitacionEmergenteCalefaccion extends JPanel {
	private static final long serialVersionUID = 1L;
	private Texto t;
	private JLabel lblTempManual;
	private JSlider slider;

	public PanelHabitacionEmergenteCalefaccion(MicroControladorLayersPadreHijo m, Controlador controlador) {
		t = controlador.getTexto();
		
		this.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240)));
		this.setSize(695, 315);
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);

		JButton btnCerrar = new JButton(t.getBtnCerrar());
		btnCerrar.setFocusPainted(false);
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ocultar panel
				m.changeLayer(0);
			}
		});
		btnCerrar.setBounds(610, 11, 75, 50);
		add(btnCerrar);
		
		JLabel lblTitulo = new JLabel("Control de temperatura");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(10, 11, 174, 23);
		add(lblTitulo);
		
		JPanel panelManual = new JPanel();
		panelManual.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)), "Control manual", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
		panelManual.setBounds(10, 45, 210, 259);
		add(panelManual);
		panelManual.setLayout(null);
		
		lblTempManual = new JLabel("");
		lblTempManual.setEnabled(false);
		lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weatherVacio.png")));
		lblTempManual.setBounds(120, 74, 59, 174);
		panelManual.add(lblTempManual);
		
		slider = new JSlider();
		slider.setEnabled(false);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (lblTempManual.isEnabled())
					setThermometerIcon(controlador);
			}
		});
		slider.setFocusable(false);
		slider.setFont(new Font("Tahoma", Font.PLAIN, 15));
		slider.setMajorTickSpacing(2);
		slider.setMinorTickSpacing(1);
		slider.setValue(21);
		slider.setMinimum(15);
		slider.setMaximum(29);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setBounds(10, 23, 79, 225);
		panelManual.add(slider);
		
		JToggleButton tglBtnManual = new JToggleButton("Activar");
		tglBtnManual.setFocusPainted(false);
		tglBtnManual.setBounds(99, 23, 101, 40);
		panelManual.add(tglBtnManual);
		tglBtnManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglBtnManual.isSelected()) {
					tglBtnManual.setText("Desactivar");
					slider.setEnabled(true);
					lblTempManual.setEnabled(true);
					setThermometerIcon(controlador);
				}
				else {
					tglBtnManual.setText("Activar");
					slider.setEnabled(false);
					lblTempManual.setEnabled(false);
					lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weatherVacio.png")));
				}
			}
		});
		tglBtnManual.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panelAuto = new JPanel();
		panelAuto.setLayout(null);
		panelAuto.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)), "Programación automática", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
		panelAuto.setBounds(230, 70, 455, 234);
		add(panelAuto);
		
		SelectorHora selectorHora = new SelectorHora(0, 24);
		selectorHora.setBounds(70, 20, 200, 200);
		panelAuto.add(selectorHora);
		
		JLabel lblDuracion = new JLabel("Duraci\u00F3n(h):");
		lblDuracion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDuracion.setBounds(302, 91, 81, 41);
		panelAuto.add(lblDuracion);
		
		JLabel lblInicio = new JLabel("Inicio:");
		lblInicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInicio.setBounds(10, 102, 50, 19);
		panelAuto.add(lblInicio);
		
		JLabel lblAuto = new JLabel("");
		lblAuto.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/auto off.png")));
		lblAuto.setBounds(340, 156, 64, 64);
		panelAuto.add(lblAuto);
		
		JComboBox<Integer> comboBoxDuracion = new JComboBox<Integer>();
		comboBoxDuracion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxDuracion.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8}));
		comboBoxDuracion.setBounds(395, 99, 50, 25);
		panelAuto.add(comboBoxDuracion);
		
		JToggleButton tglBtnAuto = new JToggleButton("Activar");
		tglBtnAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglBtnAuto.isSelected()) {
					tglBtnAuto.setText("Desactivar");
					lblAuto.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/auto on.png")));
				}
				else {
					tglBtnAuto.setText("Activar");
					lblAuto.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/auto off.png")));
				}
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(290, 20, 2, 203);
		panelAuto.add(separator);
		tglBtnAuto.setFocusPainted(false);
		tglBtnAuto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tglBtnAuto.setBounds(315, 20, 115, 40);
		panelAuto.add(tglBtnAuto);
	}
	
	private void setThermometerIcon(Controlador controlador) {
		switch (slider.getValue()) {
			case 15:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather1.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 17:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather2.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 19:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather3.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 21:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather4.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 23:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather5.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 25:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather6.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 27:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather7.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 29:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather8.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
		}
	}
}
