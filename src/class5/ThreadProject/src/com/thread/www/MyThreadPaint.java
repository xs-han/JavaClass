package com.thread.www;

import java.applet.Applet;
import java.awt.*;
import java.lang.*;
import java.util.*;

import javax.swing.*;

class PaintPanel extends JPanel implements Runnable{
	Random r = new Random();
	Thread t;
	int x = 0, y = 0;
	
	public PaintPanel(){
		this.setBackground(Color.pink);
		if(t == null){
			t = new Thread(this);
			t.start();
		}
		else{
			
		}
	}
	
	public void paint(Graphics g){
		g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		g.fillOval(0, 0, this.getWidth(), this.getHeight());
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

public class MyThreadPaint extends Applet{

	/**
	 * @param args
	 */
	final int M = 3;
	PaintPanel [] pp = new PaintPanel[M*M];

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void init(){
		this.setBackground(Color.pink);
		this.setLayout(new GridLayout(M,M,5,5));
		for(int i = 0; i < pp.length; i++){
			pp[i] = new PaintPanel();
			this.add(pp[i]);
		}
	}

}
