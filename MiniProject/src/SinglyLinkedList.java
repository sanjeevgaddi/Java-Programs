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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField ta1;
	private JTextField ta2;
	private JTextField ta3;
	private Node first;
	class Node//Linked list node
	{
		int data;
		Node link;
	}
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 566);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		heading.setForeground(new Color(0, 128, 128));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setBounds(156, 10, 394, 24);
		contentPane.add(heading);
		
		JLabel lbl1 = new JLabel("ENTER THE ELEMENT :");
		lbl1.setForeground(new Color(128, 0, 0));
		lbl1.setFont(new Font("Constantia", Font.BOLD, 18));
		lbl1.setBounds(36, 84, 204, 23);
		contentPane.add(lbl1);
		
		ta1 = new JTextField();
		ta1.setBounds(261, 85, 155, 22);
		contentPane.add(ta1);
		ta1.setColumns(10);
		
		JLabel lbl2 = new JLabel("ENTER THE ELEMENT :");
		lbl2.setForeground(new Color(128, 0, 0));
		lbl2.setFont(new Font("Constantia", Font.BOLD, 18));
		lbl2.setBounds(36, 151, 204, 23);
		contentPane.add(lbl2);
		
		ta2 = new JTextField();
		ta2.setColumns(10);
		ta2.setBounds(261, 152, 155, 22);
		contentPane.add(ta2);
		
		JButton btn1 = new JButton("INSERT REAR");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Inserting the element at Rear
				Node temp;
				int elem = Integer.valueOf(ta1.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;

				if(first == null) {
					first = newnode;
				}
				else 
				{
					temp = first;
					while(temp.link!=null) 
					{
						temp = temp.link;
					}
					temp.link = newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Element "+elem+" is inserted at rear end");
				ta1.setText("");

			}
		});
		btn1.setForeground(new Color(128, 128, 0));
		btn1.setFont(new Font("Dialog", Font.BOLD, 16));
		btn1.setBounds(465, 84, 161, 29);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("INSERT FRONT");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Inserting the element at Front
				int elem = Integer.valueOf(ta2.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;

				if(first == null) 
				{
					first = newnode;
				}
				else 
				{
					newnode.link = first;
					first = newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Element "+elem+" is inserted at front end");
				ta2.setText("");

			}
		});
		btn2.setForeground(new Color(128, 128, 0));
		btn2.setFont(new Font("Dialog", Font.BOLD, 16));
		btn2.setBounds(465, 144, 161, 29);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("DELETE REAR");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Deleting the element at Rear
				Node temp;
				if(first == null) 
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
					ta3.setText("");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else
				{
					temp = first;
					while(temp.link.link != null)
					{
						temp = temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.link.data);
					temp.link = null;
				}

			}
		});
		btn3.setForeground(new Color(128, 128, 0));
		btn3.setFont(new Font("Dialog", Font.BOLD, 16));
		btn3.setBounds(261, 225, 155, 29);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("DELETE FRONT");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Deleting the element at Front
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
					ta3.setText("");
				}
				else if(first.link == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first= null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first = first.link;
				}

			}
		});
		btn4.setForeground(new Color(128, 128, 0));
		btn4.setFont(new Font("Dialog", Font.BOLD, 16));
		btn4.setBounds(249, 300, 167, 29);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("DISPLAY");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Displaying the elements
				Node temp;
				String msg = "";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					ta3.setText(msg);
				}
				else if(first.link == null)
				{
					msg = msg+" "+first.data;
					ta3.setText(msg);
				}
				else 
				{
					temp = first;
					while(temp!=null) 
					{
						msg = msg+" "+temp.data;
						ta3.setText(msg);
						temp = temp.link;
					}
				}

			}
		});
		btn5.setForeground(new Color(128, 128, 0));
		btn5.setFont(new Font("Dialog", Font.BOLD, 16));
		btn5.setBounds(285, 374, 116, 29);
		contentPane.add(btn5);
		
		ta3 = new JTextField();
		ta3.setBounds(115, 450, 437, 29);
		contentPane.add(ta3);
		ta3.setColumns(10);
	}
}
