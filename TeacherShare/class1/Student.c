#include <stdio.h>
#include <math.h>

void getdata1(char *i,char *n,double s);
void getdata2(char *i,char *n,double s);
void putdata();

struct Student
{
   char *id;
   char *name;
   double score;
};

struct Student s1;
struct Student s2;

int main(void)
{
    getdata1("01","ÕÅÈı·á",585.88);
    getdata2("02","»ôÔª¼×",555.88);
    putdata();
    return 0;
}

void getdata1(char *i,char *n,double s)
{
  s1.id=i;
  s1.name=n;
  s1.score=s;
}
void getdata2(char *i,char *n,double s)
{
  s2.id=i;
  s2.name=n;
  s2.score=s;
}
void putdata()
{
   printf("s1.id=%s",s1.id);
   printf("s1.name=%s",s1.name);
   printf("s1.score=%lf",s1.score);
   printf("s2.id=%s",s2.id);
   printf("s2.name=%s",s2.name);
   printf("s2.score=%lf",s2.score);
}