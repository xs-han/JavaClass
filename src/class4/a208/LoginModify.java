package class4.a208;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.*;

public class LoginModify extends JFrame implements ActionListener{

	JPanel [] pnl = new JPanel[4];
	LayoutManager [] layout = {	new BorderLayout(5,5), new FlowLayout(FlowLayout.CENTER,5,5), 
			new GridLayout(3,2,5,5),new FlowLayout(FlowLayout.CENTER,5,5) };
	String [] locMain = {"North", "Center", "South"};
	Color [] cl = {Color.pink, Color.green, Color.yellow, Color.red};
	
	JButton [] jb = new JButton[3];
	String [] jbText = {"登录","取消","注册"};
	
	JLabel [] jl = new JLabel[3];
	String [] jlText = {"用  户  名：", "密        码：", "确认密码："};
	JTextField [] jtf = {new JTextField(), new JPasswordField(), new JPasswordField()};
	
	String [] data=new String[3];
	
	class RegWin extends JFrame{
		JPanel pnls=new JPanel();
		public RegWin(){
			pnls.setBackground(Color.red);
			this.setContentPane(pnls);
		}
	}
	RegWin rw = new RegWin();
	
	class MyException extends Exception{
		private String message;
		public MyException(String mess){
			message = mess;
		}
		
		public String OutMessage(){
			return message;
		}
	}
	
	class InequalityException extends MyException{
		private String message;
		public InequalityException(String s1, String s2){
			super("");
			message = s1 + " 和 " + s2 + "不一致";
		}
		public String OutMessage(){
			return message;
		}
	}
	
	public LoginModify(){
		// bg and layout
		for(int i = 0; i < pnl.length; i++){
			pnl[i] = new JPanel();
			pnl[i].setBackground(cl[i]);
			pnl[i].setLayout(layout[i]);
		}
		
		//button and txt
		pnl[1].add(new JLabel("登录系统"));
		for(int i = 0; i < jb.length; i++){
			jb[i] = new JButton(jbText[i]);
			jb[i].addActionListener(this);
			pnl[3].add(jb[i]);
		}
		for(int i = 0; i < jl.length; i++){
			jl[i] = new JLabel(jlText[i]);
			pnl[2].add(jl[i]);
			pnl[2].add(jtf[i]);
		}
		
		//add panels to the main panel
		for(int i = 1; i < pnl.length; i++){
			pnl[0].add(locMain[i-1], pnl[i]);
		}
		this.setContentPane(pnl[0]);
	}
	
	public void callRegWin(){
		this.setVisible(false);
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
	
	public void getInfo(){
		for(int i=0;i<data.length;i++){
			data[i]=jtf[i].getText().trim();
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		LoginModify lm = new LoginModify();
		lm.setTitle("登录系统");
		lm.setBounds(500,400,400,300);
		lm.setDefaultCloseOperation(EXIT_ON_CLOSE);
		lm.setVisible(true);
	}

}
