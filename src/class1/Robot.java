package class1;

public class Robot {
	
	private String id;
	private String name;
	private int speed;
	private double temperature;
	
	public Robot(){
		id = "unknown";
		name = "unknown";
		speed = 0;
		temperature = 0;
	}
	
	public Robot(String i, String n, int s, double t){
		id = i;
		name = n;
		speed = s;
		temperature = t;
	}
	
	public Robot(Robot r){
		this.id = r.id;
		this.name = r.name;
		this.speed = r.speed;
		this.temperature = r.temperature;
	}
	
	public void judge(){
		System.out.println("This is robot " + id + " reporting.");
		if(temperature > 1000){
			speed = 120;
			System.out.println("Warning: The vocano is going to blow out!");
		}
		else if(temperature > 500){
			speed = 80;
			System.out.println("Scaning seriously. Danger is approaching.");
		}
		else{
			speed = 60;
			System.out.println("The vocano is normal and safe. Keep exploring.");
		}
	}
	
	public void output(){
		System.out.println("id=" + id + ";");
		System.out.println("name=" + name + ";");
		System.out.println("speed=" + speed + ";");
		System.out.println("temperature=" + temperature + ";");
	}

	public static void main(String[] args) {
		Robot r0 = new Robot();
		Robot r1 = new Robot("1", "test1", 0, 1001);
		Robot r2 = new Robot("2", "test1", 0, 600);
		Robot r3 = new Robot("3", "test1", 0, 300);
		
		r0.output();
		r1.output();
		r2.output();
		r3.output();
		
		r1.judge();
		r2.judge();
		r3.judge();
		
		r1.output();
		r2.output();
		r3.output();
		
	}

}
