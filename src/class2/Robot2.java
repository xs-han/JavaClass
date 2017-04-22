package class2;

import java.io.*;

public class Robot2 {
	private String m_id;
	private String m_name;
	private int m_speed;
	private double m_temperature;
	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);
	
	public Robot2() {
		this.m_id = "unknown";
		this.m_name = "unknown";
		this.m_speed = 0;
		this.m_temperature = 0.0;
	}
	
	public Robot2(String id, String name, int speed, double t){
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
	
	public void judge() {
		if(m_temperature > 1000.50){
			m_speed = 120;
			System.out.println("The vocano is going to explode!");
		}
		else{
			m_speed = 60;
			System.out.println("The situation is in control");
		}
	}
	
	public String output() {
		return "id="+m_id+"\t"+
				"name="+m_name+"\t"+
				"speed="+m_speed+"\t"+
				"temperature="+m_temperature+"\n";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot2 r1 = new Robot2();
		try {
			r1.keyInput();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(r1.output());
		r1.judge();
		System.out.println(r1.output());
	}
}
