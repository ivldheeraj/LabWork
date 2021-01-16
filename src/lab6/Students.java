/*
 * 
 */
package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Students {

	public HashMap<String,String> getStudent(HashMap<String,Integer> student)
	{
		HashMap<String,String> medal = new HashMap<>();
		Set<String> set =student.keySet();
		
	    for(String s:set)
        {
               Integer marks = student.get(s);
               if(marks>=90)
               {
                     medal.put(s,"Gold");
               }
               else if(marks >=80)
               {
                     medal.put(s,"Silver");
               }
               else if(marks>=70)
               {
                     medal.put(s,"Bronze");
               }
        }
        return medal;
			
	}
	
	public static void main(String[] ar)
    {
           HashMap<String,Integer> stu = new HashMap<>();
           Students p = new Students();
           
           Scanner in = new Scanner(System.in);
           System.out.println("Enter number of students:");
           int n= in.nextInt();
           
           for (int i = 0; i < n; i++) {
         	  System.out.println("Enter the student registration number");
               String a = in.next();
               System.out.println("Enter marks of student");
               Integer b = in.nextInt();
               stu.put(a, b);
           }
           
           for(Map.Entry<String, Integer> pair: stu.entrySet()) {
         	  System.out.println(pair.getKey() + "->" + pair.getValue());
         	}
              

           System.out.println(p.getStudent(stu));

           
           }
    }


