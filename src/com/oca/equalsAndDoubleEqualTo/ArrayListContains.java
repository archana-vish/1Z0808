package com.oca.equalsAndDoubleEqualTo;
import java.util.List;
import java.util.ArrayList;

public class ArrayListContains {
	
	public static void main(String...strings ) {
		List<String> alList = new ArrayList<String>();
		alList.add("One");
		alList.add("Two");
		System.out.println(alList.contains("Two"));
		System.out.println(alList.contains(new String("Two")));
		
		List<StringBuilder> alSList = new ArrayList<>();
		alSList.add(new StringBuilder("One"));
		alSList.add(new StringBuilder("Two"));
		System.out.println(alSList.contains(new StringBuilder("Two")));
		
		StringBuilder s1 = new StringBuilder("S1");
		StringBuilder s2 = new StringBuilder("S1");
		System.out.println(s1.equals(s2));
	}

}
