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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField ta1;
	private JTextField ta2;
	private JTextField ta3;
	private Node first;
	class Node
	{
		Node prelink;
		Integer data;
		Node nextlink;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 611);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		heading.setForeground(new Color(128, 0, 0));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setBounds(153, 10, 403, 24);
		contentPane.add(heading);
		
		JLabel lbl1 = new JLabel("ENTER THE ELEMENT :");
		lbl1.setForeground(new Color(128, 0, 128));
		lbl1.setFont(new Font("Constantia", Font.BOLD, 18));
		lbl1.setBounds(54, 75, 204, 23);
		contentPane.add(lbl1);
		
		ta1 = new JTextField();
		ta1.setBounds(273, 75, 174, 23);
		contentPane.add(ta1);
		ta1.setColumns(10);
		
		JButton btn1 = new JButton("INSERT REAR");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Inserting the element at Rear
				Node temp;
				Integer elem = Integer.valueOf(ta1.getText());

				Node newnode = new Node();
				newnode.data = elem;
				newnode.nextlink = null;
				newnode.prelink = null;

				if(first == null) 
				{
					first = newnode;
				}
				else
				{
					temp = first;
					while(temp.nextlink != null)
					{
						temp = temp.nextlink;
					}
					temp.nextlink = newnode;
					temp.prelink = temp;
				}
				JOptionPane.showMessageDialog(contentPane, "Element "+elem+" is inserted at rear end");
				ta1.setText("");

			}
		});
		btn1.setForeground(new Color(30, 144, 255));
		btn1.setFont(new Font("Dialog", Font.BOLD, 16));
		btn1.setBounds(490, 75, 151, 29);
		contentPane.add(btn1);
		
		JLabel lbl2 = new JLabel("ENTER THE ELEMENT :");
		lbl2.setForeground(new Color(128, 0, 128));
		lbl2.setFont(new Font("Constantia", Font.BOLD, 18));
		lbl2.setBounds(54, 149, 204, 23);
		contentPane.add(lbl2);
		
		ta2 = new JTextField();
		ta2.setColumns(10);
		ta2.setBounds(273, 149, 174, 23);
		contentPane.add(ta2);
		
		JButton btn2 = new JButton("INSERT FRONT");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Inserting the element at Front
				int elem = Integer.valueOf(ta2.getText());

				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;

				if(first == null) 
				{
					first = newnode;
				}
				else
				{
					newnode.nextlink = first;
					first.prelink = newnode;
					first = newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Element "+elem+" is inserted at front end");
				ta2.setText("");

			}
		});
		btn2.setForeground(new Color(30, 144, 255));
		btn2.setFont(new Font("Dialog", Font.BOLD, 16));
		btn2.setBounds(490, 149, 160, 29);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("DELETE REAR");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Deleting the element at Rear
				Node temp;
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Delete not possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element "+first.data+" is deleted");
				}
				else
				{
					temp = first;
					while(temp.nextlink.nextlink != null) {
						temp = temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "Element "+temp.nextlink.data+" is deleted");
					temp.nextlink = null;
				}

			}
		});
		btn3.setForeground(new Color(30, 144, 255));
		btn3.setFont(new Font("Dialog", Font.BOLD, 16));
		btn3.setBounds(273, 233, 174, 29);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("DELETE FRONT");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Deleting the element at Front
				if(first == null) 
				{
					JOptionPane.showMessageDialog(contentPane, "Delete not possible");
				}
				else if(first.nextlink == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first = null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first = first.nextlink;
					first.prelink = null;
				}

			}
		});
		btn4.setForeground(new Color(30, 144, 255));
		btn4.setFont(new Font("Dialog", Font.BOLD, 16));
		btn4.setBounds(273, 307, 174, 29);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("DISPLAY FORWARD");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Displaying the elements in Forward 
				Node temp;
				String msg = "";
				if(first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					ta3.setText(msg);
				}
				else if(first.nextlink == null) {
					msg = msg + " "+first.data;
					ta3.setText(msg);
				}else
				{
					temp = first;
					while(temp != null) {
						msg = msg +" "+temp.data;
						temp = temp.nextlink;
					}
					ta3.setText(msg);
				}

			}
		});
		btn5.setForeground(new Color(30, 144, 255));
		btn5.setFont(new Font("Dialog", Font.BOLD, 16));
		btn5.setBounds(131, 390, 204, 29);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("DISPLAY REVERSE");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Displaying the elements in Reverse 
				Node temp;
				String msg = "";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					ta3.setText(msg);
				}
				else if(first.nextlink==null)
				{
					msg = msg + " "+first.data;
					ta3.setText(msg);
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					String msg1 = "";
					while(temp!=null)
					{
						msg1 = msg1 + " "+first.data;
						temp=temp.prelink;

					}
					ta3.setText(msg1);
				}

			}
		});
		btn6.setForeground(new Color(30, 144, 255));
		btn6.setFont(new Font("Dialog", Font.BOLD, 16));
		btn6.setBounds(392, 390, 204, 29);
		contentPane.add(btn6);
		
		ta3 = new JTextField();
		ta3.setBounds(153, 475, 403, 29);
		contentPane.add(ta3);
		ta3.setColumns(10);
	}

}
