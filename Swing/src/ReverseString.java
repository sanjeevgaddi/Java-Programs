import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReverseString extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseString frame = new ReverseString();
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
	public ReverseString() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("REVERSE STRING");
		heading.setForeground(Color.BLUE);
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setBounds(140, 10, 176, 24);
		contentPane.add(heading);
		
		JLabel lbl1 = new JLabel("Enter a String :");
		lbl1.setForeground(new Color(255, 0, 0));
		lbl1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl1.setBounds(33, 64, 133, 24);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Reversed String  :");
		lbl2.setForeground(Color.RED);
		lbl2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl2.setBounds(33, 180, 154, 24);
		contentPane.add(lbl2);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(198, 66, 184, 24);
		contentPane.add(ta1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(198, 182, 184, 24);
		contentPane.add(ta2);
		
		JButton bt1 = new JButton("Reverse String");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic for String Reverse
				String sentence=ta1.getText();
				char arr1[]=sentence.toCharArray();
				char arr2[]=new char[arr1.length];
				int j=arr2.length-1;
				for (int i = 0; i <= arr1.length-1; i++) 
				{
					arr2[j]=arr1[i];
					j--;
				}
				sentence=new String(arr2);
				ta2.setText(sentence);
			}
		});
		bt1.setForeground(Color.GREEN);
		bt1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		bt1.setBounds(150, 121, 159, 33);
		contentPane.add(bt1);
	}

}
