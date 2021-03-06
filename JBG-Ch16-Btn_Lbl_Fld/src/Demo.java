import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo implements ActionListener, FocusListener{
	private JButton btnRev;
	private JTextField txtFld;
	private JLabel label;
	
	
	//constructor
	public Demo() {
		JFrame frame=new JFrame("Aplikacija LBF");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 200);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setVisible(true);
		//frame.setFont(new Font(Font.MONOSPACED, Font.BOLD, 16));
		
		txtFld=new JTextField(20);
		txtFld.addActionListener(this);
		txtFld.addFocusListener(this);
		txtFld.setActionCommand("txtFld");
		frame.add(txtFld);
		txtFld.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
		
		btnRev=new JButton("Reverse");
		btnRev.addActionListener(this);
		frame.add(btnRev);
		
		label=new JLabel("Pritiskom ne Reverse"
							  + " tekst se okrece");
		frame.add(label);
		label.setFont(new Font(Font.MONOSPACED, Font.BOLD, 16));
			
	}
	
	//event handler
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==btnRev)
			label.setText("Okrenuto: " + reverse(txtFld.getText()) );
		else
			label.setText("Uneli ste: " + txtFld.getText());
	}
	
	//reverse string
	private String reverse(String s){
		String ret="";
		for(int i=s.length()-1; i>=0; i--)
			ret+=s.charAt(i);
		return ret;
	}
	
	//implementicn focus listener methods
	public void focusGained(FocusEvent fe){
		txtFld.setText("");
	}
	
	public void focusLost(FocusEvent fe){}	//placeholder
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Demo();			
			}
		});
		
		
	}

}
