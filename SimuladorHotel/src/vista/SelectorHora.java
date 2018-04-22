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

import tiposVariable.Tiempo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class SelectorHora extends JPanel {
	private static final long serialVersionUID = 1L;

	private int horas;
	private int minutos;
	private int maxHoras;
	private int minHoras;
	private JComboBox<Integer> comboHoras;
	private JComboBox<Integer> comboMinutos;
	private JButton btnAumentarMinutos;
	private JButton btnAumentarHoras;
	private JButton btnDisminuirHoras;
	private JButton btnDisminuirMinutos;
	private JLabel label;

	@SuppressWarnings("deprecation")
	public SelectorHora(int min, int max) {
		setSize(new Dimension(200, 200));
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		setLayout(null);
		this.maxHoras = min;
		this.minHoras = max;
		Date d = new Date(System.currentTimeMillis());
		minutos = d.getMinutes();
		maxHoras = max;
		minHoras = min;

		if (d.getHours() >= minHoras && d.getHours() <= maxHoras) {
			horas = d.getHours();
		} else {
			horas = minHoras;
		}

		label = new JLabel(":");
		label.setForeground(new Color(0, 109, 240));
		label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(85, 65, 30, 70);
		add(label);

		btnAumentarHoras = new JButton("");
		btnAumentarHoras.setFocusPainted(false);
		btnAumentarHoras.setContentAreaFilled(false);
		btnAumentarHoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (horas < maxHoras)
					horas++;
				else
					horas = minHoras;

				comboHoras.setSelectedItem(horas);
			}
		});
		btnAumentarHoras.setIcon(new ImageIcon(SelectorHora.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnAumentarHoras.setBounds(0, 0, 85, 50);
		add(btnAumentarHoras);

		btnAumentarMinutos = new JButton("");
		btnAumentarMinutos.setFocusPainted(false);
		btnAumentarMinutos.setContentAreaFilled(false);
		btnAumentarMinutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (minutos < 59)
					minutos++;
				else
					minutos = 0;

				comboMinutos.setSelectedItem(minutos);
			}
		});
		btnAumentarMinutos.setIcon(new ImageIcon(SelectorHora.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnAumentarMinutos.setBounds(115, 0, 85, 50);
		add(btnAumentarMinutos);

		btnDisminuirHoras = new JButton("");
		btnDisminuirHoras.setFocusPainted(false);
		btnDisminuirHoras.setContentAreaFilled(false);
		btnDisminuirHoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (horas > minHoras)
					horas--;
				else
					horas = maxHoras;

				comboHoras.setSelectedItem(horas);
			}
		});
		btnDisminuirHoras.setIcon(new ImageIcon(SelectorHora.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnDisminuirHoras.setBounds(0, 150, 85, 50);
		add(btnDisminuirHoras);

		btnDisminuirMinutos = new JButton("");
		btnDisminuirMinutos.setFocusPainted(false);
		btnDisminuirMinutos.setContentAreaFilled(false);
		btnDisminuirMinutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (minutos > 0)
					minutos--;
				else
					minutos = 59;

				comboMinutos.setSelectedItem(minutos);
			}
		});
		btnDisminuirMinutos.setIcon(new ImageIcon(SelectorHora.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnDisminuirMinutos.setBounds(115, 150, 85, 50);
		add(btnDisminuirMinutos);

		comboHoras = new JComboBox<Integer>();
		comboHoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horas = (int) comboHoras.getSelectedItem();
			}
		});
		comboHoras.setForeground(new Color(0, 109, 240));
		comboHoras.setFont(new Font("Tahoma", Font.PLAIN, 40));
		this.setRangoHora(minHoras, maxHoras);
		comboHoras.setSelectedItem(horas);
		comboHoras.setBounds(0, 50, 85, 100);
		add(comboHoras);

		comboMinutos = new JComboBox<Integer>();
		comboMinutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minutos = (int) comboMinutos.getSelectedItem();
			}
		});
		comboMinutos.setForeground(new Color(0, 109, 240));
		comboMinutos.setFont(new Font("Tahoma", Font.PLAIN, 40));
		comboMinutos.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
				12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37,
				38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59 }));
		comboMinutos.setSelectedItem(minutos);
		comboMinutos.setBounds(115, 50, 85, 100);
		add(comboMinutos);

	}

	public int getHoras() {
		return horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public Tiempo getTiempo() {
		return new Tiempo(horas, minutos);
	}

	public void setTiempo(Tiempo tiempo) {
		comboHoras.setSelectedIndex(tiempo.getHora() - minHoras);
		comboMinutos.setSelectedIndex(tiempo.getMinutos());
	}

	public void desactivar() {
		comboHoras.setEnabled(false);
		comboMinutos.setEnabled(false);
		btnAumentarMinutos.setEnabled(false);
		btnAumentarHoras.setEnabled(false);
		btnDisminuirHoras.setEnabled(false);
		btnDisminuirMinutos.setEnabled(false);
		label.setEnabled(false);
	}

	public void activar() {
		comboHoras.setEnabled(true);
		comboMinutos.setEnabled(true);
		btnAumentarMinutos.setEnabled(true);
		btnAumentarHoras.setEnabled(true);
		btnDisminuirHoras.setEnabled(true);
		btnDisminuirMinutos.setEnabled(true);
		label.setEnabled(true);
	}
	
	public void visible() {
		comboHoras.setVisible(true);
		comboMinutos.setVisible(true);
		btnAumentarMinutos.setVisible(true);
		btnAumentarHoras.setVisible(true);
		btnDisminuirHoras.setVisible(true);
		btnDisminuirMinutos.setVisible(true);
		label.setVisible(true);
	}

	public void noVisible() {
		comboHoras.setVisible(false);
		comboMinutos.setVisible(false);
		btnAumentarMinutos.setVisible(false);
		btnAumentarHoras.setVisible(false);
		btnDisminuirHoras.setVisible(false);
		btnDisminuirMinutos.setVisible(false);
		label.setVisible(false);
	}


	public void setRangoHora(int min, int max) {
		int numhoras = 1 + max - min;
		this.maxHoras = max;
		this.minHoras = min;
		Integer[] horas = new Integer[numhoras];
		int i = 0;
		while (min <= max) {
			horas[i] = min;
			min++;
			i++;
		}
		comboHoras.setModel(new DefaultComboBoxModel<Integer>(horas));
	}
}
