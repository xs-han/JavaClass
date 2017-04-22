package class2;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Robot4 {
	private String m_id;
	private String m_name;
	private int m_speed;
	private double m_temperature;
	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);
	private Scanner sc = new Scanner(System.in);
	
	public Robot4() {
		this.m_id = "unknown";
		this.m_name = "unknown";
		this.m_speed = 0;
		this.m_temperature = 0.0;
	}
	
	public Robot4(String id, String name, int speed, double t){
		this.m_id = id;
		this.m_name = name;
		this.m_speed = speed;
		this.m_temperature = t;
	}
	
	public void keyInput() throws IOException{
		System.out.println("Please input robot id.");
		m_id = br.readLine();
		System.out.println("Please input robot name.");
		m_name = br.readLine();
		System.out.println("Please input robot speed.");
		m_speed = Integer.parseInt(br.readLine());
		System.out.println("Please input temperature.");
		m_temperature = Double.parseDouble(br.readLine());
	}
	
	public void keySinpelInput(){
		System.out.println("Simple Input:");
		System.out.println("Please input robot id.");
		m_id = sc.nextLine();
		System.out.println("Please input robot name.");
		m_name = sc.nextLine();
		System.out.println("Please input robot speed.");
		m_speed = sc.nextInt();
		System.out.println("Please input temperature.");
		m_temperature = sc.nextDouble();
	}
	
	public void dialogInput(){
		m_id = JOptionPane.showInputDialog(null,"Please input id", "Input Id", JOptionPane.QUESTION_MESSAGE);
		m_name = JOptionPane.showInputDialog(null,"Please input name", "Input Name", JOptionPane.QUESTION_MESSAGE);
		m_speed = Integer.parseInt(JOptionPane.showInputDialog(null,"Please input speed", "Input Speed", JOptionPane.QUESTION_MESSAGE));
		m_temperature = Double.parseDouble(JOptionPane.showInputDialog(null,"Please input temperature", "Input Temperature", JOptionPane.QUESTION_MESSAGE));
	}
	
	public String judge() {
		String str;
		if(m_temperature > 1000.50){
			m_speed = 120;
			//System.out.println("The vocano is going to explode!");
			str = "The vocano is going to explode!\n";
		}
		else{
			m_speed = 60;
			//System.out.println("The situation is in control");
			str = "The situation is in control.\n";
		}
		return str;
	}
	
	public String output() {
		return "id="+m_id+"\n"+
				"name="+m_name+"\n"+
				"speed="+m_speed+"\n"+
				"temperature="+m_temperature+"\n";
	}
	
	public void dialogOutput() {
		JOptionPane.showMessageDialog(null, judge()+output(), "Output All Information", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot4 r1 = new Robot4();
		r1.dialogInput();
		//r1.judge();
		r1.dialogOutput();
	}
}
