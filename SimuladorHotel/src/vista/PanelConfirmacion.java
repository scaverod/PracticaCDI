package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import controlador.MicroControladorLayers;
import idiomas.Texto;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

public class PanelConfirmacion extends JPanel {
	private static final long serialVersionUID = 1L;

	private boolean confirmacion;

	public PanelConfirmacion(MicroControladorLayers m, String panel, Semaphore s, String precio, Texto t) {
		this.setName("p" + this.getClass().getSimpleName().substring(1));

		setBounds(new Rectangle(0, 0, 400, 200));
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)));
		setLayout(null);

		JLabel lblTextoConfirmacion = new JLabel(t.getLblConfirmacion());
		lblTextoConfirmacion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTextoConfirmacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoConfirmacion.setBounds(10, 11, 380, 40);
		add(lblTextoConfirmacion);

		JLabel lblPrecio = new JLabel(t.getLblCoste() + " " + precio);
		lblPrecio.setOpaque(true);
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrecio.setBounds(10, 62, 380, 40);
		lblPrecio.setBackground(new Color(255, 255, 153));
		lblPrecio.setBorder(new LineBorder(Color.ORANGE, 3));
		add(lblPrecio);

		JButton btnNewButton = new JButton(t.getBtnCancelar());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmacion = false;
				s.release(s.getQueueLength());
				m.changeLayer(PanelConfirmacion.this, 0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(226, 130, 120, 40);
		add(btnNewButton);

		JButton btnAceptar = new JButton(t.getBtnAceptar());
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmacion = true;
				s.release(s.getQueueLength());
				m.changeLayer(PanelConfirmacion.this, 0);
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAceptar.setBounds(53, 130, 120, 40);
		add(btnAceptar);
	}

	public boolean getConfirmacion() {
		return confirmacion;
	}

	public void setConfirmacion(boolean confirmacion) {
		this.confirmacion = confirmacion;
	}
}