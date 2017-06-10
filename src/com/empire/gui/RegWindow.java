package com.empire.gui;

import java.awt.Color;

import javax.swing.*;

public class RegWindow extends JFrame{
	JPanel pnls=new JPanel();
	public RegWindow(){
		pnls.setBackground(Color.red);
		this.setContentPane(pnls);
	}
}