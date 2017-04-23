import java.awt.*;
import javax.swing.*;

public class Robot7 extends JFrame{
	
    JPanel [] pnl=new JPanel[4];
    
    LayoutManager [] lm={new BorderLayout(5,5),
    		new FlowLayout(FlowLayout.CENTER,5,5),
    		new GridLayout(4,2,5,5),
    		new FlowLayout(FlowLayout.CENTER,5,5)};
    
    Color [] c={Color.blue,Color.green,Color.yellow,Color.red};
		
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
	
	
	public Robot7(){
		for(int i=0;i<pnl.length;i++){
			pnl[i]=new JPanel(lm[i]);
			pnl[i].setBackground(c[i]);
		}
		
		
		this.setContentPane(pnl[0]);
	}
	
	
	
	
	
	
	public static void main(String [] args){
		Robot7 r6=new Robot7();
		r6.setTitle("��ɽ̽�������");
		r6.setBounds(400,300,500,350);
		r6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r6.setVisible(true);
	}
	
}