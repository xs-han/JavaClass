package c408;

import java.awt.*;
import javax.swing.*;

import java.applet.*;

public class FirstPaint extends Applet implements Runnable{
	
	Thread t;
	int x;
	public FirstPaint(){
		this.setBackground(Color.pink);
		if(t==null){
			t=new Thread(this);
			t.start();
		}
	}
	
	public void run(){
		while(true){
			x+=1;
			try{
				Thread.sleep(100);
			}catch(InterruptedException iex){
				JOptionPane.showMessageDialog(null, iex.getMessage());
			}
			if(x>9){
				x-=1;
			}
			repaint();			
		}
	}

	public void paint(Graphics g){
		g.setColor(Color.yellow);
		g.fillOval(100, 100, 200, 200);		
		g.setColor(Color.black);
		g.drawLine(150,170,180,170);
		g.drawLine(220,170,250,170);		
		g.drawOval(150,180,30,15);
		g.drawOval(220,180,30,15);		
		g.fillOval(160+x,180,15+x,15+x);
		g.fillOval(230+x,180,15+x,15+x);		
		g.drawLine(195,190,185,230);
		g.drawArc(185,220,20,20,0,180);		
		g.drawArc(165,230,60,40,0,-180);
	}
	
}