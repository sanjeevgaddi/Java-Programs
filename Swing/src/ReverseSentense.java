import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReverseSentense extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseSentense frame = new ReverseSentense();
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
	public ReverseSentense() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("REVERSE SENTENCE");
		heading.setForeground(Color.BLUE);
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setBounds(116, 10, 207, 24);
		contentPane.add(heading);
		
		JLabel lbl1 = new JLabel("Enter a Sentence :");
		lbl1.setForeground(Color.RED);
		lbl1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl1.setBounds(26, 64, 154, 24);
		contentPane.add(lbl1);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(202, 66, 171, 24);
		contentPane.add(ta1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(202, 186, 171, 24);
		contentPane.add(ta2);
		
		JButton bt1 = new JButton("Reverse Sentence");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic of Reverse Sentence
				String sentence=ta1.getText();
				String arr[]=sentence.split(" ");
				String revsent="";
				for (int i = 0; i <= arr.length-1; i++) 
				{
					String word=arr[i];
					String revword="";
					for (int j = word.length()-1; j >= 0; j--) 	
					{
						revword=revword+word.charAt(j);
					}
					revsent=revsent+revword+" ";
				}
				ta2.setText(revsent);
			}
		});
		bt1.setForeground(Color.GREEN);
		bt1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		bt1.setBounds(134, 123, 175, 29);
		contentPane.add(bt1);
		
		JLabel lbl2 = new JLabel("Reversed Sentence :");
		lbl2.setForeground(Color.RED);
		lbl2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl2.setBounds(26, 184, 171, 24);
		contentPane.add(lbl2);
		
	
	}

}
