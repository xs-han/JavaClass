#include "iostream.h"
#include "math.h"

class Student
{
   private:
     char *id;
     char *name;
     double score;
 
    public:
      void getdata(char *i,char *n,double s);
      void putdata();
};

void main()
{
    Student s1;//给类Student新建一个对象s1;为s1分配内存;调用默认构造函数为s1初始化
    Student s2;
    s1.getdata("01","张三丰",585.88);
    s2.getdata("02","霍元甲",555.88);
    s1.putdata();
    s2.putdata();
}

      void Student::getdata(char *i,char *n,double s)
      {
         id=i;
         name=n;
         score=s;
      }

     void Student::putdata()
     {  
        cout << "id="  << id  << "\n";
        cout << "name="  << name  << endl;        
        cout << "score="  << score  << "\n";
      } 



