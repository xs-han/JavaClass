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
    Student s1;//����Student�½�һ������s1;Ϊs1�����ڴ�;����Ĭ�Ϲ��캯��Ϊs1��ʼ��
    Student s2;
    s1.getdata("01","������",585.88);
    s2.getdata("02","��Ԫ��",555.88);
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



