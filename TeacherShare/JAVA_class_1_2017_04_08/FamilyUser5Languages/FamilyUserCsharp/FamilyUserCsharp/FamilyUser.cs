// FamilyUser.cs : 定义控制台应用程序的入口点。
using System.IO;
using System;
namespace FamilyUserCsharp
{
    public class FamilyUser
    {	    
		    private string u_id;
		    private string u_name;
		    private string u_pwd;
		    public void input(string i,string n,string p)
		    {
			    u_id=i;
			    u_name=n;
			    u_pwd=p;
		    }

		    public void output()
		    {
                Console.Write("u_id=" + u_id +"\t");
                Console.Write("u_name=" +u_name + "\t");
                Console.Write("u_pwd=" + u_pwd + "\n");
		    }

            public static void  Main(string [] args)
            {
	            FamilyUser fu1=new FamilyUser();
	            fu1.input("01","admin","123456");
	            fu1.output();

                FamilyUser fu2 = new FamilyUser();
	            fu2.input("02","peter","654321");
	            fu2.output();
            }
    }
}