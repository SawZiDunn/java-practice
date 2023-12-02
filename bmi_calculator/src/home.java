import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home {

	private JFrame frame;
	private JTextField txt_greet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(128, 128, 192));
		frame.getContentPane().setBackground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 989, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_welcome = new JLabel("Welcome to my App");
		lbl_welcome.setBackground(new Color(64, 0, 64));
		lbl_welcome.setForeground(new Color(0, 0, 0));
		lbl_welcome.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl_welcome.setBounds(295, 34, 376, 47);
		frame.getContentPane().add(lbl_welcome);
		
		txt_greet = new JTextField();
		txt_greet.setBounds(341, 112, 220, 69);
		frame.getContentPane().add(txt_greet);
		txt_greet.setColumns(10);
		
		JButton btn_greet = new JButton("Greeting");
		btn_greet.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_greet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_greet.setText("Welcome to the app, ZiDunn...");
				lbl_welcome.setText("My First App");
				JOptionPane.showMessageDialog(null,"Welcome to the App...");
			}
		});
		
		btn_greet.setBounds(365, 278, 173, 47);
		frame.getContentPane().add(btn_greet);
		
		JButton btnNewButton_1 = new JButton("Go to Main Page");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main main_pg = new main();
				main_pg.setVisible(true);
				
			}
		});
		
		btnNewButton_1.setBounds(365, 355, 173, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btn_exit = new JButton("Exit");
		btn_exit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		
		btn_exit.setBounds(834, 445, 131, 56);
		frame.getContentPane().add(btn_exit);
		
		JButton btn_clear = new JButton("Clear");
		btn_clear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_greet.setText(null);
				lbl_welcome.setText(null);
			}
		});
		btn_clear.setBounds(706, 445, 118, 56);
		frame.getContentPane().add(btn_clear);
	}
}
