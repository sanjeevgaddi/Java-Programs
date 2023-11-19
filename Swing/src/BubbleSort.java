import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BubbleSort extends JFrame {

	private JPanel contentPane;
	private JTextField ta1;
	private JTextField ta2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BubbleSort frame = new BubbleSort();
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
	public BubbleSort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("SORTING");
		heading.setForeground(Color.BLUE);
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setBounds(179, 10, 91, 24);
		contentPane.add(heading);
		
		JLabel ip1 = new JLabel("Enter Numbers for Sorting :");
		ip1.setForeground(Color.RED);
		ip1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		ip1.setBounds(10, 55, 242, 24);
		contentPane.add(ip1);
		
		ta1 = new JTextField();
		ta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		ta1.setBounds(255, 58, 169, 24);
		contentPane.add(ta1);
		ta1.setColumns(10);
		
		JLabel ip2 = new JLabel("Numbers After Sorting :");
		ip2.setForeground(Color.RED);
		ip2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		ip2.setBounds(10, 114, 209, 24);
		contentPane.add(ip2);
		
		ta2 = new JTextField();
		ta2.setBounds(255, 117, 169, 24);
		contentPane.add(ta2);
		ta2.setColumns(10);
		
		JButton button1 = new JButton("BUBBLE_SORT");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentence=ta1.getText();
				String[] arr=sentence.split(" ");
				String help;
				for(int i=0;i<=arr.length-2;i++)
				{
					for(int j=0;j<=arr.length-2-i;j++)
					{
						if(Integer.valueOf(arr[j])>Integer.valueOf(arr[j+1]))
						{
							help=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=help;
						}
					}
				}
				String result ="";
				for(int i=0;i<=arr.length-1;i++)
				{
					result=result+arr[i]+" ";
				}
				ta2.setText(result);
			}
		});
		button1.setForeground(Color.GREEN);
		button1.setBackground(Color.WHITE);
		button1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button1.setBounds(160, 195, 169, 29);
		contentPane.add(button1);
	}

}