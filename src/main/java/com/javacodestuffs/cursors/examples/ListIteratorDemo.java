package com.javacodestuffs.cursors.examples;

import java.util.*;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Bala");
		l.add("John");
		l.add("Ketty");
		l.add("Amenda");
		System.out.println(l);// [Bala, Amol, Chandu, Datta]
		ListIterator<String> itr = l.listIterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("Ketty")) {
				itr.remove();
			}
		}
		System.out.println(l);// [Bala, Amol, Chandu]
	}
}