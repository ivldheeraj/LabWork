package main.java.com.cg.labwork;


import java.util.Scanner;

public class MirrorImage {
    Scanner scanner = new Scanner(System.in);
	public void main(String[] args) {
	    String str=scanner.next();
	    System.out.print(getImage(str));
		}
		public String getImage(String str)
		{
			if(str.equals(""))
				return "";
			else
			{
				StringBuilder st = new StringBuilder(str);
				StringBuilder ss= new StringBuilder(str);
				StringBuilder rev=st.reverse();
				rev=ss.append("|"+st);
				return rev.toString();
			}
			
		}
}
