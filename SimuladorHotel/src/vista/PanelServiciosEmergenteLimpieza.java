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
import tiposVariable.Tiempo;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
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
import java.awt.Insets;

public class PanelServiciosEmergenteLimpieza extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	private SelectorHora panelHora;
	private Semaphore s;
	private Texto t;
	private JButton btnAdquirir;

	public PanelServiciosEmergenteLimpieza(MicroControladorLayersPadreHijo microControlador, String padre, Controlador controlador, Semaphore s) {
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

		JLabel lblGif = new JLabel("");
		lblGif.setBorder(new LineBorder(Color.GREEN));
		lblGif.setOpaque(true);
		lblGif.setVisible(false);
		lblGif.setIcon(new ImageIcon(PanelServiciosEmergenteWifi.class.getResource("/iconos/check-gif-1.gif")));
		lblGif.setBounds(287, 103, 120, 109);
		panelPrincipal.add(lblGif);

		crearPanelConfirmacion("<precio>");

		JTextPane txtpnUnaVezHaya = new JTextPane();

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

		panelHora = new SelectorHora(7, 20);
		panelHora.setBounds(232, 43, 231, 214);
		panelPrincipal.add(panelHora);

		btnAdquirir = new JButton(t.getBtnAceptar());
		btnAdquirir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdquirir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (controlador.getServicios().getLimpieza().getTiempo() == null) {
					new Thread() {
						public void run() {
							try {
								mostrarPanelConfirmacion(
										String.valueOf(controlador.getServicios().getLimpieza().getPrecio()));

								s.acquire();

								if (((PanelConfirmacion) panelConfirmacion).getConfirmacion() == true) {
									// Actualizar ventana; en otro caso no hacer nada
									Tiempo tiempo = panelHora.getTiempo();
									controlador.getServicios().getLimpieza().setTiempo(tiempo);
									panelHora.setTiempo(tiempo);
									controlador.getCuenta().getGasto()
											.addGasto(new StringDouble(t.getHoraLimpieza(),
													controlador.getServicios().getLimpieza().getPrecio()));
									txtpnUnaVezHaya.setVisible(false);
									lblGif.setVisible(true);
									Thread.sleep(2050);
									lblGif.setVisible(false);
									btnAdquirir.setText(t.getPanelServiciosEmergenteLimpiezaBtnCambiar());
									// Tiene que hacerse siempre!
									((PanelConfirmacion) panelConfirmacion).setConfirmacion(false);
								}
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
						}
					}.start();
				} else {
					Tiempo tiempo = panelHora.getTiempo();
					controlador.getServicios().getLimpieza().setTiempo(tiempo);
					panelHora.setTiempo(tiempo);

					new Thread() {
						public void run() {
							try {
								lblGif.setVisible(true);
								Thread.sleep(2050);
								lblGif.setVisible(false);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}.start();

				}

			}
		});
		btnAdquirir.setBounds(260, 266, 175, 40);
		panelPrincipal.add(btnAdquirir);

		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText(t.getPanelServiciosEmergenteLimpiezaTxt());
		txtpnInfo.setBounds(7, 9, 593, 25);
		panelPrincipal.add(txtpnInfo);

		txtpnUnaVezHaya.setMargin(new Insets(5, 5, 5, 5));
		txtpnUnaVezHaya.setBorder(new LineBorder(Color.ORANGE));
		txtpnUnaVezHaya.setText(t.getPanelServiciosEmergenteLimpiezaTxtUnaVezHaya());
		txtpnUnaVezHaya.setOpaque(false);
		txtpnUnaVezHaya.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnUnaVezHaya.setEditable(false);
		txtpnUnaVezHaya.setBounds(7, 228, 200, 78);
		panelPrincipal.add(txtpnUnaVezHaya);
		
		this.addHierarchyListener(new HierarchyListener() {
			public void hierarchyChanged(HierarchyEvent e) {
				if (e.getChangeFlags() == HierarchyEvent.HIERARCHY_FIRST || e.getChangeFlags() == HierarchyEvent.SHOWING_CHANGED) {
					t = controlador.getTexto();
					
					btnCerrar.setText(t.getBtnCerrar());
					txtpnInfo.setText(t.getPanelServiciosEmergenteLimpiezaTxt());
					txtpnUnaVezHaya.setText(t.getPanelServiciosEmergenteLimpiezaTxtUnaVezHaya());
					btnAdquirir.setText(t.getBtnAdquirir());
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
					btnAdquirir.setEnabled(true);
				}
				else if (evt.getNewValue().equals(2)) {
					btnAdquirir.setEnabled(false);
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
