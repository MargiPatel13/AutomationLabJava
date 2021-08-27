package javasessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//stores with key-value pair
		HashMap<String,String> mp = new HashMap<String,String>();
		mp.put("rajan", "WebDev");
		mp.put("niki", "QA");
		mp.put("binal", "iOSDev");
		mp.put("chetan", "AndroidDev");
		System.out.println(mp.get("niki"));
		
		mp.put(null, "QA1");//0
		mp.put("niki", "SDET4");
		mp.put(null, "QA2");//0
		System.out.println("--------");
				
		System.out.println(mp.get("niki"));
 
		System.out.println("--------");

		System.out.println(mp.get(null));
		
		System.out.println("--------");

		//print all the values from hashap:
		System.out.println(mp);

		System.out.println("--------");

		for(Map.Entry element : mp.entrySet()) {
			System.out.println(element.getKey() + ":" + element.getValue());
		}
		System.out.println("--------");

		//jdk1.8: can use lambda:
		mp.forEach((k,v) -> System.out.println(k+":"+v));
		
		HashMap<Integer, String> numMap = new HashMap<Integer, String>();
		numMap.put(1, "Axc");
		numMap.put(2, "Bdf");
		numMap.put(3, "wer");
		numMap.put(5, "eas");
		System.out.println("--------");

		System.out.println(numMap);
		
		System.out.println("---------");

		System.out.println(numMap.entrySet());
		
		System.out.println("--------");

		for(Map.Entry e : numMap.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		System.out.println("--------");
		numMap.forEach((a, b) -> System.out.println(a+"="+b));
		
		

	}

}
