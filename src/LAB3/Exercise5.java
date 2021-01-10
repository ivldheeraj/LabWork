/**
 * Write a Java program that displays the number of characters,
 * lines and words in a text?
 * @author Dheeraj
 *
 */


public class Exercise5{

public static void main(String[] args) {
   
String str="Hello how are you? \nI am fine.  ";
String  words[] = str.split("[ ,.]");
String  lines[] = str.split("[\n]");

System.out.println("No of characters = "+str.length());
System.out.println("No of lines = "+lines.length);
System.out.println("No of words = "+words.length);
}

}
