import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 429);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CHOOSE A DATA STRUCTURE");
		heading.setForeground(new Color(0, 0, 255));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setHorizontalAlignment(SwingConstants.TRAILING);
		heading.setBounds(162, 10, 290, 24);
		contentPane.add(heading);
		
		JButton array = new JButton("ARRAY");
		array.setForeground(new Color(255, 0, 0));
		array.setFont(new Font("Dialog", Font.BOLD, 16));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Array Window Opening code Here
				new Array().setVisible(true);
			}
		});
		array.setBounds(256, 62, 97, 29);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Stack Window Opening code Here
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(Color.ORANGE);
		stack.setFont(new Font("Dialog", Font.BOLD, 16));
		stack.setBounds(92, 124, 95, 29);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Queue Window Opening code Here
			}
		});
		queue.setForeground(Color.MAGENTA);
		queue.setFont(new Font("Dialog", Font.BOLD, 16));
		queue.setBounds(424, 124, 99, 29);
		contentPane.add(queue);
		
		JButton circularqueue = new JButton("CIRCULAR QUEUE");
		circularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Circular Queue Window Opening code Here
			}
		});
		circularqueue.setForeground(Color.MAGENTA);
		circularqueue.setFont(new Font("Times New Roman", Font.BOLD, 16));
		circularqueue.setBounds(37, 237, 203, 29);
		contentPane.add(circularqueue);
		
		JButton SinglyLinkedList = new JButton("SINGLY LINKED LIST");
		SinglyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Singly Linked List Window Opening code Here
			}
		});
		SinglyLinkedList.setForeground(Color.ORANGE);
		SinglyLinkedList.setFont(new Font("Dialog", Font.BOLD, 16));
		SinglyLinkedList.setBounds(369, 237, 227, 29);
		contentPane.add(SinglyLinkedList);
		
		JButton doublyLinkedList = new JButton("DOUBLY LINKED LIST");
		doublyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Doubly Linked List Window Opening code Here
			}
		});
		doublyLinkedList.setForeground(Color.RED);
		doublyLinkedList.setFont(new Font("Dialog", Font.BOLD, 16));
		doublyLinkedList.setBounds(198, 326, 235, 29);
		contentPane.add(doublyLinkedList);
	}

}
