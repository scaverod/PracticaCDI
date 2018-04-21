package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controlador.Controlador;
import controlador.MicroControladorLayersPadreHijo;
import idiomas.Texto;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class PanelHabitacionEmergenteAlarma extends JPanel {
	private static final long serialVersionUID = 1L;
	private Texto t;
	private ImageIcon addIcon = new ImageIcon(PanelHabitacionEmergenteAlarma.class.getResource("/iconos/alarmAdd.png"));
	private ImageIcon descativarIcon = new ImageIcon(
			PanelHabitacionEmergenteAlarma.class.getResource("/iconos/alarmRemove.png"));
	private ImageIcon editIcon = new ImageIcon(
			PanelHabitacionEmergenteAlarma.class.getResource("/iconos/alarmEdit.png"));
	private ImageIcon aceptIcon = new ImageIcon(
			PanelHabitacionEmergenteAlarma.class.getResource("/iconos/alarmAcept.png"));
	private JCheckBox chckbxLunes;
	private JCheckBox chckbxMartes;
	private JCheckBox chckbxMiercoles;
	private JCheckBox chckbxJueves;
	private JCheckBox chckbxViernes;
	private JCheckBox chckbxSbado;
	private JCheckBox chckbxDomingo;

	private int estado;

	public PanelHabitacionEmergenteAlarma(MicroControladorLayersPadreHijo m, Controlador controlador) {
		t = controlador.getTexto();
		estado = 0;

		JButton btnDescativar = new JButton("");
		JButton btnAceptar = new JButton("");
		SelectorHora panelHora = new SelectorHora(0, 23);
		JTextArea txtrParaEmpezarA = new JTextArea();

		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (estado) {
				case 0:
					panelHora.visible();
					visibleChckbox();
					btnAceptar.setIcon(aceptIcon);
					estado = 1;
					txtrParaEmpezarA.setVisible(false);
					break;
				case 1:
					btnAceptar.setIcon(editIcon);
					panelHora.desactivar();
					desactivarChckbox();
					btnDescativar.setVisible(true);
					estado = 2;
					break;
				case 2:
					btnAceptar.setIcon(aceptIcon);
					panelHora.activar();
					activarChckbox();
					btnDescativar.setVisible(false);
					estado = 1;
					break;
				}

			}
		});

		this.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 109, 240), new Color(0, 109, 240),
				new Color(0, 109, 240), new Color(0, 109, 240)));
		this.setSize(695, 315);
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

		txtrParaEmpezarA.setOpaque(false);
		txtrParaEmpezarA.setEditable(false);
		
		
		txtrParaEmpezarA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtrParaEmpezarA.setText("Para empezar a utilizar nuestro sistema de despertador a\u00F1ada una alarma pulsando en el bot\u00F3n inferior derecho");
		txtrParaEmpezarA.setLineWrap(true);
		txtrParaEmpezarA.setRequestFocusEnabled(false);
		txtrParaEmpezarA.setBounds(139, 136, 416, 42);
		add(txtrParaEmpezarA);
		btnCerrar.setBounds(610, 11, 75, 50);
		add(btnCerrar);

		chckbxLunes = new JCheckBox("Lunes");
		chckbxLunes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxLunes.setBounds(23, 19, 75, 23);
		add(chckbxLunes);

		panelHora.setBounds(232, 57, 231, 201);
		panelHora.noVisible();
		add(panelHora);

		chckbxMiercoles = new JCheckBox("Mi\u00E9rcoles");
		chckbxMiercoles.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxMiercoles.setBounds(23, 103, 97, 23);
		add(chckbxMiercoles);

		chckbxJueves = new JCheckBox("Jueves");
		chckbxJueves.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxJueves.setBounds(23, 145, 79, 23);
		add(chckbxJueves);

		chckbxViernes = new JCheckBox("Viernes");
		chckbxViernes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxViernes.setBounds(23, 187, 83, 23);
		add(chckbxViernes);

		chckbxSbado = new JCheckBox("S\u00E1bado");
		chckbxSbado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxSbado.setBounds(23, 229, 83, 23);
		add(chckbxSbado);

		chckbxDomingo = new JCheckBox("Domingo");
		chckbxDomingo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxDomingo.setBounds(23, 271, 97, 23);
		add(chckbxDomingo);

		chckbxMartes = new JCheckBox("Martes");
		chckbxMartes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxMartes.setBounds(23, 61, 86, 23);
		add(chckbxMartes);

		btnAceptar.setIcon(addIcon);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAceptar.setBounds(610, 254, 75, 50);
		add(btnAceptar);

		btnDescativar.setIcon(descativarIcon);
		btnDescativar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				noVisibleChckbox();
				panelHora.noVisible();
				btnDescativar.setVisible(false);
				btnAceptar.setIcon(addIcon);
				txtrParaEmpezarA.setVisible(true);
				estado = 0;
			}
		});
		btnDescativar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDescativar.setBounds(525, 254, 75, 50);
		btnDescativar.setVisible(false);
		add(btnDescativar);
		
		noVisibleChckbox();
	}

	public void desactivarChckbox() {
		chckbxLunes.setEnabled(false);
		chckbxMartes.setEnabled(false);
		chckbxMiercoles.setEnabled(false);
		chckbxJueves.setEnabled(false);
		chckbxViernes.setEnabled(false);
		chckbxSbado.setEnabled(false);
		chckbxDomingo.setEnabled(false);
	}

	public void activarChckbox() {
		chckbxLunes.setEnabled(true);
		chckbxMartes.setEnabled(true);
		chckbxMiercoles.setEnabled(true);
		chckbxJueves.setEnabled(true);
		chckbxViernes.setEnabled(true);
		chckbxSbado.setEnabled(true);
		chckbxDomingo.setEnabled(true);
	}
	
	public void noVisibleChckbox() {
		chckbxLunes.setVisible(false);
		chckbxMartes.setVisible(false);
		chckbxMiercoles.setVisible(false);
		chckbxJueves.setVisible(false);
		chckbxViernes.setVisible(false);
		chckbxSbado.setVisible(false);;
		chckbxDomingo.setVisible(false);
	}

	public void visibleChckbox() {
		chckbxLunes.setVisible(true);
		chckbxMartes.setVisible(true);
		chckbxMiercoles.setVisible(true);
		chckbxJueves.setVisible(true);
		chckbxViernes.setVisible(true);
		chckbxSbado.setVisible(true);;
		chckbxDomingo.setVisible(true);
	}
}
