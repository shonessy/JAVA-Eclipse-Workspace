import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;


public class FirstGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstGUI window = new FirstGUI();
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
	public FirstGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 672, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel Label1 = new JLabel("");
		Label1.setBounds(318, 41, 257, 15);
		frame.getContentPane().add(Label1);
		
		JButton Button1 = new JButton("Stisni me");
		Button1.addActionListener(new ActionListener() {
			int i=0;
			public void actionPerformed(ActionEvent arg0) {
				i++;
				if(i%2!=0)
					Label1.setText("Uhhhhh.... Al' si me stisnuo");
				else
					Label1.setText("");
				
				
			}
		});
		Button1.setBounds(67, 36, 117, 25);
		frame.getContentPane().add(Button1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(333, 56, 1, 15);
		textArea.append("Stisnuo si me");
		frame.getContentPane().add(textArea);
		
		
	}
}
