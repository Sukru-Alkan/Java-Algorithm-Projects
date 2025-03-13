package SukrucanAlkan_21010310019_Algoritma2_Hafta3;

public class SukrucanAlkan_21010310019_Algoritma2_Hafta3_Ornek1 {

public static void main(String[] args) {
	
	Point p1 = new Point(3 , 5);
	
	System.out.println("p1 --> "+p1.getX() + " " + p1.getY());
	
	Point p2 = new Point();
	
	System.out.println("p2 --> "+p2.getX() + " " + p2.getY());
	
	System.out.println(p2.toString());
	
	System.out.println(p2.print());
	
	System.out.println(p2);
	
	Point p3 = new Point(7); 
	
	System.out.println(topla(5, 6));
	
}

public static int topla(int sayi1 , int sayi2) {
	return sayi1 + sayi2;
}

}
