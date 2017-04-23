import java.io.*;
import java.lang.*;

public class Robot2{
  //在类的下方声明实例变量(全局变量)
  private String id;
  private String name;
  private int speed;
  private double temperature;
  
  private InputStreamReader isr=new InputStreamReader(System.in);
  private BufferedReader br=new BufferedReader(isr);

  public Robot2(){
      id="unknown";
      name="unknown";
      speed=0;
      temperature=0.0;
  }
  
  public Robot2(String i,String n,int s,double t){
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
  
  public static void main(String [] args) throws IOException{
      Robot2 r1=new Robot2();
      r1.keyInput();
      r1.judge();
      System.out.println(r1.output()); 
  }
}
