/**
Exercise 8
author : dheeraj 
Date: 5/1/2021
*/
public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num = 10;
    boolean result = checkNumber(num);
    if(result) {
    	System.out.println(num+" is not  power of 2");
    }
    else
    	System.out.println(num+" is power of 2");

    
	}
	
	private static boolean checkNumber(int num)
	{
		boolean result=false;
		if(num>0)
		{
			while(num%2==0)
			{
				num=num/2;
			}
			if(num==1)
			{
				result=true;
			}
		}
		if(num==0||num!=1) {
			result=false;
		}
		return result;
	}

}
