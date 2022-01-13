#include<stdio.h>
int main()
{
	int arr[50][50];
	int i,j,n;
	printf("Enter number of rows : ");
	scanf("%d",&n);
	for(i = 0 ; i <=n ; i++)  
	{
		for(j = 0; j<=i;j++)    
		{
			if((j==0) || (i==j))
				arr[i][j] = 1;
			else
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];	
		}
	
	}
	
	print_arr(arr,n);
	return 0;
	
}

void print_arr(int arr[50][50],int n)
{
	int i,j;
	for(i = 0; i <=n;i++)
	{
		for(j = 0;j<=i;j++)
		{
			printf("%5d",arr[i][j]);
		}
		printf("\n");
	}
}
