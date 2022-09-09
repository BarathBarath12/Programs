package org.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Demo {
	public static void iterator() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(43);
		l.add(21);
		Iterator<Integer> iterator = l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
	public static void main(String[] args) {
		iterator();
	}
}
