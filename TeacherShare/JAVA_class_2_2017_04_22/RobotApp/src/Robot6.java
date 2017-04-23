import java.awt.*;
import javax.swing.*;

public class Robot6 extends JFrame{
	
	JPanel pnlMain=new JPanel();
	JPanel pnlNorth=new JPanel();
	JPanel pnlCenter=new JPanel();
	JPanel pnlSouth=new JPanel();	
	
	BorderLayout bl=new BorderLayout(5,5);
	FlowLayout fl=new FlowLayout(FlowLayout.CENTER,5,5);
	GridLayout gl=new GridLayout(4,2,5,5);
	
	JLabel lblTitle=new JLabel("火山探测机器人系统");
	
	JLabel lblID=new JLabel("请输入机器人编号：",JLabel.CENTER);
	JLabel lblName=new JLabel("请输入机器人姓名：",JLabel.CENTER);
	JLabel lblSpeed=new JLabel("请输入机器人速度：",JLabel.CENTER);
	JLabel lblTemperature=new JLabel("请输入火山当前温度：",JLabel.CENTER);
	
	JTextField txtID=new JTextField(10);
	JTextField txtName=new JTextField(10);
	JTextField txtSpeed=new JTextField(10);
	JTextField txtTemperature=new JTextField(10);
	
	JButton btnDisp=new JButton("显示");
	JButton btnClear=new JButton("清空");
	JButton btnExit=new JButton("退出");
	
	
	
	
	public Robot6(){
		pnlNorth.setLayout(fl);
		pnlNorth.setBackground(Color.green);
		pnlNorth.add(lblTitle);	
		
		pnlCenter.setLayout(gl);
		pnlCenter.setBackground(Color.yellow);
		pnlCenter.add(lblID);
		pnlCenter.add(txtID);		
		pnlCenter.add(lblName);
		pnlCenter.add(txtName);	
		pnlCenter.add(lblSpeed);
		pnlCenter.add(txtSpeed);	
		pnlCenter.add(lblTemperature);
		pnlCenter.add(txtTemperature);	
		
		pnlSouth.setLayout(fl);
		pnlSouth.setBackground(Color.red);
		pnlSouth.add(btnDisp);
		pnlSouth.add(btnClear);		
		pnlSouth.add(btnExit);		
		pnlMain.setLayout(bl);
		
		pnlMain.setBackground(Color.blue);
		pnlMain.add("North",pnlNorth);
		pnlMain.add("Center",pnlCenter);
		pnlMain.add("South",pnlSouth);		
		this.setContentPane(pnlMain);
	}
	
	
	
	
	
	
	public static void main(String [] args){
		Robot6 r6=new Robot6();
		r6.setTitle("火山探测机器人");
		r6.setBounds(400,300,500,350);
		r6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r6.setVisible(true);
	}
	
}