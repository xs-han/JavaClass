package com.empire.gui;

import java.awt.*;
import javax.swing.*;

public class CenterPanel extends JPanel{
	ImageIcon ii = new ImageIcon("./src/com/empire/gui/checkCode.jpg");
	String [] lbl = {"用户名", "密码", "密码确认"};
	JLabel [] lblText = new JLabel[4];
	JTextField [] tfText = {new JTextField(), new JPasswordField(), new JPasswordField(), new JTextField()};
	
	public CenterPanel(){
		for(int i = 0; i < lblText.length; i++){
			if(i < lblText.length-1){
				lblText[i] = new JLabel(lbl[i]);
			}
			else{
				lblText[i] = new JLabel(ii);
			}
			this.add(lblText[i]);
			this.add(tfText[i]);
		}
	}
	
	public void clear(){
		for(int i=0;i<tfText.length;i++){
			tfText[i].setText("");
		}
	}
}

