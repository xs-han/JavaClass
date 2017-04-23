import java.io.*;
import java.lang.*;
import java.util.*;
import javax.swing.*;

public class Robot5{
  //������·�����ʵ������(ȫ�ֱ���)
  private String id;
  private String name;
  private int speed;
  private double temperature;
  
  private InputStreamReader isr=new InputStreamReader(System.in);
  private BufferedReader br=new BufferedReader(isr);
  
  private Scanner sc=new Scanner(System.in);

  public Robot5(){
      id="unknown";
      name="unknown";
      speed=0;
      temperature=0.0;
  }
  
  public Robot5(String i,String n,int s,double t){
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
  
  public void dialogInput(){
      id=JOptionPane.showInputDialog(null,
    		  "Please Input id:",
    		  "Input id",
    		  JOptionPane.QUESTION_MESSAGE);
      name=JOptionPane.showInputDialog(null,
    		  "Please Input name:",
    		  "Input name",
    		  JOptionPane.QUESTION_MESSAGE);
      speed=Integer.parseInt(JOptionPane.showInputDialog(null,
    		  "Please Input speed:",
    		  "Input speed",
    		  JOptionPane.QUESTION_MESSAGE));
      temperature=Double.parseDouble(JOptionPane.showInputDialog(null,
    		  "Please Input temperature:",
    		  "Input temperature",
    		  JOptionPane.QUESTION_MESSAGE));	  
  }



  public String judge(){
	  String str;
      if(temperature>1000.50){
           speed=120;
           str="��ɽ����������"+"\n";
      }else{
           speed=60;
           str="��ɽ�ڿɿط�Χ��"+"\n";
      }
      return str;
  }
  
  public String output(){
     return "id="+id+"\n"+ "name="+name+"\n"+ "speed="+speed+"\n"+ "temperature="+temperature+"\n";
  }
  
  public void dialogOutput(){
	  JOptionPane.showMessageDialog(null,
			output()+judge(),
			"Output All Information",
			JOptionPane.INFORMATION_MESSAGE);
  }
  
  public void setID(String i){
	  id=i;
  }
  
  public String getID(){
	  return id;
  }
  
  public void setName(String n){
	 name=n;
  }
  
  public String getName(){
	  return name;
  }
  
  public void setSpeed(int s){
	  speed=s;
  }
  
  public int getSpeed(){
	  return speed;
  }
 
  public void setTemperature(double t){
	  temperature=t;
  }
  
  public double getTemperature(){
	  return temperature;
  }
  
  
  public static void main(String [] args) {
      Robot5 r1=new Robot5();
      
      r1.setID("01");
      r1.setName("robot");
      r1.setSpeed(100);
      r1.setTemperature(5000.5);
      
      System.out.println( r1.judge());
      
      System.out.println("id="+r1.getID());
      System.out.println("name="+r1.getName());
      System.out.println("speed="+r1.getSpeed());
      System.out.println("temperature="+r1.getTemperature());
  }
}
