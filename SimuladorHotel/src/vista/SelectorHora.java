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

public class SelectorHora extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private int horas;
	private int minutos;
	private JComboBox<Integer> comboHoras;
	private JComboBox<Integer> comboMinutos;

	@SuppressWarnings("deprecation")
	public SelectorHora() {
		setSize(new Dimension(229, 205));
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		setLayout(null);
		
		Date d = new Date(System.currentTimeMillis());
		horas = d.getHours();
		minutos = d.getMinutes();
		
		JLabel label = new JLabel(":");
		label.setForeground(new Color(0, 109, 240));
		label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(99, 66, 30, 72);
		add(label);
		
		JButton btnAumentarHoras = new JButton("");
		btnAumentarHoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (horas < 24)
					horas++;
				else
					horas = 0;
				
				comboHoras.setSelectedItem(horas);
			}
		});
		btnAumentarHoras.setIcon(new ImageIcon(SelectorHora.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnAumentarHoras.setBounds(0, 0, 89, 41);
		add(btnAumentarHoras);
		
		JButton btnAumentarMinutos = new JButton("");
		btnAumentarMinutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (minutos < 60)
					minutos++;
				else
					minutos = 0;
				
				comboMinutos.setSelectedItem(minutos);
			}
		});
		btnAumentarMinutos.setIcon(new ImageIcon(SelectorHora.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnAumentarMinutos.setBounds(139, 0, 89, 41);
		add(btnAumentarMinutos);
		
		JButton btnDisminuirHoras = new JButton("");
		btnDisminuirHoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (horas > 0)
					horas--;
				else
					horas = 24;
				
				comboHoras.setSelectedItem(horas);
			}
		});
		btnDisminuirHoras.setIcon(new ImageIcon(SelectorHora.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnDisminuirHoras.setBounds(0, 164, 89, 41);
		add(btnDisminuirHoras);
		
		JButton btnDisminuirMinutos = new JButton("");
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
		btnDisminuirMinutos.setBounds(139, 164, 89, 41);
		add(btnDisminuirMinutos);
		
		comboHoras = new JComboBox<Integer>();
		comboHoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horas = (int) comboHoras.getSelectedItem();
			}
		});
		comboHoras.setForeground(new Color(0, 109, 240));
		comboHoras.setFont(new Font("Tahoma", Font.PLAIN, 40));
		comboHoras.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}));
		comboHoras.setSelectedItem(horas);
		comboHoras.setBounds(0, 52, 89, 101);
		add(comboHoras);
		
		comboMinutos = new JComboBox<Integer>();
		comboMinutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minutos = (int) comboMinutos.getSelectedItem();
			}
		});
		comboMinutos.setForeground(new Color(0, 109, 240));
		comboMinutos.setFont(new Font("Tahoma", Font.PLAIN, 40));
		comboMinutos.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59}));
		comboMinutos.setSelectedItem(minutos);
		comboMinutos.setBounds(139, 52, 89, 101);
		add(comboMinutos);

	}

	public int getHoras() {
		return horas;
	}

	public int getMinutos() {
		return minutos;
	}
}