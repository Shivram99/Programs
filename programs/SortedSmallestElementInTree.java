package com.mahait.programs;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedSmallestElementInTree {
		public static void main(String[] args) {
			TreeSet<Integer> treeSet = new TreeSet<>();
			treeSet.add(11);
			treeSet.add(12);
			treeSet.add(1);
			treeSet.add(2);
			treeSet.add(3);
			treeSet.add(4);
			treeSet.add(5);
			
			 Integer integer = treeSet.stream().sorted(Comparator.naturalOrder()).distinct().limit(1).findFirst().get();
			 System.out.println(integer);
			 
		}
}
