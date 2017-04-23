// FamilyUserCplusplus.cpp : 定义控制台应用程序的入口点。

#include "stdafx.h"
#include "iostream"
#include "math.h"
using namespace std;

class FamilyUser
{
	private:
		char *u_id;
		char *u_name;
		char *u_pwd;
	public:
		void input(char *i,char *n,char *p)
		{
			u_id=i;
			u_name=n;
			u_pwd=p;
		}
		void output()
		{
			cout << "u_id=" << u_id << "\t";
			cout << "u_name=" << u_name << "\t";
			cout << "u_pwd=" << u_pwd << "\n";
		}
};
int main(void)
{
	FamilyUser fu1,fu2;
	fu1.input("01","admin","123456");
	fu1.output();
	fu2.input("02","peter","654321");
	fu2.output();
	return 0;
}
