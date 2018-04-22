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

		JButton btnAdquirir = new JButton(t.getBtnAceptar());
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
									btnAdquirir.setText("Cambiar");
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
		txtpnInfo.setText("Seleccione la hora m\u00E1s adecuada para que limpiemos la habitaci\u00F3n");
		txtpnInfo.setBounds(7, 9, 593, 25);
		panelPrincipal.add(txtpnInfo);

		txtpnUnaVezHaya.setMargin(new Insets(5, 5, 5, 5));
		txtpnUnaVezHaya.setBorder(new LineBorder(Color.ORANGE));
		txtpnUnaVezHaya.setText(
				"Aviso: Una vez haya adquirido este servicio podr\u00E1 cambiar la hora ilimitadas veces sin coste alguno.");
		txtpnUnaVezHaya.setOpaque(false);
		txtpnUnaVezHaya.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnUnaVezHaya.setEditable(false);
		txtpnUnaVezHaya.setBounds(7, 228, 200, 78);
		panelPrincipal.add(txtpnUnaVezHaya);

	}

	public void cerrarPanelConfirmacion() {
		panelContenedor.setLayer(panelConfirmacion, 0);
	}

	public void crearPanelConfirmacion(String precio) {
		panelConfirmacion = new PanelConfirmacion(new MicroControladorLayers(panelContenedor), this.getName(), s, precio, t);
		panelConfirmacion.setBounds(147, 57, 400, 200);
		panelContenedor.setLayer(panelConfirmacion, 0);
		panelContenedor.add(panelConfirmacion);
	}

	public void mostrarPanelConfirmacion(String precio) {
		crearPanelConfirmacion(precio);
		panelContenedor.setLayer(panelConfirmacion, 2);
	}
}
