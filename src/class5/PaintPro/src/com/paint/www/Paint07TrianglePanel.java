package com.paint.www;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class Paint07TrianglePanel extends JPanel implements Runnable{
	Random r = new Random();
	Thread t;
	public Paint07TrianglePanel(){
		if(t == null){
			t = new Thread(this);
			t.start();
		}
		else{
			
		}
	}
	
//	public void paint(Graphics g) {
//		g.setColor(Color.red);
//		int [] x = {this.getWidth()/2, 0, this.getWidth()};
//		int [] y = {0, this.getHeight(), this.getHeight()};
//		g.fillPolygon(x, y, 3);
//	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		super.paintComponent(g2d);
		g2d.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		int [] x = {this.getWidth()/2, 0, this.getWidth()};
		int [] y = {0, this.getHeight(), this.getHeight()};
		g2d.fillPolygon(x, y, 3);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
//			x+= 5;
//			y+= 5;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException iex){
				JOptionPane.showMessageDialog(null, iex.getMessage());
			}
			repaint();
		}
	}
}