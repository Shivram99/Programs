package com.mahait.programs;

import java.util.ArrayList;
import java.util.HashSet;

public class MergeTwoListWithoutDuplicate {

			public static void main(String[] args) {
				ArrayList<String> arrayList1 = new ArrayList<String>();
				arrayList1.add("a");
				arrayList1.add("b");
				arrayList1.add("c");

				ArrayList<String> arrayList2 = new ArrayList<String>();
				arrayList2.add("a");
				arrayList2.add("b");
				arrayList2.add("d");
				
				HashSet<String> set = new HashSet<String>();
				set.addAll(arrayList1);
				set.addAll(arrayList2);
				
				System.out.println(set.toString());
 			}
}
