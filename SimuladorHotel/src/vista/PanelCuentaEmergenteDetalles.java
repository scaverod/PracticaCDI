package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.Controlador;
import controlador.MicroControladorLayersPadreHijo;
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
import java.awt.Dimension;

public class PanelCuentaEmergenteDetalles extends JPanel {
	private static final long serialVersionUID = 1L;

	public PanelCuentaEmergenteDetalles(MicroControladorLayersPadreHijo m, Controlador controlador) {
		setMaximumSize(new Dimension(400, 330));
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102),
				new Color(0, 0, 102)));
		this.setSize(400, 315);
		this.setName("p" + this.getClass().getSimpleName().substring(1));
		setLayout(null);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ocultar panel
				m.changeLayer(0);
			}
		});
		btnCerrar.setBounds(304, 11, 89, 35);
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
		scrollPane.setMaximumSize(new Dimension(400, 330));
		scrollPane.setBounds(10, 49, 380, 255);
		add(scrollPane);

		JLabel lblListaDeGastos = new JLabel("Lista de Gastos");
		lblListaDeGastos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblListaDeGastos.setBounds(135, 16, 130, 25);
		add(lblListaDeGastos);
	}
}
