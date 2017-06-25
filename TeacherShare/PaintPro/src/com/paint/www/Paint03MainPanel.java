package com.paint.www;

import java.awt.*;
import javax.swing.*;

public class Paint03MainPanel extends JPanel{
	
	BorderLayout bl=new BorderLayout(5,5);
	JPanel [] pnl={new Paint04NorthPanel(),
							new Paint05CenterPanel(),
							new Paint06SouthPanel()};
	String [] str={"North","Center","South"};
	
	public Paint03MainPanel(){
		this.setBackground(Color.pink);
		this.setLayout(bl);
		for(int i=0;i<pnl.length;i++){
			this.add(str[i],pnl[i]);
		}
	}
	
}