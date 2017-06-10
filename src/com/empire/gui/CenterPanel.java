package com.empire.gui;

import java.awt.*;
import javax.swing.*;

public class CenterPanel extends JPanel{
	ImageIcon ii = new ImageIcon("./src/com/empire/gui/checkCode.jpg");
	JLabel [] lblText = {	new JLabel("用户名",JLabel.CENTER), 
							new JLabel("密码",JLabel.CENTER), 
							new JLabel("密码确认",JLabel.CENTER),
							new JLabel(ii)};
	JTextField [] tfText = {new JTextField(), new JPasswordField(), new JPasswordField(), new JTextField()};
	
	static String [] data = new String[3];
	public CenterPanel(){
		for(int i = 0; i < lblText.length; i++){
			this.add(lblText[i]);
			this.add(tfText[i]);
		}
	}
	
	static String [] getTf(){
		for(int i=0;i<data.length;i++){
			data[i]=tfText[i].getText().trim();
		}
		return data;
	}
}

