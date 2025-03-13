package SukrucanAlkan_21010310019_Hafta6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SukrucanAlkan_21010310019_Courses {
public static void main (String[]args) throws FileNotFoundException{
Scanner input = new Scanner(new File ("Course.txt"));

Set<String> dersler =new TreeSet<String>();
dersler= read(input);
for (String ders :dersler) {
	System.out.println(ders);
	
}
System.out.println(dersler.size());

}
public static Set <String> read(Scanner in){
	Set<String> dersler = new TreeSet<String>();
	
	while (in.hasNext()) {
		dersler.add(in.nextLine());
		
	}
	return dersler;
	
}
}
