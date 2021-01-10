package com.cg.StringTDD;

import java.util.Arrays;

public class PositiveString {
	
	public String getPositiveString(String str) {
		
		return null;
   }

	public String checkForBlankSpace(String input) {
		// TODO Auto-generated method stub
		int count=0;
		String output="";
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				output+="Exception";
				break;
	}
			else {
	          count++;			
	}
			if(count==input.length())
				output+="No Exception Caught";
	}
		   return output;
	}

	public String checkForString(String input) {
		// TODO Auto-generated method stub
		String output="";
		String op="";
		char ch[]=input.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++) {
			output+=ch[i];
		}
		if(input.equals(output)) {
			op+="positive string";
		}
		else {
			op+="Negative String";
		}
		return op;
	}
}
