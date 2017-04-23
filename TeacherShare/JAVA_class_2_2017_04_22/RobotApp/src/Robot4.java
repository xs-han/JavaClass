import java.io.*;
import java.lang.*;
import java.util.*;
import javax.swing.*;

public class Robot4{
  //在类的下方声明实例变量(全局变量)
  private String id;
  private String name;
  private int speed;
  private double temperature;
  
  private InputStreamReader isr=new InputStreamReader(System.in);
  private BufferedReader br=new BufferedReader(isr);
  
  private Scanner sc=new Scanner(System.in);

  public Robot4(){
      id="unknown";
      name="unknown";
      speed=0;
      temperature=0.0;
  }
  
  public Robot4(String i,String n,int s,double t){
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
           str="火山即将爆发！"+"\n";
      }else{
           speed=60;
           str="火山在可控范围！"+"\n";
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
  
  public static void main(String [] args) {
      Robot4 r1=new Robot4();
      r1.dialogInput();
      r1.dialogOutput(); 
  }
}
