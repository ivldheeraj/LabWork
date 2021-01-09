/*
 * The Fibonacci sequence is defined by the following rule.
 The first 2 values in the sequence are 1, 1.
 Every subsequent value is the sum of the 2 values preceding it.
 Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?.

*/
import java.util.*;
public class Exercise3
{
	int nFib(int n)
	{
		int a = 0, b = 1, c=0;
		if(n == 1)
		return 0;
		else if(n == 2)
		return 1;
		else
		{
			for(int i = 2; i < n; i++)
			{
				c = a+b;
				a = b;
				b = c;
			}
			return c;
		}
	}
	int rFib(int n)
	{
		if(n == 1)
		return 0;
		else if(n == 2)
		return 1;
		else
		{
			return rFib(n-1)+rFib(n-2);
		}
	}

	public static void main(String[] args)
	{
		Exercise3 f = new Exercise3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("Element using normal method is: "+f.nFib(n));
		System.out.println("Element using recursive method is: "+f.rFib(n));
		sc.close();
	}
}