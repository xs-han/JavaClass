package com.paint.www;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

import java.lang.*;

public class Paint08RectanglePanel extends JPanel implements Runnable{
	Random r = new Random();
	Thread t;
	public Paint08RectanglePanel(){
		if(t == null){
			t = new Thread(this);
			t.start();
		}
		else{
			
		}
	}
	
//	public void paint(Graphics g){
//		g.setColor(Color.red);
//		g.fillRect(0, 0, this.getWidth(), this.getHeight());
//	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		super.paintComponent(g2d);
		g2d.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
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