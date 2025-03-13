package SukrucanAlkan_21010310019_Hafta6;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class SukrucanAlkan_21010310019_Iterators2 {

	public static void main(String[] args) {
		
		Map<String, Integer> scores = new TreeMap<String , Integer>();
		scores.put("Ali", 80);
		scores.put("Veli", 50);
		scores.put("Mehmet", 90);
		scores.put("Davut", 78);
		Iterator<String> itr = scores.keySet().iterator();
		  
		
		while (itr.hasNext()) {
			String name = itr.next();
			int score = scores.get(name);
			System.out.println(name+" " +score);
			if (score<60) {
				itr.remove();
				
			}
		}

		System.out.println(scores);
		}
}