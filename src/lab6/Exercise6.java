package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;


public class Exercise6 {
	
	public static List<Integer> voterList(Map<Integer,Integer> map)
	{
		
		List<Integer> list = new ArrayList<>();
		for(Map.Entry<Integer, Integer> m : map.entrySet())
		{
			int age = m.getValue();
			if(age > 18) {
				list.add(m.getKey());
			}
		}
		return list;
	}
	
	public static void main(String[] args)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int age = 0, keys = 1;
	
		String ch;
		do
		{			
			System.out.print("Enter age:");
			age = sc.nextInt();
			map.put(keys, age);
			keys++;
			System.out.print("More(y/n)??");
			 ch = sc.next();
		}while(ch.equalsIgnoreCase("y"));
		
		List<Integer> list = new ArrayList<>();
		
		list = voterList(map);
		
		System.out.println("\nEligible Voter IDs :");
		for(int id : list)
		{
			System.out.println(id);
		}
	}
	
	

}
