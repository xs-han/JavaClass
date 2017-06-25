package c408;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.applet.*;
import java.sql.*;

public class Test1_GoodLogin extends JFrame implements ActionListener{
	
	JPanel pnlNorth=new JPanel();
	JPanel pnlCenter=new JPanel();
	JPanel pnlSouth=new JPanel();
	JPanel pnlMain=new JPanel();
	
	JLabel lblTitle=new JLabel("用户登陆系统");
	JLabel lblUserName=new JLabel("用户名:");
	JLabel lblPassword=new JLabel("密  码:");
	
	JTextField txtUserName=new JTextField(8);
	JPasswordField txtPassword=new JPasswordField(8);
	
	JButton btnOk=new JButton("登陆");
	JButton btnCancel=new JButton("取消");
	
	String uname,pwd;
	
	MyDB md;
	
	public Test1_GoodLogin() {
		pnlNorth.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		pnlCenter.setLayout(new GridLayout(2,2,5,5));
		pnlSouth.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		pnlMain.setLayout(new BorderLayout(5,5));
		
		pnlNorth.add(lblTitle);
		
		pnlCenter.add(lblUserName);
		pnlCenter.add(txtUserName);
		pnlCenter.add(lblPassword);
		pnlCenter.add(txtPassword);
		
		pnlSouth.add(btnOk);
		pnlSouth.add(btnCancel);
		
		pnlMain.add("North",pnlNorth);
		pnlMain.add("Center",pnlCenter);
		pnlMain.add("South",pnlSouth);
		
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
		
		setContentPane(pnlMain);	
		
	}
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource()==btnOk){			
			try{
				judgeLogin();
			}catch(Exception ex){
				//
			}
		}else{
			System.exit(0);
		}
		
	}
	
	public void judgeLogin() throws SQLException,ClassNotFoundException{
		uname=txtUserName.getText();
		pwd=txtPassword.getText();
		
		if(uname.equals("")){
			judgeNull(txtUserName,"用户名不能为空");
		}else if(pwd.equals("")){
			judgeNull(txtPassword,"密码不能为空");			
		}else{			
			connectDB();
		}
	}

	public void judgeNull(JComponent jc,String str){
		JOptionPane.showMessageDialog(null, str,"消息",JOptionPane.INFORMATION_MESSAGE);
		jc.requestFocus();
	}
	
	public void connectDB() throws SQLException,ClassNotFoundException{
		try{
			md=new MyDB("testdsn");			
			if(md.myQuery("login", uname, pwd)){
				JOptionPane.showMessageDialog(null, "登陆成功","消息",JOptionPane.INFORMATION_MESSAGE);
			}else{
				JOptionPane.showMessageDialog(null, "用户名密码不正确","消息",JOptionPane.INFORMATION_MESSAGE);
				clearText();
			}
			
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "异常内容为:"+ex.getMessage(),"发生异常",JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void clearText(){
		txtUserName.setText("");
		txtPassword.setText("");
		txtUserName.requestFocus();
	}
	
	public static void main(String[] args) {
		Test1_GoodLogin ml=new Test1_GoodLogin();
		ml.setTitle("用户登陆");
		ml.setSize(300,200);
		ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ml.setVisible(true);

	}
}

class MyDB{	
	
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	public MyDB(String dsnstr) throws SQLException,ClassNotFoundException{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:"+dsnstr);
		stmt=con.createStatement();		
	}
	
	public boolean myQuery(String tstr,String ustr,String pstr) throws SQLException,ClassNotFoundException{
		rs=stmt.executeQuery(
				"select * from "+
				tstr +
				" where username='"+
				ustr+
				"' and password='"+
				pstr+
				"'"
		);
		return rs.next();
		
	}
	
	public void closeDB() throws SQLException,ClassNotFoundException{
		rs.close();
		stmt.close();
		con.close();
	}

	
}


