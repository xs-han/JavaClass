package com.paint.www;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paint06SouthPanel extends JPanel{	
	
	static JButton [] btn=new JButton[3];
	String [] btnStr={"Èý½ÇÐÎ","¾ØÐÎ","ÍÖÔ²"};
	Paint11MyEvent pme=new Paint11MyEvent();
	FlowLayout fl=new FlowLayout(FlowLayout.CENTER,5,5);
	public Paint06SouthPanel(){
		this.setBackground(Color.blue);
		this.setLayout(fl);
		for(int i=0;i<btn.length;i++){
			btn[i]=new JButton(btnStr[i]);
			btn[i].addActionListener(pme);
			this.add(btn[i]);
		}
	}
	
}