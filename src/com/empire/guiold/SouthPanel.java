package com.empire.guiold;

import java.awt.*;
import javax.swing.*;

public class SouthPanel extends JPanel{
	JButton [] jb3 = {	new JButton("登录"),
						new JButton("取消"),
						new JButton("注册")};
	FlowLayout fl = new FlowLayout(FlowLayout.CENTER,5,5);
	public SouthPanel(){
		this.setBackground(Color.blue);
		this.setLayout(fl);
		for(int i = 0; i < jb3.length; i++){
			this.add(jb3[i]);
		}
	}
}
