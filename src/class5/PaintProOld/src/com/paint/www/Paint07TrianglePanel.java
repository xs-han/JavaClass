package com.paint.www;

import java.awt.*;

import javax.swing.*;

public class Paint07TrianglePanel extends JPanel{
	
	public Paint07TrianglePanel(){
		
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
		g2d.setColor(Color.magenta);
		int [] x = {this.getWidth()/2, 0, this.getWidth()};
		int [] y = {0, this.getHeight(), this.getHeight()};
		g2d.fillPolygon(x, y, 3);
	}
}