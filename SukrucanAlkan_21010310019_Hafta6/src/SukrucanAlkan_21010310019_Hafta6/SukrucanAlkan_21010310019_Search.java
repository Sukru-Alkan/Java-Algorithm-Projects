package SukrucanAlkan_21010310019_Hafta6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SukrucanAlkan_21010310019_Search {


	public static void main(String[] args) {
		
		UseBinarySearch();
		UseBinarySearch2();

		int[] array = {-3, 2, 8, 12, 17, 29, 44, 58, 79, 80, 25, 21, 13};
		
		System.out.println(binarySearch(array, 29));
		
	}
	
	public static void UseBinarySearch() {
		int array[] = {-3, 2, 8, 12, 17, 29, 44, 58, 79};
		int target = Arrays.binarySearch(array, 29);
		System.out.println( target);
	}
	
	public static void UseBinarySearch2() {
		int array[] = {-3, 2, 8, 12, 17, 29, 44, 58, 79};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int integer : array) {
			list.add(integer);
		}
		int target = Collections.binarySearch(list, 29);
		System.out.println( target);
		
	}
	
	public static int binarySearch(int[] numbers , int target) {
		
		int min = 0;
		int max = numbers.length-1;
		
		
		while (min <= max){
			int mid = (max + min) / 2;
			if (numbers[mid] == target) {
				return mid;
			}
			else if(numbers[mid] < target){
				min = mid + 1; 
			}
			else {//mid < target
				max = mid - 1;
			}
		}
		
		
		return -1;
		
	}
}