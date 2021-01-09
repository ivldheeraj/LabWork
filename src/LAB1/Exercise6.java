/**
Exercise 6
author : dheeraj 
Date: 5/1/2021
*/
import java.lang.Math;
public class Exercise6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      int n=3;
      int result = calculateDifference(n);
      System.out.println(result);  
	}
	
private static int calculateDifference(int n) 
{
	int diff,sum=0,sum1=0;
	//double power=2;
	for(int i=1;i<=n;i++)
	{
		
		sum+=(i * i);
		sum1=sum1+i;
	}
	//double total=Math.pow(sum1,power);
	diff=Math.abs(sum-sum1*sum1);
	return diff;
	
			
}
}

