package class4.a208;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
	
	public LoginModify(){
		// bg and layout
		for(int i = 0; i < pnl.length; i++){
			pnl[i] = new JPanel();
			pnl[i].setBackground(cl[i]);
		}
		for(int i = 0; i < pnl.length; i++){
			pnl[i].setLayout(layout[i]);
		}
		
		//button and txt
		pnl[1].add(new JTextField("登录系统"));
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

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jb[0]){
			if( jtf[0].getText().equals("admin") && 
				jtf[1].getText().equals("123456") && 
				jtf[2].getText().equals("123456")){
				JOptionPane.showMessageDialog(null, "您已登录成功");
			}
			else{
				JOptionPane.showMessageDialog(null, "您登录失败");
			}
		}
		else if(ae.getSource() == jb[1]){
			for(int i = 0; i < jtf.length; i++){
				jtf[i].setText("");
			}
		}
		else{
			
		}
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
