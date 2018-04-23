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

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import controlador.Controlador;
import controlador.MicroControladorLayers;
import controlador.MicroControladorLayersPadreHijo;
import idiomas.Texto;
import tiposVariable.InformacionSpaTratamiento;
import tiposVariable.StringDouble;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.Semaphore;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelSpaEmergente extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	private Semaphore s;
	private Texto t;
	private JComboBox<Integer> comboHoras;
	private JComboBox<Integer> comboMinutos;
	private JLabel label;
	private JButton btnAumentarHoras;
	private JButton btnDisminuirHoras;
	private int horas;
	private int maxHoras;
	private int minHoras;
	private JPanel panelAforo;
	private JLabel lblAforo;
	private JLabel lblNumAforo;
	private GuayCalendar panelFecha;
	private JButton btnConfirmar;
	private JButton btnCancelar;

	public PanelSpaEmergente(MicroControladorLayersPadreHijo microControlador, String padre, Controlador controlador,
			Semaphore s, InformacionSpaTratamiento info) {
		this.s = s;
		t = controlador.getTexto();
		this.setSize(new Dimension(695, 315));
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);

		panelContenedor = new JLayeredPane();
		panelContenedor.setBounds(0, 0, 695, 315);
		add(panelContenedor);
		panelContenedor.setLayout(null);

		panelPrincipal = new JPanel();
		panelPrincipal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cerrarPanelConfirmacion();
			}
		});
		panelPrincipal.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)));
		panelPrincipal.setBounds(0, 0, 695, 315);
		panelContenedor.setLayer(panelPrincipal, 1);
		panelContenedor.add(panelPrincipal);
		panelPrincipal.setLayout(null);

		panelFecha = new GuayCalendar();
		panelFecha.setLocation(307, 48);

		crearPanelConfirmacion("<precio>");

		btnCancelar = new JButton(t.getBtnCancelar());
		btnConfirmar = new JButton(t.getBtnAceptar());
		
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // No modificar
				// Devuelve control al padre
				microControlador.changeLayer(0);
				s.release(s.getQueueLength());
			}
		});

		JLabel lblGif = new JLabel("");
		lblGif.setBorder(new LineBorder(Color.GREEN));
		lblGif.setOpaque(true);
		lblGif.setVisible(false);
		lblGif.setIcon(new ImageIcon(PanelServiciosEmergenteWifi.class.getResource("/iconos/check-gif-1.gif")));
		lblGif.setBounds(287, 103, 120, 109);
		panelPrincipal.add(lblGif);
		btnCancelar.setBounds(489, 254, 175, 53);
		panelPrincipal.add(btnCancelar);

		maxHoras = info.getMax();
		minHoras = info.getMin();
		horas = minHoras;

		label = new JLabel(":");
		label.setForeground(new Color(0, 109, 240));
		label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(126, 113, 30, 70);
		panelPrincipal.add(label);

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
		btnAumentarHoras.setBounds(41, 48, 85, 50);
		panelPrincipal.add(btnAumentarHoras);

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
		btnDisminuirHoras.setBounds(41, 198, 85, 50);
		panelPrincipal.add(btnDisminuirHoras);

		lblNumAforo = new JLabel("0");
		comboHoras = new JComboBox<Integer>();
		comboHoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horas = (int) comboHoras.getSelectedItem();
				int plazasDisp = info.getMaxAforo() - info.getAforo()[horas-minHoras];
				lblNumAforo.setText(String.valueOf(plazasDisp));
				if(plazasDisp == 0 || plazasDisp < info.getPersonas()) {
					btnConfirmar.setEnabled(false);
				}else {
					btnConfirmar.setEnabled(true);
				}
				
			}
		});

		comboHoras.setForeground(new Color(0, 109, 240));
		comboHoras.setFont(new Font("Tahoma", Font.PLAIN, 40));
		this.setRangoHora(minHoras, maxHoras);
		comboHoras.setSelectedItem(horas);
		comboHoras.setBounds(41, 98, 85, 100);
		panelPrincipal.add(comboHoras);
		
		comboMinutos = new JComboBox<Integer>();
		comboMinutos.setForeground(new Color(0, 109, 240));
		comboMinutos.setFont(new Font("Tahoma", Font.PLAIN, 40));
		comboMinutos.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 0}));
		comboMinutos.setSelectedItem(0);
		comboMinutos.setBounds(156, 98, 85, 100);
		comboMinutos.setEnabled(false);
		panelPrincipal.add(comboMinutos);


		
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(String.valueOf(info.getFactura().getNumero()) + " \u20AC");

							s.acquire();

							if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								info.setFactura(new StringDouble(info.getFactura().getCadena() + "  "
										+ panelFecha.getFecha().toString() + " - " + String.valueOf(comboHoras.getSelectedItem())+":00",
										info.getFactura().getNumero()));
								controlador.getCuenta().getGasto().addGasto(info.getFactura());
								int [] aux = info.getAforo();
								aux[comboHoras.getSelectedIndex()] = aux[comboHoras.getSelectedIndex()] + info.getPersonas();
								controlador.getServiciosSpa().getSpas().get(info.getSpa()).setAsistentes(aux);
								lblGif.setVisible(true);
								Thread.sleep(2050);
								lblGif.setVisible(false);
								microControlador.changeLayer(0);
								s.release(s.getQueueLength());

								// Tiene que hacerse siempre!
								((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
							}
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				}.start();
			}
		});
		btnConfirmar.setBounds(31, 254, 175, 53);
		panelPrincipal.add(btnConfirmar);

		panelPrincipal.add(panelFecha);

		JLabel lblTxtSpaTitulo = new JLabel(t.getLblTxtSpaTitulo());
		lblTxtSpaTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTxtSpaTitulo.setBounds(21, 6, 214, 34);
		panelPrincipal.add(lblTxtSpaTitulo);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(270, 48, 2, 200);
		panelPrincipal.add(separator);
		
		panelAforo = new JPanel();
		panelAforo.setLayout(null);
		panelAforo.setForeground(new Color(60, 179, 113));
		panelAforo.setBorder(new LineBorder(new Color(51, 153, 102), 3));
		panelAforo.setBackground(new Color(153, 255, 153));
		panelAforo.setBounds(237, 273, 221, 31);
		panelPrincipal.add(panelAforo);
		
		lblAforo = new JLabel(t.getLblPlazas());
		lblAforo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAforo.setBounds(14, 0, 127, 31);
		panelAforo.add(lblAforo);
		lblNumAforo = new JLabel(String.valueOf(String.valueOf(info.getMaxAforo() - info.getAforo()[0])));
		lblNumAforo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumAforo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumAforo.setBounds(137, 0, 84, 31);
		panelAforo.add(lblNumAforo);
		
		if(info.getMaxAforo() - info.getAforo()[horas-minHoras] == 0 || info.getMaxAforo() - info.getAforo()[horas-minHoras] < info.getPersonas()) {
			btnConfirmar.setEnabled(false);
			panelAforo.setForeground(Color.decode("#f13007"));
			panelAforo.setBorder(new LineBorder(new Color(51, 153, 102), 3));
			panelAforo.setBackground(new Color(153, 255, 153));
		}

		this.addHierarchyListener(new HierarchyListener() {
			public void hierarchyChanged(HierarchyEvent e) {
				if (e.getChangeFlags() == HierarchyEvent.HIERARCHY_FIRST
						|| e.getChangeFlags() == HierarchyEvent.SHOWING_CHANGED) {
					t = controlador.getTexto();
					lblTxtSpaTitulo.setText(t.getLblTxtSpaTitulo());
					btnCancelar.setText(t.getBtnCancelar());
					btnConfirmar.setText(t.getBtnAceptar());
				}
			}
		});

	}

	public void cerrarPanelConfirmacion() {
		panelContenedor.setLayer(panelConfirmacion, 0);
	}

	public void crearPanelConfirmacion(String precio) {
		panelConfirmacion = new PanelConfirmacion(new MicroControladorLayers(panelContenedor), this.getName(), s, precio, t);
		panelConfirmacion.setBounds(147, 57, 400, 200);
		
		panelConfirmacion.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getNewValue().equals(0)) {
					panelFecha.setActivado(true);
					btnAumentarHoras.setEnabled(true);
					btnConfirmar.setEnabled(true);
					btnDisminuirHoras.setEnabled(true);
					btnCancelar.setEnabled(true);
					label.setEnabled(true);
					comboHoras.setEnabled(true);
					comboMinutos.setEnabled(true);
				}
				else if (evt.getNewValue().equals(2)) {
					panelFecha.setActivado(false);
					panelFecha.setActivado(false);
					btnAumentarHoras.setEnabled(false);
					btnConfirmar.setEnabled(false);
					btnDisminuirHoras.setEnabled(false);
					btnCancelar.setEnabled(false);
					label.setEnabled(false);
					comboHoras.setEnabled(false);
					comboMinutos.setEnabled(false);
				}
			}
		});
		
		panelContenedor.setLayer(panelConfirmacion, 0);
		panelContenedor.add(panelConfirmacion);
	}

	public void mostrarPanelConfirmacion(String precio) {
		crearPanelConfirmacion(precio);
		panelContenedor.setLayer(panelConfirmacion, 2);
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
