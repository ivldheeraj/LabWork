/**
Exercise 5
author : dheeraj 
Date: 5/1/2021
*/
public class Exercise5 {
	public static void main(String args[])
	{
		int N=10;
		int result=calculateSum(N);
		System.out.println(result);
		
	}
	private static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
