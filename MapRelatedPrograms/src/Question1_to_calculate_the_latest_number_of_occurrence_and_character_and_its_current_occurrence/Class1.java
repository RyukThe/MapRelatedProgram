package Question1_to_calculate_the_latest_number_of_occurrence_and_character_and_its_current_occurrence;

import java.util.HashMap;

public class Class1 {

	
	public static void main(String[] args) {
		
		
		String inp="abacbba";
		String out="";
		
		HashMap<Character, Integer>map= new HashMap<>();
		
		for(int i=0;i<=inp.length()-1;i++)
		{
			char ch = inp.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			out=out+ch+map.get(ch);
		}
		
		
		System.out.println(out);
	}
}
