#include<stdio.h>
#include<stdlib.h>
int main()
{

	int i;
	int **ptr;
	ptr = (int**) malloc(sizeof(int*) * 5);    //  this is for creating dyanimic 2d array      
	for(i=0;i<5;i++)
	{
		ptr[i] = (int* ) malloc(sizeof(int) * 3);         // Creating array of integer of address [0] [1] [2] [3] [4]
	}

	
	for(i = 0;i<5;i++)					// address are completely different as it is created on heap
	{
		printf("\n%d", ptr[i]);
	}
	

	return 0;
	 
}

