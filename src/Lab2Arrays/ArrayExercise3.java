import java.util.Arrays;

/**
Arrays Exercise 3
author : dheeraj 
Date: 5/1/2021
*/
public class ArrayExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {100,10,50,40,70};
                                  

		
		getSorted(array);
	}
	
	public static void getSorted(int array[]) {
		
	   /* System.out.println("Original Array:");

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();*/
	    System.out.println("Reversed Array:");

		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();

	    Arrays.sort(array);
	    for(int i=0;i<array.length;i++)
	    {
	    	System.out.print(array[i]+" ");
	    }
		
	}

}
