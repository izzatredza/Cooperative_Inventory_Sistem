import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.TextArea;

public class MainGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txt_product;
	private JTextField txt_quantity;
	private JTextField txt_price;
	
	Inventory inventory = new Inventory();
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
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
	public MainGUI() {
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_additem = new JButton("ADD ITEM");
		btn_additem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String getproductname = txt_product.getText().toUpperCase();
					int getquantity = Integer.parseInt(txt_quantity.getText());
					double getprice = Double.parseDouble(txt_price.getText());
					
					Item item = new Item(getproductname, getquantity, getprice);
					inventory.addItem(item);
					
				} catch(NumberFormatException e1) {
					
					JOptionPane.showMessageDialog(null, "PLEASE PUT APPROPIRATE VALUE", "WARNING", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btn_additem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_additem.setBounds(115, 346, 126, 58);
		contentPane.add(btn_additem);
		
		JButton btn_ListItem = new JButton("LIST ITEM");
		btn_ListItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventory.displayInventory();
			}
		});
		btn_ListItem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_ListItem.setBounds(487, 244, 126, 58);
		contentPane.add(btn_ListItem);
		
		JButton btn_removeitem = new JButton("REMOVE ITEM");
		btn_removeitem.setBackground(Color.RED);
		btn_removeitem.setForeground(Color.WHITE);
		btn_removeitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String getproductname = txt_product.getText().toUpperCase();
				
				inventory.removeItem(getproductname);
				
			}
		});
		btn_removeitem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_removeitem.setBounds(298, 346, 126, 58);
		contentPane.add(btn_removeitem);
		
		JButton btn_staff = new JButton("STAFF");
		btn_staff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddstaffGUI frame = new AddstaffGUI();
				frame.show();
				
			}
		});
		btn_staff.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_staff.setBounds(487, 144, 126, 58);
		contentPane.add(btn_staff);
		
		JLabel lblNewLabel = new JLabel("COOPERATIVE INVENTORY SYSTEM");
		lblNewLabel.setBackground(new Color(51, 0, 204));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(210, 33, 274, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRODUCT NAME:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(134, 129, 141, 16);
		contentPane.add(lblNewLabel_1);
		
		txt_product = new JTextField();
		txt_product.setColumns(10);
		txt_product.setBounds(298, 129, 96, 19);
		contentPane.add(txt_product);
		
		JLabel lblQuantity = new JLabel("QUANTITY:");
		lblQuantity.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblQuantity.setBounds(179, 183, 96, 16);
		contentPane.add(lblQuantity);
		
		JLabel lblPrice = new JLabel("PRICE(RM):");
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPrice.setBounds(179, 244, 96, 16);
		contentPane.add(lblPrice);
		
		txt_quantity = new JTextField();
		txt_quantity.setColumns(10);
		txt_quantity.setBounds(298, 183, 96, 19);
		contentPane.add(txt_quantity);
		
		txt_price = new JTextField();
		txt_price.setColumns(10);
		txt_price.setBounds(298, 244, 96, 19);
		contentPane.add(txt_price);
		
		JLabel lblNewLabel_2 = new JLabel("*Only Product name should be input for removing item");
		lblNewLabel_2.setBounds(1, 10, 328, 13);
		contentPane.add(lblNewLabel_2);
		
		JButton btn_update = new JButton("UPDATE ITEM");
		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String getproductname = txt_product.getText().toUpperCase();
					int getquantity = Integer.parseInt(txt_quantity.getText());
					double getprice = Double.parseDouble(txt_price.getText());
					
					inventory.updateItem(getproductname, getquantity, getprice);
		
				}catch(NumberFormatException e1) {
					
					JOptionPane.showMessageDialog(null, "PLEASE PUT APPROPIRATE VALUE & FILL IN THE BLANK", "WARNING", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btn_update.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_update.setBounds(487, 346, 126, 58);
		contentPane.add(btn_update);
	}
}
