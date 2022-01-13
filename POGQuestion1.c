/* Write a function that return as product Array containing product (Multiplication of integers) in the 
given array  (passed as a parameter) excluding the integer as index */ 

#include<stdio.h>
void product_fun(int [],int []);
int main()
{
	int arr[] = {2,5,7};
	int tar[3];
	int i,prod;
	product_fun(arr,tar);
	for(i =0; i< 3;i++)
	{
		printf(" %d ", tar[i]);
	}
	
}

void product_fun(int arr[],int tar[])
{
	int i,j,prod;
	for(i = 0; i<3;i++)
	{
		prod = 1;
		for(j = 0;j<3;j++)
		{
			if(i!=j)
			{
				prod = prod * arr[j];	
			}
			tar[i] = prod;
		}
		
	}
}
