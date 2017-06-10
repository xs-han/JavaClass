package com.empire.guiold;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel{
	SouthPanel sp = new SouthPanel();
	NorthPanel np = new NorthPanel();
	CenterPanel cp = new CenterPanel();
	
	BorderLayout bl = new BorderLayout(5,5);
	public MainPanel(){
		this.setBackground(Color.PINK);
		this.setLayout(bl);
		this.add("North",np);
		this.add("South",sp);
		this.add("Center",cp);
	}
}
