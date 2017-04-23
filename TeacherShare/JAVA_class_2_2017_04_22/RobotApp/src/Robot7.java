import java.awt.*;
import javax.swing.*;

public class Robot7 extends JFrame{
	
    JPanel [] pnl=new JPanel[4];
    
    LayoutManager [] lm={new BorderLayout(5,5),
    		new FlowLayout(FlowLayout.CENTER,5,5),
    		new GridLayout(4,2,5,5),
    		new FlowLayout(FlowLayout.CENTER,5,5)};
    
    Color [] c={Color.blue,Color.green,Color.yellow,Color.red};
		
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
	
	
	public Robot7(){
		for(int i=0;i<pnl.length;i++){
			pnl[i]=new JPanel(lm[i]);
			pnl[i].setBackground(c[i]);
		}
		
		
		this.setContentPane(pnl[0]);
	}
	
	
	
	
	
	
	public static void main(String [] args){
		Robot7 r6=new Robot7();
		r6.setTitle("火山探测机器人");
		r6.setBounds(400,300,500,350);
		r6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r6.setVisible(true);
	}
	
}