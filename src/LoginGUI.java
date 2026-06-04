import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class LoginGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txt_username;
	private JTextField txt_password;
	private JButton btnNewButton;
	private JLabel lblLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		Login login = new Login();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		txt_username = new JTextField();
		txt_username.setBounds(241, 88, 96, 19);
		contentPane.add(txt_username);
		txt_username.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USERNAME:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(114, 88, 96, 16);
		contentPane.add(lblNewLabel);
		
		txt_password = new JTextField();
		txt_password.setColumns(10);
		txt_password.setBounds(241, 137, 96, 19);
		contentPane.add(txt_password);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(114, 137, 96, 16);
		contentPane.add(lblPassword);
		
		btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String getusername = txt_username.getText();
				String getpassword = txt_password.getText();
				login.uselogin(getusername, getpassword);
				
				
			}
		});
		btnNewButton.setBounds(176, 191, 100, 26);
		contentPane.add(btnNewButton);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblLogin.setBounds(192, 36, 84, 16);
		contentPane.add(lblLogin);
	}
}
