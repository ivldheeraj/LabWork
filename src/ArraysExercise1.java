/**
Arrays Exercise 1
author : dheeraj 
Date: 5/1/2021
*/
public class ArraysExercise1 {

	public static void main(String args[]) {
		int a[]= {9,0,7,3,5,6};
		System.out.println("Second smallest element in array:"+getSecondSmallest(a));
		
	}
	public static int getSecondSmallest(int a[]) {
		int temp;
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}
	
}
