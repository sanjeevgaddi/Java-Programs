import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BinarySearch extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BinarySearch frame = new BinarySearch();
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
	public BinarySearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("BINARY SEARCH");
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setForeground(Color.BLUE);
		heading.setBounds(138, 10, 166, 24);
		contentPane.add(heading);
		
		JLabel lbl1 = new JLabel("Enter 5 Numbers :");
		lbl1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl1.setForeground(Color.RED);
		lbl1.setBounds(30, 67, 160, 24);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Enter Key to Search :");
		lbl2.setForeground(Color.RED);
		lbl2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl2.setBounds(30, 113, 183, 24);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("Result :");
		lbl3.setForeground(Color.RED);
		lbl3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl3.setBounds(93, 162, 66, 24);
		contentPane.add(lbl3);
		
		JTextArea ta1 = new JTextArea();
		ta1.setColumns(5);
		ta1.setBounds(223, 69, 190, 22);
		contentPane.add(ta1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(223, 115, 190, 22);
		contentPane.add(ta2);
		
		JTextArea ta3 = new JTextArea();
		ta3.setBounds(223, 164, 190, 22);
		contentPane.add(ta3);
		
		JButton bt1 = new JButton("Binary Search");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic for Binary Search
				String sentence=ta1.getText();
				String arr[]=sentence.split(" ");
				int key=Integer.valueOf(ta2.getText());
				int low=0;
				int high=arr.length-1;
				String result1;
				String result2;
				while(low <= high)
				{
				{
					int mid=(low+high)/2;
					if(key==Integer.valueOf(arr[mid]))
					{
						result1="Search Success Key @ ";
						ta3.setText(result1+String.valueOf(mid));
						return;
					}
					else if(key > Integer.valueOf(arr[mid]))
					{
						low=mid+1;
						high=high;
					}
					else
					{
						high=mid-1;
						low=low;
					}
				}
				result2="Key Not Found!";
				ta3.setText(result2);
				}
			}
		});
		bt1.setForeground(Color.GREEN);
		bt1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		bt1.setBounds(158, 206, 155, 33);
		contentPane.add(bt1);
	}

}
