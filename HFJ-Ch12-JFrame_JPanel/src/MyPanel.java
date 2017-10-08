import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class MyPanel extends JPanel{
	
	//paint
	@Override
	public void paintComponent(Graphics g){
		int red =(int)(Math.random()*255);
		int green=(int)(Math.random()*255);
		int blue=(int)(Math.random()*255);
		Color color=new Color(red, green, blue);
		g.setColor(color);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.RED);
		int r=50;
		g.fillOval(getHeight()/2-r/2, getWidth()/2-r/2, r, r);
	}
}
