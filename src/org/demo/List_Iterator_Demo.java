package org.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator_Demo {
	public static void iterating_Next() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(43);
		l.add(21);
		ListIterator<Integer> listIterator = l.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("iterating previsious");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

	public static void main(String[] args) {
		iterating_Next();
	}

}
