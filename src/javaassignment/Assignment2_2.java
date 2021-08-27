package javaassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment2_2 {

	public static void main(String[] args) {		
		
//1. Write a Java program to create a new array list, add some colors (string) and print out the collection
	
		ArrayList<String> colors= new ArrayList<String>();
		colors.add("Red");
		colors.add("Gray");
		colors.add("Blue");
		colors.add("black");
		System.out.println(colors);
		
		System.out.println("------------------");
//2. Write a Java program to insert an element into the array list at the first and last positions.
		
		ArrayList<Object> element= new ArrayList<Object>();
		element.add("Java");
		element.add(1);
		element.add("python");
		element.add(2);
		System.out.println(element);
		
		element.add(0, "Automation");
		element.add(4, 5);
		System.out.println(element);
		
		System.out.println("------------------");
//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		System.out.println("Retrieve 4th element: "+list.get(3));
		
		System.out.println("-------------------");
//4. Write a Java program to update specific array element by given element.
		ArrayList<String> Alist = new ArrayList<String>();
		Alist.add("Ahmedabad");
		Alist.add("Baroda");
		Alist.add("Chennai");
		Alist.add("Delhi");
		System.out.println(Alist);
		
		Alist.set(1,"Brampton");
		System.out.println(Alist);
		
		System.out.println("-------------------");
//5. Write a Java program to remove the third element from a array list. 
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(60);
		alist.add(70);
		alist.add(80);
		alist.add(90);
		alist.add(100);
		System.out.println(alist);
		
		alist.remove(2);
		System.out.println(alist);
		
		System.out.println("-------------------");
//6. Write a Java program to search an element in a array list.
		System.out.println(alist);
		if(alist.contains(100)) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element Not Present");
		}
		
		System.out.println("-------------------");
//7. Write a Java program to reverse elements in a array list
		
		System.out.println(Alist);
		Collections.reverse(Alist);
		System.out.println(Alist);
		
		System.out.println("-------------------");
//8. Write a Java program to extract a portion of a array list.
		
		ArrayList<String> language= new ArrayList<String>();
		language.add("English");
		language.add("French");
		language.add("Hindi");
		language.add("Gujarati");
		language.add("Marathi");

		System.out.println(language);
		
		List<String> LangList=	language.subList(1, 3);
		System.out.println(LangList);
	
		System.out.println("-------------------");	
//9. Write a Java program of swap two elements in an array list.
		System.out.println(language);
		Collections.swap(language, 0, 3);

		System.out.println(language);
	
		System.out.println("-------------------");
//10. Write a Java program to empty an array list.

		ArrayList<Object> alldatalist= new ArrayList<Object>();
		alldatalist.add(10.2);
		alldatalist.add(555);
		alldatalist.add('A');
		alldatalist.add("Data");
		System.out.println(alldatalist);
		
		alldatalist.removeAll(alldatalist);
		System.out.println(alldatalist);
		
		System.out.println("-------------------");
//11. Write a Java program to trim the virtual capacity of an array list the current list size.
		ArrayList<Character> CharList= new ArrayList<Character>();
		CharList.add('M');
		CharList.add('A');
		CharList.add('R');
		CharList.add('G');
		CharList.add('I');
		System.out.println(CharList);
		
		CharList.trimToSize();
		System.out.println(CharList);

		System.out.println("-------------------");
//12. Write a Java program to print all the elements of a ArrayList using the position of the elements
		
		ArrayList<Double> doubleList= new ArrayList<Double>();
		doubleList.add(10.11);
		doubleList.add(20.21);
		doubleList.add(30.31);
		doubleList.add(40.41);
		System.out.println(doubleList);
		
		System.out.println(doubleList.get(0));
		System.out.println(doubleList.get(1));
		System.out.println(doubleList.get(2));
		System.out.println(doubleList.get(3));
	}
}
