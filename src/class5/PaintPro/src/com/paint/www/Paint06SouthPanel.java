package com.paint.www;

import java.awt.*;

import javax.swing.*;

public class Paint06SouthPanel extends JPanel{
	
	static JButton [] btn = new JButton[3];
	String [] btstr = {"三角形", "矩形", "椭圆"};
	Paint11MyEvent pme = new Paint11MyEvent();
	
	public Paint06SouthPanel(){
		this.setBackground(Color.blue);
		for(int i = 0; i < btn.length; i++){
			btn[i] = new JButton(btstr[i]);
			btn[i].addActionListener(pme);
			this.add(btn[i]);
			
		}
	}
	
}