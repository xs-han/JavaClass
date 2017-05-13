package com.empire.gui;

import java.awt.*;
import javax.swing.*;

public class NorthPanel extends JPanel{
	JLabel lblTitle = new JLabel("王者荣耀登录系统");
	FlowLayout fl = new FlowLayout(FlowLayout.CENTER,5,5);
	public NorthPanel(){
		this.setBackground(Color.green);
		this.setLayout(fl);
		this.add(lblTitle);
	}
}
