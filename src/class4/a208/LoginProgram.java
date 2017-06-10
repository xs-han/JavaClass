package class4.a208;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class LoginProgram extends JFrame implements ActionListener{
	JPanel pnlMain = new JPanel();
	
	JPanel pnlNorth = new JPanel();	
	JPanel pnlCenter = new JPanel();
	
	JPanel pnlSouth = new JPanel();

	
	FlowLayout fl = new FlowLayout(FlowLayout.CENTER,5,5);
	BorderLayout bl=new BorderLayout(5,5);
	GridLayout gl = new GridLayout(2,2,5,5);
	
	JLabel lblTitle = new JLabel("登录系统");
	JLabel lblUname = new JLabel("用户名：");
	JLabel lblPwd = new JLabel("密    码：");

	JTextField txtUname = new JTextField(10);
	JPasswordField txtPwd = new JPasswordField(10);
	
	JButton btnLogin = new JButton("登录");
	JButton btnCancel = new JButton("取消");
	JButton btnRegesiter = new JButton("注册");
	
	public LoginProgram(){

		pnlNorth.setBackground(Color.green);
		pnlNorth.setLayout(fl);
		
		pnlCenter.setBackground(Color.yellow);
		pnlCenter.setLayout(gl);
		pnlCenter.add(lblUname);
		pnlCenter.add(txtUname);
		pnlCenter.add(lblPwd);
		pnlCenter.add(txtPwd);	
		
		pnlSouth.setBackground(Color.red);
		pnlSouth.setLayout(fl);
		pnlSouth.add(btnLogin);
		pnlSouth.add(btnCancel);
		pnlSouth.add(btnRegesiter);
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		btnRegesiter.addActionListener(this);
		
		pnlMain.setBackground(Color.pink);
		pnlMain.setLayout(bl);
		pnlMain.add("North",pnlNorth);
		pnlMain.add("South",pnlSouth);
		pnlMain.add("Center",pnlCenter);
		
		this.setContentPane(pnlMain);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginProgram lp = new LoginProgram();
		lp.setTitle("登录系统");
		lp.setBounds(500,400,400,300);
		lp.setDefaultCloseOperation(EXIT_ON_CLOSE);
		lp.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource() == btnLogin){
			if(txtUname.getText().equals("admin") && txtPwd.getText().equals("123456")){
				JOptionPane.showMessageDialog(null, "您已登录成功");
			}
			else{
				JOptionPane.showMessageDialog(null, "您登录失败");
			}
		}
		else if(ae.getSource() == btnCancel){
			txtUname.setText("");
			txtPwd.setText("");
		}
		else{
			
		}
	}

}
