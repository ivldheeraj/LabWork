package lab6;

import java.util.*;  
import java.util.Collections;

public class Exercise5{  
	public static void main(String args[]){  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int [] inputArray=new int[size];
		System.out.println("Enter the array values:");
		for(int i=0;i<size;i++) {
			inputArray[i]=sc.nextInt();
		}
		System.out.println("Entered array elements are");
		for(int num:inputArray) {
			System.out.println(num);
		}
		
	    System.out.println("Second Smallest: "+getSecondSmallest(inputArray));  
	     
	}
public static int getSecondSmallest(int[] array){  
      List list=new ArrayList();  
      for(int num:array) {
			list.add(num);
		}
      Collections.sort(list);  
      
     return (int)list.get(1);  
}  

}