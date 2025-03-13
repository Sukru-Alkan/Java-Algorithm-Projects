package SukrucanAlkan_21010310019_Algoritma2_Hafta3;

public class SukrucanAlkan_21010310019_Algoritma2_Hafta3_Ornek2 {
public static void main(String[] args) {
		
		
		BankAccount b1 = new BankAccount();
		
		System.out.println(b1);
		
		BankAccount b2 = new BankAccount("Mehmet");
		
		System.out.println(b2);
		
		b2.setName("Ali"); 
		System.out.println(b2);
		
		System.out.println(b2.numberOfObjectCount());
		
		System.out.println(b2.numberOfObjectCountStatic());
		
		System.out.println(BankAccount.numberOfObjectCountStatic());

	}


}
