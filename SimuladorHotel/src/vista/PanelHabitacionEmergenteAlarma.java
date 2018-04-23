/*

The following notices can be found in each source file of the 
original project.

Copyright (C) 2018 EquipoSPA:
	David Herrero Pascual	- GitHub: Deividhp13
	Antonio Castro Blanco	- GitHub: Castrum38
	Radu Dumitru Boboia		- GitHub: rdboboia
	Sergio Cavero Díaz		- GitHub: scaverod

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.

You can contact us at our GitHub written above.

To see the full license, check:
https://github.com/scaverod/PracticaCDI/blob/master/LICENSE

*/

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
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class PanelHabitacionEmergenteAlarma extends JPanel {
	private static final long serialVersionUID = 1L;

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
	private JCheckBox chckbxSabado;
	private JCheckBox chckbxDomingo;

	private Texto t;

	private int estado;

	public PanelHabitacionEmergenteAlarma(MicroControladorLayersPadreHijo m, Controlador controlador) {
		t = controlador.getTexto();
		estado = 0;

		JButton btnDescativar = new JButton("");
		btnDescativar.setFocusPainted(false);
		JButton btnAceptar = new JButton("");
		btnAceptar.setFocusPainted(false);
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
					controlador.getHabitacion().getDespertador().setHora(panelHora.getTiempo());
					controlador.getHabitacion().getDespertador().setDia(guardarDias());
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
					btnDescativar.setVisible(true);
					estado = 1;
					controlador.getHabitacion().getDespertador().setHora(panelHora.getTiempo());
					controlador.getHabitacion().getDespertador().setDia(guardarDias());
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
		txtrParaEmpezarA.setText(t.getTxtrParaEmpezarA());
		txtrParaEmpezarA.setLineWrap(true);
		txtrParaEmpezarA.setRequestFocusEnabled(false);
		txtrParaEmpezarA.setBounds(139, 136, 416, 42);
		add(txtrParaEmpezarA);
		btnCerrar.setBounds(610, 11, 75, 50);
		add(btnCerrar);

		chckbxLunes = new JCheckBox(t.getLblLunes());
		chckbxLunes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxLunes.setBounds(23, 19, 121, 23);
		add(chckbxLunes);

		panelHora.setLocation(247, 57);
		panelHora.noVisible();
		add(panelHora);

		chckbxMiercoles = new JCheckBox(t.getLblMiercoles());
		chckbxMiercoles.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxMiercoles.setBounds(23, 103, 121, 23);
		add(chckbxMiercoles);

		chckbxJueves = new JCheckBox(t.getLblJueves());
		chckbxJueves.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxJueves.setBounds(23, 145, 121, 23);
		add(chckbxJueves);

		chckbxViernes = new JCheckBox(t.getLblViernes());
		chckbxViernes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxViernes.setBounds(23, 187, 121, 23);
		add(chckbxViernes);

		chckbxSabado = new JCheckBox(t.getLblSabado());
		chckbxSabado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxSabado.setBounds(23, 229, 121, 23);
		add(chckbxSabado);

		chckbxDomingo = new JCheckBox(t.getLblDomingo());
		chckbxDomingo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxDomingo.setBounds(23, 271, 121, 23);
		add(chckbxDomingo);

		chckbxMartes = new JCheckBox(t.getLblMartes());
		chckbxMartes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxMartes.setBounds(23, 61, 121, 23);
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
				activarChckbox();
				panelHora.activar();
				estado = 0;
				controlador.getHabitacion().getDespertador().eliminar();
			}
		});
		btnDescativar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDescativar.setBounds(525, 254, 75, 50);
		btnDescativar.setVisible(false);
		add(btnDescativar);

		noVisibleChckbox();

		this.addHierarchyListener(new HierarchyListener() {
			public void hierarchyChanged(HierarchyEvent e) {
				if (e.getChangeFlags() == HierarchyEvent.HIERARCHY_FIRST
						|| e.getChangeFlags() == HierarchyEvent.SHOWING_CHANGED) {
					t = controlador.getTexto();
					chckbxLunes.setText(t.getLblLunes());
					chckbxMartes.setText(t.getLblMartes());
					chckbxMiercoles.setText(t.getLblMiercoles());
					chckbxJueves.setText(t.getLblJueves());
					chckbxViernes.setText(t.getLblViernes());
					chckbxSabado.setText(t.getLblSabado());
					chckbxDomingo.setText(t.getLblDomingo());
					btnCerrar.setText(t.getBtnCerrar());
					txtrParaEmpezarA.setText(t.getTxtrParaEmpezarA());

				}
			}
		});

	}

	public void desactivarChckbox() {
		chckbxLunes.setEnabled(false);
		chckbxMartes.setEnabled(false);
		chckbxMiercoles.setEnabled(false);
		chckbxJueves.setEnabled(false);
		chckbxViernes.setEnabled(false);
		chckbxSabado.setEnabled(false);
		chckbxDomingo.setEnabled(false);
	}

	public void activarChckbox() {
		chckbxLunes.setEnabled(true);
		chckbxMartes.setEnabled(true);
		chckbxMiercoles.setEnabled(true);
		chckbxJueves.setEnabled(true);
		chckbxViernes.setEnabled(true);
		chckbxSabado.setEnabled(true);
		chckbxDomingo.setEnabled(true);
	}

	public void noVisibleChckbox() {
		chckbxLunes.setVisible(false);
		chckbxMartes.setVisible(false);
		chckbxMiercoles.setVisible(false);
		chckbxJueves.setVisible(false);
		chckbxViernes.setVisible(false);
		chckbxSabado.setVisible(false);
		chckbxDomingo.setVisible(false);
	}

	public void visibleChckbox() {
		chckbxLunes.setVisible(true);
		chckbxMartes.setVisible(true);
		chckbxMiercoles.setVisible(true);
		chckbxJueves.setVisible(true);
		chckbxViernes.setVisible(true);
		chckbxSabado.setVisible(true);
		chckbxDomingo.setVisible(true);
	}

	public boolean[] guardarDias() {
		boolean[] aux = new boolean[7];
		aux[0] = chckbxLunes.isSelected();
		aux[1] = chckbxMartes.isSelected();
		aux[2] = chckbxMiercoles.isSelected();
		aux[3] = chckbxJueves.isSelected();
		aux[4] = chckbxViernes.isSelected();
		aux[5] = chckbxSabado.isSelected();
		aux[6] = chckbxDomingo.isSelected();
		return aux;
	}
}
