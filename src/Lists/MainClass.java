package Lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		List<String> mylist = new ArrayList<>();
		mylist.add("ab");
		
		for (String o : mylist) {
			System.out.println(o);
		}
		
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new TreeSet<>();
		
		set1.add("abc");
		set1.add("asdc");
		set1.add("aed");

		set2.add("abc");
		set2.add("asdc");
		set2.add("aed");
		
		for (String s : set1) {
			System.out.println(s);
		
		}
		for (String s : set2) {
			System.out.println(s);
		}
	}

}
