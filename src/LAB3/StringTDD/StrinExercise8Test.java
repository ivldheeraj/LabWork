package com.cg.StringTDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StrinExercise8Test {

	private PositiveString positive;
	private static String EMPTY_STRING="";
	private static String NEGATIVE_STRING="DCBA";
	private static String POSITIVE_STRING="ABCD";
	
	@Before
	public void setup()
	{
		positive = new PositiveString(); 
	}

	@Test
	public void get_StringAsEmpty_AndreturnnullAsString() {
	  String result=positive.getPositiveString(EMPTY_STRING);
	  assertEquals(null,result);
		
	}
	
	
	@Test
	public void GivenString_ShouldReturnNegativeString() {
		String negative_result="Negative String";
		String result2=positive.checkForString(NEGATIVE_STRING);
		assertEquals(negative_result,result2);
	}
	@Test
	public void GivenString_ShouldReturnPositiveString() {
		String positive_result="positive string";
		String result3=positive.checkForString(POSITIVE_STRING);
		assertEquals(positive_result,result3);
	}
	
	
}
