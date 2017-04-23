import java.io.*;
import java.lang.*;
import java.util.*;

public class Robot3{
  //在类的下方声明实例变量(全局变量)
  private String id;
  private String name;
  private int speed;
  private double temperature;
  
  private InputStreamReader isr=new InputStreamReader(System.in);
  private BufferedReader br=new BufferedReader(isr);
  
  private Scanner sc=new Scanner(System.in);

  public Robot3(){
      id="unknown";
      name="unknown";
      speed=0;
      temperature=0.0;
  }
  
  public Robot3(String i,String n,int s,double t){
      id=i;
      name=n;
      speed=s;
      temperature=t;
  }

  public void keyInput() throws IOException{
	  System.out.print("Please input id:");
      id=br.readLine();
      
	  System.out.print("Please input name:");
      name=br.readLine();
      
	  System.out.print("Please input speed:");
      speed=Integer.parseInt(br.readLine());
      
	  System.out.print("Please input temperature:");
      temperature=Double.parseDouble(br.readLine());
  }
  
  public void keySimpleInput(){
	  System.out.print("Please input id:");
      id=sc.next();      
      
	  System.out.print("Please input name:");
      name=sc.next();
      
	  System.out.print("Please input speed:");
      speed=sc.nextInt();
      
	  System.out.print("Please input temperature:");
      temperature=sc.nextDouble();
  }


  public void judge(){
      if(temperature>1000.50){
           speed=120;
           System.out.println("火山即将爆发！");
      }else{
           speed=60;
           System.out.println("火山在可控范围！");
      }
  }
  
  public String output(){
     return "id="+id+"\t"+ "name="+name+"\t"+ "speed="+speed+"\t"+ "temperature="+temperature+"\n";
  }
  
  public static void main(String [] args) {
      Robot3 r1=new Robot3();
      r1.keySimpleInput();
      r1.judge();
      System.out.println(r1.output()); 
  }
}
