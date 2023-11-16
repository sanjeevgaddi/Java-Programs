import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField ta1;
	private JTextField ta2;
	private JTextField ta3;
	private int cq[];
	private int rear=-1;
	private int front=0;
	private int size;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 598);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		heading.setForeground(new Color(72, 61, 139));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setBounds(183, 10, 366, 24);
		contentPane.add(heading);
		
		JLabel lbl1 = new JLabel("ENTER QUEUE SIZE :");
		lbl1.setForeground(new Color(128, 0, 0));
		lbl1.setFont(new Font("Constantia", Font.BOLD, 18));
		lbl1.setBounds(104, 91, 186, 23);
		contentPane.add(lbl1);
		
		ta1 = new JTextField();
		ta1.setBounds(311, 84, 171, 24);
		contentPane.add(ta1);
		ta1.setColumns(10);
		
		JButton btn1 = new JButton("CREATE QUEUE");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for Creating the Queue size
				String message="";
				size = Integer.valueOf(ta1.getText());
				if(size>0)
				{
					message = "Queue of size "+size+" is created";
					cq = new int[size];
				}
				else
				{
					message = "Queue size should be more than zero";
					ta1.setText("");
				}
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		btn1.setForeground(new Color(106, 90, 205));
		btn1.setFont(new Font("Dialog", Font.BOLD, 16));
		btn1.setBounds(231, 150, 180, 29);
		contentPane.add(btn1);
		
		JLabel lbl2 = new JLabel("ENTER AN ELEMENT :");
		lbl2.setForeground(new Color(128, 0, 0));
		lbl2.setFont(new Font("Constantia", Font.BOLD, 18));
		lbl2.setBounds(104, 225, 192, 23);
		contentPane.add(lbl2);
		
		ta2 = new JTextField();
		ta2.setColumns(10);
		ta2.setBounds(311, 224, 119, 24);
		contentPane.add(ta2);
		
		JButton btn2 = new JButton("INSERT");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for Inserting the element
				if(count == size && count !=0)//to display a message if queue is full
				{
					JOptionPane.showMessageDialog(contentPane,"CircularQueue is full! Insertion not possible");
					ta1.setText("");
				}
				else if(count >=0)
				{
					int elem = Integer.valueOf(ta2.getText());//asking user for the element
					rear=(rear+1)%size;
					if(rear==-1)
					{
						JOptionPane.showMessageDialog(contentPane,"CircularQueue is not created! Create CircularQueue");
						ta2.setText("");
					}
					else
					{
						cq[rear] = elem;//inserting element at rear end
						count++;
						JOptionPane.showMessageDialog(contentPane,"Insertion Successfull");
						ta2.setText("");
					}
				}

			}
		});
		btn2.setForeground(new Color(0, 0, 255));
		btn2.setFont(new Font("Dialog", Font.BOLD, 16));
		btn2.setBounds(465, 219, 107, 29);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("DELETE");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for Deleting the element
				if(count == 0)
				{
					JOptionPane.showMessageDialog(contentPane,"CircularQueue is empty! Deletion not possible");
					
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane,"Element deleted is "+cq[front]);
					front=(front+1)%size;
					count--;
				}

			}
		});
		btn3.setForeground(new Color(0, 0, 255));
		btn3.setFont(new Font("Dialog", Font.BOLD, 16));
		btn3.setBounds(281, 302, 119, 29);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("DISPLAY");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for Displaying the element
				int f1=front;
				String msg="";
				if(count == 0)
				{
					JOptionPane.showMessageDialog(contentPane,"CircularQueue is empty! Display not possible");
					ta3.setText("");
				}
				else
				{
					for(int i=1;i<=count;i++)
					{
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					ta3.setText(msg);
				}

			}
		});
		btn4.setForeground(new Color(0, 0, 255));
		btn4.setFont(new Font("Dialog", Font.BOLD, 16));
		btn4.setBounds(281, 374, 119, 29);
		contentPane.add(btn4);
		
		ta3 = new JTextField();
		ta3.setColumns(10);
		ta3.setBounds(152, 461, 397, 29);
		contentPane.add(ta3);
	}

}
