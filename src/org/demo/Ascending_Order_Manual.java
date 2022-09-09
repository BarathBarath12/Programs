package org.demo;

public class Ascending_Order_Manual {
	public static void main(String[] args) {
		int a[] = { 11, 15, 12, 14, 13 };
		int temp = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
