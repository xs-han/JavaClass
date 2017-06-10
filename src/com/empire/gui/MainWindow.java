package com.empire.gui;

import java.awt.*;
import javax.swing.*;


public class MainWindow extends JFrame{
	MainPanel mp = new MainPanel();
	RegWindow rw = new RegWindow();
	public MainWindow(){
		this.setContentPane(mp);
	}
	
	public void callRegWin(){
		this.setVisible(false);
		rw.setTitle("注册窗口");
		rw.setBounds(600,600,300,200);
		rw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rw.setVisible(true);
	}
}
