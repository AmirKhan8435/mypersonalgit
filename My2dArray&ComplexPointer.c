#include<stdio.h>
int main()
{
	int arr[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
	display(arr,3,3);
	return 0;
}

 void display (int (*ptr)[3],int row,int col )      //int arr[row][][col];   int (*ptr)[3] this is called complex pointer  (pointer to array of single array)
 {
 	int i,j;
 	
 	for(i = 0;i<row;i++)
 	{
 		for(j=0;j<col;j++)
 		{
 			printf("\t %d",   * (*(ptr + i) + j));    //  ptr[i][j];      //*(*(ptr + i) + j)  for value
    	}
 	}
 }
 
 	
 	
 	
 
