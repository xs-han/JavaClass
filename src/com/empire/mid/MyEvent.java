package com.empire.mid;

import java.awt.event.*;
import javax.swing.*;
import com.empire.gui.*;

public class MyEvent implements ActionListener{
	
	JButton [] jb3;
	JTextField [] jtf;
	String [] jlb; 
	String [] data;
	
	public MyEvent(){
		jb3 = null;
		jtf = null;
		data = null;
		jlb = null;
	}
	
	public MyEvent(JTextField [] tfText, JButton [] jb, String [] lb){
		jb3 = jb;
		jtf = tfText;
		jlb = lb;
		for(int i = 0; i < jb.length; i++){
			jb3[i].addActionListener(this);
		}
		data = new String[tfText.length];
	}
	

	public void judgeNull() throws EmptyException{
		for(int i = 0; i < data.length; i++){
			if(data[i].equals("")){
				if(i != data.length-1){
					throw new EmptyException(jlb[i] + "不能为空。");
				}
				else {
					throw new EmptyException("验证码" + "不能为空。");
				}
			}
		}
		if(!data[3].toLowerCase().equals("uwv6")){
			throw new EmptyException("验证码不正确");
		}
	}
	
	public void judgeEquality() throws InequalityException{
		if(!data[1].equals(data[2])){
			throw new InequalityException(jlb[1],jlb[2]);
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
	
	public void clear(){
		for(int i=0;i<jtf.length;i++){
			jtf[i].setText("");
		}
	}
	
	public void getInfo(){
		for(int i=0;i<jtf.length;i++){
			data[i] = jtf[i].getText().trim();
		}
	}
	
	public void callRegWin(){
		RegWindow rw = new RegWindow();
		rw.setTitle("注册窗口");
		rw.setBounds(600,600,300,200);
		rw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rw.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		try{
			if(ae.getSource() == jb3[0]){
				getInfo();
				judgeNull();
				judgeEquality();
				judge();
			}
			else if(ae.getSource() == jb3[1]){
				clear();
			}
			else{
				callRegWin();
			}
		}catch(EmptyException myex){
			JOptionPane.showMessageDialog(null, myex.OutMessage(), 
					"不能为空", JOptionPane.ERROR_MESSAGE);
//		}catch(InequalityException ieex){
//			JOptionPane.showMessageDialog(null, ieex.OutMessage(), 
//					"不能为空", JOptionPane.ERROR_MESSAGE);
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex.getMessage(), 
					"不能为空", JOptionPane.ERROR_MESSAGE);
		}
	}
}
