import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class bmi extends JFrame {

	private JPanel contentPane;
	private JTextField txt_weight;
	private JTextField txt_height;
	private JTextField txt_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmi frame = new bmi();
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
	public bmi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1109, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Calculate BMI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double w = Double.parseDouble(txt_weight.getText());
				double h = Double.parseDouble(txt_height.getText());
				
				txt_result.setText(Double.toString(w/ (h * h)));
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(324, 302, 155, 54);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_weight.setText(null);
				txt_height.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(539, 302, 155, 54);
		contentPane.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
			
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(741, 302, 155, 54);
		contentPane.add(btnExit);
		
		txt_weight = new JTextField();
		txt_weight.setBounds(547, 127, 209, 33);
		contentPane.add(txt_weight);
		txt_weight.setColumns(10);
		
		txt_height = new JTextField();
		txt_height.setColumns(10);
		txt_height.setBounds(547, 220, 209, 33);
		contentPane.add(txt_height);
		
		JLabel lblNewLabel = new JLabel("Weight(kg)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(389, 129, 114, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblHeight = new JLabel("Height(m)");
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHeight.setBounds(389, 222, 90, 23);
		contentPane.add(lblHeight);
		
		JLabel lblBmiCalculator = new JLabel("BMI Calculator");
		lblBmiCalculator.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBmiCalculator.setBounds(485, 27, 242, 23);
		contentPane.add(lblBmiCalculator);
		
		JLabel lblNewLabel_1_1 = new JLabel("Result");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_1_1.setBounds(413, 411, 90, 73);
		contentPane.add(lblNewLabel_1_1);
		
		txt_result = new JTextField();
		txt_result.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_result.setBounds(539, 427, 299, 54);
		contentPane.add(txt_result);
		txt_result.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("kg/m2");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_1_1_1.setBounds(848, 417, 90, 73);
		contentPane.add(lblNewLabel_1_1_1);
	}

}
