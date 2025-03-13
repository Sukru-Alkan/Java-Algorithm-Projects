package SukrucanAlkan_21010310019_Hafta6;
import java.util.ArrayList;
import java.util.Iterator;

public class SukrucanAlkan_21010310019_Iterators {


	public static void main(String[] args) {
	
		ArrayList<String> isimler = new ArrayList<>();
		isimler.add("Ali");
		isimler.add("Veli");
		isimler.add("Zeynep");
		isimler.add("Muhbet");
		System.out.println(isimler.toString());
		
		
		Iterator<String> iterator = isimler.iterator();
		
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
			if (string.equals("Veli")) {
				iterator.remove();
			}
		}
		System.out.println("Koleksiyondan 'veli ' elemanı kaldırıldı:");
		
		System.out.println("Koleksiyonun güncel hali:");
		
		for (String string : isimler) {
			System.out.println(string);
		}
		
		

	}

}
