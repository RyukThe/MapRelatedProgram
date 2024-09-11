package Question5_Find_non_reparative_character_for_give_string_;

import java.util.LinkedHashMap;
import java.util.Set;

public class Class1 {

	public static void main(String[] args) {
		
		String s="aaabcccdeeefggg";
		LinkedHashMap<Character, Integer> mp= new LinkedHashMap<Character, Integer>();
		
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(mp.containsKey(ch))
			{
				mp.put(ch, mp.get(ch)+1);
			}
			else
			{
				mp.put(ch,1);
				
			}
		
			
			
		
		}
		
		
		Set<Character>allkeys=mp.keySet();
		
		for(Character key:allkeys)
		{
			if(mp.get(key)==1)
			{
				System.out.println(key+"-"+mp.get(key));
				break;
			}
		}
	}
}
