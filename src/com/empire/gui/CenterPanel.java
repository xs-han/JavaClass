package com.empire.gui;

import java.awt.*;
import javax.swing.*;

public class CenterPanel extends JPanel{
	GridLayout gl = new GridLayout(4, 2, 10, 10);
	ImageIcon ii = new ImageIcon("./src/com/empire/gui/checkCode.jpg");
	JLabel [] lblText = {	new JLabel("用户名",JLabel.CENTER), 
							new JLabel("密码",JLabel.CENTER), 
							new JLabel("密码确认",JLabel.CENTER),
							new JLabel(ii)};
	JTextField [] tfText = {new JTextField(), new JPasswordField(), new JPasswordField(), new JTextField()};
	public CenterPanel(){
		this.setBackground(Color.yellow);
		this.setLayout(gl);
		for(int i = 0; i < lblText.length; i++){
			this.add(lblText[i]);
			this.add(tfText[i]);
		}
	}
}

