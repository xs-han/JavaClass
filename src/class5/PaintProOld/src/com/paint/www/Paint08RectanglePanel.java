package com.paint.www;

import java.awt.*;

import javax.swing.*;

public class Paint08RectanglePanel extends JPanel{
	
	public Paint08RectanglePanel(){
		
	}
	
//	public void paint(Graphics g){
//		g.setColor(Color.red);
//		g.fillRect(0, 0, this.getWidth(), this.getHeight());
//	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		super.paintComponent(g2d);
		g2d.setColor(Color.magenta);
		int [] x = {this.getWidth()/2, 0, this.getWidth()};
		int [] y = {0, this.getHeight(), this.getHeight()};
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
}