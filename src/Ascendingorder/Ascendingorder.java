package Ascendingorder;

import java.util.*;	

public class Ascendingorder {
	
	public static void main(String[] args) {
			
		ArrayList<Integer> counts=new ArrayList<Integer>();  
		counts.add(5);
		counts.add(4);
		counts.add(7);
		counts.add(3);
		counts.add(1);
		 System.out.println("Before sorting");
		 System.out.println(counts);  
			 
		 printSortedNumbers(counts);
		}
		
		public static void printSortedNumbers(List<Integer> arraylist)
		   {
			for (int i = 0; i < arraylist.size(); i++) {
	            for (int j = arraylist.size() - 1; j > i; j--) {
	                if ((int) arraylist.get(i) > (int) arraylist.get(j)) {
	                    int temp = (int) arraylist.get(i);
	                    arraylist.set(i, arraylist.get(j));
	                    arraylist.set(j, temp);
	                }
	            }
	        }
	        System.out.println("After sorting ");
	        System.out.println(arraylist);
		   }
}

	
