package com.paint.www;

import java.awt.*;

import javax.swing.*;

public class Paint04NorthPanel extends JPanel{

	JLabel lblTitle=new JLabel("ͼ��ѡ�����",JLabel.CENTER);
	
	public Paint04NorthPanel(){
		this.setBackground(Color.green);
		this.add(lblTitle);
	}
	/*Font f=new Font("����",Font.BOLD,12);
	
	public void paint(Graphics g){
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("ͼ��ѡ�����",200,10);
	}
	*/
	
}