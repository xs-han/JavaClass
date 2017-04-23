// FamilyUserC.cpp : 定义控制台应用程序的入口点。
#include "stdafx.h"
#include <stdio.h>
#include <math.h>
void input(char *i,char *n,char *p);
void output();
struct FamilyUser
{
	char *u_id;
	char *u_name;
	char *u_pwd;
}fu1;

int main(void)
{
	input("01","admin","123456");
	output();
	return 0;
}
void input(char *i,char *n,char *p)
{
	fu1.u_id=i;
	fu1.u_name=n;
	fu1.u_pwd=p;
}
void output()
{
	printf("u_id=%s\t",fu1.u_id);
	printf("u_name=%s\t",fu1.u_name);
	printf("u_pwd=%s\n",fu1.u_pwd);
}