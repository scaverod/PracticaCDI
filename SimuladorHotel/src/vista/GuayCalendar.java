/*

The following notices can be found in each source file of the 
original project.

Copyright (C) 2018 EquipoSPA:
	David Herrero Pascual	- GitHub: Deividhp13
	Antonio Castro Blanco	- GitHub: Castrum38
	Radu Dumitru Boboia		- GitHub: rdboboia
	Sergio Cavero Díaz		- GitHub: scaverod

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.

You can contact us at our GitHub written above.

To see the full license, check:
https://github.com/scaverod/PracticaCDI/blob/master/LICENSE

*/

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

	private final Integer[] dias27 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
			23, 24, 25, 26, 27 };
	private final Integer[] dias28 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
			23, 24, 25, 26, 27, 28 };
	private final Integer[] dias30 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
			23, 24, 25, 26, 27, 28, 29, 30 };
	private final Integer[] dias31 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
			23, 24, 25, 26, 27, 28, 29, 30, 31 };

	private final DefaultComboBoxModel<Integer> modelDias27 = new DefaultComboBoxModel<Integer>(dias27);
	private final DefaultComboBoxModel<Integer> modelDias28 = new DefaultComboBoxModel<Integer>(dias28);
	private final DefaultComboBoxModel<Integer> modelDias30 = new DefaultComboBoxModel<Integer>(dias30);
	private final DefaultComboBoxModel<Integer> modelDias31 = new DefaultComboBoxModel<Integer>(dias31);

	private Fecha fecha;
	private JLabel lblSeparador;
	private JLabel lblSeparador2;
	private JButton btnAumentarDia;
	private JButton btnDisminuirDia;
	private JButton btnAumentarMes;
	private JButton btnDisminuirMes;
	private JButton btnAumentarAnyo;
	private JButton btnDisminuirAnyo;

	public GuayCalendar() {
		fecha = new Fecha();

		setSize(new Dimension(350, 200));
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		setLayout(null);

		lblSeparador = new JLabel("/");
		lblSeparador.setForeground(new Color(0, 109, 240));
		lblSeparador.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblSeparador.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeparador.setBounds(85, 65, 30, 70);
		add(lblSeparador);

		lblSeparador2 = new JLabel("/");
		lblSeparador2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeparador2.setForeground(new Color(0, 109, 240));
		lblSeparador2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblSeparador2.setBounds(200, 65, 30, 70);
		add(lblSeparador2);

		btnAumentarDia = new JButton("");
		btnAumentarDia.setFocusPainted(false);
		btnAumentarDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(fecha.getDay() == fecha.getMaxDay() && fecha.getMonth() == fecha.getMaxMonth()
						&& (fecha.getYear() == (int) comboAnyo.getItemAt(comboAnyo.getItemCount() - 1)))) {
					fecha.addDay();
					updateAllViews();
				}
			}
		});
		btnAumentarDia.setContentAreaFilled(false);
		btnAumentarDia.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnAumentarDia.setBounds(0, 0, 85, 50);
		add(btnAumentarDia);

		btnDisminuirDia = new JButton("");
		btnDisminuirDia.setFocusPainted(false);
		btnDisminuirDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(fecha.getDay() == fecha.getMinDay() && fecha.getMonth() == fecha.getMinMonth()
						&& (fecha.getYear() == (int) comboAnyo.getItemAt(0)))) {
					fecha.substractDay();
					updateAllViews();
				}
			}
		});
		btnDisminuirDia.setContentAreaFilled(false);
		btnDisminuirDia.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnDisminuirDia.setBounds(0, 150, 85, 50);
		add(btnDisminuirDia);

		btnAumentarMes = new JButton("");
		btnAumentarMes.setFocusPainted(false);
		btnAumentarMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(fecha.getMonth() == fecha.getMaxMonth()
						&& (fecha.getYear() == (int) comboAnyo.getItemAt(comboAnyo.getItemCount() - 1)))) {
					fecha.addMonth();
					updateMonthAndYearView();
				}
			}
		});
		btnAumentarMes.setContentAreaFilled(false);
		btnAumentarMes.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnAumentarMes.setBounds(115, 0, 85, 50);
		add(btnAumentarMes);

		btnDisminuirMes = new JButton("");
		btnDisminuirMes.setFocusPainted(false);
		btnDisminuirMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(fecha.getMonth() == fecha.getMinMonth() && (fecha.getYear() == (int) comboAnyo.getItemAt(0)))) {
					fecha.substractMonth();
					updateMonthAndYearView();
				}
			}
		});
		btnDisminuirMes.setContentAreaFilled(false);
		btnDisminuirMes.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnDisminuirMes.setBounds(115, 150, 85, 50);
		add(btnDisminuirMes);

		btnAumentarAnyo = new JButton("");
		btnAumentarAnyo.setFocusPainted(false);
		btnAumentarAnyo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fecha.getYear() < (int) comboAnyo.getItemAt(comboAnyo.getItemCount() - 1)) {
					fecha.addYear();
					comboAnyo.setSelectedItem(fecha.getYear());
					fixDayModel();
				}
			}
		});
		btnAumentarAnyo.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaArriba_x32_blue.png")));
		btnAumentarAnyo.setContentAreaFilled(false);
		btnAumentarAnyo.setBounds(230, 0, 120, 50);
		add(btnAumentarAnyo);

		btnDisminuirAnyo = new JButton("");
		btnDisminuirAnyo.setFocusPainted(false);
		btnDisminuirAnyo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fecha.getYear() > (int) comboAnyo.getItemAt(0)) {
					fecha.substractYear();
					comboAnyo.setSelectedItem(fecha.getYear());
					fixDayModel();
				}
			}
		});
		btnDisminuirAnyo.setIcon(new ImageIcon(GuayCalendar.class.getResource("/iconos/flechaAbajo_x32_blue.png")));
		btnDisminuirAnyo.setContentAreaFilled(false);
		btnDisminuirAnyo.setBounds(230, 150, 120, 50);
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
		comboDia.setBounds(0, 50, 85, 100);
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
		comboMes.setBounds(115, 50, 85, 100);
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
		comboAnyo.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { fecha.getYear(), fecha.getYear() + 1 }));
		comboAnyo.setSelectedItem(fecha.getYear());
		comboAnyo.setBounds(230, 50, 120, 100);
		add(comboAnyo);

		// Siempre al final
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
	
	public void setActivado(boolean b) {
		lblSeparador.setEnabled(b);
		lblSeparador2.setEnabled(b);
		btnAumentarAnyo.setEnabled(b);
		btnAumentarDia.setEnabled(b);
		btnAumentarMes.setEnabled(b);
		btnDisminuirAnyo.setEnabled(b);
		btnDisminuirDia.setEnabled(b);
		btnDisminuirMes.setEnabled(b);
		comboAnyo.setEnabled(b);
		comboDia.setEnabled(b);
		comboMes.setEnabled(b);
	}
}