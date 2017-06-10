package com.empire.gui;

import java.awt.*;

import javax.swing.*;

import com.empire.mid.MyEvent;

public class MainPanel extends JPanel{

	JPanel [] pnl = {new NorthPanel(), new CenterPanel(), new SouthPanel()};
	LayoutManager [] layout = {	new BorderLayout(5,5), new FlowLayout(FlowLayout.CENTER,5,5), 
			new GridLayout(4,2,5,5),new FlowLayout(FlowLayout.CENTER,5,5) };
	String [] locMain = {"North", "Center", "South"};
	Color [] cl = {Color.pink, Color.green, Color.yellow, Color.red};
	
	MyEvent me = new MyEvent(pnl[2].jb3, pnl[1],tfText);
	public MainPanel(){
		this.setBackground(Color.PINK);
		this.setLayout(layout[0]);
		for(int i = 0; i < pnl.length; i++){
			pnl[i].setLayout(layout[i+1]);
			pnl[i].setBackground(cl[i]);
			this.add(locMain[i],pnl[i]);
		}
	}
}
