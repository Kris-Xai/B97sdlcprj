package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Radio_Btn extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radio_Btn frame = new Radio_Btn();
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
	public Radio_Btn() {
		setTitle("Radiion Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnmale = new JRadioButton("Male");
		rdbtnmale.setBackground(new Color(64, 128, 128));
		rdbtnmale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnmale.setBounds(120, 154, 103, 21);
		contentPane.add(rdbtnmale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(new Color(64, 128, 128));
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnFemale.setBounds(252, 156, 103, 21);
		contentPane.add(rdbtnFemale);
		
		JRadioButton rdbtnWalmartBag = new JRadioButton("Walmart bag");
		rdbtnWalmartBag.setBackground(new Color(64, 128, 128));
		rdbtnWalmartBag.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnWalmartBag.setBounds(413, 156, 111, 21);
		contentPane.add(rdbtnWalmartBag);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnmale);
		bg.add(rdbtnFemale);
		bg.add(rdbtnWalmartBag);
		
		JLabel lblNewLabel = new JLabel("Choose your gender");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(208, 58, 191, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Choose");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnmale.isSelected())
					JOptionPane.showMessageDialog(null, "Hello, Sir");
				if(rdbtnFemale.isSelected())
					JOptionPane.showMessageDialog(null, "Good Morning, Ma'dam");
				if(rdbtnWalmartBag.isSelected())
					JOptionPane.showMessageDialog(null, "You sure? (;-;)");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(164, 225, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bg.clearSelection();
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNext.setBounds(340, 225, 85, 21);
		contentPane.add(btnNext);
	}
}
