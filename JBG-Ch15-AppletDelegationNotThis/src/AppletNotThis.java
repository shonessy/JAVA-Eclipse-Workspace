import java.awt.*;
import java.applet.*;

public class AppletNotThis extends Applet {
	Listeners l=new Listeners(this);
	
	@Override
	public void init(){
		addMouseListener(l);
		addMouseMotionListener(l);
	}
	
	//paint
	@Override
	public void paint(Graphics g){
		g.setFont(new Font( "SansSerif", Font.PLAIN, 16 ));
		
		g.drawString(l.mouseClickedMsg, 20, 20);
		if(l.mouseEnterExitMsg.contains("Usao"))
			g.setColor(Color.GREEN);
		else
			g.setColor(Color.RED);
		g.drawString(l.mouseEnterExitMsg, 20, 40);
		g.setColor(Color.BLUE);
		g.drawString(l.mousePressRelessMsg, 20, 60);
		g.drawString("Kreatanje: " + l.xPos + " , " + l.yPos, 20, 80);
		g.setColor(Color.MAGENTA);
		g.fillOval(l.xPos-3, l.yPos-3, 10, 10);
		
	}
}
