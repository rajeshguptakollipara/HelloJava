package com.org.sairam.calculator;

public class UnderstandingLoopsInJava {

	public void understandForLoop() {
		for(int i=0; i<10; i++) {
			System.out.println("The current value of i is : "+i);
		}
		//for(initialization, decision, increment)
	}

	public void understandingNewForLoop() {
		String array[] = {"Deepanshu","Sai","Ram","Abhinav","Java"};
		
		System.out.println("Below output will be fetched via Older Methodology");
		for(int i=0; i<array.length; i++) {
			System.out.println("Contents of Arrays :: "+array[i]);
		}
		System.out.println("Below output will be fetched via Newer Methodology");
		
		for (String string : array) {
			System.out.println("Contents of Array :: "+string);
		}
	}
	
	public void understandingWhileLoops() {
		int count = 1;
		
		while(count <= 10) {
			System.out.println("The value of my counter is :: "+count);
			count++;
			
		}
		
	}
	
	public static void main(String[] args) {
		UnderstandingLoopsInJava loops = new UnderstandingLoopsInJava();
		//loops.understandForLoop();
		//loops.understandingNewForLoop();
		loops.understandingWhileLoops();
	}
}
