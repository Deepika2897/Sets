package com.TreeAndHash;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StudentTreeSet
{
	int sid;
	String name;
	public StudentTreeSet(int sid, String name)
	{
		super();
		this.sid=sid;
		this.name=name;
		
	}
}
class StudentIdCompare implements Comparator<StudentTreeSet>
{

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		if(o1.sid==o2.sid)
		return 0;
		else if(o1.sid>o2.sid)
			return 1;
		else
			return-1;
	}
	
}
public class TreeSetStudent {
public static void main(String[] args) {
	TreeSet<StudentTreeSet> ob=new TreeSet<StudentTreeSet>(new StudentIdCompare());
	StudentTreeSet tob1=new StudentTreeSet(2,"Deepi");
	StudentTreeSet tob2=new StudentTreeSet(4,"vijay");
	StudentTreeSet tob3=new StudentTreeSet(5,"bismi");
	ob.add(tob3);
	ob.add(tob2);
	ob.add(tob1);
	System.out.println("Sorting based on the id");
Iterator<StudentTreeSet> it1=ob.descendingIterator();
while(it1.hasNext())
{
	StudentTreeSet sob1=it1.next();
	System.out.println("sid="+sob1.sid+"name="+sob1.name);
}


}

}
