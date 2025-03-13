package SukrucanAlkan_21010310019_Algoritma2_Hafta5;


import java.util.HashSet;
import java.util.Set;

public class PointMain {

	public static void main(String[] args) {
		
		Point p1 = new Point(3, 4);
		
		Set<Point> points = new HashSet<Point>();
		
		points.add(p1);
		points.add(new Point(10, 20));
		points.add(new Point(5, 6));
	
		System.out.println(points.size());
		
		for (Point p : points) {
			System.out.println(p.getX()+" "+p.getY());
		}

	}

}