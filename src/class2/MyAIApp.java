package class2;

class MyFatherAI{
	String id;
	int superAbility;
	
	public MyFatherAI() {
		// TODO Auto-generated constructor stub
		id = "unknown";
		superAbility = -1;
	}
	
	public String putID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public int putSA() {
		return superAbility;
	}

	public void setSA(int superAbility) {
		this.superAbility = superAbility;
	}

	public MyFatherAI(String s){
		id = s;
	}
	
	public MyFatherAI(String s, int i) {
		id = s;
		superAbility = i;
	}
	
	public String judge() {
		System.out.println("This is FatherAI " + id + " with SA " + superAbility);
		return "This is FatherAI " + id + " with SA " + superAbility;
	}
}

class MyYouAI extends MyFatherAI{
	int hb;
	
	public MyYouAI() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public MyYouAI(String s, int i){
		super(s,i);
	}

	public int putHB() {
		return hb;
	}

	public void setHB(int hb) {
		this.hb = hb;
	}
	
	public String judge(){
		System.out.println("This is FatherAI " + id + 
				" with SA " + superAbility + 
				" and humanity " + hb);
		return "This is FatherAI " + id + 
				" with SA " + superAbility + 
				" and humanity " + hb;
	}
}

class MyMyAI extends MyFatherAI{
	int think;
	
	public MyMyAI() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public int putThink() {
		return think;
	}

	public void setThink(int think) {
		this.think = think;
	}

	MyMyAI(String s, int i) {
		super(s, i);
	}
	
	public String judge() {
		System.out.println("This is MyAI " + id + 
				" with SA " + superAbility + 
				" and think " + think);
		return "This is MyAI " + id + 
				" with SA " + superAbility + 
				" and think " + think;
	}
}

public class MyAIApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFatherAI fai = new MyFatherAI("father01", 9);
		MyYouAI yai = new MyYouAI("you01", 7);
		yai.setHB(3);
		MyMyAI mai = new MyMyAI("my01", 3);
		mai.setThink(100);
		
		fai.judge();
		yai.judge();
		mai.judge();
		
		MyFatherAI foo = new MyFatherAI("father01", 9);
		foo.judge();
		foo = new MyYouAI("you02", 9);
		foo.judge();
		foo = new MyMyAI("my01", 3);
		foo.judge();

	}

}
