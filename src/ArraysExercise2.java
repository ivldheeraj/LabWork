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
        String[] array= {"ab","abc","xyz","nmb","eft"};
        sortStrings(array);
        
	}
	
	public static String sortStrings(String[] array)
	{
		Arrays.sort(array);
		int len=array.length;
		for(int i=0;i<array.length;i++) {
			if(len%2==0)
			{
				if(i<(len/2))
				{
					System.out.println(array[i].toLowerCase());
				}
				else {
					System.out.println(array[i].toUpperCase());
				}
			}
			else 
			{
				if(i<=((len/2)-1))
				{
					System.out.println(array[i].toLowerCase());
				}
				else 
				{
					System.out.println(array[i].toUpperCase());
				}
			}	
			//System.out.println(array[i]);
		}
	return null;	
	}

	
}
