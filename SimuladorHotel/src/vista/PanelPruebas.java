package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelPruebas extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private SelectorHora panelHora;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelPruebas frame = new PanelPruebas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PanelPruebas() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelHora = new SelectorHora();
		panelHora.setBounds(94, 37, 230, 206);
		contentPane.add(panelHora);

		JButton btnGetTiempo = new JButton("Get tiempo");
		btnGetTiempo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane,
						("Hora: " + panelHora.getHoras() + " / Minutos: " + panelHora.getMinutos()), "Info",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnGetTiempo.setBounds(94, 254, 230, 23);
		contentPane.add(btnGetTiempo);
	}
}
