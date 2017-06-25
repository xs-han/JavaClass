package com.paint.www;

import java.awt.*;
import javax.swing.*;

public class Paint01Mainpro{
	
	public static void main(String [] args){
		System.out.println("main");
		Paint02MainFrame mf=new Paint02MainFrame();
		mf.setTitle("图形选择程序");
		mf.setBounds(400,200, 500,500);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
	
}