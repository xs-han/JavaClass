package com.paint.www;

import java.awt.*;
import javax.swing.*;

public class Paint05CenterPanel extends JPanel{
	
	GridLayout gl=new GridLayout(3,3,5,5);
	static JPanel [] pl=new JPanel[9];
	
	public Paint05CenterPanel(){
		this.setBackground(Color.yellow);
		this.setLayout(gl);
		
		for(int i=0;i<pl.length;i++){
			pl[i]=new JPanel(new BorderLayout(5,5));
			//pl[i].setBackground(Color.cyan);					
			this.add(pl[i]);
		}
	}	
}