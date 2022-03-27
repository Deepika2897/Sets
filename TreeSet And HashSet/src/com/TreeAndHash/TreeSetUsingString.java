package com.TreeAndHash;
//TreeSet class elements are sorted


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUsingString {

	public static void main(String[] args) {
		TreeSet<String> tob=new TreeSet<String>();
		tob.add("DEEPI");
		tob.add("VIJAY");
		tob.add("BISMI");
		tob.add("KAVI");
		System.out.println(tob);
		
		//Individual elements to be displayed
		//Ascending
		System.out.println("Ascending order");
		Iterator<String> it=tob.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Descending order
		System.out.println("Descending order");
		Iterator<String> it1=tob.descendingIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}


