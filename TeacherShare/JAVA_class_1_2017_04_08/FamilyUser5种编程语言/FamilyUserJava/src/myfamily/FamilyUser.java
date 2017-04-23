// FamilyUser.java 
package myfamily;
import java.io.*;
import java.lang.*;
public class FamilyUser{
	    private String u_id;
	    private String u_name;
	    private String u_pwd;	    
	    public void input(String i,String n,String p){
		    u_id=i;
		    u_name=n;
		    u_pwd=p;
	    }	    
	    public void output(){
            System.out.print("u_id=" + u_id +"\t");
            System.out.print("u_name=" +u_name + "\t");
            System.out.print("u_pwd=" + u_pwd + "\n");
	    }
        public static void  main(String [] args){
            FamilyUser fu1=new FamilyUser();
            fu1.input("01","admin","123456");
            fu1.output();
            FamilyUser fu2 = new FamilyUser();
            fu2.input("02","peter","654321");
            fu2.output();
        }
}
