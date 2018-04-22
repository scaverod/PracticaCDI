package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.Controlador;
import controlador.MicroControladorLayersPadreHijo;
import idiomas.Texto;
import tiposVariable.StringDouble;
import tiposVariable.Tabla;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelCuentaEmergenteDetalles extends JPanel {
	private static final long serialVersionUID = 1L;
	private Texto t;

	public PanelCuentaEmergenteDetalles(MicroControladorLayersPadreHijo m, Controlador controlador) {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// No borrar
			}
		});
		t = controlador.getTexto();
		this.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240), new Color(0, 109, 240)));
		this.setSize(400, 330);
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);

		JButton btnCerrar = new JButton(t.getBtnCerrar());
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ocultar panel
				m.changeLayer(0);
			}
		});
		btnCerrar.setBounds(301, 13, 89, 35);
		add(btnCerrar);
		Tabla tabla = new Tabla();
		ArrayList<StringDouble> listagastos = controlador.getCuenta().getGasto().getGastos();
		if (listagastos.size() > 0) {
			tabla.removeFilaInicial();
			for (int x = 0; x < listagastos.size(); x++) {
				tabla.addFila(listagastos.get(x));
			}
		}
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setBounds(10, 59, 380, 260);
		add(scrollPane);

		JLabel lblListaDeGastos = new JLabel(t.getLblListaDeGastos());
		lblListaDeGastos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblListaDeGastos.setBounds(135, 16, 130, 25);
		add(lblListaDeGastos);
	}
}
