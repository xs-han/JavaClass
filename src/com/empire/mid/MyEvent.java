package com.empire.mid;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;
import com.empire.gui.*;

public class MyEvent implements ActionListener{
	
	JButton [] jb3;
	JTextField [] jtf;
	String [] data;
	
	public MyEvent(){
		jb3 = null;
		tfText = null;
	}
	
	public MyEvent(JButton [] jb, JTextField [] tfText){
		jb3 = jb;
		jtf = tfText;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		try{
			if(ae.getSource() == jb[0]){
				getInfo();
				judgeNull();
				judgeEquality();
				judge();
			}
			else if(ae.getSource() == jb[1]){
				clear();
			}
			else{
				callRegWin();
				this.setVisible(true);
			}
		}catch(MyException myex){
			JOptionPane.showMessageDialog(null, myex.OutMessage(), 
					"不能为空", JOptionPane.ERROR_MESSAGE);
//		}catch(InequalityException ieex){
//			JOptionPane.showMessageDialog(null, ieex.OutMessage(), 
//					"不能为空", JOptionPane.ERROR_MESSAGE);
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex.getMessage(), 
					"不能为空", JOptionPane.ERROR_MESSAGE);
		}
		System.out.println("test");
	}
	public void callRegWin(){
		rw.setTitle("注册窗口");
		rw.setBounds(600,600,300,200);
		rw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rw.setVisible(true);
	}
	
	public void clear(){
		for(int i=0;i<jtf.length;i++){
			jtf[i].setText("");
		}
	}
	
	public void judgeNull() throws MyException{
		for(int i = 0; i < data.length; i++){
			if(data[i].equals("")){
				throw new MyException(jlText[i] + "不能为空。");
			}
		}
	}
	
	public void judgeEquality() throws InequalityException{
		if(!data[1].equals(data[2])){
			throw new InequalityException(jlText[1].substring(0, jlText[1].length()-1),
					jlText[2].substring(0, jlText[2].length()-1));
		}
	}
	
	public void judge(){
		if( jtf[0].getText().equals("admin") && 
				jtf[1].getText().equals("123456") && 
				jtf[2].getText().equals("123456")){
				JOptionPane.showMessageDialog(null, "您已登录成功");
		}
		else{
			JOptionPane.showMessageDialog(null, "您登录失败");
		}
	}
	

	

}
