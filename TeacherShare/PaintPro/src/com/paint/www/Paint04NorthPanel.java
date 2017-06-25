package com.paint.www;

import java.awt.*;

import javax.swing.*;

public class Paint04NorthPanel extends JPanel{

	JLabel lblTitle=new JLabel("图形选择程序",JLabel.CENTER);
	
	public Paint04NorthPanel(){
		this.setBackground(Color.green);
		this.add(lblTitle);
	}
	/*Font f=new Font("宋体",Font.BOLD,12);
	
	public void paint(Graphics g){
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("图形选择程序",200,10);
	}
	*/
	
}