package SukrucanAlkan_21010310019_Hafta5;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SukrucanAlkan_21010310019_Maps {

	public static void main(String[] args) {
		
		
		Map<String, String> danismanlar = new HashMap<String , String>();
		danismanlar.put("Evrim G" , "Algoritma");
		System.out.println(danismanlar.size());
		System.out.println(danismanlar.toString());
		
		danismanlar.put("Furkan A", "Algoritma uygulama");
		danismanlar.put("Sukrucan Alkan", "Ogrenci");
		danismanlar.put("Evrim G", "Algoritma2");
		System.out.println(danismanlar.toString());
		
		Map<String, Set<String>> danisman2 = new TreeMap<>();
		
		danisman2.put("Evrim G", new HashSet<String>());
		danisman2.get("Evrim G").add("Algoritma");
		danisman2.get("Evrim G").add("Algoritma 2");
		
		Set<String> ogr = new HashSet<String>();
		ogr.add("deneme");
		
		danisman2.put("Furkan A", ogr);
		danisman2.get("Furkan A").add("Algoritma uygulama");
		
		System.out.println(danisman2.toString());
		
		for (String dersler : danismanlar.keySet()) {
			System.out.println(dersler);
		}
		
		for (String dersler : danismanlar.values()) { 
			System.out.println(dersler);
		}
		

		for (Set value : danisman2.values()) { 
			System.out.println(value.toString());
		}
		
	}

}