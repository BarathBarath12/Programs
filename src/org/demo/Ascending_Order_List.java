package org.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ascending_Order_List {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(2);
	list.add(1);
	list.add(8);
	list.add(4);
	list.add(9);
	Collections.sort(list);
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
}
}
