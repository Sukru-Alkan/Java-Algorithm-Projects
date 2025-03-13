package SukrucanAlkan_21010310019_Algoritma2_Hafta3;

public class Point {
	private int x;
	private int y;

	public Point() {
		
		this.x = 6;
		this.y = 7;
		
		System.out.println(this.print());
	}

	public Point(int initialX) { 
		x = initialX;

	}

	public Point(int initialX, int initialY) {
		x = initialX;
		y = initialY;
	}
	
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void set(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "p -->  x: " +x +" , y: "+y;
	}
	
	public String print() {  
		return "PRINT p -->  x: " +x +" , y: "+y;
	}
	


}
