import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovingBall implements Runnable{
	static MovingBall mb;
	JFrame frame;
	Thread t;
	JButton btnStart,
			btnStop,
			btnSpeedUp,
			btnSpeedDown;
	int xPos,
		yPos;
	boolean running;
	int ballSpeed;
	
	public static void main(String[] args) {
		mb=new MovingBall();
		mb.init();
	}
	
	
	public void init(){
		running=false;
		ballSpeed=100;
		frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		
		MyPanel panel=new MyPanel();
		frame.getContentPane().add(panel);
		
		btnStart=new JButton("Start");
		frame.getContentPane().add(btnStart, BorderLayout.WEST);
		btnStart.addActionListener(new ButtonStartListener());
		
		btnStop=new JButton("Stop");
		frame.getContentPane().add(btnStop, BorderLayout.EAST);
		btnStop.addActionListener(new ButtonStopListener());
		
		btnSpeedUp=new JButton("Speed Up");
		frame.getContentPane().add(btnSpeedUp, BorderLayout.NORTH);
		btnSpeedUp.addActionListener(new ButtonSpeedUpListener());
		
		btnSpeedDown=new JButton("Speed Down");
		frame.getContentPane().add(btnSpeedDown, BorderLayout.SOUTH);
		btnSpeedDown.addActionListener(new ButtonSpeedDownListener());

	}
	
	//run
	public void run(){
		while(running){
			xPos=(int)(Math.random()*500);
			yPos=(int)(Math.random()*300);
			frame.repaint();
			try{
				Thread.sleep(ballSpeed);
			}catch(InterruptedException e){}
		}
	}
	
	//innerClass
	class MyPanel extends JPanel{
		
		@Override
		public void paintComponent(Graphics g){
			g.fillOval(xPos, yPos, 20, 20);
			g.drawString(Thread.currentThread().getName(), 250, 150);
		}
	}
	
	//inner class
	class ButtonStartListener implements ActionListener{
		
		public void actionPerformed(ActionEvent ae){
			if(!running){
				running=true;
				t=new Thread(mb);
				t.start();
			}
		}
	}
	
	//inner class
	class ButtonStopListener implements ActionListener{
		
		public void actionPerformed(ActionEvent ae){
			if(running){
				running=false;
				t=null;
			}
		}
	}
		
	//inner class
	class ButtonSpeedUpListener implements ActionListener{
		
		public void actionPerformed(ActionEvent ae){
			ballSpeed-=50;
		}
	}
	
	//inner class
	class ButtonSpeedDownListener implements ActionListener{
		
		public void actionPerformed(ActionEvent ae){
			ballSpeed+=50;
		}
	}
		
	
	
}
