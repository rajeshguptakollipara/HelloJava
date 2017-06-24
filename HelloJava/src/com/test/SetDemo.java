package com.test;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("Ram");
		set.add("Ram");
		set.add("Mohan");
		set.add("Mohan");
		set.add("Raghav");

		set.add("Shyam");
		set.add("Shyam");
		set.add("Raghav");

		System.out.println(set);
		
	}
}
