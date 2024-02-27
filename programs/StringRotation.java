package com.mahait.programs;
public class StringRotation {
	
	public static void main(String[] args) {
		String firstString = "ABCD";
		String goalString = "CDAB";
		
		/*First Approch*/
		boolean temp = (firstString+firstString).contains(goalString);
		
		if(temp == true) {
			System.out.println("String Is Rotation");
		}else {
			System.out.println("String Is Not Rotation");
		}
		
		/*Second Approch*/
		System.out.println(isRotaionString(firstString,goalString));
		
	}

	private static boolean isRotaionString(String firstString, String goalString) {

		return (firstString.length()==goalString.length() && (firstString+firstString).contains(goalString));
	}
}
