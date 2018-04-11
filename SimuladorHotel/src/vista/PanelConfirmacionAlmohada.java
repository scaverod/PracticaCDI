package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.MicroControladorLayers;
import modelo.Texto;
import modelo.TextoManager;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelConfirmacionAlmohada extends JPanel {
	// FIXME: temporal para que salga el texto en vez de "<dynamic>"
	// Habría que mandarlo desde el Main, por ejemplo
	private Texto t = new TextoManager(TextoManager.english).getTexto();

	private static final long serialVersionUID = 1L;
	private boolean confirmacion;

	public PanelConfirmacionAlmohada(MicroControladorLayers m) {
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102)));
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
				m.changeLayer(PanelConfirmacionAlmohada.this, 0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(226, 130, 120, 40);
		add(btnNewButton);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Siempre al final
				confirmacion = true;
				m.changeLayer(PanelConfirmacionAlmohada.this, 0);
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAceptar.setBounds(53, 130, 120, 40);
		add(btnAceptar);
		
	}
	
	public boolean getConfirmacion() {
		return confirmacion;
	}
}