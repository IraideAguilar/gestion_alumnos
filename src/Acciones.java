import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Acciones extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Acciones dialog = new Acciones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Acciones() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblDatosAlumno = new JLabel("DATOS ALUMNO");
			lblDatosAlumno.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblDatosAlumno.setBounds(136, 36, 171, 14);
			contentPanel.add(lblDatosAlumno);
		}
		{
			JButton btnNewButton = new JButton("introducir alumno");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnNewButton.setBounds(10, 85, 164, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JButton buttonBorrarAlumno = new JButton("BorrarAlumno");
			buttonBorrarAlumno.setFont(new Font("Tahoma", Font.BOLD, 11));
			buttonBorrarAlumno.setBounds(10, 119, 164, 23);
			contentPanel.add(buttonBorrarAlumno);
		}
		{
			JButton buttonMedia = new JButton("Media Edad Alumnos");
			buttonMedia.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			buttonMedia.setFont(new Font("Tahoma", Font.BOLD, 11));
			buttonMedia.setBounds(10, 159, 164, 23);
			contentPanel.add(buttonMedia);
		}
		
		JComboBox comboBoxAlumnos = new JComboBox();
		comboBoxAlumnos.setBounds(264, 120, 122, 20);
		contentPanel.add(comboBoxAlumnos);
	}
	protected void mediaEdad(){
	
	}
}
