package com.paint.www;

import java.awt.*;

import javax.swing.*;

public class Paint07TrianglePanel extends JPanel{
	
	public void paintComponent(Graphics g){
		Graphics2D g2d=(Graphics2D)g;
		super.paintComponent(g2d);
		g2d.setColor(Color.magenta);
		int [] x={getWidth()/2,0,getWidth()};
		int [] y={0,getHeight(),getHeight()};
		g2d.fillPolygon(new Polygon(x,y,x.length));
	}
	
}