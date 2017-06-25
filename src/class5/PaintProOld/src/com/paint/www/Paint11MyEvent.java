package com.paint.www;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paint11MyEvent implements ActionListener{
	
	static int count = 0;
		
	public Paint11MyEvent(){
		
	}
	
	public void actionPerformed(ActionEvent ae){
		System.out.println("action");
		try{
			if(count < 9){
				if(ae.getSource() == Paint06SouthPanel.btn[0]){
					System.out.println("tri");
					Paint07TrianglePanel tp = new Paint07TrianglePanel();
					Paint05CenterPanel.pnl[count].add(tp);
					tp.repaint();
					Paint05CenterPanel.pnl[count].validate();
				}
				else if(ae.getSource() == Paint06SouthPanel.btn[1]){
					System.out.println("rect");
					Paint08RectanglePanel rp = new Paint08RectanglePanel();
					Paint05CenterPanel.pnl[count].add(rp);
					rp.repaint();
					Paint05CenterPanel.pnl[count].validate();
				}
				else {
					System.out.println("oval");
					Paint09OvalPanel op = new Paint09OvalPanel();
					Paint05CenterPanel.pnl[count].add(op);
					op.repaint();
					Paint05CenterPanel.pnl[count].validate();
				}
				count++;
			}
			else{
				throw new Paint10MyException("最多9个，重置。");
			}
		}
		catch(Paint10MyException myex){
			System.out.println(myex.getMessage());
		}
	}

}