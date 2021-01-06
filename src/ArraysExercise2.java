/**
Arrays Exercise 2
author : dheeraj 
Date: 5/1/2021
*/
import java.util.Arrays;
public class ArraysExercise2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        String[] array= {"ab","abc","xyz","nmb","opi"};
        sortStrings(array);
        
	}
	
	public static String sortStrings(String[] array)
	{
		Arrays.sort(array);
		String arraySort=Arrays.toString(array);
		System.out.println(arraySort);
		String[] arraySplit= arraySort.split(",");
		
		for(String q:arraySplit)
		{
		System.out.println(q);
		}
	return arraySort;	
	}

	
}
