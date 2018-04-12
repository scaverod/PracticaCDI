package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.MicroControladorLayers;
import idiomas.Texto;
import idiomas.TextoManager;

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
	// FIXME: temporal para que salga el texto en vez de "<dynamic>"
	// Habría que mandarlo desde el Main, por ejemplo
	private Texto t = new TextoManager(TextoManager.english).getTexto();

	private static final long serialVersionUID = 1L;
	
	private boolean confirmacion;

	public PanelConfirmacion(MicroControladorLayers m, String panel, Semaphore s) {
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		
		setBounds(new Rectangle(0, 0, 400, 200));
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240)));
		setLayout(null);
		
		JLabel lblTextoConfirmacion = new JLabel(t.getLblConfirmacion());
		lblTextoConfirmacion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTextoConfirmacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoConfirmacion.setBounds(10, 11, 380, 40);
		add(lblTextoConfirmacion);
		
		JLabel lblPrecio = new JLabel(t.getLblCoste() + "<precio>");
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrecio.setBounds(10, 62, 380, 40);
		add(lblPrecio);
		
		JButton btnNewButton = new JButton("Cancelar");
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
		
		JButton btnAceptar = new JButton("Aceptar");
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
		
		JLabel lblMiPadreEs = new JLabel("Mi padre es:");
		lblMiPadreEs.setBounds(20, 105, 59, 14);
		add(lblMiPadreEs);
		
		JLabel lblSs = new JLabel(panel);
		lblSs.setBounds(89, 105, 301, 14);
		add(lblSs);
	}
	
	public boolean getConfirmacion() {
		return confirmacion;
	}
	
	public void setConfirmacion(boolean confirmacion) {
		this.confirmacion = confirmacion;
	}
}