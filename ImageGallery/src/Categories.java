import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Categories extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Categories frame = new Categories();
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
	public Categories() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Technology");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				technology a = new technology();
			}
		});
		btnNewButton.setBounds(156, 24, 108, 32);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Animals");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				animals b = new animals();
			}
		});
		btnNewButton_1.setBounds(26, 82, 108, 32);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Culture");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				culture c = new culture();
			}
		});
		btnNewButton_2.setBounds(26, 140, 108, 32);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Dance");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dance d = new dance();
			}
		});
		btnNewButton_3.setBounds(156, 198, 108, 32);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Entertainment");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entertainment f = new entertainment();
			}
		});
		btnNewButton_4.setBounds(290, 24, 114, 32);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Landscape");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				landscape g = new landscape();
			}
		});
		btnNewButton_5.setBounds(156, 82, 108, 32);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Memes");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memes h = new memes();
			}
		});
		btnNewButton_6.setBounds(290, 82, 114, 32);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Nature");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nature i = new nature();
			}
		});
		btnNewButton_7.setBounds(156, 140, 108, 32);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Urban");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				urban j = new urban();
			}
		});
		btnNewButton_8.setBounds(290, 140, 114, 32);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Sports");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sports k = new sports();
			}
		});
		btnNewButton_9.setBounds(26, 24, 108, 32);
		panel.add(btnNewButton_9);
		setVisible(true);
	}

}
