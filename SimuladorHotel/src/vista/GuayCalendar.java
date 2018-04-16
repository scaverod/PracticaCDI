package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Date;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GuayCalendar extends JPanel {
	private static final long serialVersionUID = 1L;

	private int dia;
	private int mes;
	private int anyo;
	private JComboBox<Integer> comboDia;
	private JComboBox<Integer> comboMes;
	private JComboBox<Integer> comboAnyo;

	@SuppressWarnings("deprecation")
	public GuayCalendar() {
		setSize(new Dimension(398, 205));
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		setLayout(null);

		Date d = new Date(System.currentTimeMillis());
		dia = d.getDate();
		mes = d.getMonth() + 1;
		anyo = d.getYear() + 1900;
		
		System.out.println(anyo);

		JLabel lblSeparador = new JLabel("/");
		lblSeparador.setForeground(new Color(0, 109, 240));
		lblSeparador.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblSeparador.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeparador.setBounds(99, 66, 30, 72);
		add(lblSeparador);

		JButton btnAumentarDia = new JButton("");
		btnAumentarDia.setContentAreaFilled(false);
		btnAumentarDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dia < 31)
					dia++;
				else
					dia = 1;

				comboDia.setSelectedItem(dia);
			}
		});
		
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
		btnAumentarMes.setContentAreaFilled(false);
		btnAumentarMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mes < 12)
					mes++;
				else
					mes = 1;

				comboMes.setSelectedItem(mes);
			}
		});
		btnAumentarMes.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnAumentarMes.setBounds(139, 0, 89, 41);
		add(btnAumentarMes);

		JButton btnDisminuirDia = new JButton("");
		btnDisminuirDia.setContentAreaFilled(false);
		btnDisminuirDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dia > 0)
					dia--;
				else
					dia = 31;

				comboDia.setSelectedItem(dia);
			}
		});
		
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
		btnDisminuirMes.setContentAreaFilled(false);
		btnDisminuirMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mes > 0)
					mes--;
				else
					mes = 12;

				comboMes.setSelectedItem(mes);
			}
		});
		btnDisminuirMes.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnDisminuirMes.setBounds(139, 164, 89, 41);
		add(btnDisminuirMes);

		comboDia = new JComboBox<Integer>();
		comboDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dia = (int) comboDia.getSelectedItem();
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
		comboDia.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
				13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 }));
		comboDia.setSelectedItem(dia);
		comboDia.setBounds(0, 52, 89, 101);
		add(comboDia);

		comboMes = new JComboBox<Integer>();
		comboMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mes = (int) comboMes.getSelectedItem();
			}
		});
		comboMes.setForeground(new Color(0, 109, 240));
		comboMes.setFont(new Font("Tahoma", Font.PLAIN, 40));
		comboMes.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
				12}));
		comboMes.setSelectedItem(mes);
		comboMes.setBounds(139, 52, 89, 101);
		add(comboMes);
		
		comboAnyo = new JComboBox<Integer>();
		comboAnyo.setForeground(new Color(0, 109, 240));
		comboAnyo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		comboAnyo.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {anyo, anyo + 1}));
		comboAnyo.setSelectedItem(anyo);
		comboAnyo.setBounds(278, 52, 120, 101);
		add(comboAnyo);

	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}
	
	public int getAnyo() {
		return anyo;
	}
}