package com.paint.www;

import java.awt.*;

import javax.swing.*;

public class Paint04NorthPanel extends JPanel{
	JLabel jl = new JLabel("图形选择程序");
	FlowLayout fl = new FlowLayout(FlowLayout.CENTER,5,5);
	public Paint04NorthPanel(){
		this.setBackground(Color.green);
		this.setLayout(fl);
		this.add(jl);
	}
	
//	Font f = new Font("宋体", Font.BOLD, 14);
//	public void paint(Graphics g){
//		g.setFont(f);
//		g.setColor(Color.red);
//		g.drawString("图形选择程序", 200, 5);
//	}
	
}