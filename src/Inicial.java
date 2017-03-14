import java.awt.BorderLayout;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicial extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JTextField textFieldContrasena;

	
	
	Usuario usuario = new Usuario();
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
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
	public Inicial() {
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
		
		JButton buttonEntrar = new JButton("Entrar");
		buttonEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(usuario.getNombreUsuario().equals(textFieldUsuario.getText()) && usuario.getPasswordUsuario().equals(textFieldContrasena.getText())){
					
					abrirComprobacion();
				}else{
					error();
				}
			}
		});
		buttonEntrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonEntrar.setBounds(136, 190, 89, 23);
		contentPane.add(buttonEntrar);
		
		JLabel labelUsuario = new JLabel("Usuario :");
		labelUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelUsuario.setBounds(50, 81, 58, 14);
		contentPane.add(labelUsuario);
		
		JLabel labelContrasena = new JLabel("Contrasena :");
		labelContrasena.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelContrasena.setBounds(31, 125, 77, 14);
		contentPane.add(labelContrasena);
	}

	protected void error(){
		JOptionPane.showMessageDialog(this, "Error, usuario no permitido", "Comprobar cuenta", JOptionPane.ERROR_MESSAGE);
	}
	
	protected void abrirComprobacion(){
		Comprobacion comprobacion = new Comprobacion(this,"Comprobar cuenta",true);
		comprobacion.setVisible(true);
	}
}
