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

public class LinearSearch extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinearSearch frame = new LinearSearch();
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
	public LinearSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("LINEAR SEARCH");
		heading.setForeground(Color.BLUE);
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setBounds(138, 10, 165, 24);
		contentPane.add(heading);
		
		JLabel lbl1 = new JLabel("Enter 5 Numbers :");
		lbl1.setForeground(Color.RED);
		lbl1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl1.setBounds(25, 56, 160, 24);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Enter a Key to Search :");
		lbl2.setForeground(Color.RED);
		lbl2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl2.setBounds(25, 106, 198, 24);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("Result :");
		lbl3.setForeground(Color.RED);
		lbl3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl3.setBounds(91, 154, 66, 24);
		contentPane.add(lbl3);
		
		JTextArea ta1 = new JTextArea();
		ta1.setColumns(5);
		ta1.setBounds(233, 58, 180, 22);
		contentPane.add(ta1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(233, 108, 180, 22);
		contentPane.add(ta2);
		
		JTextArea ta3 = new JTextArea();
		ta3.setBounds(233, 156, 180, 22);
		contentPane.add(ta3);
		
		JButton btn1 = new JButton("Linear Search");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic to write for linear search
				String sentence=ta1.getText();
				String arr[]=sentence.split(" ");
				int key=Integer.valueOf(ta2.getText());
				String result1;
				String result2;
				for(int i=0;i<=arr.length-1;i++)
				{
				{
					if(key==Integer.valueOf(arr[i]))
					{
						result1="Search sucess key @ ";
						ta3.setText(result1+String.valueOf(i));
						break;
					}
				}
				result2="Key Not Found! ";
				ta3.setText(result2);
				}
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn1.setForeground(Color.GREEN);
		btn1.setBounds(156, 212, 153, 33);
		contentPane.add(btn1);
	}
}
