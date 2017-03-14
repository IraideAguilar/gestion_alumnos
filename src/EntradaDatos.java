import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EntradaDatos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldMatricula;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EntradaDatos dialog = new EntradaDatos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EntradaDatos() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel labelMatricula = new JLabel("N\u00BA matricula :");
			labelMatricula.setBounds(48, 68, 94, 14);
			contentPanel.add(labelMatricula);
		}
		{
			JLabel labelNombre = new JLabel("Nombre :");
			labelNombre.setBounds(48, 102, 46, 14);
			contentPanel.add(labelNombre);
		}
		{
			JLabel labelApellido = new JLabel("Apellido :");
			labelApellido.setBounds(48, 140, 56, 14);
			contentPanel.add(labelApellido);
		}
		{
			JLabel labelEdad = new JLabel("Edad :");
			labelEdad.setBounds(48, 173, 46, 14);
			contentPanel.add(labelEdad);
		}
		{
			textFieldMatricula = new JTextField();
			textFieldMatricula.setBounds(128, 65, 86, 20);
			contentPanel.add(textFieldMatricula);
			textFieldMatricula.setColumns(10);
		}
		{
			textFieldNombre = new JTextField();
			textFieldNombre.setBounds(128, 99, 86, 20);
			contentPanel.add(textFieldNombre);
			textFieldNombre.setColumns(10);
		}
		{
			textFieldApellido = new JTextField();
			textFieldApellido.setBounds(128, 137, 86, 20);
			contentPanel.add(textFieldApellido);
			textFieldApellido.setColumns(10);
		}
		{
			textFieldEdad = new JTextField();
			textFieldEdad.setBounds(128, 170, 86, 20);
			contentPanel.add(textFieldEdad);
			textFieldEdad.setColumns(10);
		}
		{
			JButton buttonGuardar = new JButton("Guardar");
			buttonGuardar.setBounds(232, 211, 89, 23);
			contentPanel.add(buttonGuardar);
		}
	}

}
