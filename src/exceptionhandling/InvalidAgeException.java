package exceptionhandling;

public class InvalidAgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(){
		
	}

	public InvalidAgeException(String s){
		super(s);
	}

	

}