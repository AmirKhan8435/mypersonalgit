#include<stdio.h>
int main()
{
	
	int i = 20;       // address of main function stack, there address of i,j have 4 bytes differnece 
	int j = 10;
	int *ptr = &j;
	printf("\n Adress of i = %d",&i);
	printf("\n Adress of j = %d",&j);
	printf("\n value of ptr = %d",ptr);
	printf("\n value at ptr  = %d",*ptr);
	ptr = ptr + 1;
	printf("\n value of ptr  = %d", ptr);
	printf("\n value at ptr  = %d",*ptr);
	return 0;
}
