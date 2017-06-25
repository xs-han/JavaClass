package c408;

import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class PaintGame extends JFrame{
	
	public final int M=3;
	
	Random r=new Random();
	JPanel pnlMain=new JPanel(new GridLayout(M,M,5,5));
	MyPaint [] mp=new MyPaint[M*M];
		
	public PaintGame(){
		
		for(int i=0;i<mp.length;i++){
			mp[i]=new MyPaint();
			pnlMain.add(mp[i]);
		}
		
		this.setContentPane(pnlMain);
	}
	
	public static void main(String [] args){
		PaintGame pg=new PaintGame();
		pg.setTitle("我的第一个线程");
		pg.setBounds(10,20,800,800);
		pg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pg.setVisible(true);
	}
	
	class MyPaint extends JPanel implements Runnable{//内部类
		
		Thread t;
		int m=0;
		
		public MyPaint(){
			this.setBackground(Color.pink);
			if(t==null){
				t=new Thread(this);
				t.start();
			}
		}
		
		public void run(){
			while(true){
				m+=1;
				try{
					Thread.sleep(100);
				}catch(InterruptedException iex){
					JOptionPane.showMessageDialog(null, iex.getMessage());
				}
				repaint();
			}
		}
		
		public void paintComponent(Graphics g){
			Graphics2D g2d=(Graphics2D)g;
			super.paintComponent(g2d);
			g2d.setColor(new Color(r.nextInt(m),r.nextInt(m),r.nextInt(m)));
			g2d.fillOval(0,0,this.getWidth(),this.getHeight());
		}
	}
	
}

















