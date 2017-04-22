package class2;

import javax.swing.*;
import java.awt.*;

public class Robot6 extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel pnlMain = new JPanel();
	JPanel pnlNorth = new JPanel();
	JPanel pnlCenter = new JPanel();
	JPanel pnlSouth = new JPanel();
	
	FlowLayout fl = new FlowLayout(FlowLayout.CENTER,5,5);
	BorderLayout bl = new BorderLayout(5,5);
	GridLayout gl = new GridLayout(4,2);
	
	// Components of north panel
	JLabel lblTitle = new JLabel("Vocano Exploring Robotic System");
	
	// Components of south panel
	JButton btnDisp = new JButton("Display");
	JButton btnClear = new JButton("Clear");
	JButton btnExit = new JButton("Exit");
	
	// Components of center panel
	JLabel lblID = new JLabel("Please input the ID: ",JLabel.CENTER);
	JLabel lblName = new JLabel("Please input the name: ",JLabel.CENTER);
	JLabel lblSpeed = new JLabel("Please input the speed: ",JLabel.CENTER);
	JLabel lblTemp = new JLabel("Please input the temperature: ",JLabel.CENTER);
	JTextField txtID = new JTextField(10);
	JTextField txtName = new JTextField(10);
	JTextField txtSpeed = new JTextField(10);
	JTextField txtTemp = new JTextField(10);
	
	public Robot6() {
		
		// North panel
		pnlNorth.setBackground(Color.green);
		pnlNorth.setLayout(fl);
		pnlNorth.add(lblTitle);		
		
		// South panel
		pnlSouth.setBackground(Color.red);
		pnlSouth.setLayout(fl);
		pnlSouth.add(btnClear);
		pnlSouth.add(btnDisp);
		pnlSouth.add(btnExit);
		
		// Center panel
		pnlCenter.setBackground(Color.yellow);
		pnlCenter.setLayout(gl);
		pnlCenter.add(lblID); pnlCenter.add(txtID);
		pnlCenter.add(lblName); pnlCenter.add(txtName);
		pnlCenter.add(lblSpeed); pnlCenter.add(txtSpeed);
		pnlCenter.add(lblTemp); pnlCenter.add(txtTemp);
		
		// Main panel
		pnlMain.setLayout(bl);
		pnlMain.add("North", pnlNorth);
		pnlMain.add("Center", pnlCenter);
		pnlMain.add("South", pnlSouth);
		this.setContentPane(pnlMain);
	}
	
	public static void main(String [] args) {
		Robot6 r6 = new Robot6();
		r6.setTitle("Vocano Exploring Robot");
		r6.setBounds(400,300,500,350);
		r6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r6.setVisible(true);
	}
}
