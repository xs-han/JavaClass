package com.empire.gui;

import javax.swing.*;
import com.empire.mid.*;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow mw = new MainWindow();
		MyEvent mEvent = new MyEvent(((CenterPanel) mw.mp.pnl[1]).tfText, 
				((SouthPanel)mw.mp.pnl[2]).jb3,((CenterPanel)mw.mp.pnl[1]).lbl);
		mw.setTitle("王者荣耀登录系统");
		mw.setBounds(300,400,350,280);
		mw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mw.setVisible(true);
	}

}
