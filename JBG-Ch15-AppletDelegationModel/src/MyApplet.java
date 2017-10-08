import java.awt.*;
import java.applet.*;
import java.awt.event.MouseListener;
import java.awt.event.*;

public class MyApplet extends Applet implements MouseListener,
												MouseMotionListener{
	int numOfClicks=0;
	String mouseClickedMsg;
	String mousePressRelessMsg;
	String mouseEnterExitMsg;
	String message;
	int xPos, yPos;
	
	@Override
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	//mouseClicked
	public void mouseClicked(MouseEvent me){
		numOfClicks++;
		mouseClickedMsg="Kliknuto: " + numOfClicks;
		//message="Kliknuto: " + numOfClicks;
		repaint();
	}
	
	//mousePressed
	public void mousePressed(MouseEvent me){
		//message="Stisnuo";
		mousePressRelessMsg="Stisnuo";
		repaint();
	}
	
	
	//mouseReleased
	public void mouseReleased(MouseEvent me){
		//message="Pustio";
		mousePressRelessMsg="Pustio";
		repaint();
	}
	
	//mouseEntered
	public void mouseEntered(MouseEvent me){
		//message="Usao u Aplet";
		mouseEnterExitMsg="Usao";
		repaint();
	}
	
	//mouseExited
	public void mouseExited(MouseEvent me){
		//message="Izasao iz Apleta";
		mouseEnterExitMsg="Izasao";
		repaint();
	}
	
	//mouseDragged
	public void mouseDragged(MouseEvent me){
		
	}
	
	//mouseMoved
	public void mouseMoved(MouseEvent me){
		xPos=me.getX();
		yPos=me.getY();
		repaint();
	}
	
	//paint
	@Override
	public void paint(Graphics g){
		g.setFont(new Font( "SansSerif", Font.PLAIN, 16 ));
		
		g.drawString(mouseClickedMsg, 20, 20);
		if(mouseEnterExitMsg.contains("Usao"))
			g.setColor(Color.GREEN);
		else
			g.setColor(Color.RED);
		g.drawString(mouseEnterExitMsg, 20, 40);
		g.setColor(Color.BLUE);
		g.drawString(mousePressRelessMsg, 20, 60);
		g.drawString("Kreatanje: " + xPos + " , " + yPos, 20, 80);
		g.setColor(Color.ORANGE);
		g.fillOval(xPos-3, yPos-3, xPos+3, yPos+3);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
