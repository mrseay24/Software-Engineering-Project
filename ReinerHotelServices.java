import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ReinerHotelServices {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReinerHotelServices window = new ReinerHotelServices();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReinerHotelServices() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reiner Hotel Services");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(77, 11, 281, 103);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Request Service");
		btnNewButton.setBounds(32, 142, 161, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Submit Complaint");
		btnNewButton_1.setBounds(237, 142, 168, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Check Out");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LogoutScreen nw = new LogoutScreen();
				nw.NewScreen();
			}
		});
		btnNewButton_2.setBounds(163, 213, 107, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
