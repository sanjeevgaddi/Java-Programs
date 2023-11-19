import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class FirstWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txofA;
	private JTextField txofB;
	private JTextField txofresult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow frame = new FirstWindow();
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
	public FirstWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Calculator = new JLabel("CALCULATOR");
		Calculator.setForeground(Color.BLUE);
		Calculator.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Calculator.setBackground(Color.WHITE);
		Calculator.setBounds(148, 11, 140, 24);
		contentPane.add(Calculator);
		
		JLabel labelA = new JLabel("A");
		labelA.setForeground(Color.RED);
		labelA.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelA.setBounds(99, 46, 14, 24);
		contentPane.add(labelA);
		
		txofA = new JTextField();
		txofA.setBounds(163, 45, 111, 25);
		contentPane.add(txofA);
		txofA.setColumns(10);
		
		txofB = new JTextField();
		txofB.setBounds(163, 88, 111, 25);
		contentPane.add(txofB);
		txofB.setColumns(10);
		
		JLabel labelB = new JLabel("B");
		labelB.setForeground(Color.RED);
		labelB.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelB.setBounds(99, 89, 14, 24);
		contentPane.add(labelB);
		
		txofresult = new JTextField();
		txofresult.setColumns(10);
		txofresult.setBounds(163, 127, 111, 25);
		contentPane.add(txofresult);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setForeground(Color.RED);
		lblResult.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblResult.setBounds(83, 127, 55, 24);
		contentPane.add(lblResult);
		
		JButton add = new JButton("ADD");
		add.setForeground(Color.GREEN);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//addition logic
			String data1=txofA.getText();
			String data2=txofB.getText();
			int val1=Integer.valueOf(data1);
			int val2=Integer.valueOf(data2);
			int res=val1+val2;
			String result = String.valueOf(res);
			txofresult.setText(result);
			}
		});
		add.setFont(new Font("Times New Roman", Font.BOLD, 13));
		add.setBounds(10, 192, 63, 25);
		contentPane.add(add);
		
		JButton sub = new JButton("SUB");
		sub.setForeground(Color.GREEN);
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//subtraction logic
			String data1=txofA.getText();
			String data2=txofB.getText();
			int val1=Integer.valueOf(data1);
			int val2=Integer.valueOf(data2);
			int res=val1-val2;
			String result = String.valueOf(res);
			txofresult.setText(result);
			}
		});
		sub.setFont(new Font("Times New Roman", Font.BOLD, 13));
		sub.setBounds(97, 192, 61, 25);
		contentPane.add(sub);
		
		JButton mul = new JButton("MUL");
		mul.setForeground(Color.GREEN);
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Multiplication logic
				String data1=txofA.getText();
				String data2=txofB.getText();
				int val1=Integer.valueOf(data1);
				int val2=Integer.valueOf(data2);
				int res=val1*val2;
				String result = String.valueOf(res);
				txofresult.setText(result);
			}
		});
		mul.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mul.setBounds(188, 192, 67, 25);
		contentPane.add(mul);
		
		JButton div = new JButton("DIV");
		div.setForeground(Color.GREEN);
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//division logic
				String data1=txofA.getText();
				String data2=txofB.getText();
				float val1=Float.valueOf(data1);
				float val2=Float.valueOf(data2);
				float res=val1/val2;
				String result = String.valueOf(res);
				txofresult.setText(result);
			}
		});
		div.setFont(new Font("Times New Roman", Font.BOLD, 13));
		div.setBounds(269, 192, 59, 25);
		contentPane.add(div);
		
		JButton rem = new JButton("REM");
		rem.setForeground(Color.GREEN);
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//reminder logic
				int val1=Integer.valueOf(txofA.getText());
				int val2=Integer.valueOf(txofB.getText());
				int res=val1%val2;
				String result = String.valueOf(res);
				txofresult.setText(result);
			}
		});
		rem.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rem.setBounds(355, 192, 65, 25);
		contentPane.add(rem);
	}
}
