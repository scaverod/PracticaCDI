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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class PanelSpaEmergente extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLayeredPane panelContenedor;
	private JPanel panelPrincipal;
	private JPanel panelConfirmacion;
	private Semaphore s;
	private Texto t;

	public PanelSpaEmergente(MicroControladorLayersPadreHijo microControlador, String padre, Controlador controlador, Semaphore s, InformacionSpaTratamiento info) {
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
		panelPrincipal.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240)));
		panelPrincipal.setBounds(0, 0, 695, 315);
		panelContenedor.setLayer(panelPrincipal, 1);
		panelContenedor.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		GuayCalendar panelFecha = new GuayCalendar();
		panelFecha.setLocation(307, 48);
		SelectorHora panelTiempo = new SelectorHora(info.getMin(), info.getMax());
		panelTiempo.setLocation(35, 48);

		crearPanelConfirmacion("<precio>");

		JButton btnCancelar = new JButton("Cancelar");
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
		btnCancelar.setBounds(405, 254, 175, 53);
		panelPrincipal.add(btnCancelar);

		JButton btnConfirmar = new JButton("Confirmar");
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
								info.setFactura(new StringDouble(info.getFactura().getCadena() + "  " + panelFecha.getFecha().toString() + " - " + panelTiempo.getTiempo().toString(), info.getFactura().getNumero()));
								controlador.getCuenta().getGasto().addGasto(info.getFactura());
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
		btnConfirmar.setBounds(115, 254, 175, 53);
		panelPrincipal.add(btnConfirmar);
		
		panelPrincipal.add(panelFecha);

		panelPrincipal.add(panelTiempo);
		
		JLabel lblTxt = new JLabel("Seleccione el dia y la hora");
		lblTxt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTxt.setBounds(21, 6, 175, 34);
		panelPrincipal.add(lblTxt);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(270, 48, 2, 200);
		panelPrincipal.add(separator);
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
