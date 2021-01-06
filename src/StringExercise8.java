import java.util.Arrays;

/*
 * accepts a String and checks if it is a positive string
 */
public class StringExercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="ANT";
     if(PositiveString(str)) {
    	 System.out.println("Yes");
     }
     else
    	 System.out.println("No");     
	}
	
	public static Boolean PositiveString(String str)
	{
		int len=str.length();
		char ch[]=new char[len];
		
		for(int i=0;i<len;i++)
		{
			ch[i] = str.charAt(i);
		}
		Arrays.sort(ch);
		for(int i=0;i<len;i++)
		{
			if(ch[i]!=str.charAt(i))
				return false;
		}
		return true;
		
		
	}

}
