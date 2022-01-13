#include<stdio.h>
int* fun();
int main()
{
	int  *p;
	p = fun();
	printf("Value of p is = %d", *p);
	printf("\n Reteurn from fun2() = %d ",fun2()); // this will return function value
	printf("\nValue of p is = %d", *p);   // now second time this will print garbage
	return 0;
	
}
int* fun()
{
	int j = 10;          // FAR removes the link first time only
	return &j;
}

int fun2()
{
	return 1;
}
