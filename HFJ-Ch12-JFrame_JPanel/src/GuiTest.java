import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuiTest implements ActionListener{
	JFrame frame;
	MyPanel panel;
	JButton btnS,
			btnW,
			btnE,
			btnN;
	int iS,
		iN,
		iE,
		iW;
	
	public static void main(String args[]){
		GuiTest gt=new GuiTest();
		gt.init();
	}
	
	public void init(){
		iN=0;
		iS=0;
		iE=0;
		iW=0;
		frame=new JFrame();
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new MyPanel();
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		
		btnS=new JButton("Klikni me");
		frame.getContentPane().add(BorderLayout.SOUTH,btnS);
		btnS.addActionListener(this);		//njegov listener je this 
											//i actionPerformed je u this-u
		
		btnN=new JButton("Gore");
		frame.getContentPane().add(btnN, BorderLayout.NORTH);
		btnN.addActionListener(new ButtonNortListener());
											//njegov listener je u inner class
											//i actionPerformer je u inner class
		
		btnW=new JButton("Levo");
		frame.getContentPane().add(btnW, BorderLayout.WEST);
		btnW.addActionListener(new ButtonWestListener());
		
		btnE=new JButton("Desno");
		frame.getContentPane().add(btnE, BorderLayout.EAST);
		btnE.addActionListener(new ButtonEastListener());

	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==btnS)
			frame.repaint();
		btnS.setText("Repaint: " + (++iS));
	}
	
	//inner class
	class ButtonNortListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent ae){
			btnN.setText("N: " + (++iN));
		}
	}
	
	//innerClass
	class ButtonEastListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent ae){
			btnE.setText("E: " + (++iE));
		}
	}
	
	//innerClass
	class ButtonWestListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent ae){
			btnW.setText("W: " + (++iW));
		}
	}
	
	
}
