import java.awt.*;
import java.util.Random;
import java.applet.*;
/*
 <applet code="Banner.class" width 200 height=200>
 <param name="author" value="Nemanja">
 <param name="work" value="Creating Banners">
 <param name="version" value=4>
 </applet>
 */

public class Banner extends Applet implements Runnable{
	Thread t;
	String msg="Java Rules the web  ";
	String mStop="";
	boolean stopFlag=false;
	int xInc;
	String author;
	String work;
	int version;
	
	@Override
	public void init(){
		t=null;
		xInc=0;
	}
	
	@Override
	public void start(){
		t=new Thread(this, "Moja Thread");
		stopFlag=false;
		
		author=getParameter("author");
		if(author==null)
			author="Not Found";
		work=getParameter("work");
		if(work==null)
			work="Not Found";
		String temp=getParameter("version");
		try{
			if(temp!=null)
				version=Integer.parseInt(temp);
			else
				version=0;
		}catch(NumberFormatException e){
			version=-1;
		}
		
		t.start();
	}
	
	@Override
	public void stop(){
		stopFlag=true;
		mStop+="Stopped";
		t=null;				//brisemo nit(GC)
							//sa svakim pozivom start() kreiramo novu nit
	}
	
	/*@Override
	public void destory(){
		
	}*/
	
	//@Override
	
	
	@Override
	public void run(){
		while(!stopFlag){
			try{
				repaint();
				t.sleep(250);
			}catch(InterruptedException e){}
		}
	}
	
	@Override
	public void paint(Graphics g){
		g.setColor(Color.BLUE);
		showStatus("Ime Appleta: " + getClass().getName());
		char c=msg.charAt(0);
		msg=msg.substring(1) + c;
		g.drawString(msg, 50, 50);
		g.drawString(t.getName()+"-"+(t.hashCode()), 50, 70);
		g.drawString(mStop, 50, 90);
		g.drawString(msg, 50+xInc, 110);
		if(xInc>150)
			xInc=0;
		else
			xInc+=5;
		g.drawLine(50, 120, 150, 120);
		
		g.setColor(Color.RED);
		g.drawString("Autor: " + author, 50, 160);
		g.drawString("Projekat: " + work, 50, 180);
		g.drawString("Verzija: " + version, 50, 200);
	}
}
