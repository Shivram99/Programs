package com.mahait.java8;

import java.util.Optional;

public class OptionalClassExa {
	public static void main(String[] args) {
		String str = null;
		Optional<String> ofNullable = Optional.ofNullable(str);
		
		if(ofNullable.isPresent()) {
			System.out.println(str);
		}else {
			System.out.println("No Value Present");
		}
	}
}
