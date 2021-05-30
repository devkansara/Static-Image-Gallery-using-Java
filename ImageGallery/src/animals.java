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

public class animals extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					animals frame = new animals();
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
	public animals() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 41, 736, 498);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Animal1", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(animals.class.getResource("/Images/Animals/imgonline-com-ua-resize-8n6Bp6rtxHlsY.jpg")));
		lblNewLabel.setBounds(10, 10, 711, 395);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_3_2 = new JButton("Next");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_3_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2.setBounds(295, 415, 118, 41);
		panel.add(btnNewButton_3_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Animal2", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(animals.class.getResource("/Images/Animals/imgonline-com-ua-resize-N1kABZzAbmIUZP.jpg")));
		lblNewLabel_1.setBounds(10, 10, 711, 395);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_3_2_1 = new JButton("Next");
		btnNewButton_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_3_2_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2_1.setBounds(399, 415, 118, 41);
		panel_1.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_3 = new JButton("Previous");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3.setBounds(226, 415, 116, 40);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Animal3", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(animals.class.getResource("/Images/Animals/imgonline-com-ua-resize-OOxGmbCfKzU.jpg")));
		lblNewLabel_2.setBounds(10, 10, 711, 395);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_3_2_2 = new JButton("Next");
		btnNewButton_3_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_3_2_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2_2.setBounds(415, 415, 118, 41);
		panel_2.add(btnNewButton_3_2_2);
		
		JButton btnNewButton_3_1 = new JButton("Previous");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_3_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_1.setBounds(235, 415, 116, 40);
		panel_2.add(btnNewButton_3_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Animal4", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(animals.class.getResource("/Images/Animals/imgonline-com-ua-resize-Qnh6tLG8XoLP9A.jpg")));
		lblNewLabel_3.setBounds(10, 10, 711, 395);
		panel_3.add(lblNewLabel_3);
		
		JButton btnNewButton_3_2_3 = new JButton("Next");
		btnNewButton_3_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnNewButton_3_2_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2_3.setBounds(413, 415, 118, 41);
		panel_3.add(btnNewButton_3_2_3);
		
		JButton btnNewButton_3_3 = new JButton("Previous");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_3_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_3.setBounds(226, 415, 116, 40);
		panel_3.add(btnNewButton_3_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Animal5", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(animals.class.getResource("/Images/Animals/imgonline-com-ua-resize-vdO7FlqHjCQG4G.jpg")));
		lblNewLabel_4.setBounds(10, 10, 711, 395);
		panel_4.add(lblNewLabel_4);
		
		JButton btnNewButton_3_4 = new JButton("Previous");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_3_4.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_4.setBounds(299, 415, 116, 40);
		panel_4.add(btnNewButton_3_4);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Categories c = new Categories();
				setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 10, 85, 21);
		contentPane.add(btnNewButton);
		setVisible(true);
	}

}
