import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField taSize;
	private JTextField taElement;
	private JTextField taDisplay;
	private int[] arr;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 515);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("STACK DATA STRUCTURE");
		heading.setForeground(new Color(0, 0, 255));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setBounds(241, 10, 255, 24);
		contentPane.add(heading);
		
		JLabel lblStackSize = new JLabel("ENTER THE STACK SIZE :");
		lblStackSize.setForeground(new Color(255, 0, 0));
		lblStackSize.setFont(new Font("Constantia", Font.BOLD, 18));
		lblStackSize.setBounds(146, 79, 231, 21);
		contentPane.add(lblStackSize);
		
		taSize = new JTextField();
		taSize.setBackground(new Color(255, 250, 250));
		taSize.setBounds(387, 77, 106, 29);
		contentPane.add(taSize);
		taSize.setColumns(10);
		
		JButton btnCreateStack = new JButton("CREATE STACK");
		btnCreateStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic to create stack size
				int size=Integer.valueOf(taSize.getText());
				arr=new int[size];
				String message="Stack of length "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnCreateStack.setForeground(new Color(0, 0, 128));
		btnCreateStack.setFont(new Font("Dialog", Font.BOLD, 16));
		btnCreateStack.setBounds(300, 134, 167, 35);
		contentPane.add(btnCreateStack);
		
		JLabel lblElement = new JLabel("ENTER AN ELEMENT :");
		lblElement.setHorizontalAlignment(SwingConstants.TRAILING);
		lblElement.setForeground(Color.RED);
		lblElement.setFont(new Font("Constantia", Font.BOLD, 18));
		lblElement.setBounds(131, 208, 202, 21);
		contentPane.add(lblElement);
		
		taElement = new JTextField();
		taElement.setBackground(new Color(255, 250, 250));
		taElement.setBounds(341, 206, 114, 29);
		contentPane.add(taElement);
		taElement.setColumns(10);
		
		JButton btnPush = new JButton("PUSH");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic to push an element
				int elem=Integer.valueOf(taElement.getText());
				int size=Integer.valueOf(taSize.getText());
				if(top==size-1)
				{
					String message="PUSH not possible";
					JOptionPane.showMessageDialog(contentPane, message);
					taElement.setText("");
				}
				else
				{
					++top;
					arr[top]=elem;
					String message="Element "+elem+" is pushed into stack @ "+top;
					JOptionPane.showMessageDialog(contentPane, message);
					taElement.setText("");
				}	
			}
		});
		btnPush.setForeground(new Color(0, 0, 128));
		btnPush.setFont(new Font("Dialog", Font.BOLD, 16));
		btnPush.setBounds(500, 205, 114, 30);
		contentPane.add(btnPush);
		
		JButton btnPop = new JButton("POP");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic to pop an element
				if(top==-1)
				{
					String message="POP not possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					String message="Element deleted is "+arr[top]+" @ position"+top;
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}	
			}
		});
		btnPop.setForeground(new Color(0, 0, 128));
		btnPop.setFont(new Font("Dialog", Font.BOLD, 16));
		btnPop.setBounds(366, 271, 130, 35);
		contentPane.add(btnPop);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic to display array elements
				String msg="";
				if(top == -1)
				{
					JOptionPane.showMessageDialog(contentPane, "Stack is empty! Display not possible");
					taDisplay.setText("");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						msg=msg+" "+arr[i];
					}
					taDisplay.setText(msg);
				}
			}
		});
		btnDisplay.setForeground(new Color(0, 0, 128));
		btnDisplay.setFont(new Font("Dialog", Font.BOLD, 16));
		btnDisplay.setBounds(325, 337, 130, 35);
		contentPane.add(btnDisplay);
		
		taDisplay = new JTextField();
		taDisplay.setBackground(new Color(255, 250, 250));
		taDisplay.setText("");
		taDisplay.setBounds(178, 412, 387, 29);
		contentPane.add(taDisplay);
		taDisplay.setColumns(10);
	}
}
