package com.empire.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import com.empire.mid.*;

public class SouthPanel extends JPanel{
	JButton [] jb3 = {	new JButton("登录"),
						new JButton("取消"),
						new JButton("注册")};
	public SouthPanel(){
		for(int i = 0; i < jb3.length; i++){
			this.add(jb3[i]);
		}
	}
	
	public JButton [] getJb3(){
		return jb3;
	}
}
