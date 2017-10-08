import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnnoDemo {

	private JLabel label;
	private int n;
	
	//constructor
	public AnnoDemo(){
		n=0;
		
		//frame
		JFrame frame=new JFrame("Annonimus Inner Class for Handler");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setVisible(true);
		
		//button
		JButton btn=new JButton("Click");
		btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				label.setText("Kliknuto: " + (++n));
			}
		});
		frame.add(btn);
		
		//check box
		JCheckBox cb = new JCheckBox("Alpha");
		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox cbo=(JCheckBox) e.getItem();
				if(cbo.isSelected())
					label.setText(cbo.getActionCommand() + ": checked");
				else
					label.setText(cbo.getActionCommand() + ": unchecked");
			}
		});
		frame.add(cb);
		
		//label
		label=new JLabel("Kliknuto: " + n);
		frame.add(label);
		
	}
	
	
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new AnnoDemo();
				
			}
		});	
	}

}
