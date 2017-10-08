import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo implements ItemListener{
	private JCheckBox cbAlpha,
					  cbBeta,
					  cbGama;
	private JLabel label1, 
				   label2;
	
	//Constructor
	public Demo(){
		JFrame frame= new JFrame("Aplikacija CheckBox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setVisible(true);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel=new JPanel();
		panel.setSize(frame.getWidth(), frame.getHeight()/3);
		frame.add(panel);
		
		cbAlpha=new JCheckBox("Alpha");
		cbAlpha.addItemListener(this);
		panel.add(cbAlpha);
		
		cbBeta=new JCheckBox("Beta");
		cbBeta.addItemListener(this);
		panel.add(cbBeta);
		
		cbGama=new JCheckBox("Gama");
		cbGama.addItemListener(this);
		panel.add(cbGama);
		
		
		label1=new JLabel("Promena: ");
		label1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 16));
		frame.add(label1);
		
		label2=new JLabel("Cekirani: ");
		label2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 16));
		frame.add(label2);
	}
	
	//hendler metoda
	@Override
	public void itemStateChanged(ItemEvent ie){
		JCheckBox cbChanged=(JCheckBox) ie.getItem();
		String promena="Promena: " + cbChanged.getActionCommand();
		if(cbChanged.isSelected())
			label1.setText(promena + " cekiran");
		else
			label1.setText(promena + " odcekiran");
		
		String cekirani="Cekirani: ";
		if(cbAlpha.isSelected())
			cekirani+=cbAlpha.getActionCommand() + ", ";
		if(cbBeta.isSelected())
			cekirani+=cbBeta.getActionCommand() + ", ";
		if(cbGama.isSelected())
			cekirani+=cbGama.getActionCommand() + " ";
		label2.setText(cekirani);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Demo();
			}
		});
		
		
	}

}
