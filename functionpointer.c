#include<stdio.h>
int (* fun_p) (int,int);
int sum(int,int);
int sub(int,int);
int main()
{
	int num1 , num2,res;
	num1 = 30;
	num2 = 20;
	fun_p = sum;
	printf("%d\n",fun_p(num1,num2));
	fun_p = sub;
	printf("%d",fun_p(num1,num2));

}

int sum (int num1,int num2)
{
 	return num1+num2;
}
int sub (int num1 , int num2)
{
	return num1-num2;
}
