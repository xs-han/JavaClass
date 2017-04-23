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
	
	JLabel lblTitle=new JLabel("��ɽ̽�������ϵͳ");
	
	JLabel lblID=new JLabel("����������˱�ţ�",JLabel.CENTER);
	JLabel lblName=new JLabel("�����������������",JLabel.CENTER);
	JLabel lblSpeed=new JLabel("������������ٶȣ�",JLabel.CENTER);
	JLabel lblTemperature=new JLabel("�������ɽ��ǰ�¶ȣ�",JLabel.CENTER);
	
	JTextField txtID=new JTextField(10);
	JTextField txtName=new JTextField(10);
	JTextField txtSpeed=new JTextField(10);
	JTextField txtTemperature=new JTextField(10);
	
	JButton btnDisp=new JButton("��ʾ");
	JButton btnClear=new JButton("���");
	JButton btnExit=new JButton("�˳�");
	
	
	
	
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
		r6.setTitle("��ɽ̽�������");
		r6.setBounds(400,300,500,350);
		r6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r6.setVisible(true);
	}
	
}