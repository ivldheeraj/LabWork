package exceptionhandling;
	
	public class EmployeeException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public EmployeeException() {
			
		}
		
	    public EmployeeException(String s) {
			super(s);
		}
	}

