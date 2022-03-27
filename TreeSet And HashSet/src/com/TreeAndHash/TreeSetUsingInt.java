//TreeSet elements are sorted
package com.TreeAndHash;

	import java.util.Iterator;
	import java.util.TreeSet;

	public class TreeSetUsingInt {

		public static void main(String[] args) {
			TreeSet<Integer> tob=new TreeSet<Integer>();
			tob.add(12);
			tob.add(34);
			tob.add(56);
			tob.add(45);
			System.out.println(tob);
			
			//Individual elements to be displayed
			//Ascending
			System.out.println("Ascending order");
			Iterator<Integer> it=tob.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			//Descending order
			System.out.println("Descending order");
			Iterator<Integer> it1=tob.descendingIterator();
			while(it1.hasNext()) {
				System.out.println(it1.next());
			}

		}

	}



