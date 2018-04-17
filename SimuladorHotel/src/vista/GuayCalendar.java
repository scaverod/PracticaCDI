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
				
			}
		});
		btnAumentarMes.setContentAreaFilled(false);
		btnAumentarMes.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnAumentarMes.setBounds(139, 0, 89, 41);
		add(btnAumentarMes);

		JButton btnDisminuirDia = new JButton("");
		btnDisminuirDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDisminuirDia.setContentAreaFilled(false);
		
		JButton btnAumentarAnyo = new JButton("");
		btnAumentarAnyo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
				
			}
		});
		btnDisminuirMes.setContentAreaFilled(false);
		btnDisminuirMes.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnDisminuirMes.setBounds(139, 164, 89, 41);
		add(btnDisminuirMes);

		comboDia = new JComboBox<Integer>();
		comboDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnDisminuirAnyo = new JButton("");
		btnDisminuirAnyo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDisminuirAnyo.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnDisminuirAnyo.setContentAreaFilled(false);
		btnDisminuirAnyo.setBounds(278, 164, 120, 41);
		add(btnDisminuirAnyo);
		comboDia.setForeground(new Color(0, 109, 240));
		comboDia.setFont(new Font("Tahoma", Font.PLAIN, 40));
		comboDia.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 }));
		comboDia.setSelectedItem(fecha.getDay());
		comboDia.setBounds(0, 52, 89, 101);
		add(comboDia);

		comboMes = new JComboBox<Integer>();
		comboMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboMes.setForeground(new Color(0, 109, 240));
		comboMes.setFont(new Font("Tahoma", Font.PLAIN, 40));
		comboMes.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
		comboMes.setSelectedItem(fecha.getMonth());
		comboMes.setBounds(139, 52, 89, 101);
		add(comboMes);
		
		comboAnyo = new JComboBox<Integer>();
		comboAnyo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboAnyo.setForeground(new Color(0, 109, 240));
		comboAnyo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		comboAnyo.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {fecha.getYear(), fecha.getYear() + 1}));
		comboAnyo.setSelectedItem(fecha.getYear());
		comboAnyo.setBounds(278, 52, 120, 101);
		add(comboAnyo);

	}
	
//	private void cambiarDia(int day) {
//		fecha.setDay(day);
//		comboDia.setSelectedItem(fecha.getDay());
//	}
//	
//	private boolean validarDia() {
//		boolean b = otroMetodo();
//		System.out.println(b);
//		
//		return b;
//	}
//	
//	private boolean otroMetodo() {
//		int day = fecha.getDay();
//		int month = fecha.getMonth();
//		int year = fecha.getYear();
//		
//		if (month == 4 || month == 6 || month == 9 || month == 11) { // Meses con 30 dias
//			if (day <= 30)
//				return true;
//			else
//				return false;
//		}
//		else if (month == 2) { // Febrero
//			if ((year % 4 == 0) && (day <= 28)) // Con 28 dias (año bisiesto)
//				return true;
//			else if ((year % 4 != 0) && (day <= 27)) // Con 27 dias (año no bisiesto)
//				return true;
//			else
//				return false;
//		}
//		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { // Meses con 30 dias
//			if (day <= 31)
//				return true;
//			else
//				return false;
//		}
//		else
//			return false;
//	}
	
	public Fecha getFecha() {
		return fecha;
	}
}