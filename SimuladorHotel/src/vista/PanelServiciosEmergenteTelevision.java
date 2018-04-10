package vista;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.Controlador;
import controlador.MicroControladorPanelesPadreHijo;
import tiposVariable.StringDouble;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextPane;

public class PanelServiciosEmergenteTelevision extends JPanel {
	private static final long serialVersionUID = 1L;

	public PanelServiciosEmergenteTelevision(MicroControladorPanelesPadreHijo microControlador, String padre,
			Controlador controlador) {
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102),
				new Color(0, 0, 102)));
		this.setSize(new Dimension(695, 315));
		this.setName("p" + this.getClass().getSimpleName().substring(1)); // No modificar
		setLayout(null);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // No modificar
				// Devuelve control al padre
				microControlador.cambiarPanel(padre);
			}
		});
		btnCerrar.setBounds(596, 11, 89, 23);
		add(btnCerrar);

		JButton btnMoviestar = new JButton("");
		btnMoviestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO: implementar esto
				if (JOptionPane.showConfirmDialog(btnMoviestar, "¿Desea adquirir el canal Moviestar + por el precio de "
						+ String.valueOf(controlador.getServicios().getTelevision().getPrecioMoviestarPlus()) + " €",
						"Confirmatar compra ", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					btnMoviestar.setEnabled(false);
					controlador.getCuenta().getGasto().addGasto(new StringDouble("Contratar Moviesta +",
							controlador.getServicios().getTelevision().getPrecioMoviestarPlus()));
					controlador.getServicios().getTelevision().setActivadoMoviestarPlus(true);
				}

			}
		});
		btnMoviestar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnMoviestar
				.setIcon(new ImageIcon(PanelServiciosEmergenteTelevision.class.getResource("/iconos/movistar.png")));
		btnMoviestar.setBounds(96, 138, 100, 90);
		btnMoviestar.setContentAreaFilled(false);
		add(btnMoviestar);
		
		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnInfo.setEditable(false);
		txtpnInfo.setOpaque(false);
		txtpnInfo.setText("Nuestros hoteles cuentan con una variedad de canales exclusivos para nuestros clientes m\u00E1s exigentes. Seleccione el canal que desee contratar. ");
		txtpnInfo.setBounds(45, 63, 593, 75);
		add(txtpnInfo);

		JButton btnNetflix = new JButton("");
		btnNetflix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: implementar esto
				if (JOptionPane.showConfirmDialog(btnNetflix,
						"¿Desea adquirir el canal Netflix por el precio de "
								+ String.valueOf(controlador.getServicios().getTelevision().getPrecioNetflix()) + " €",
						"Confirmar compra ", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					btnNetflix.setEnabled(false);
				}

			}
		});
		btnNetflix.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNetflix.setIcon(new ImageIcon(PanelServiciosEmergenteTelevision.class.getResource("/iconos/netflix.png")));
		btnNetflix.setBounds(227, 138, 100, 90);
		btnNetflix.setContentAreaFilled(false);
		add(btnNetflix);

		JButton btnBBC = new JButton("");
		btnBBC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: implementar esto
				if (JOptionPane.showConfirmDialog(btnBBC,
						"¿Desea adquirir el canal BBC por el precio de "
								+ String.valueOf(controlador.getServicios().getTelevision().getPrecioBBC()) + " €",
						"Confirmar compra ", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					btnBBC.setEnabled(false);
				}
			}
		});
		btnBBC.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnBBC.setIcon(new ImageIcon(PanelServiciosEmergenteTelevision.class.getResource("/iconos/bbc.png")));
		btnBBC.setBounds(354, 138, 100, 90);
		btnBBC.setContentAreaFilled(false);
		add(btnBBC);

		JButton btnBeinSport = new JButton("");
		btnBeinSport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: implementar esto
				if (JOptionPane.showConfirmDialog(btnBeinSport, "¿Desea adquirir el canal Bein Sports por el precio de "
						+ String.valueOf(controlador.getServicios().getTelevision().getPrecioBeinSport()) + " €",
						"Confirmar compra ", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					btnBeinSport.setEnabled(false);
				}
			}
		});
		btnBeinSport.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnBeinSport
				.setIcon(new ImageIcon(PanelServiciosEmergenteTelevision.class.getResource("/iconos/beinsport.png")));
		btnBeinSport.setBounds(486, 138, 100, 90);
		btnBeinSport.setContentAreaFilled(false);
		add(btnBeinSport);
	}
}
