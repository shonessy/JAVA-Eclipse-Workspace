import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.applet.*;
/*
 * <applet code="TimeApplet" width=700 height=500>
 * </applet>
 */
public class TimeApplet extends Applet implements Runnable{
	Calendar cal;
	Thread t;
	
	//init
	@Override
	public void init(){
		t=null;
	}
	
	//start
	@Override
	public void start(){
		t=new Thread(this);
		t.start();
	}
	
	//run
	@Override
	public void run(){
		while(true){
			try{
				cal=Calendar.getInstance();
				repaint();
				Thread.sleep(1_500);
			}catch(InterruptedException e){}
		}
	}
	
	@Override
	public void paint(Graphics g){
		g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
		g.drawString(Integer.toString(cal.get(Calendar.YEAR)), 20, 20);
		g.drawString(Integer.toString(cal.get(Calendar.HOUR_OF_DAY)), 20, 40);
		
		SimpleDateFormat sdf=new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss");
		Date date=cal.getTime();
		String s=sdf.format(date);	//metoda iz DateFormat koju nasledjuje SimpleDateFormat
									// koristimo SimpleDateFormat jer nudi bolje formatiranje datuma 
		g.drawString(s, 20, 60);
	}

}
