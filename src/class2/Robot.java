package class2;

public class Robot {
	private String m_id;
	private String m_name;
	private int m_speed;
	private double m_temperature;
	
	public Robot() {
		this.m_id = "unknown";
		this.m_name = "unknown";
		this.m_speed = 0;
		this.m_temperature = 0.0;
	}
	
	public Robot(String id, String name, int speed, double t){
		this.m_id = id;
		this.m_name = name;
		this.m_speed = speed;
		this.m_temperature = t;
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
		Robot r1 = new Robot("r01","robot",30,2500.5);
		r1.judge();
		System.out.println(r1.output());
	}
}
