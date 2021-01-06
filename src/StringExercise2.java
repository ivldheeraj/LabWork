/*
 * StringExercise 2
 * 5/01/2021
 * 
 */
public class StringExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="JAVA PYTHON";
		System.out.println(getImage(str));
	}
	
	public static String getImage(String str) {
		
		StringBuffer s = new StringBuffer(str);
		s.append('|');
		StringBuffer st = new StringBuffer(str);
		st.reverse();
		s.append(st);
		return s.toString();
	}

}
