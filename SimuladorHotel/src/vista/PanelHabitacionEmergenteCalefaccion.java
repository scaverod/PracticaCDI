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
import javax.swing.border.TitledBorder;
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
		
		JLabel lblTitulo = new JLabel(t.getLblTituloTemperatura());
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(10, 11, 590, 23);
		add(lblTitulo);
		
		JPanel panelManual = new JPanel();
		panelManual.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)), t.getLblControlManual(), TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
		panelManual.setBounds(10, 60, 121, 244);
		add(panelManual);
		panelManual.setLayout(null);
		
		lblTempManual = new JLabel("");
		lblTempManual.setEnabled(false);
		lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weatherVacio.png")));
		lblTempManual.setBounds(30, 72, 59, 161);
		panelManual.add(lblTempManual);
		
		JToggleButton tglBtnManual = new JToggleButton(t.getBtnActivar());
		tglBtnManual.setFocusPainted(false);
		tglBtnManual.setBounds(10, 23, 101, 40);
		panelManual.add(tglBtnManual);
		tglBtnManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglBtnManual.isSelected()) {
					tglBtnManual.setText(t.getBtnDesactivar());
					lblTempManual.setEnabled(true);
					setThermometerIcon(controlador);
				}
				else {
					tglBtnManual.setText(t.getBtnActivar());
					lblTempManual.setEnabled(false);
					lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weatherVacio.png")));
				}
			}
		});
		tglBtnManual.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panelAuto = new JPanel();
		panelAuto.setLayout(null);
		panelAuto.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)), t.getLblProgramacionAutomatica(), TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
		panelAuto.setBounds(260, 60, 425, 244);
		add(panelAuto);
		
		SelectorHora selectorHora = new SelectorHora(0, 24);
		selectorHora.setBounds(73, 23, 200, 200);
		panelAuto.add(selectorHora);
		
		JLabel lblDuracion = new JLabel(t.getLblDuracion() + " (h)");
		lblDuracion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuracion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDuracion.setBounds(295, 74, 118, 25);
		panelAuto.add(lblDuracion);
		
		JLabel lblInicio = new JLabel(t.getLblInicio());
		lblInicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInicio.setBounds(10, 113, 64, 19);
		panelAuto.add(lblInicio);
		
		JLabel lblAuto = new JLabel("");
		lblAuto.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/auto off.png")));
		lblAuto.setBounds(323, 159, 64, 64);
		panelAuto.add(lblAuto);
		
		JComboBox<Integer> comboBoxDuracion = new JComboBox<Integer>();
		comboBoxDuracion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxDuracion.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8}));
		comboBoxDuracion.setBounds(295, 110, 118, 25);
		panelAuto.add(comboBoxDuracion);
		
		JToggleButton tglBtnAuto = new JToggleButton(t.getBtnActivar());
		tglBtnAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglBtnAuto.isSelected()) {
					tglBtnAuto.setText(t.getBtnDesactivar());
					lblAuto.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/auto on.png")));
				}
				else {
					tglBtnAuto.setText(t.getBtnActivar());
					lblAuto.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/auto off.png")));
				}
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(283, 23, 2, 203);
		panelAuto.add(separator);
		tglBtnAuto.setFocusPainted(false);
		tglBtnAuto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tglBtnAuto.setBounds(295, 23, 118, 40);
		panelAuto.add(tglBtnAuto);
		
		JPanel panelTemp = new JPanel();
		panelTemp.setBounds(130, 60, 131, 244);
		panelTemp.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)), t.getLblTemperatura() + " (º)", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
		add(panelTemp);
		panelTemp.setLayout(null);
		
		slider = new JSlider();
		slider.setBounds(10, 23, 111, 210);
		panelTemp.add(slider);
		slider.setOrientation(SwingConstants.VERTICAL);
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
		
		this.addHierarchyListener(new HierarchyListener() {
			public void hierarchyChanged(HierarchyEvent e) {
				if (e.getChangeFlags() == HierarchyEvent.HIERARCHY_FIRST || e.getChangeFlags() == HierarchyEvent.SHOWING_CHANGED) {
					t = controlador.getTexto();
					
					btnCerrar.setText(t.getBtnCerrar());
					lblTitulo.setText(t.getLblTituloTemperatura());
					lblDuracion.setText(t.getLblDuracion() + " (h)");
					lblInicio.setText(t.getLblInicio());
					
					panelManual.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
							new Color(0, 109, 240), new Color(0, 109, 240)), t.getLblControlManual(), TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
					panelAuto.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
							new Color(0, 109, 240), new Color(0, 109, 240)), t.getLblProgramacionAutomatica(), TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
					panelTemp.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 109, 240), new Color(0, 109, 240),
							new Color(0, 109, 240), new Color(0, 109, 240)), t.getLblTemperatura() + " (º)", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), null));
					
					if (tglBtnManual.isSelected())
						tglBtnManual.setText(t.getBtnDesactivar());
					else
						tglBtnManual.setText(t.getBtnActivar());
					
					if (tglBtnAuto.isSelected())
						tglBtnAuto.setText(t.getBtnDesactivar());
					else
						tglBtnAuto.setText(t.getBtnActivar());
				}
			}
		});
	}
	
	private void setThermometerIcon(Controlador controlador) {
		switch (slider.getValue()) {
			case 15:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather1.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 16:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather1.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 17:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather2.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 18:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather2.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 19:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather3.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 20:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather3.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 21:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather4.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 22:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather4.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 23:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather5.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 24:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather5.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 25:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather6.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 26:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather6.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 27:
				lblTempManual.setIcon(new ImageIcon(PanelHabitacionEmergenteCalefaccion.class.getResource("/iconos/weather7.png")));
				controlador.getHabitacion().getTemperatura().setTemperaturaActual(slider.getValue());
				break;
			case 28:
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
