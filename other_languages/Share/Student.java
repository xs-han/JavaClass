import  java.io.*;
import  java.lang.*;

public class Student{
   private String id;
   private String name;
   private double score;

   public  void getData(String i,String n,double s){
         id=i;
         name=n;
         score=s;
   }

   public  void putData(){  
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("score="+score);
   } 
    
   public static void main(String [] args){
    Student s1=new Student();
    Student s2=new Student();
    s1.getData("01","ÕÅÈý·á",585.88);
    s2.getData("02","»ôÔª¼×",555.88);
    s1.putData();
    s2.putData();
    }
}









