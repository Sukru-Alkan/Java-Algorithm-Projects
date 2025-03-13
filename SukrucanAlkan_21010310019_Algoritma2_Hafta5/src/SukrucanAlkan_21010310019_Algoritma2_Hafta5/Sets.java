package SukrucanAlkan_21010310019_Algoritma2_Hafta5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		Set<String> sehirler = new HashSet<String>(); // Hashset Arraylistten farkı girilen değerlerin sıralaması karışık olur.
		                                              // Ve her değer sadece bir kez yazdırılır. iki tane aynı değer bir kez yazar.
		
		sehirler.add("Bartin");
		sehirler.add("Ankara");
		sehirler.add("Istanbul");
		sehirler.add("Urfa");
		sehirler.add("Bartin"); // Bartin iki tane oldu. Ama hashset tek olarak gösterecek. Hashsette tüm elemanlar eşsiz olmalı.
		
		System.out.println(sehirler.toString());
		System.out.println(sehirler.contains("Ankara"));
		System.out.println(sehirler.contains("Aydin"));
		System.out.println(sehirler.size());
		
		
		
		Set<String> sehirler2 = new TreeSet<String>(); // TreeSet Girilen elemanları sıralar. Girilen elemanlan tiplerine göre
		                                               // sıralama yapar. Örneğin stringi alfabetik sıralar. Sayıları Küçükten büyüğe
		
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