package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import tiposVariable.Fecha;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuayCalendar extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JComboBox<Integer> comboDia;
	private JComboBox<Integer> comboMes;
	private JComboBox<Integer> comboAnyo;
	
	private final Integer[] dias27 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
	private final Integer[] dias28 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
	private final Integer[] dias30 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
	private final Integer[] dias31 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
	
	private final DefaultComboBoxModel<Integer> modelDias27 = new DefaultComboBoxModel<Integer>(dias27);
	private final DefaultComboBoxModel<Integer> modelDias28 = new DefaultComboBoxModel<Integer>(dias28);
	private final DefaultComboBoxModel<Integer> modelDias30 = new DefaultComboBoxModel<Integer>(dias30);
	private final DefaultComboBoxModel<Integer> modelDias31 = new DefaultComboBoxModel<Integer>(dias31);
	
	
	private Fecha fecha;

	public GuayCalendar() {
		setSize(new Dimension(398, 205));
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		setLayout(null);
		
		fecha = new Fecha();

		JLabel lblSeparador = new JLabel("/");
		lblSeparador.setForeground(new Color(0, 109, 240));
		lblSeparador.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblSeparador.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeparador.setBounds(99, 66, 30, 72);
		add(lblSeparador);

		JButton btnAumentarDia = new JButton("");
		btnAumentarDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecha.addDay();
				updateAllViews();
			}
		});
		btnAumentarDia.setContentAreaFilled(false);
		
		JLabel lblSeparador2 = new JLabel("/");
		lblSeparador2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeparador2.setForeground(new Color(0, 109, 240));
		lblSeparador2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblSeparador2.setBounds(238, 66, 30, 72);
		add(lblSeparador2);
		btnAumentarDia.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnAumentarDia.setBounds(0, 0, 89, 41);
		add(btnAumentarDia);

		JButton btnAumentarMes = new JButton("");
		btnAumentarMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecha.addMonth();
				updateMonthAndYearView();
			}
		});
		btnAumentarMes.setContentAreaFilled(false);
		btnAumentarMes.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnAumentarMes.setBounds(139, 0, 89, 41);
		add(btnAumentarMes);

		JButton btnDisminuirDia = new JButton("");
		btnDisminuirDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecha.substractDay();
				updateAllViews();
			}
		});
		btnDisminuirDia.setContentAreaFilled(false);
		
		JButton btnAumentarAnyo = new JButton("");
		btnAumentarAnyo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecha.addYear();
				comboAnyo.setSelectedItem(fecha.getYear());
				fixDayModel();
			}
		});
		btnAumentarAnyo.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnAumentarAnyo.setContentAreaFilled(false);
		btnAumentarAnyo.setBounds(278, 0, 120, 41);
		add(btnAumentarAnyo);
		btnDisminuirDia.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnDisminuirDia.setBounds(0, 164, 89, 41);
		add(btnDisminuirDia);

		JButton btnDisminuirMes = new JButton("");
		btnDisminuirMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecha.substractMonth();
				updateMonthAndYearView();
			}
		});
		btnDisminuirMes.setContentAreaFilled(false);
		btnDisminuirMes.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnDisminuirMes.setBounds(139, 164, 89, 41);
		add(btnDisminuirMes);
		
		JButton btnDisminuirAnyo = new JButton("");
		btnDisminuirAnyo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecha.substractYear();
				comboAnyo.setSelectedItem(fecha.getYear());
				fixDayModel();
			}
		});
		btnDisminuirAnyo.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnDisminuirAnyo.setContentAreaFilled(false);
		btnDisminuirAnyo.setBounds(278, 164, 120, 41);
		add(btnDisminuirAnyo);
		
		comboDia = new JComboBox<Integer>();
		comboDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecha.setDay((int) comboDia.getSelectedItem());
			}
		});
		comboDia.setForeground(new Color(0, 109, 240));
		comboDia.setFont(new Font("Tahoma", Font.PLAIN, 40));
		comboDia.setSelectedItem(fecha.getDay());
		comboDia.setBounds(0, 52, 89, 101);
		add(comboDia);
		
		comboMes = new JComboBox<Integer>();
		comboMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecha.setMonth((int) comboMes.getSelectedItem());
				fixDayModel();
			}
		});
		comboMes.setForeground(new Color(0, 109, 240));
		comboMes.setFont(new Font("Tahoma", Font.PLAIN, 40));
		comboMes.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }));
		comboMes.setSelectedItem(fecha.getMonth());
		comboMes.setBounds(139, 52, 89, 101);
		add(comboMes);

		comboAnyo = new JComboBox<Integer>();
		comboAnyo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecha.setYear((int) comboAnyo.getSelectedItem());
				fixDayModel();
			}
		});
		comboAnyo.setForeground(new Color(0, 109, 240));
		comboAnyo.setFont(new Font("Tahoma", Font.PLAIN, 40));
//		comboAnyo.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { fecha.getYear(), fecha.getYear() + 1 }));
		comboAnyo.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 2016, 2017, 2018, 2019, 2020 }));
		comboAnyo.setSelectedItem(fecha.getYear());
		comboAnyo.setBounds(278, 52, 120, 101);
		add(comboAnyo);
		
		fixDayModel();
	}
	
	private void updateAllViews() {
		comboDia.setSelectedItem(fecha.getDay());
		comboMes.setSelectedItem(fecha.getMonth());
		comboAnyo.setSelectedItem(fecha.getYear());
	}
	
	private void updateMonthAndYearView() {
		comboMes.setSelectedItem(fecha.getMonth());
		comboAnyo.setSelectedItem(fecha.getYear());
		fixDayModel();
	}
	
	private void fixDayModel() {
		setMaxDayComboDay();
		comboDia.setSelectedItem(fecha.getDay());
	}
	
	private void setMaxDayComboDay() {
		switch (fecha.getMaxDay()) {
			case 27:
				comboDia.setModel(modelDias27);
				break;
			case 28:
				comboDia.setModel(modelDias28);
				break;
			case 30:
				comboDia.setModel(modelDias30);
				break;
			case 31:
				comboDia.setModel(modelDias31);
				break;
		}
	}
	
	public Fecha getFecha() {
		return fecha;
	}
}