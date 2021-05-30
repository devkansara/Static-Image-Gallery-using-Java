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

public class memes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memes frame = new memes();
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
	public memes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 41, 716, 485);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Meme1", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(memes.class.getResource("/Images/Memes/imgonline-com-ua-resize-hNRBWIEpINVgAWf.jpg")));
		lblNewLabel.setBounds(0, 0, 711, 395);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_3_2 = new JButton("Next");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_3_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2.setBounds(284, 405, 118, 41);
		panel.add(btnNewButton_3_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Meme2", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(memes.class.getResource("/Images/Memes/imgonline-com-ua-resize-0bemauTFq5HS0BEA.jpg")));
		lblNewLabel_1.setBounds(0, 0, 711, 395);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_3_2_1 = new JButton("Next");
		btnNewButton_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_3_2_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2_1.setBounds(366, 405, 118, 41);
		panel_1.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_3 = new JButton("Previous");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3.setBounds(192, 405, 116, 40);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Meme3", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(memes.class.getResource("/Images/Memes/imgonline-com-ua-resize-6Ffsv0YJl4j2CoA.jpg")));
		lblNewLabel_2.setBounds(0, 0, 711, 395);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_3_2_2 = new JButton("Next");
		btnNewButton_3_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_3_2_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2_2.setBounds(378, 405, 118, 41);
		panel_2.add(btnNewButton_3_2_2);
		
		JButton btnNewButton_3_1 = new JButton("Previous");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_3_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_1.setBounds(188, 405, 116, 40);
		panel_2.add(btnNewButton_3_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Meme4", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(memes.class.getResource("/Images/Memes/imgonline-com-ua-resize-7R4PrV5JlE.jpg")));
		lblNewLabel_3.setBounds(0, 0, 711, 395);
		panel_3.add(lblNewLabel_3);
		
		JButton btnNewButton_3_2_3 = new JButton("Next");
		btnNewButton_3_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnNewButton_3_2_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_2_3.setBounds(375, 405, 118, 41);
		panel_3.add(btnNewButton_3_2_3);
		
		JButton btnNewButton_3_3 = new JButton("Previous");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_3_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_3.setBounds(186, 405, 116, 40);
		panel_3.add(btnNewButton_3_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Meme5", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(memes.class.getResource("/Images/Memes/imgonline-com-ua-resize-Ov7dchGpzWFc.jpg")));
		lblNewLabel_4.setBounds(0, 0, 711, 395);
		panel_4.add(lblNewLabel_4);
		
		JButton btnNewButton_3_4 = new JButton("Previous");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_3_4.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_4.setBounds(299, 405, 116, 40);
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
