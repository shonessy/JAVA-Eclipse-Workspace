import java.awt.*;
import java.applet.*;
/*
  <applet code="MyApplet" width=100 height=100>
  </applet> 
 */
public class MyApplet extends Applet {
	
	@Override
	public void init(){
		setSize(200, 200);
	}
	
	@Override
	public void start(){
		
	}
	
	@Override
	public void stop(){
		
	}
	
	@Override
	public void destroy(){
		
	}
	
	@Override
	public void paint(Graphics g){
		g.drawString("Moj prvi aplet", 20, 20);
		g.drawLine(20, 20, 100, 100);
	}
}
