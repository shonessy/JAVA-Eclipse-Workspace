import javax.swing.*;

public class SwingTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(300, 300);
		
		JButton btn=new JButton("Click Me");
		btn.setSize(50, 50);
		frame.getContentPane().add(btn);
	}

}
