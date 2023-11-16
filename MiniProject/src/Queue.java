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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField ta1;
	private JTextField ta2;
	private JTextField ta3;
	private int q[];
	private int r=-1;
	private int f=0;
	private int size;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 533);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("QUEUE  DATASTRUCTURE");
		heading.setForeground(new Color(102, 0, 0));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setBounds(207, 10, 259, 24);
		contentPane.add(heading);
		
		JLabel lbl1 = new JLabel("ENTER QUEUE SIZE :");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setForeground(new Color(255, 0, 0));
		lbl1.setFont(new Font("Constantia", Font.BOLD, 18));
		lbl1.setBounds(76, 82, 218, 23);
		contentPane.add(lbl1);
		
		ta1 = new JTextField();
		ta1.setBounds(308, 78, 161, 29);
		contentPane.add(ta1);
		ta1.setColumns(10);
		
		JButton btn1 = new JButton("CREATE QUEUE");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for creating queue size
				size = Integer.valueOf(ta1.getText());
				q = new int[size];
				String msg = "Queue of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, msg);

			}
		});
		btn1.setBackground(new Color(240, 240, 240));
		btn1.setForeground(new Color(0, 0, 255));
		btn1.setFont(new Font("Dialog", Font.BOLD, 16));
		btn1.setBounds(280, 145, 186, 29);
		contentPane.add(btn1);
		
		JLabel lbl2 = new JLabel("ENTER AN ELEMENT :");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setForeground(Color.RED);
		lbl2.setFont(new Font("Constantia", Font.BOLD, 18));
		lbl2.setBounds(76, 218, 218, 23);
		contentPane.add(lbl2);
		
		ta2 = new JTextField();
		ta2.setColumns(10);
		ta2.setBounds(308, 214, 132, 29);
		contentPane.add(ta2);
		
		JButton btn2 = new JButton("INSERT");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for Inserting the element
				int elem;
				if(r == size-1) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");	
					ta2.setText("");
				}
				else
				{
					elem = Integer.valueOf(ta2.getText());
					++r;
					q[r] = elem;
					JOptionPane.showMessageDialog(contentPane, "element "+elem+" inserted");
					ta2.setText("");
				}
			}
		});
		btn2.setForeground(new Color(0, 0, 255));
		btn2.setFont(new Font("Dialog", Font.BOLD, 16));
		btn2.setBounds(495, 218, 118, 29);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("DELETE");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for Deleting the element
				if(r == -1 || f>r) 
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
					
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+q[f]);
					f++;
				}

			}
		});
		btn3.setForeground(new Color(0, 0, 255));
		btn3.setFont(new Font("Dialog", Font.BOLD, 16));
		btn3.setBounds(308, 283, 130, 29);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("DISPLAY");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for Displaying the elements
				String msg = "";
				if(r == -1 || f>r) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					ta3.setText(msg);
				}
				else
				{
					for (int i = f; i <= r; i++) {
						msg = msg+" "+q[i];
					}
					ta3.setText(msg);
				}


			}
		});
		btn4.setForeground(new Color(0, 0, 255));
		btn4.setFont(new Font("Dialog", Font.BOLD, 16));
		btn4.setBounds(308, 340, 130, 29);
		contentPane.add(btn4);
		
		ta3 = new JTextField();
		ta3.setColumns(10);
		ta3.setBounds(155, 419, 406, 34);
		contentPane.add(ta3);
	}

}
