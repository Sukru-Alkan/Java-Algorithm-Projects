package ŞükrücanAlkan_21010310019_Hafta14;

public class LinkedIntList {
	private ListNode front;
	public LinkedIntList () {
	front = null;
	}
	public void add (int value) {
	if (front == null){
	front = new ListNode (value) ;
	} else {
	ListNode current = front;
	while (current.next != null) {
	current = current.next;
	}
	current.next = new ListNode (value) ;
	}
	}
	public String toString() {
		if (front == null) {
			return " []";
		}else {
			
		
	
	String result = "[" + front.data;
	ListNode current = front.next;
	while (current != null) {
		
	}
	result+="]"	;
	return result;
}
	}
}
