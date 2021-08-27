package javaassignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSorting {

	public static void main(String[] args) {
		//sort in reverse order using for loop and than printing in ascending order
		
//		int arr[] =new int[] {5,2,8,7,1};
//		int temp = 0;
//		System.out.println("Element sof original array");
//		
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+"");
//		}
//		
//		for (int j=0;j<arr.length;j++) {
//			for (int k = j+1;k<arr.length;k++) {
//				if (arr[j]<arr[k]) {
//					temp = arr[j];
//					arr[j] = arr[k];
//					arr[k] = temp;
//					
//			}
//			}
//}
//System.out.println();		
//System.out.println("");
			ArrayList<Integer> numList = new ArrayList<Integer>();
			numList.add(12);
			numList.add(15);
			numList.add(1);
			numList.add(22);
			numList.add(5);
			
			Collections.sort(numList, Collections.reverseOrder());
			
			System.out.println("---");
			System.out.println(numList);
			
	}
}
