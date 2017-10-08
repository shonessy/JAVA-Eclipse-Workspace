
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Listeners implements MouseListener, MouseMotionListener{
	int numOfClicks=0;
	String mouseClickedMsg;
	String mousePressRelessMsg;
	String mouseEnterExitMsg;
	String message;
	int xPos, yPos;
	
	AppletNotThis ant;
	
	//Constructor
	public Listeners(AppletNotThis ant){
		this.ant=ant;
	}
	
	//mouseClicked
		public void mouseClicked(MouseEvent me){
			numOfClicks++;
			mouseClickedMsg="Kliknuto: " + numOfClicks;
			//message="Kliknuto: " + numOfClicks;
			ant.repaint();
		}
		
		//mousePressed
		public void mousePressed(MouseEvent me){
			//message="Stisnuo";
			mousePressRelessMsg="Stisnuo";
			ant.repaint();
		}
		
		
		//mouseReleased
		public void mouseReleased(MouseEvent me){
			//message="Pustio";
			mousePressRelessMsg="Pustio";
			ant.repaint();
		}
		
		//mouseEntered
		public void mouseEntered(MouseEvent me){
			//message="Usao u Aplet";
			mouseEnterExitMsg="Usao";
			ant.repaint();
		}
		
		//mouseExited
		public void mouseExited(MouseEvent me){
			//message="Izasao iz Apleta";
			mouseEnterExitMsg="Izasao";
			ant.repaint();
		}
		
		//mouseDragged
		public void mouseDragged(MouseEvent me){
			
		}
		
		//mouseMoved
		public void mouseMoved(MouseEvent me){
			xPos=me.getX();
			yPos=me.getY();
			ant.repaint();
		}
		

}
