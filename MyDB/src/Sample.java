import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class Sample extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample frame = new Sample();
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
	public Sample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Id");
		lblNewLabel.setBounds(39, 30, 61, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(135, 25, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 58, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 96, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setBounds(39, 63, 61, 16);
		contentPane.add(lblEnterName);
		
		JLabel lblEnterAge = new JLabel("Enter Age");
		lblEnterAge.setBounds(39, 101, 61, 16);
		contentPane.add(lblEnterAge);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/NU19","root","root");
					Statement stmt=con.createStatement();
					int id=Integer.parseInt(textField.getText());
					String name=textField_1.getText();
					int age=Integer.parseInt(textField_2.getText());
					
					String query="Insert into student values("
							+id+",'"+name+"',"+age+")";
					//System.out.println(query);
					stmt.executeUpdate(query);
					con.close();
					System.out.println("Record Saved");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(39, 134, 117, 29);
		contentPane.add(btnNewButton);
	}

}
