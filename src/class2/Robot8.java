package class2;

import javax.swing.*;
import java.awt.*;

public class Robot8 extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JPanel [] pnl = new JPanel[6]; // 0-->main; 1-->north; 2-->middle; 3-->south; 4-->middle up; 5-->middle down;
	LayoutManager [] lm = {	new BorderLayout(5,5),
							new FlowLayout(FlowLayout.CENTER,5,5),
							new BorderLayout(5,5),
							new FlowLayout(FlowLayout.CENTER,5,5),
							new GridLayout(4,2,5,5),
							new FlowLayout(FlowLayout.CENTER,5,5),
							};
	Color [] clPnls = {Color.BLUE, Color.GREEN, Color.GRAY, Color.RED, Color.YELLOW, Color.PINK};
	String [] loc = {"North", "Center", "South"};
	
	// Components of north panel
	JLabel lblTitle = new JLabel("Vocano Exploring Robotic System");
	
	// Components of south panel
	JButton [] btn = {	new JButton("Display"), 
						new JButton("Clear"), 
						new JButton("Exit")};
	
	// Components of center panel
	JLabel [] lbl = {	new JLabel("Please input the ID: ",JLabel.CENTER),
						new JLabel("Please input the name: ",JLabel.CENTER),
						new JLabel("Please input the speed: ",JLabel.CENTER),
						new JLabel("Please input the temperature: ",JLabel.CENTER)};
	JTextField [] txt = {	new JTextField(10),
							new JTextField(10),
							new JTextField(10),
							new JTextField(10)};
	JTextArea jta = new JTextArea(5,40);
	
	public Robot8() {
		for(int i = 0; i < pnl.length; i++){
			pnl[i] = new JPanel(lm[i]);
			pnl[i].setBackground(clPnls[i]);
		}
		
		// North panel
		pnl[1].add(lblTitle);
		
		// center
		for(int i = 0; i < lbl.length; i++){
			pnl[4].add(lbl[i]);
			pnl[4].add(txt[i]);
		}
		pnl[5].add(jta);
		
		pnl[2].add("North", pnl[4]);
		pnl[2].add("Center", pnl[5]);
		
		// south
		for(int i = 0; i < btn.length; i++) {
			pnl[3].add(btn[i]);
		}
		
		// main
		for(int i = 0; i < loc.length; i++) {
			pnl[0].add(loc[i],pnl[i+1]);
		}
		this.setContentPane(pnl[0]);
		
	}
	
	public static void main(String [] args) {
		Robot8 r6 = new Robot8();
		r6.setTitle("Vocano Exploring Robot");
		r6.setBounds(400,300,500,300);
		r6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r6.setVisible(true);
	}
}
