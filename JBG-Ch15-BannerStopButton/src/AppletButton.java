import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class AppletButton extends Applet implements ActionListener,
													Runnable{
	String msg="Java rules the world";
	int numOk,
		numCancel;
	int yPos;
	int moveCircleX,
		moveCircleY;
	Button button1,
		   button2,
		   button3,
		   button4,
		   btnUp,
		   btnDown,
		   btnLeft,
		   btnRight;
	Thread thrd;
	boolean stopFlag;
	
	
	//init
	@Override
	public void init(){
		numOk=0;
		numCancel=0;
		yPos=0;
		moveCircleX=0;
		moveCircleY=0;
		stopFlag=true;
		
		button1=new Button("Ok");
		button2=new Button("Cancel");
		button3=new Button("Start");
		button4=new Button("Stop");
		btnUp = new Button("Up");
		btnDown=new Button("Down");
		btnLeft=new Button("Left");
		btnRight=new Button("Right");
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(btnUp);
		add(btnDown);
		add(btnLeft);
		add(btnRight);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		btnUp.addActionListener(this);
		btnDown.addActionListener(this);
		btnLeft.addActionListener(this);
		btnRight.addActionListener(this);
		
		thrd=null;
	}
	
	//start
	@Override
	public void start(){
		//stopFlag=false;
		thrd=new Thread(this);
		thrd.start();
	}
	
	//stop
	@Override
	public void stop(){
		stopFlag=true;
		thrd=null;
	}
	
	//actionPerformed
	public void actionPerformed(ActionEvent ae){
		//if(ae.getActionCommand().equals("Ok")){
		if(ae.getSource()==button1){
			numOk++;
		}else if(ae.getActionCommand().equals("Cancel")){
			numCancel++;
		}else if(ae.getActionCommand().equals("Start")){
			stopFlag=false;
			start();
		}else if(ae.getActionCommand().equals("Stop")){
			stopFlag=true;
		}else if(ae.getActionCommand().equals("Up")){
			moveCircleY-=10;
		}else if(ae.getActionCommand().equals("Down")){
			moveCircleY+=10;
		}else if(ae.getActionCommand().equals("Left")){
			moveCircleX-=10;
		}else if(ae.getActionCommand().equals("Right")){
			moveCircleX+=10;
		}
		repaint();
	}
	
	//run
	@Override
	public void run(){
		while(!stopFlag){
			try{
				thrd.sleep(100);
				yPos = (yPos<150) ? yPos+5 : 0;
				repaint();
			}catch(InterruptedException e){}
		}
	}
	
	//paint
	@Override
	public void paint(Graphics g){
		g.setFont(new Font("Monospace", Font.BOLD, 16));
		Dimension dim=this.getSize();
		button1.setLocation(dim.width/2, 5);
		Point ok=new Point(button1.getLocation().x,
						   button1.getLocation().y);
		
		button2.setLocation(ok.x+60, ok.y);
		button3.setLocation(ok.x, ok.y+30);
		button4.setLocation(ok.x+60, ok.y+30);
		
		btnUp.setLocation(ok.x+180, ok.y);
		btnLeft.setLocation(ok.x+150, ok.y+20);
		btnDown.setLocation(ok.x+180, ok.y+40);
		btnRight.setLocation(ok.x+210, ok.y+20);
		
		g.drawString("OK: " + numOk, 20, 20);
		g.drawString("Cancel: " + numCancel, 20, 40);
		g.drawString(thrd.getName(), 20, 60);
		g.drawString(msg, 20, 100+yPos);
		
		int circleX=dim.width/2;
		int circleY=dim.height/2;
		g.setColor(Color.MAGENTA);
		g.fillOval(circleX+20+moveCircleX, circleY+20+moveCircleY, 40, 40);
	}
	
	
	
	
	
	
	
	
	
}
