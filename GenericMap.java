
import java.io.*; 
import java.util.*; 

class GenericMap { 

	public static void main(String[] args) 
	{ 
		
		String arr[] 
			= { "gfg", "code", "quiz", "program", 
				"code", "website", "quiz", "gfg", 
				"java", "gfg",	 "program" }; 

		Map<String, Integer> map = new HashMap<>(); 
		for (int i = 0; i < arr.length; i++) { 
			if (map.containsKey(arr[i])) { 
				int count = map.get(arr[i]); 
				map.put(arr[i], count + 1); 
			} 
			else { 
				map.put(arr[i], 1); 
			} 
		} 

		// to get and print the count of the mentioned 
		// string 
		System.out.println(map.get("gfg")); 
		System.out.println(map.get("code")); 
	} 
}

