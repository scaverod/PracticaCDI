package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.Controlador;
import controlador.MicroControladorLayersPadreHijo;
import idiomas.Texto;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class PanelHabitacionEmergenteJacuzzi extends JPanel {
	private static final long serialVersionUID = 1L;
	private Texto t;

	public PanelHabitacionEmergenteJacuzzi(MicroControladorLayersPadreHijo m, Controlador controlador) {
		t = controlador.getTexto();
		
		this.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240)));
		this.setSize(695, 315);
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);

		JLabel lblPanelEmergente = new JLabel(this.getName());
		lblPanelEmergente.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanelEmergente.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblPanelEmergente.setBounds(10, 138, 675, 39);
		add(lblPanelEmergente);

		JButton btnCerrar = new JButton(t.getBtnCerrar());
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ocultar panel
				m.changeLayer(0);
			}
		});
		btnCerrar.setBounds(610, 11, 75, 50);
		add(btnCerrar);
		
		JLabel lblEncenderapagar = new JLabel("encender/apagar burbujas/chorros");
		lblEncenderapagar.setBounds(10, 259, 173, 45);
		add(lblEncenderapagar);
		
		JLabel lblRellenar = new JLabel("rellenar");
		lblRellenar.setBounds(214, 259, 150, 45);
		add(lblRellenar);
		
		JLabel lblTemperatura = new JLabel("temperatura");
		lblTemperatura.setBounds(395, 259, 143, 45);
		add(lblTemperatura);
	}
}
