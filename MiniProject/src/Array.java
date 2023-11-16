import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deleteposition;
	private JTextField arraydisplay;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 618);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 224));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("ARRAY DATA STRUCTURE");
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setForeground(new Color(0, 0, 128));
		heading.setBounds(266, 10, 259, 24);
		contentPane.add(heading);
		
		JLabel lbl1 = new JLabel("ENTER ARRAY LENGTH :");
		lbl1.setForeground(new Color(255, 0, 0));
		lbl1.setFont(new Font("Constantia", Font.BOLD, 18));
		lbl1.setBounds(68, 87, 216, 23);
		contentPane.add(lbl1);
		
		length = new JTextField();
		length.setBackground(new Color(255, 255, 255));
		length.setFont(new Font("Constantia", Font.BOLD, 16));
		length.setBounds(305, 87, 111, 24);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btncreatearray = new JButton("CREATE ARRAY");
		btncreatearray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic to create length of an array
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		btncreatearray.setForeground(new Color(255, 0, 255));
		btncreatearray.setFont(new Font("Dialog", Font.BOLD, 16));
		btncreatearray.setBounds(269, 139, 169, 31);
		contentPane.add(btncreatearray);
		
		JLabel lbl2 = new JLabel("ENTER AN INTEGER ELEMENT :");
		lbl2.setForeground(new Color(255, 0, 0));
		lbl2.setFont(new Font("Constantia", Font.BOLD, 18));
		lbl2.setBounds(6, 226, 278, 23);
		contentPane.add(lbl2);
		
		element = new JTextField();
		element.setBackground(new Color(255, 255, 255));
		element.setBounds(283, 225, 102, 24);
		contentPane.add(element);
		element.setColumns(10);
		
		JLabel lbl3 = new JLabel("POSITION :");
		lbl3.setForeground(new Color(255, 0, 0));
		lbl3.setFont(new Font("Constantia", Font.BOLD, 18));
		lbl3.setBounds(395, 226, 102, 23);
		contentPane.add(lbl3);
		
		insertposition = new JTextField();
		insertposition.setBounds(507, 226, 96, 22);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JButton btninsert = new JButton("INSERT");
		btninsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic to Insert an element
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				if(pos>arr.length-1) {
					String message="Enter the position from 0 to "+(arr.length-1);
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
					insertposition.setText("");
				}
				arr[pos]=elem;
				String message="Element "+elem+" inserted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		btninsert.setForeground(new Color(255, 0, 255));
		btninsert.setFont(new Font("Dialog", Font.BOLD, 16));
		btninsert.setBounds(631, 222, 99, 31);
		contentPane.add(btninsert);
		
		JLabel lbl4 = new JLabel("ENTER THE POSITION :");
		lbl4.setForeground(new Color(255, 0, 0));
		lbl4.setFont(new Font("Constantia", Font.BOLD, 18));
		lbl4.setBounds(68, 315, 209, 23);
		contentPane.add(lbl4);
		
		deleteposition = new JTextField();
		deleteposition.setBounds(294, 314, 122, 24);
		contentPane.add(deleteposition);
		deleteposition.setColumns(10);
		
		JButton btndelete = new JButton("DELETE");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic to Delete an element
				int pos=Integer.valueOf(deleteposition.getText());
				if(pos>arr.length-1) {
					String message="Enter the position from 0 to "+(arr.length-1);
					JOptionPane.showMessageDialog(contentPane, message);
				}
				String message="Element Deleted @ the position "+pos+" is "+arr[pos];
				arr[pos]=0;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		btndelete.setForeground(new Color(255, 0, 255));
		btndelete.setFont(new Font("Dialog", Font.BOLD, 16));
		btndelete.setBounds(463, 311, 103, 31);
		contentPane.add(btndelete);
		
		JButton btndisplay = new JButton("DISPLAY");
		btndisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic to display elements in an array
				String message="";
				for(int i=0;i<=arr.length-1;i++)
				{
					message=message+" "+arr[i];
				}
				arraydisplay.setText(message);
			}
		});
		btndisplay.setForeground(new Color(255, 0, 255));
		btndisplay.setFont(new Font("Dialog", Font.BOLD, 16));
		btndisplay.setBounds(345, 397, 109, 31);
		contentPane.add(btndisplay);
		
		arraydisplay = new JTextField();
		arraydisplay.setBackground(new Color(255, 255, 255));
		arraydisplay.setBounds(164, 482, 439, 31);
		contentPane.add(arraydisplay);
		arraydisplay.setColumns(10);
	}
}
