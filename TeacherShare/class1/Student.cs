
using  System.IO;
using  System;

namespace c208
{
 public class Student
{
   private string id;
   private string name;
   private double score;

   public  void getData(string i,string n,double s)
  {
         id=i;
         name=n;
         score=s;
   }

   public  void putData()
  {  
        Console.WriteLine("id="+id);
        Console.WriteLine("name="+name);
        Console.WriteLine("score="+score);
   } 
    
   public static void Main(string [] args)
  {
    Student s1=new Student();
    Student s2=new Student();
    s1.getData("01","ÕÅÈý·á",585.88);
    s2.getData("02","»ôÔª¼×",555.88);
    s1.putData();
    s2.putData();
    }
}

}








