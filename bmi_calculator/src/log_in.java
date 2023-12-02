import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class log_in extends JFrame {

	private JPanel contentPane;
	private JTextField txt_user;
	private JPasswordField txt_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					log_in frame = new log_in();
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
	public log_in() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_user = new JTextField();
		txt_user.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_user.setBounds(366, 145, 215, 40);
		contentPane.add(txt_user);
		txt_user.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(240, 148, 116, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(240, 224, 78, 27);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txt_user.getText();
				String password = txt_password.getText();
				
				if (user.equals("ZiDunn") && password.equals("123")) {
					JOptionPane.showMessageDialog(null, "Log In Confirmed...");
					bmi bmi = new bmi();
					bmi.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "Incorrect Password or Username!");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(233, 320, 144, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblLogIn = new JLabel("Log In ");
		lblLogIn.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblLogIn.setBounds(392, 35, 116, 27);
		contentPane.add(lblLogIn);
		
		txt_password = new JPasswordField();
		txt_password.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_password.setBounds(366, 221, 215, 40);
		contentPane.add(txt_password);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_user.setText(null);
				txt_password.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(457, 320, 144, 40);
		contentPane.add(btnClear);
	}
}
