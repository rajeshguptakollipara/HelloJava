package com.org.sairam.calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnderstandingCollections {

	//Collections in Java
	//List - ArrayList
	//Set - HashSet
	//Difference Between List and Set is: List take duplicates while Set doesn't
	//Map - HashMap
	
	public void understandingList() {
		List<String> fruitList = new ArrayList<String>();
		fruitList.add("Apples");
		fruitList.add("Oranges");
		fruitList.add("Bananas");
		fruitList.add("Kiwis");
		
		System.out.println("My Fruit List :: "+fruitList);
		
		fruitList.add("Coconuts");
		fruitList.add("Pineapples");

		System.out.println("My Fruit List :: "+fruitList);
		System.out.println("Fetching the individual Elements of the List with the new For Loop");
		for (String fruit : fruitList) {
			System.out.println("జాబితాలోని వ్యక్తిగత అంశాలు:"+fruit);
		}
		System.out.println("*******************************************");
		
		System.out.println("Fethcing the Individual elements of the List via Iterator");
		
		Iterator<String> itr = fruitList.iterator();
		while(itr.hasNext()) {
			System.out.println(" Next Iterator Values :: "+itr.next());
		}
	}
		
	public void understandSet() {
		Set<String> fruitSet = new HashSet<String>();
		fruitSet.add("Apples");
		fruitSet.add("Oranges");
		fruitSet.add("Bananas");
		fruitSet.add("Kiwis");
		
		System.out.println("My fruit Set are : "+fruitSet);
		System.out.println("Adding more Oranges in my previous set/.....");
		fruitSet.add("Mangoes");

		System.out.println("My fruit Set are : "+fruitSet);
		
	}

	public void understandMaps() {
		Map<String, String> employeeMap = new HashMap<String, String>();
		employeeMap.put("101", "Deepanshu");
		employeeMap.put("102", "Abhinav");
		employeeMap.put("103", "Sai Ram");
		
		System.out.println("My Current Map Details are :: "+employeeMap);
		
		System.out.println("All the Keys in my Current Map is : "+employeeMap.keySet());
		
		for (String key : employeeMap.keySet()) {
			System.out.println("Getting the value of Key Named : "+key+" is : "+employeeMap.get(key));
		}
	}
	
	public static void main(String[] args) {
		UnderstandingCollections understandingCollections = new UnderstandingCollections();
		//understandingCollections.understandingList();
		//understandingCollections.understandSet();
		understandingCollections.understandMaps();
	}
}
