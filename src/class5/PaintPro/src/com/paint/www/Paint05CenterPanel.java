package com.paint.www;

import java.awt.*;

import javax.swing.*;

public class Paint05CenterPanel extends JPanel{
	
	GridLayout gl = new GridLayout(3,3,5,5);
	static JPanel [] pnl = new JPanel[9];
//	Paint09OvalPanel [] op = new Paint09OvalPanel[9];
//	Paint08RectanglePanel [] rp = new Paint08RectanglePanel[9];
//	Paint07TrianglePanel [] tp = new Paint07TrianglePanel[9];
	
	public Paint05CenterPanel(){
		this.setBackground(Color.yellow);
		this.setLayout(gl);
		for(int i = 0; i < pnl.length; i++){
			pnl[i] = new JPanel(new BorderLayout(5,5));
			pnl[i].setBackground(Color.cyan);
//			if(i < 3){
//				op[i] = new Paint09OvalPanel();
//				pnl[i].add(op[i]);
//			}
//			else if(i < 6){
//				rp[i] = new Paint08RectanglePanel();
//				pnl[i].add(rp[i]);
//			}
//			else {
//				tp[i] = new Paint07TrianglePanel();
//				pnl[i].add(tp[i]);
//			}
			this.add(pnl[i]);
		}
	}
	
}