//not maintains the order of insertion
//not duplicates are allowed



package com.TreeAndHash;

import java.util.HashSet;

public class HashSetMain {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(8);
		hs.add(56);
		hs.add(4);
		hs.add(4);
		System.out.println(hs);
	}

}
