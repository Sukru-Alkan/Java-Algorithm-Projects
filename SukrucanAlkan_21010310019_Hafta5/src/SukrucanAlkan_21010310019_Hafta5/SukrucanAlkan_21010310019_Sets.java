package SukrucanAlkan_21010310019_Hafta5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class  SukrucanAlkan_21010310019_Sets {

	public static void main(String[] args) {
		
		Set<String> sehirler = new HashSet<String>(); 
		sehirler.add("Bartin");
		sehirler.add("Ankara");
		sehirler.add("Istanbul");
		sehirler.add("kazan");
		sehirler.add("Bartin"); 
		System.out.println(sehirler.toString());
		System.out.println(sehirler.contains("Ankara"));
		System.out.println(sehirler.contains("madagaskar"));
		System.out.println(sehirler.size());
		
		
		
		Set<String> sehirler2 = new TreeSet<String>();
		sehirler2.add("Bartin");
		sehirler2.add("Zonguldak");
		
		System.out.println("Set'in eleman sayisi : "+ sehirler2.size() );
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Sivas");
		list.add("Adana");
		sehirler2.addAll(list);
		
		System.out.println("Set'in guncel eleman sayisi : "+ sehirler2.size());
		System.out.println(sehirler2.toString());
		
		for (String sehir : sehirler2) {
			System.out.println(sehir);
		}
	}

}