/*

The following notices can be found in each source file of the 
original project.

Copyright (C) 2018 EquipoSPA:
	David Herrero Pascual	- GitHub: Deividhp13
	Antonio Castro Blanco	- GitHub: Castrum38
	Radu Dumitru Boboia		- GitHub: rdboboia
	Sergio Cavero D�az		- GitHub: scaverod

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
import javax.swing.JLayeredPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.Semaphore;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class PanelServiciosEmergenteTaxi extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	private Semaphore s;
	private Texto t;
	private JButton btnCabify;
	private JButton btnUber;
	private JButton btnTaxi;

	public PanelServiciosEmergenteTaxi(MicroControladorLayersPadreHijo microControlador, String padre, Controlador controlador, Semaphore s) {
		this.s = s;
		t = controlador.getTexto();
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102)));
		this.setSize(new Dimension(695, 315));
		this.setName("p" + this.getClass().getSimpleName().substring(1)); // No modificar
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

		crearPanelConfirmacion("<precio>");

		JButton btnCerrar = new JButton(t.getBtnCerrar());
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

		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(t.getPanelServiciosEmergenteTaxiTxt());
		txtpnInfo.setBounds(10, 11, 590, 81);
		panelPrincipal.add(txtpnInfo);

		JLabel lblGif = new JLabel("");
		lblGif.setBorder(new LineBorder(Color.GREEN));
		lblGif.setOpaque(true);
		lblGif.setVisible(false);
		lblGif.setIcon(new ImageIcon(PanelServiciosEmergenteWifi.class.getResource("/iconos/check-gif-1.gif")));
		lblGif.setBounds(287, 103, 120, 109);
		panelPrincipal.add(lblGif);

		btnCabify = new JButton("");
		btnCabify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(String.valueOf(controlador.getServicios().getTaxi().getPrecio())+ " �");

							s.acquire();

							if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								generarGasto("Cabify", controlador);
								lblGif.setVisible(true);
								Thread.sleep(2050);
								lblGif.setVisible(false);
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
		btnCabify.setContentAreaFilled(false);
		btnCabify.setIcon(new ImageIcon(PanelServiciosEmergenteTaxi.class.getResource("/iconos/cabify.png")));
		btnCabify.setBounds(296, 138, 100, 90);
		panelPrincipal.add(btnCabify);

		btnUber = new JButton("");
		btnUber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(String.valueOf(controlador.getServicios().getTaxi().getPrecio())+ " �");

							s.acquire();

							if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								generarGasto("Uber", controlador);
								lblGif.setVisible(true);
								Thread.sleep(2050);
								lblGif.setVisible(false);
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
		btnUber.setContentAreaFilled(false);
		btnUber.setIcon(new ImageIcon(PanelServiciosEmergenteTaxi.class.getResource("/iconos/Uber.png")));
		btnUber.setBounds(494, 138, 100, 90);
		panelPrincipal.add(btnUber);

		btnTaxi = new JButton("");
		btnTaxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Thread() {
					public void run() {
						try {
							mostrarPanelConfirmacion(String.valueOf(controlador.getServicios().getTaxi().getPrecio())+ " �");

							s.acquire();

							if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
								// Actualizar ventana; en otro caso no hacer nada
								generarGasto("Taxi", controlador);
								lblGif.setVisible(true);
								Thread.sleep(2050);
								lblGif.setVisible(false);
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
		btnTaxi.setContentAreaFilled(false);
		btnTaxi.setIcon(new ImageIcon(PanelServiciosEmergenteTaxi.class.getResource("/iconos/taxi2.png")));
		btnTaxi.setBounds(98, 138, 100, 90);
		panelPrincipal.add(btnTaxi);

		JPanel panelPrecio = new JPanel();
		panelPrecio.setBackground(new Color(255, 255, 153));
		panelPrecio.setBorder(new LineBorder(Color.ORANGE, 3));
		panelPrecio.setForeground(Color.ORANGE);
		panelPrecio.setBounds(51, 248, 593, 35);
		panelPrincipal.add(panelPrecio);

		JLabel lblPrecio = new JLabel(t.getLblCoste());
		panelPrecio.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel labelPrecioYPwd = new JLabel(
				String.valueOf(controlador.getServicios().getTaxi().getPrecio()) + " \u20AC");
		panelPrecio.add(labelPrecioYPwd);
		labelPrecioYPwd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		this.addHierarchyListener(new HierarchyListener() {
			public void hierarchyChanged(HierarchyEvent e) {
				if (e.getChangeFlags() == HierarchyEvent.HIERARCHY_FIRST || e.getChangeFlags() == HierarchyEvent.SHOWING_CHANGED) {
					t = controlador.getTexto();
					
					btnCerrar.setText(t.getBtnCerrar());
					txtpnInfo.setText(t.getPanelServiciosEmergenteTaxiTxt());
					lblPrecio.setText(t.getLblCoste());
				}
			}
		});
	}

	public void generarGasto(String compania, Controlador controlador) {
		controlador.getCuenta().getGasto().addGasto(
				new StringDouble(compania, controlador.getServicios().getTaxi().getPrecio()));
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
					btnCabify.setEnabled(true);
					btnTaxi.setEnabled(true);
					btnUber.setEnabled(true);
				}
				else if (evt.getNewValue().equals(2)) {
					btnCabify.setEnabled(false);
					btnTaxi.setEnabled(false);
					btnUber.setEnabled(false);
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
