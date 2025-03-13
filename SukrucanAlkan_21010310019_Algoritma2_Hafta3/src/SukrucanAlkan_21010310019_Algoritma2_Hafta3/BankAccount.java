package SukrucanAlkan_21010310019_Algoritma2_Hafta3;

public class BankAccount {
	private static int objectCount = 0;
	private String name;
	private int id;
	
	
	public BankAccount() {
		objectCount++;
		id = objectCount;
	}
	
	public BankAccount(String name) {
		this();
		this.setName(name);
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "id : "+id+" name : "+name;
	}
	
	public int numberOfObjectCount() {
		return objectCount;
	}
	
	public static int numberOfObjectCountStatic() {
		return objectCount;
	}
}
