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
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import controlador.Controlador;
import controlador.MicroControladorLayers;
import controlador.MicroControladorLayersPadreHijo;
import idiomas.Texto;
import tiposVariable.StringDouble;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.Semaphore;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;

public class PanelServiciosEmergenteTelefono extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	private Semaphore s;

	// 1 -> America, 2-> Asia, 3-> Europa y 4-> Africa
	private int continente = 0;
	private Texto t;
	private JButton btnCerrar;
	private JButton btnConfirmarLLamada;
	private JButton btnAmerica;
	private JButton btnAsia;
	private JButton btnEuropa;
	private JButton btnAfrica;
	private JLabel lblImagen;

	public PanelServiciosEmergenteTelefono(MicroControladorLayersPadreHijo microControlador, String padre, Controlador controlador, Semaphore s) {
		this.s = s;
		t = controlador.getTexto();
		this.setSize(new Dimension(695, 315));
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);
		btnConfirmarLLamada = new JButton(t.getPanelServiciosEmergenteTelefonobtnConfirmarLLamada());
		btnConfirmarLLamada.setEnabled(false);
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

		lblImagen = new JLabel("");
		ImageIcon mapa = new ImageIcon(PanelServiciosEmergenteTelefono.class.getResource("/iconos/continente.png"));
		ImageIcon europa = new ImageIcon(PanelServiciosEmergenteTelefono.class.getResource("/iconos/europa.jpg"));
		ImageIcon asia = new ImageIcon(PanelServiciosEmergenteTelefono.class.getResource("/iconos/asia.jpg"));
		ImageIcon america = new ImageIcon(PanelServiciosEmergenteTelefono.class.getResource("/iconos/america.jpg"));
		ImageIcon africa = new ImageIcon(PanelServiciosEmergenteTelefono.class.getResource("/iconos/africa.jpg"));

		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(t.getPanelServiciosEmergenteTelefonoTxt());
		txtpnInfo.setBounds(10, 11, 593, 81);
		panelPrincipal.add(txtpnInfo);

		JLabel lblGif = new JLabel("");
		lblGif.setBorder(new LineBorder(Color.GREEN));
		lblGif.setOpaque(true);
		lblGif.setVisible(false);
		lblGif.setIcon(new ImageIcon(PanelServiciosEmergenteWifi.class.getResource("/iconos/check-gif-1.gif")));
		lblGif.setBounds(287, 103, 120, 109);
		panelPrincipal.add(lblGif);

		crearPanelConfirmacion("<precio>");

		btnCerrar = new JButton(t.getBtnCerrar());
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // No modificar
				// Devuelve control al padre
				microControlador.changeLayer(0);
				s.release(s.getQueueLength());
			}
		});
		btnCerrar.setBounds(610, 11, 75, 50);
		panelPrincipal.add(btnCerrar);

		btnConfirmarLLamada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							switch (continente) {
							case 1:

								mostrarPanelConfirmacion(String
										.valueOf(controlador.getServicios().getLlamada().getPrecioAmerica() + " €"));

								s.acquire();

								if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
									controlador.getCuenta().getGasto().addGasto(new StringDouble(t.getAmerica(),
											controlador.getServicios().getLlamada().getPrecioAmerica()));
									btnConfirmarLLamada.setEnabled(false);
									btnConfirmarLLamada.setText(t.getPanelServiciosEmergenteTelefonobtnConfirmarLLamada());
									lblGif.setVisible(true);
									Thread.sleep(2050);
									lblGif.setVisible(false);

									// Tiene que hacerse siempre!
									((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
								}
								break;
							case 2:

								mostrarPanelConfirmacion(
										String.valueOf(controlador.getServicios().getLlamada().getPrecioAsia() + " €"));

								s.acquire();

								if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
									controlador.getCuenta().getGasto().addGasto(new StringDouble(t.getAsia(),
											controlador.getServicios().getLlamada().getPrecioAsia()));
									btnConfirmarLLamada.setEnabled(false);
									btnConfirmarLLamada.setText(t.getPanelServiciosEmergenteTelefonobtnConfirmarLLamada());
									lblGif.setVisible(true);
									Thread.sleep(2050);
									lblGif.setVisible(false);

									// Tiene que hacerse siempre!
									((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
								}
								break;
							case 3:

								mostrarPanelConfirmacion(String
										.valueOf(controlador.getServicios().getLlamada().getPrecioEuropa() + " €"));

								s.acquire();

								if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
									controlador.getCuenta().getGasto().addGasto(new StringDouble(t.getEuropa(),
											controlador.getServicios().getLlamada().getPrecioEuropa()));
									btnConfirmarLLamada.setEnabled(false);
									btnConfirmarLLamada.setText(t.getPanelServiciosEmergenteTelefonobtnConfirmarLLamada());
									lblGif.setVisible(true);
									Thread.sleep(2050);
									lblGif.setVisible(false);

									// Tiene que hacerse siempre!
									((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
								}
								break;
							case 4:

								mostrarPanelConfirmacion(String
										.valueOf(controlador.getServicios().getLlamada().getPrecioAfrica() + " €"));

								s.acquire();

								if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
									controlador.getCuenta().getGasto().addGasto(new StringDouble(t.getAfrica(),
											controlador.getServicios().getLlamada().getPrecioAfrica()));
									btnConfirmarLLamada.setEnabled(false);
									btnConfirmarLLamada.setText(t.getPanelServiciosEmergenteTelefonobtnConfirmarLLamada());
									lblGif.setVisible(true);
									Thread.sleep(2050);
									lblGif.setVisible(false);

									// Tiene que hacerse siempre!
									((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
								}
								break;
							}
							lblImagen.setIcon(mapa);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				}.start();
			}
		});
		btnConfirmarLLamada.setBounds(268, 266, 158, 38);
		panelPrincipal.add(btnConfirmarLLamada);

		btnAmerica = new JButton("");
		btnAmerica.setFocusPainted(false);
		btnAmerica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				continente = 1;
				btnConfirmarLLamada.setEnabled(true);
				btnConfirmarLLamada.setText(t.getAmerica());
				lblImagen.setIcon(america);

			}
		});
		btnAmerica.setContentAreaFilled(false);
		btnAmerica.setBounds(111, 55, 166, 210);
		panelPrincipal.add(btnAmerica);

		btnAsia = new JButton("");
		btnAsia.setFocusPainted(false);
		btnAsia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				continente = 2;
				btnConfirmarLLamada.setEnabled(true);
				btnConfirmarLLamada.setText(t.getAsia());
				lblImagen.setIcon(asia);
			}
		});
		btnAsia.setContentAreaFilled(false);
		btnAsia.setBounds(383, 55, 190, 210);
		panelPrincipal.add(btnAsia);

		btnEuropa = new JButton("");
		btnEuropa.setFocusPainted(false);
		btnEuropa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				continente = 3;
				btnConfirmarLLamada.setEnabled(true);
				btnConfirmarLLamada.setText(t.getEuropa());
				lblImagen.setIcon(europa);
			}
		});
		btnEuropa.setContentAreaFilled(false);
		btnEuropa.setBounds(284, 56, 97, 75);
		panelPrincipal.add(btnEuropa);

		btnAfrica = new JButton("");
		btnAfrica.setFocusPainted(false);
		btnAfrica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				continente = 4;
				btnConfirmarLLamada.setEnabled(true);
				btnConfirmarLLamada.setText(t.getAfrica());
				lblImagen.setIcon(africa);
			}
		});
		btnAfrica.setContentAreaFilled(false);
		btnAfrica.setBounds(287, 136, 94, 124);
		panelPrincipal.add(btnAfrica);

		lblImagen.setIcon(new ImageIcon(PanelServiciosEmergenteTelefono.class.getResource("/iconos/continente.png")));
		lblImagen.setBounds(111, 45, 472, 259);
		panelPrincipal.add(lblImagen);
		
		this.addHierarchyListener(new HierarchyListener() {
			public void hierarchyChanged(HierarchyEvent e) {
				if (e.getChangeFlags() == HierarchyEvent.HIERARCHY_FIRST || e.getChangeFlags() == HierarchyEvent.SHOWING_CHANGED) {
					t = controlador.getTexto();
					
					btnCerrar.setText(t.getBtnCerrar());
					txtpnInfo.setText(t.getPanelServiciosEmergenteTelevisionTxt());
					btnConfirmarLLamada.setText(t.getPanelServiciosEmergenteTelefonobtnConfirmarLLamada());
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
					btnAfrica.setEnabled(true);
					btnAmerica.setEnabled(true);
					btnAsia.setEnabled(true);
					btnConfirmarLLamada.setEnabled(true);
					btnEuropa.setEnabled(true);
					lblImagen.setEnabled(true);
				}
				else if (evt.getNewValue().equals(2)) {
					btnAfrica.setEnabled(false);
					btnAmerica.setEnabled(false);
					btnAsia.setEnabled(false);
					btnConfirmarLLamada.setEnabled(false);
					btnEuropa.setEnabled(false);
					lblImagen.setEnabled(false);
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
}
