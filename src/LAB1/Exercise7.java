/**
Exercise 7
author : dheeraj 
Date: 5/1/2021
*/
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int number=12345;
       boolean flag=checkNumber(number);
      
       if(flag) {
    	   System.out.println(number+" is not  an increasing number");
       }
       else
       {
    	   System.out.println(number+" is an increasing number");

       }
	}

	private static boolean checkNumber(int number)
	{
		boolean flag=false;
		int currentdigit= number%10;
		number=number/10;
		while(number>0)
		{
			if(currentdigit<= number%10)
			{
				flag=true;
				break;	
			}
			currentdigit = number%10;
			number=number/10;
		}
		return flag;
	}
}
