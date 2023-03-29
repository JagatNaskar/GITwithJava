package Collection2Week6;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {

	static void count(String str){
	      HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	      char[] arr = str.toCharArray();
	      for (char c : arr){
	         if (map.containsKey(c)){
	            map.put(c, map.get(c) + 1);
	         }else{
	            map.put(c, 1);
	         }
	      }
	      System.out.println("Character    Frequency");
	      System.out.println("---------    ---------");
	      for (Map.Entry entry : map.entrySet()){
	    	  
	         System.out.println("   "+entry.getKey() + "  ---------> " + entry.getValue());
	      } 
	      
	}
	public static void main(String[] args) {
		count("fsdjflk234j435kdjhs");
	}

}
