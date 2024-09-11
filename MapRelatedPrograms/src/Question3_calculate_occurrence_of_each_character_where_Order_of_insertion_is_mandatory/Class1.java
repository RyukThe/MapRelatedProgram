package Question3_calculate_occurrence_of_each_character_where_Order_of_insertion_is_mandatory;

import java.util.LinkedHashMap;
import java.util.Set;

public class Class1 {

	public static void main(String[] args) {
		
		String s="sauravkasture";
		LinkedHashMap<Character, Integer>map=new  LinkedHashMap<>();
		//in LinkedHashMap data/key is stored ordered manner/ order of insertion is maintained 
		for(int i=0;i<=s.length()-1;i++)
		{
			char  ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		
		
		Set<Character> allKeys = map.keySet();
		
		for(Character key:allKeys)
		{
			System.out.print(key+"-"+map.get(key)+" | ");
		
		}
	}
}
