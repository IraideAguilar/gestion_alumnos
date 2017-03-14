import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;

public class Comprobacion extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public Comprobacion(JFrame parent,String titulua,boolean modal){
		
		super(parent,titulua,modal);
		
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton buttonContinuar = new JButton("Continuar");
			buttonContinuar.setFont(new Font("Tahoma", Font.BOLD, 11));
			buttonContinuar.setBounds(156, 146, 89, 23);
			contentPanel.add(buttonContinuar);
		}
		{
			JLabel labelOngiEtorri = new JLabel("Ongi etorri : ");
			labelOngiEtorri.setBounds(105, 86, 177, 14);
			contentPanel.add(labelOngiEtorri);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
