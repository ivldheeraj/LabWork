package exceptionhandling;

public class InvalidNameException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5847523046276163583L;
	public InvalidNameException(){
		
	}
    
	public InvalidNameException(String s){
		super(s);
	}
}

