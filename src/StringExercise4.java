/*
 * DIfference of consective elements
 * 6/01/2021
 */
/*
public class StringExercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=64;
		String str = Integer.toString(number);
		System.out.println(modifyNumber(str));
	}
	public static int modifyNumber(String str) {
		
		int difference=0;
		for(int i=0;i<str.length()-1;i++)
		{
		  char c =str.charAt(i);
		  int num1=Character.getNumericValue(c);
		  char ch=str.charAt(i+1);
		  int num2=Character.getNumericValue(ch);
		  difference=Math.abs(num1-num2);
		}
		return difference; 
		
	}

}
*/
