package class1;

public class Family {

    private String u_id;
    private String u_name;
    private String u_pwd;
    
    public Family(){
    }

    public void getData(String id, String name, String pwd){
        u_id = id;
        u_name = name;
        u_pwd = pwd;
    }

    public void putData(){
        System.out.println("member id: " + u_id + " member name: "
                + u_name + " member pw: " +u_pwd);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world.");
        Family f1 = new Family();
        Family f2 = new Family();
        Family f3 = new Family();
        f1.getData("1","admin","123456");
        f2.getData("2","Peter","654321");
        f3.getData("3","Mary","111111");
        f1.putData();
        f2.putData();
        f3.putData();
	}
}
