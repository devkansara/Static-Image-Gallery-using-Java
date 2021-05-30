import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class technology extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					technology frame = new technology();
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
	public technology() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 608);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 38, 726, 528);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Gaming", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(technology.class.getResource("/Images/Technology/imgonline-com-ua-resize-6GgqIVGjBSOHn.jpg")));
		lblNewLabel.setBounds(10, 10, 711, 395);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_3_2 = new JButton("Next");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_3_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2.setBounds(285, 415, 118, 41);
		panel.add(btnNewButton_3_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("PCB", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(technology.class.getResource("/Images/Technology/imgonline-com-ua-resize-agSPtHRBsJ3tAq.jpg")));
		lblNewLabel_1.setBounds(10, 10, 711, 395);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_3_2_1 = new JButton("Next");
		btnNewButton_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_3_2_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2_1.setBounds(382, 415, 118, 41);
		panel_1.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_3 = new JButton("Previous");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3.setBounds(189, 415, 116, 40);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Graphic", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(technology.class.getResource("/Images/Technology/imgonline-com-ua-resize-NtQwVJJojpdCAk4.jpg")));
		lblNewLabel_2.setBounds(10, 10, 711, 395);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_3_2_2 = new JButton("Next");
		btnNewButton_3_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_3_2_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2_2.setBounds(386, 415, 118, 41);
		panel_2.add(btnNewButton_3_2_2);
		
		JButton btnNewButton_3_1 = new JButton("Previous");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_3_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_1.setBounds(207, 415, 116, 40);
		panel_2.add(btnNewButton_3_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Futuristic", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(technology.class.getResource("/Images/Technology/imgonline-com-ua-resize-WSEjBvftmazzS.jpg")));
		lblNewLabel_3.setBounds(10, 10, 711, 395);
		panel_3.add(lblNewLabel_3);
		
		JButton btnNewButton_3_2_3 = new JButton("Next");
		btnNewButton_3_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnNewButton_3_2_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2_3.setBounds(396, 415, 118, 41);
		panel_3.add(btnNewButton_3_2_3);
		
		JButton btnNewButton_3_3 = new JButton("Previous");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_3_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_3.setBounds(217, 415, 116, 40);
		panel_3.add(btnNewButton_3_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Server Room", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(technology.class.getResource("/Images/Technology/imgonline-com-ua-resize-ysILRdIMlx1pCbev.jpg")));
		lblNewLabel_4.setBounds(10, 10, 711, 395);
		panel_4.add(lblNewLabel_4);
		
		JButton btnNewButton_3_4 = new JButton("Previous");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_3_4.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_4.setBounds(290, 415, 116, 40);
		panel_4.add(btnNewButton_3_4);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Categories c = new Categories();
				setVisible(false);
			}
		});
		btnNewButton.setBounds(5, 10, 85, 21);
		contentPane.add(btnNewButton);
		setVisible(true);
	}

}
