import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JTextField textFieldContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(132, 78, 104, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		textFieldContrasena = new JTextField();
		textFieldContrasena.setBounds(132, 122, 104, 20);
		contentPane.add(textFieldContrasena);
		textFieldContrasena.setColumns(10);
		
		JButton buttonAceptar = new JButton("Aceptar");
		buttonAceptar.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonAceptar.setBounds(136, 190, 89, 23);
		contentPane.add(buttonAceptar);
		
		JLabel labelUsuario = new JLabel("Usuario :");
		labelUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelUsuario.setBounds(50, 81, 58, 14);
		contentPane.add(labelUsuario);
		
		JLabel labelContrasena = new JLabel("Contrasena :");
		labelContrasena.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelContrasena.setBounds(31, 125, 77, 14);
		contentPane.add(labelContrasena);
	}

}
