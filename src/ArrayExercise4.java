import java.util.Arrays;
import java.util.Collections;

public class ArrayExercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {10,20,20,40,40,10,5};
		modifyArray(array);
	}
	public static void modifyArray(int[] array) {
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]==array[j])
				{
					array[j]=array[len-1];
					len--;
					j--;
				}
			}
		}
		int[] array1=Arrays.copyOf(array, len);
		for(int i=0;i<len;i++)
		{
		System.out.print(array1[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(array1);
		System.out.println("Sorted");
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+" ");
		}
		System.out.println();

		System.out.println("Reversed");

		for(int i=array1.length-1;i>=0;i--)
		{
			System.out.print(array1[i]+" ");
		}
		
		
	}

}
