package class2;

class FatherAI {

	private String id;
	private int superAbility;

	public FatherAI() {
		id = "unknown";
		superAbility = 0;
	}

	public FatherAI(String i) {
		id = i;
		superAbility = 0;
	}

	public FatherAI(String i, int s) {
		id = i;
		superAbility = s;
	}

	public void setID(String i) {
		id = i;
	}

	public void setSA(int s) {
		superAbility = s;
	}

	public String judge() {
		String str;
		if (superAbility > 2) {
			str = "powerful";
		} else {
			str = "weak";
		}
		return str;
	}

	public String putID() {
		return id;
	}

	public int puttSA() {
		return superAbility;
	}
}

class YouAI extends MyFatherAI {
	private int hb;

	public YouAI() {
		super();
		hb = 0;
	}

	public YouAI(String i, int s) {
		super(i, s);
	}

	public void setHB(int h) {
		hb = h;
	}

	public String judge() {
		String st;
		if (hb > 5) {
			st = "YouAi is close to humanity.";
			//System.out.println("YouAi is close to humanity.");
		} else {
			st = "YouAi is far from humanity";
			//System.out.println("YouAi is far from humanity");
		}
		return st;
	}

	public int putHB() {
		return hb;
	}
}

class MyAI extends MyFatherAI {
	private int think;

	public MyAI() {
		super();
		think = -1;
	}

	public MyAI(String i, int s) {
		super(i, s);
	}

	public void setThink(int h) {
		think = h;
	}

	public String judge() {
		String st;
		if (think > 125) {
			//System.out.print("it's a genius");
			st = "it's a genius";
		} else if (think > 90) {
			//System.out.print("it's normal");
			st = "it's normal.";
		} else {
			//System.out.print("It's bad");
			st = "It's bad.";
		}
		return st;
	}

	public int putThink() {
		return think;
	}
}

public class AIApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test pattern 1");
		MyFatherAI fai = new MyFatherAI("father01", 9);
		MyYouAI yai = new MyYouAI("you01", 7);
		yai.setHB(3);
		MyMyAI mai = new MyMyAI("my01", 3);
		mai.setThink(100);

		System.out.println(fai.judge());
		System.out.println(yai.judge());
		System.out.println(mai.judge());
		
		System.out.println("Test pattern 2"); 
		System.out.println("Check the duotai!");

		MyFatherAI[] foo = { new MyFatherAI("father01", 9), new MyYouAI("you02", 9), new MyMyAI("my01", 3) };
		for (int i = 0; i < foo.length; i++) {
			System.out.println(foo[i].judge());
		}
	}

}
