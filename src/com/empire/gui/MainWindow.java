package com.empire.gui;

import java.awt.*;
import javax.swing.*;


public class MainWindow extends JFrame{
	MainPanel mp = new MainPanel();
	public MainWindow(){
		this.setContentPane(mp);
	}
}
