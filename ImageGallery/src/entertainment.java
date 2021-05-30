import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class entertainment extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					entertainment frame = new entertainment();
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
	public entertainment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(0, 41, 736, 498);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Silicon Valley", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(entertainment.class.getResource("/Images/Entertainment/imgonline-com-ua-resize-BCrHxCVtLj36.jpg")));
		lblNewLabel_1.setBounds(10, 0, 711, 395);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1_2 = new JButton("Next");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_1_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(294, 405, 116, 40);
		panel.add(btnNewButton_1_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Breaking Bad", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon(entertainment.class.getResource("/Images/Entertainment/imgonline-com-ua-resize-44KB78TjZEkgOV.jpg")));
		lblNewLabel_1_1.setBounds(10, 0, 711, 395);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Next");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1_2_1.setBounds(367, 405, 116, 40);
		panel_1.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_3 = new JButton("Previous");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3.setBounds(201, 405, 116, 40);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Dark", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setIcon(new ImageIcon(entertainment.class.getResource("/Images/Entertainment/imgonline-com-ua-resize-YuZY3RfbJKKDeu.jpg")));
		lblNewLabel_1_2.setBounds(10, 0, 711, 395);
		panel_2.add(lblNewLabel_1_2);
		
		JButton btnNewButton_1_2_2 = new JButton("Next");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_1_2_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1_2_2.setBounds(379, 405, 116, 40);
		panel_2.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_3_1 = new JButton("Previous");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_3_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_1.setBounds(213, 405, 116, 40);
		panel_2.add(btnNewButton_3_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Money Heist", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("New label");
		lblNewLabel_1_3.setIcon(new ImageIcon(entertainment.class.getResource("/Images/Entertainment/imgonline-com-ua-resize-nCwKRFoFa7PF.jpg")));
		lblNewLabel_1_3.setBounds(10, 0, 711, 395);
		panel_3.add(lblNewLabel_1_3);
		
		JButton btnNewButton_1_2_3 = new JButton("Next");
		btnNewButton_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnNewButton_1_2_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1_2_3.setBounds(386, 405, 116, 40);
		panel_3.add(btnNewButton_1_2_3);
		
		JButton btnNewButton_3_2 = new JButton("Previous");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_3_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2.setBounds(215, 405, 116, 40);
		panel_3.add(btnNewButton_3_2);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Friends", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_4 = new JLabel("New label");
		lblNewLabel_1_4.setIcon(new ImageIcon(entertainment.class.getResource("/Images/Entertainment/imgonline-com-ua-resize-wYwBBXJXVSw1M.jpg")));
		lblNewLabel_1_4.setBounds(10, 0, 711, 395);
		panel_4.add(lblNewLabel_1_4);
		
		JButton btnNewButton_1_2_4 = new JButton("Next");
		btnNewButton_1_2_4.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1_2_4.setBounds(388, 405, 116, 40);
		panel_4.add(btnNewButton_1_2_4);
		
		JButton btnNewButton_3_3 = new JButton("Previous");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_3_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_3.setBounds(214, 405, 116, 40);
		panel_4.add(btnNewButton_3_3);
		
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
