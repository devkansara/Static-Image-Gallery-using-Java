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

public class urban extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					urban frame = new urban();
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
	public urban() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 36, 726, 494);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Urban1", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(urban.class.getResource("/Images/Urban/imgonline-com-ua-resize-2c8CeHH9dDuO.jpg")));
		lblNewLabel.setBounds(10, 10, 711, 395);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_3_2 = new JButton("Next");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_3_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2.setBounds(290, 415, 118, 41);
		panel.add(btnNewButton_3_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Urban2", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(urban.class.getResource("/Images/Urban/imgonline-com-ua-resize-QD6kkhPvCv.jpg")));
		lblNewLabel_1.setBounds(10, 10, 711, 395);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_3_2_1 = new JButton("Next");
		btnNewButton_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_3_2_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2_1.setBounds(387, 415, 118, 41);
		panel_1.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_3 = new JButton("Previous");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3.setBounds(214, 415, 116, 40);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Urban3", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(urban.class.getResource("/Images/Urban/imgonline-com-ua-resize-TwIwmNxUbTNy4 (1).jpg")));
		lblNewLabel_2.setBounds(10, 10, 711, 395);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_3_2_2 = new JButton("Next");
		btnNewButton_3_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_3_2_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2_2.setBounds(393, 415, 118, 41);
		panel_2.add(btnNewButton_3_2_2);
		
		JButton btnNewButton_3_1 = new JButton("Previous");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_3_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_1.setBounds(218, 415, 116, 40);
		panel_2.add(btnNewButton_3_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Urban4", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(urban.class.getResource("/Images/Urban/imgonline-com-ua-resize-guJTStE0IB.jpg")));
		lblNewLabel_3.setBounds(10, 10, 711, 395);
		panel_3.add(lblNewLabel_3);
		
		JButton btnNewButton_3_2_3 = new JButton("Next");
		btnNewButton_3_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnNewButton_3_2_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2_3.setBounds(390, 415, 118, 41);
		panel_3.add(btnNewButton_3_2_3);
		
		JButton btnNewButton_3_3 = new JButton("Previous");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_3_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_3.setBounds(216, 415, 116, 40);
		panel_3.add(btnNewButton_3_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Urban5", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(urban.class.getResource("/Images/Urban/imgonline-com-ua-resize-zJrmQUMFZtMgO.jpg")));
		lblNewLabel_4.setBounds(10, 10, 711, 395);
		panel_4.add(lblNewLabel_4);
		
		JButton btnNewButton_3_4 = new JButton("Previous");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_3_4.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_4.setBounds(304, 415, 116, 40);
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
