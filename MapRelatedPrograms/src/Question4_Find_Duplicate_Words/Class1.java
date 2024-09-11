package Question4_Find_Duplicate_Words;

import java.util.HashMap;
import java.util.Set;

public class Class1 {
public static void main(String[] args)
{
	String s="My Name is Saurav and and iam am form karanja karanja .";
	
	String [] ar=s.split(" ");
	
	HashMap<String, Integer> map=new HashMap<>();
	for(int i=0;i<ar.length-1;i++)
	{
		String str=ar[i];
		
		if(map.containsKey(str))
		{
			map.put(str, map.get(str)+1);
		}else
		{
			map.put(str, 1);
		}
	}
	
	
	Set<String> allkeys = map.keySet();
	
	for(String key:allkeys)
	{
		if(map.get(key)>1)
		{
			System.out.println(key+"-"+map.get(key));
		}
	}
}
}
