package com.paint.www;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paint11MyEvent implements ActionListener{

	public static int count=0;
	
	public void actionPerformed(ActionEvent ae){
		try{
			if(count<9){
				if(ae.getSource()==Paint06SouthPanel.btn[0]){
					Paint07TrianglePanel tp=new Paint07TrianglePanel();
					Paint05CenterPanel.pl[count].add("Center",tp);
					tp.repaint();
					Paint05CenterPanel.pl[count].validate();
				}else if(ae.getSource()==Paint06SouthPanel.btn[1]){
					Paint08RectanglePanel rp=new Paint08RectanglePanel();
					Paint05CenterPanel.pl[count].add("Center",rp);
					rp.repaint();
					Paint05CenterPanel.pl[count].validate();
				}else{
					Paint09OvalPanel op=new Paint09OvalPanel();
					Paint05CenterPanel.pl[count].add("Center",op);
					op.repaint();
					Paint05CenterPanel.pl[count].validate();
				}
				count++;
			}else{
				throw new Paint10MyException("图形最多只能选九个！！！");
			}
		}catch(Paint10MyException myex){
			JOptionPane.showMessageDialog(null,myex.getMessage());
		}
	}

}