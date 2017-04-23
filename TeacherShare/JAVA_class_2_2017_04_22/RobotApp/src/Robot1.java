import java.io.*;
import java.lang.*;

public class Robot1{
  //在类的下方声明实例变量(全局变量)
  private  String id;
  private String name;
  private  int speed;
  private  double temperature;
  
  public Robot1(){
      id="unknown";
      name="unknown";
      speed=0;
      temperature=0.0;
  }
  public Robot1(String i,String n,int s,double t){
      id=i;
      name=n;
      speed=s;
      temperature=t;
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
  public  String output(){
     return "id="+id+"\t"+ "name="+name+"\t"+ "speed="+speed+"\t"+ "temperature="+temperature+"\n";
  }
  public static void main(String [] args){
      Robot1 r1=new Robot1("r01","罗伯特",30,2500.5);
      r1.judge();
      System.out.println(r1.output()); 
  }
}
