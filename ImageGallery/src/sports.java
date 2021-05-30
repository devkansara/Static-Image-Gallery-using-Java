import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sports extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sports frame = new sports();
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
	public sports() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 41, 727, 502);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Formula 1", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton_3_2 = new JButton("Next");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_3_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2.setBounds(288, 415, 118, 41);
		panel_1.add(btnNewButton_3_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(sports.class.getResource("/Images/Sports/imgonline-com-ua-resize-y7XlSK8pNJmR2dhB.jpg")));
		lblNewLabel.setBounds(10, 10, 711, 395);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Motorsports", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(sports.class.getResource("/Images/Sports/imgonline-com-ua-resize-76p1LlQAn8nsyYeg.jpg")));
		lblNewLabel_1.setBounds(10, 10, 711, 395);
		panel_2.add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("Previous");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3.setBounds(196, 415, 116, 40);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("Next");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_1_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(381, 415, 116, 40);
		panel_2.add(btnNewButton_1_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("F1", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon(sports.class.getResource("/Images/Sports/imgonline-com-ua-resize-zYSW5v7iKlKGg.jpg")));
		lblNewLabel_1_1.setBounds(10, 10, 711, 395);
		panel_3.add(lblNewLabel_1_1);
		
		JButton btnNewButton_4 = new JButton("Previous");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_4.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_4.setBounds(193, 415, 116, 40);
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("Next");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_1_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(380, 415, 116, 40);
		panel_3.add(btnNewButton_1_1);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Football", null, panel, null);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnNewButton_1.setBounds(378, 416, 116, 40);
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Previous");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton.setBounds(194, 416, 116, 40);
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setIcon(new ImageIcon(sports.class.getResource("/Images/Sports/imgonline-com-ua-resize-Gc42CzWI7eJ.jpg")));
		lblNewLabel_1_2.setBounds(10, 10, 711, 395);
		panel.add(lblNewLabel_1_2);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Cricket", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("New label");
		lblNewLabel_1_3.setIcon(new ImageIcon(sports.class.getResource("/Images/Sports/imgonline-com-ua-resize-C8motqv6klbockjR.jpg")));
		lblNewLabel_1_3.setBounds(10, 10, 711, 395);
		panel_4.add(lblNewLabel_1_3);
		
		JButton btnNewButton_2 = new JButton("Previous");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_2.setBounds(294, 415, 116, 40);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("Back");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Categories c = new Categories();
				setVisible(false);
			}
		});
		btnNewButton_5.setBounds(10, 10, 85, 21);
		contentPane.add(btnNewButton_5);
		setVisible(true);
	}
}
