package exceptionhandling;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

import exception.InvalidNameException;

public class Validation {

	static void ValidateAge(int age) throws InvalidAgeException
	{
		
		if(age<15)
		{
			throw new InvalidAgeException("Not valid age");
		}
		else
		{
			System.out.println("Valid Age");
		}
	}
	static void ValidateName(String fname,String lname) throws InvalidNameException{
		if(fname.isEmpty() ||  lname.isEmpty())
		{
			throw new InvalidNameException ("Invalid Name");
		}
		else
		{
				System.out.println("Valid Name");
		}
	}

	static void ValidateSalary(int salary) throws EmployeeException
	{
		if(salary < 3000)
		{
			throw new EmployeeException ("Cant be less than 3000");
		}
		else
		{
			System.out.println("Valid salary");
		}
	}
	
	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub
		//String firstname,lastname; 
		//int salary;
		/*System.out.println("Enter age:");
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		
		System.out.println("Enter your firstName:");
		firstname= sc.nextLine();
		System.out.println("Enter your lastname:");
		lastname = sc.nextLine();
		sc.nextLine();
		sc.close();
		*/
		try {
			ValidateAge(50);
			ValidateName("dheeraj","ivl");
			ValidateSalary(2000);

		}
		catch(InvalidAgeException a)
		{
			System.out.println(a.getMessage());
		}
		catch(InvalidNameException n)
		{
			System.out.println(n.getMessage());

		}
		 catch(EmployeeException e)
        {
			System.out.println(e.getMessage());

        }
	    
		
		
	}

}
