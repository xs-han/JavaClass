package com.paint.www;

import java.awt.*;

import javax.swing.*;

public class Paint08RectanglePanel extends JPanel{
	
	public void paintComponent(Graphics g){
		Graphics2D g2d=(Graphics2D)g;
		super.paintComponent(g2d);
		g2d.setColor(Color.green);
		g2d.fillRoundRect(0,0,this.getWidth(),this.getHeight(),100,100);
	}
	
}