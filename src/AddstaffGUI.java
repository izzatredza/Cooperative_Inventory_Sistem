import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddstaffGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txt_username;
	private JTextField txt_password;
	
	Login login = new Login();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddstaffGUI frame = new AddstaffGUI();
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
	public AddstaffGUI() {
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddStaff = new JLabel("STAFF");
		lblAddStaff.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddStaff.setBackground(new Color(51, 0, 204));
		lblAddStaff.setBounds(226, 25, 82, 36);
		contentPane.add(lblAddStaff);
		
		JLabel lblUsername = new JLabel("USERNAME:");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblUsername.setBounds(137, 91, 106, 16);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(137, 132, 106, 16);
		contentPane.add(lblPassword);
		
		txt_username = new JTextField();
		txt_username.setColumns(10);
		txt_username.setBounds(278, 91, 122, 19);
		contentPane.add(txt_username);
		
		txt_password = new JTextField();
		txt_password.setColumns(10);
		txt_password.setBounds(278, 132, 122, 19);
		contentPane.add(txt_password);
		
		JButton btn_addlogin = new JButton("ADD STAFF");
		btn_addlogin.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn_addlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String getusername = txt_username.getText();
				String getpassword = txt_password.getText();
				
				Staff staff = new Staff(getusername, getpassword);
				
				login.add(staff);

			}
		});
		btn_addlogin.setBounds(57, 197, 106, 36);
		contentPane.add(btn_addlogin);
		
		JButton btn_removelogin = new JButton("REMOVE STAFF");
		btn_removelogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = txt_username.getText();
				
				login.removeLogin(username);
			}
		});
		btn_removelogin.setForeground(Color.WHITE);
		btn_removelogin.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn_removelogin.setBackground(Color.RED);
		btn_removelogin.setBounds(203, 197, 117, 36);
		contentPane.add(btn_removelogin);
		
		JButton btn_updatelogin = new JButton("UPDATE STAFF");
		btn_updatelogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = txt_username.getText();
				String password = txt_password.getText();
				
				login.updateLogin(username, password);
			}
		});
		btn_updatelogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_updatelogin.setBounds(352, 196, 134, 37);
		contentPane.add(btn_updatelogin);
		
		JButton btn_Listlogin = new JButton("LIST STAFF");
		btn_Listlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.displaylogin();
			}
		});
		btn_Listlogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Listlogin.setBounds(203, 261, 117, 36);
		contentPane.add(btn_Listlogin);
		
		JLabel lblNewLabel_2 = new JLabel("*Only username should be input for removing staff");
		lblNewLabel_2.setBounds(0, 0, 328, 13);
		contentPane.add(lblNewLabel_2);
	}
}
